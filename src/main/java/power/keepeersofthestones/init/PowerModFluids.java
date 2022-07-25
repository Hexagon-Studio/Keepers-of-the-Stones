
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package power.keepeersofthestones.init;

import power.keepeersofthestones.fluid.QuicksandBlockFluid;
import power.keepeersofthestones.fluid.MercuryLiquidFluid;
import power.keepeersofthestones.fluid.AcidFluid;
import power.keepeersofthestones.PowerMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

public class PowerModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, PowerMod.MODID);
	public static final RegistryObject<Fluid> ACID = REGISTRY.register("acid", () -> new AcidFluid.Source());
	public static final RegistryObject<Fluid> FLOWING_ACID = REGISTRY.register("flowing_acid", () -> new AcidFluid.Flowing());
	public static final RegistryObject<Fluid> QUICKSAND_BLOCK = REGISTRY.register("quicksand_block", () -> new QuicksandBlockFluid.Source());
	public static final RegistryObject<Fluid> FLOWING_QUICKSAND_BLOCK = REGISTRY.register("flowing_quicksand_block",
			() -> new QuicksandBlockFluid.Flowing());
	public static final RegistryObject<Fluid> MERCURY_LIQUID = REGISTRY.register("mercury_liquid", () -> new MercuryLiquidFluid.Source());
	public static final RegistryObject<Fluid> FLOWING_MERCURY_LIQUID = REGISTRY.register("flowing_mercury_liquid",
			() -> new MercuryLiquidFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(ACID.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_ACID.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(QUICKSAND_BLOCK.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_QUICKSAND_BLOCK.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(MERCURY_LIQUID.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_MERCURY_LIQUID.get(), renderType -> renderType == RenderType.translucent());
		}
	}
}
