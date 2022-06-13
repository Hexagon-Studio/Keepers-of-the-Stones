
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package power.keepeersofthestones.init;

import power.keepeersofthestones.client.gui.BatteryCreateGUIScreen;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class PowerModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(PowerModMenus.CULTIVATION_GUI, CultivationGUIScreen::new);
			MenuScreens.register(PowerModMenus.SPAWN_ANIMALS_GUI, SpawnAnimalsGUIScreen::new);
			MenuScreens.register(PowerModMenus.CHOISE_MAGIC_STONE_GUI, ChoiseMagicStoneGUIScreen::new);
			MenuScreens.register(PowerModMenus.CHOISE_MAGIC_STONES_PAGE_2, ChoiseMagicStonesPage2Screen::new);
			MenuScreens.register(PowerModMenus.CHECKPOINT_GUI, CheckpointGUIScreen::new);
			MenuScreens.register(PowerModMenus.BATTERY_CREATE_GUI, BatteryCreateGUIScreen::new);
			MenuScreens.register(PowerModMenus.REDSTONE_BUNDLE_GUI, RedstoneBundleGUIScreen::new);
			MenuScreens.register(PowerModMenus.BUILDING_GUI, BuildingGUIScreen::new);
			MenuScreens.register(PowerModMenus.EB_FIRE, EBFireScreen::new);
			MenuScreens.register(PowerModMenus.EB_AIR, EBAirScreen::new);
			MenuScreens.register(PowerModMenus.EB_WATER, EBWaterScreen::new);
			MenuScreens.register(PowerModMenus.EB_EARTH, EBEarthScreen::new);
			MenuScreens.register(PowerModMenus.EB_ENERGY, EBEnergyScreen::new);
			MenuScreens.register(PowerModMenus.EB_ICE, EBIceScreen::new);
			MenuScreens.register(PowerModMenus.EB_LIGHTNING, EBLightningScreen::new);
			MenuScreens.register(PowerModMenus.EB_SOUND, EBSoundScreen::new);
			MenuScreens.register(PowerModMenus.EB_CRYSTAL, EBCrystalScreen::new);
			MenuScreens.register(PowerModMenus.EB_LAVA, EBLavaScreen::new);
			MenuScreens.register(PowerModMenus.EB_RAIN, EBRainScreen::new);
			MenuScreens.register(PowerModMenus.EB_TORNADO, EBTornadoScreen::new);
			MenuScreens.register(PowerModMenus.EB_OCEAN, EBOceanScreen::new);
			MenuScreens.register(PowerModMenus.EB_GREENERY, EBGreeneryScreen::new);
			MenuScreens.register(PowerModMenus.EB_ANIMALS, EBAnimalsScreen::new);
			MenuScreens.register(PowerModMenus.EB_METAL, EBMetalScreen::new);
			MenuScreens.register(PowerModMenus.EB_LIGHT, EBLightScreen::new);
			MenuScreens.register(PowerModMenus.EB_SHADOW, EBShadowScreen::new);
			MenuScreens.register(PowerModMenus.EB_VACUUM, EBVacuumScreen::new);
			MenuScreens.register(PowerModMenus.EB_SUN, EBSunScreen::new);
			MenuScreens.register(PowerModMenus.EB_MOON, EBMoonScreen::new);
			MenuScreens.register(PowerModMenus.EB_SPACE, EBSpaceScreen::new);
			MenuScreens.register(PowerModMenus.EB_TIME, EBTimeScreen::new);
			MenuScreens.register(PowerModMenus.EB_CREATION, EBCreationScreen::new);
			MenuScreens.register(PowerModMenus.EB_DESTRUCTION, EBDestructionScreen::new);
			MenuScreens.register(PowerModMenus.EB_BLOOD, EBBloodScreen::new);
			MenuScreens.register(PowerModMenus.EB_TECHNOLOGY, EBTechnologyScreen::new);
			MenuScreens.register(PowerModMenus.EB_TELEPORTATION, EBTeleportationScreen::new);
			MenuScreens.register(PowerModMenus.EB_EXPLOSION, EBExplosionScreen::new);
			MenuScreens.register(PowerModMenus.EB_AMBER, EBAmberScreen::new);
			MenuScreens.register(PowerModMenus.POINT_GUI, PointGUIScreen::new);
			MenuScreens.register(PowerModMenus.CHOISE_MAGIC_STONES_PAGE_3, ChoiseMagicStonesPage3Screen::new);
			MenuScreens.register(PowerModMenus.SPACE_ATLAS_GUI, SpaceAtlasGUIScreen::new);
			MenuScreens.register(PowerModMenus.CHECK_POINT_TP, CheckPointTPScreen::new);
			MenuScreens.register(PowerModMenus.LEVELS_AND_SKILLS_PAGE, LevelsAndSkillsPageScreen::new);
			MenuScreens.register(PowerModMenus.BUY_LEVEL_2, BuyLevel2Screen::new);
			MenuScreens.register(PowerModMenus.BUY_LEVEL_3, BuyLevel3Screen::new);
			MenuScreens.register(PowerModMenus.BUY_AQUA_POWER, BuyAquaPowerScreen::new);
			MenuScreens.register(PowerModMenus.EB_MIST, EBMistScreen::new);
			MenuScreens.register(PowerModMenus.SOUND_IMITATE_CHOICE, SoundImitateChoiceScreen::new);
			MenuScreens.register(PowerModMenus.EB_SAND, EBSandScreen::new);
		});
	}
}
