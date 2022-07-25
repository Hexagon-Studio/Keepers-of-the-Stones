
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package power.keepeersofthestones.init;

import power.keepeersofthestones.block.WoodMagicBoxBlock;
import power.keepeersofthestones.block.VacuumWebBlockBlock;
import power.keepeersofthestones.block.UnmultiplicationMoonStonesBlock;
import power.keepeersofthestones.block.TechnobarrierBlockBlock;
import power.keepeersofthestones.block.StoneMagicBoxBlock;
import power.keepeersofthestones.block.SoundBarrierBlockBlock;
import power.keepeersofthestones.block.QuicksandBlockBlock;
import power.keepeersofthestones.block.OrangePortalBlock;
import power.keepeersofthestones.block.OblivionPortalBlock;
import power.keepeersofthestones.block.MoonStonesBlockBlock;
import power.keepeersofthestones.block.MercuryLiquidBlock;
import power.keepeersofthestones.block.IronMagicBoxBlock;
import power.keepeersofthestones.block.GoldMagicBoxBlock;
import power.keepeersofthestones.block.EnergyBlockBlock;
import power.keepeersofthestones.block.DinoeraPortalBlock;
import power.keepeersofthestones.block.DetonatorTNTBlock;
import power.keepeersofthestones.block.CrystallizedPortalBlock;
import power.keepeersofthestones.block.CrystalYellowBlock;
import power.keepeersofthestones.block.CrystalVioletBlock;
import power.keepeersofthestones.block.CrystalShieldBlockBlock;
import power.keepeersofthestones.block.CrystalRedBlock;
import power.keepeersofthestones.block.CrystalPurpleBlock;
import power.keepeersofthestones.block.CrystalPinkBlock;
import power.keepeersofthestones.block.CrystalOrangeBlock;
import power.keepeersofthestones.block.CrystalLimeBlock;
import power.keepeersofthestones.block.CrystalLightBlueBlock;
import power.keepeersofthestones.block.CrystalGreenBlock;
import power.keepeersofthestones.block.CrystalGrayBlock;
import power.keepeersofthestones.block.CrystalBrownBlock;
import power.keepeersofthestones.block.CrystalBlueBlock;
import power.keepeersofthestones.block.ClusterBlockBlock;
import power.keepeersofthestones.block.BluePortalBlock;
import power.keepeersofthestones.block.BlackHoleBlockBlock;
import power.keepeersofthestones.block.BatteryChargerBlock;
import power.keepeersofthestones.block.AmberBlockBlock;
import power.keepeersofthestones.block.AcidBlock;
import power.keepeersofthestones.PowerMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

