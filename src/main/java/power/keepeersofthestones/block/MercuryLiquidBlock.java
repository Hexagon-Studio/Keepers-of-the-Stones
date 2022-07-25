
package power.keepeersofthestones.block;

import power.keepeersofthestones.procedures.MercuryLiquidWaitingCrushProcedure;
import power.keepeersofthestones.init.PowerModFluids;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

public class MercuryLiquidBlock extends LiquidBlock {
	public MercuryLiquidBlock() {
		super(() -> (FlowingFluid) PowerModFluids.MERCURY_LIQUID.get(), BlockBehaviour.Properties.of(Material.WATER).strength(1000000f)

		);
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}

	@Override
	public void entityInside(BlockState blockstate, Level world, BlockPos pos, Entity entity) {
		super.entityInside(blockstate, world, pos, entity);
		MercuryLiquidWaitingCrushProcedure.execute(world, entity);
	}
}
