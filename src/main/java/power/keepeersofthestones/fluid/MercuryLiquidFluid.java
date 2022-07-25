
package power.keepeersofthestones.fluid;

import power.keepeersofthestones.init.PowerModFluids;
import power.keepeersofthestones.init.PowerModBlocks;

import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fluids.FluidAttributes;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public abstract class MercuryLiquidFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(PowerModFluids.MERCURY_LIQUID,
			PowerModFluids.FLOWING_MERCURY_LIQUID,
			FluidAttributes.builder(new ResourceLocation("power:blocks/mercury_liquid"), new ResourceLocation("power:blocks/mercury_liquid"))

					.density(100000).viscosity(100000).temperature(0)

	).explosionResistance(1000000f)

			.tickRate(1).levelDecreasePerBlock(8).slopeFindDistance(16)

			.block(() -> (LiquidBlock) PowerModBlocks.MERCURY_LIQUID.get());

	private MercuryLiquidFluid() {
		super(PROPERTIES);
	}

	@Override
	public Vec3 getFlow(BlockGetter world, BlockPos pos, FluidState fluidstate) {
		return super.getFlow(world, pos, fluidstate).scale(0.1);
	}

	public static class Source extends MercuryLiquidFluid {
		public Source() {
			super();
		}

		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends MercuryLiquidFluid {
		public Flowing() {
			super();
		}

		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