public class PowerModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, PowerMod.MODID);
	public static final RegistryObject<Block> ACID = REGISTRY.register("acid", () -> new AcidBlock());
	public static final RegistryObject<Block> BATTERY_CHARGER = REGISTRY.register("battery_charger", () -> new BatteryChargerBlock());
	public static final RegistryObject<Block> DINOERA_PORTAL = REGISTRY.register("dinoera_portal", () -> new DinoeraPortalBlock());
	public static final RegistryObject<Block> CRYSTALLIZED_PORTAL = REGISTRY.register("crystallized_portal", () -> new CrystallizedPortalBlock());
	public static final RegistryObject<Block> OBLIVION_PORTAL = REGISTRY.register("oblivion_portal", () -> new OblivionPortalBlock());
	public static final RegistryObject<Block> CRYSTAL_BLUE = REGISTRY.register("crystal_blue", () -> new CrystalBlueBlock());
	public static final RegistryObject<Block> CRYSTAL_BROWN = REGISTRY.register("crystal_brown", () -> new CrystalBrownBlock());
	public static final RegistryObject<Block> CRYSTAL_GRAY = REGISTRY.register("crystal_gray", () -> new CrystalGrayBlock());
	public static final RegistryObject<Block> CRYSTAL_GREEN = REGISTRY.register("crystal_green", () -> new CrystalGreenBlock());
	public static final RegistryObject<Block> CRYSTAL_LIGHT_BLUE = REGISTRY.register("crystal_light_blue", () -> new CrystalLightBlueBlock());
	public static final RegistryObject<Block> CRYSTAL_LIME = REGISTRY.register("crystal_lime", () -> new CrystalLimeBlock());
	public static final RegistryObject<Block> CRYSTAL_ORANGE = REGISTRY.register("crystal_orange", () -> new CrystalOrangeBlock());
	public static final RegistryObject<Block> CRYSTAL_PINK = REGISTRY.register("crystal_pink", () -> new CrystalPinkBlock());
	public static final RegistryObject<Block> CRYSTAL_PURPLE = REGISTRY.register("crystal_purple", () -> new CrystalPurpleBlock());
	public static final RegistryObject<Block> CRYSTAL_RED = REGISTRY.register("crystal_red", () -> new CrystalRedBlock());
	public static final RegistryObject<Block> CRYSTAL_VIOLET = REGISTRY.register("crystal_violet", () -> new CrystalVioletBlock());
	public static final RegistryObject<Block> CRYSTAL_YELLOW = REGISTRY.register("crystal_yellow", () -> new CrystalYellowBlock());
	public static final RegistryObject<Block> ENERGY_BLOCK = REGISTRY.register("energy_block", () -> new EnergyBlockBlock());
	public static final RegistryObject<Block> SOUND_BARRIER_BLOCK = REGISTRY.register("sound_barrier_block", () -> new SoundBarrierBlockBlock());
	public static final RegistryObject<Block> CLUSTER_BLOCK = REGISTRY.register("cluster_block", () -> new ClusterBlockBlock());
	public static final RegistryObject<Block> CRYSTAL_SHIELD_BLOCK = REGISTRY.register("crystal_shield_block", () -> new CrystalShieldBlockBlock());
	public static final RegistryObject<Block> VACUUM_WEB_BLOCK = REGISTRY.register("vacuum_web_block", () -> new VacuumWebBlockBlock());
	public static final RegistryObject<Block> MOON_STONES_BLOCK = REGISTRY.register("moon_stones_block", () -> new MoonStonesBlockBlock());
	public static final RegistryObject<Block> BLACK_HOLE_BLOCK = REGISTRY.register("black_hole_block", () -> new BlackHoleBlockBlock());
	public static final RegistryObject<Block> UNMULTIPLICATION_MOON_STONES_BLOCK = REGISTRY.register("unmultiplication_moon_stones_block",
			() -> new UnmultiplicationMoonStonesBlock());
	public static final RegistryObject<Block> TECHNOBARRIER_BLOCK = REGISTRY.register("technobarrier_block", () -> new TechnobarrierBlockBlock());
	public static final RegistryObject<Block> BLUE_PORTAL = REGISTRY.register("blue_portal", () -> new BluePortalBlock());
	public static final RegistryObject<Block> ORANGE_PORTAL = REGISTRY.register("orange_portal", () -> new OrangePortalBlock());
	public static final RegistryObject<Block> DETONATOR_TNT = REGISTRY.register("detonator_tnt", () -> new DetonatorTNTBlock());
	public static final RegistryObject<Block> WOOD_MAGIC_BOX = REGISTRY.register("wood_magic_box", () -> new WoodMagicBoxBlock());
	public static final RegistryObject<Block> STONE_MAGIC_BOX = REGISTRY.register("stone_magic_box", () -> new StoneMagicBoxBlock());
	public static final RegistryObject<Block> IRON_MAGIC_BOX = REGISTRY.register("iron_magic_box", () -> new IronMagicBoxBlock());
	public static final RegistryObject<Block> GOLD_MAGIC_BOX = REGISTRY.register("gold_magic_box", () -> new GoldMagicBoxBlock());
	public static final RegistryObject<Block> AMBER_BLOCK = REGISTRY.register("amber_block", () -> new AmberBlockBlock());
	public static final RegistryObject<Block> QUICKSAND_BLOCK = REGISTRY.register("quicksand_block", () -> new QuicksandBlockBlock());
	public static final RegistryObject<Block> MERCURY_LIQUID = REGISTRY.register("mercury_liquid", () -> new MercuryLiquidBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			BatteryChargerBlock.registerRenderLayer();
			ClusterBlockBlock.registerRenderLayer();
			VacuumWebBlockBlock.registerRenderLayer();
			BlackHoleBlockBlock.registerRenderLayer();
			TechnobarrierBlockBlock.registerRenderLayer();
			BluePortalBlock.registerRenderLayer();
			OrangePortalBlock.registerRenderLayer();
			WoodMagicBoxBlock.registerRenderLayer();
			StoneMagicBoxBlock.registerRenderLayer();
			IronMagicBoxBlock.registerRenderLayer();
			GoldMagicBoxBlock.registerRenderLayer();
			AmberBlockBlock.registerRenderLayer();
		}
	}
}
