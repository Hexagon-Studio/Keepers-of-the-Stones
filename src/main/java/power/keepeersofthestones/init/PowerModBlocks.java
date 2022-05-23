
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
import power.keepeersofthestones.block.QuicksilverBlock;
import power.keepeersofthestones.block.OrangePortalBlock;
import power.keepeersofthestones.block.OblivionPortalBlock;
import power.keepeersofthestones.block.MoonStonesBlockBlock;
import power.keepeersofthestones.block.IronMagicBoxBlock;
import power.keepeersofthestones.block.GoldMagicBoxBlock;
import power.keepeersofthestones.block.EnergyBlockBlock;
import power.keepeersofthestones.block.DinoeraPortalBlock;
import power.keepeersofthestones.block.DetonatorTNTBlock;
import power.keepeersofthestones.block.CrystallizedPortalBlock;
import power.keepeersofthestones.block.CrystalShieldBlockBlock;
import power.keepeersofthestones.block.ClusterBlockBlock;
import power.keepeersofthestones.block.BluePortalBlock;
import power.keepeersofthestones.block.BlackHoleBlockBlock;
import power.keepeersofthestones.block.BatteryChargerBlock;
import power.keepeersofthestones.block.AmberBlockBlock;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PowerModBlocks {
	private static final List<Block> REGISTRY = new ArrayList<>();
	public static final Block QUICKSILVER = register(new QuicksilverBlock());
	public static final Block BATTERY_CHARGER = register(new BatteryChargerBlock());
	public static final Block DINOERA_PORTAL = register(new DinoeraPortalBlock());
	public static final Block CRYSTALLIZED_PORTAL = register(new CrystallizedPortalBlock());
	public static final Block OBLIVION_PORTAL = register(new OblivionPortalBlock());
	public static final Block WOOD_MAGIC_BOX = register(new WoodMagicBoxBlock());
	public static final Block STONE_MAGIC_BOX = register(new StoneMagicBoxBlock());
	public static final Block IRON_MAGIC_BOX = register(new IronMagicBoxBlock());
	public static final Block GOLD_MAGIC_BOX = register(new GoldMagicBoxBlock());
	public static final Block ENERGY_BLOCK = register(new EnergyBlockBlock());
	public static final Block SOUND_BARRIER_BLOCK = register(new SoundBarrierBlockBlock());
	public static final Block CLUSTER_BLOCK = register(new ClusterBlockBlock());
	public static final Block CRYSTAL_SHIELD_BLOCK = register(new CrystalShieldBlockBlock());
	public static final Block VACUUM_WEB_BLOCK = register(new VacuumWebBlockBlock());
	public static final Block MOON_STONES_BLOCK = register(new MoonStonesBlockBlock());
	public static final Block BLACK_HOLE_BLOCK = register(new BlackHoleBlockBlock());
	public static final Block UNMULTIPLICATION_MOON_STONES_BLOCK = register(new UnmultiplicationMoonStonesBlock());
	public static final Block TECHNOBARRIER_BLOCK = register(new TechnobarrierBlockBlock());
	public static final Block BLUE_PORTAL = register(new BluePortalBlock());
	public static final Block ORANGE_PORTAL = register(new OrangePortalBlock());
	public static final Block DETONATOR_TNT = register(new DetonatorTNTBlock());
	public static final Block AMBER_BLOCK = register(new AmberBlockBlock());

	private static Block register(Block block) {
		REGISTRY.add(block);
		return block;
	}

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Block[0]));
	}

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			BatteryChargerBlock.registerRenderLayer();
			WoodMagicBoxBlock.registerRenderLayer();
			StoneMagicBoxBlock.registerRenderLayer();
			IronMagicBoxBlock.registerRenderLayer();
			GoldMagicBoxBlock.registerRenderLayer();
			ClusterBlockBlock.registerRenderLayer();
			VacuumWebBlockBlock.registerRenderLayer();
			BlackHoleBlockBlock.registerRenderLayer();
			TechnobarrierBlockBlock.registerRenderLayer();
			BluePortalBlock.registerRenderLayer();
			OrangePortalBlock.registerRenderLayer();
			AmberBlockBlock.registerRenderLayer();
		}
	}
}
