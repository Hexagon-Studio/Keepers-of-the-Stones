
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package power.keepeersofthestones.init;

import power.keepeersofthestones.world.inventory.BatteryCreateGUIMenu;

import net.minecraftforge.network.IContainerFactory;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.AbstractContainerMenu;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PowerModMenus {
	private static final List<MenuType<?>> REGISTRY = new ArrayList<>();
	public static final MenuType<CultivationGUIMenu> CULTIVATION_GUI = register("cultivation_gui",
			(id, inv, extraData) -> new CultivationGUIMenu(id, inv, extraData));
	public static final MenuType<SpawnAnimalsGUIMenu> SPAWN_ANIMALS_GUI = register("spawn_animals_gui",
			(id, inv, extraData) -> new SpawnAnimalsGUIMenu(id, inv, extraData));
	public static final MenuType<ChoiseMagicStoneGUIMenu> CHOISE_MAGIC_STONE_GUI = register("choise_magic_stone_gui",
			(id, inv, extraData) -> new ChoiseMagicStoneGUIMenu(id, inv, extraData));
	public static final MenuType<ChoiseMagicStonesPage2Menu> CHOISE_MAGIC_STONES_PAGE_2 = register("choise_magic_stones_page_2",
			(id, inv, extraData) -> new ChoiseMagicStonesPage2Menu(id, inv, extraData));
	public static final MenuType<CheckpointGUIMenu> CHECKPOINT_GUI = register("checkpoint_gui",
			(id, inv, extraData) -> new CheckpointGUIMenu(id, inv, extraData));
	public static final MenuType<BatteryCreateGUIMenu> BATTERY_CREATE_GUI = register("battery_create_gui",
			(id, inv, extraData) -> new BatteryCreateGUIMenu(id, inv, extraData));
	public static final MenuType<RedstoneBundleGUIMenu> REDSTONE_BUNDLE_GUI = register("redstone_bundle_gui",
			(id, inv, extraData) -> new RedstoneBundleGUIMenu(id, inv, extraData));
	public static final MenuType<BuildingGUIMenu> BUILDING_GUI = register("building_gui",
			(id, inv, extraData) -> new BuildingGUIMenu(id, inv, extraData));
	public static final MenuType<EBFireMenu> EB_FIRE = register("eb_fire", (id, inv, extraData) -> new EBFireMenu(id, inv, extraData));
	public static final MenuType<EBAirMenu> EB_AIR = register("eb_air", (id, inv, extraData) -> new EBAirMenu(id, inv, extraData));
	public static final MenuType<EBWaterMenu> EB_WATER = register("eb_water", (id, inv, extraData) -> new EBWaterMenu(id, inv, extraData));
	public static final MenuType<EBEarthMenu> EB_EARTH = register("eb_earth", (id, inv, extraData) -> new EBEarthMenu(id, inv, extraData));
	public static final MenuType<EBEnergyMenu> EB_ENERGY = register("eb_energy", (id, inv, extraData) -> new EBEnergyMenu(id, inv, extraData));
	public static final MenuType<EBIceMenu> EB_ICE = register("eb_ice", (id, inv, extraData) -> new EBIceMenu(id, inv, extraData));
	public static final MenuType<EBLightningMenu> EB_LIGHTNING = register("eb_lightning",
			(id, inv, extraData) -> new EBLightningMenu(id, inv, extraData));
	public static final MenuType<EBSoundMenu> EB_SOUND = register("eb_sound", (id, inv, extraData) -> new EBSoundMenu(id, inv, extraData));
	public static final MenuType<EBCrystalMenu> EB_CRYSTAL = register("eb_crystal", (id, inv, extraData) -> new EBCrystalMenu(id, inv, extraData));
	public static final MenuType<EBLavaMenu> EB_LAVA = register("eb_lava", (id, inv, extraData) -> new EBLavaMenu(id, inv, extraData));
	public static final MenuType<EBRainMenu> EB_RAIN = register("eb_rain", (id, inv, extraData) -> new EBRainMenu(id, inv, extraData));
	public static final MenuType<EBTornadoMenu> EB_TORNADO = register("eb_tornado", (id, inv, extraData) -> new EBTornadoMenu(id, inv, extraData));
	public static final MenuType<EBOceanMenu> EB_OCEAN = register("eb_ocean", (id, inv, extraData) -> new EBOceanMenu(id, inv, extraData));
	public static final MenuType<EBGreeneryMenu> EB_GREENERY = register("eb_greenery",
			(id, inv, extraData) -> new EBGreeneryMenu(id, inv, extraData));
	public static final MenuType<EBAnimalsMenu> EB_ANIMALS = register("eb_animals", (id, inv, extraData) -> new EBAnimalsMenu(id, inv, extraData));
	public static final MenuType<EBMetalMenu> EB_METAL = register("eb_metal", (id, inv, extraData) -> new EBMetalMenu(id, inv, extraData));
	public static final MenuType<EBLightMenu> EB_LIGHT = register("eb_light", (id, inv, extraData) -> new EBLightMenu(id, inv, extraData));
	public static final MenuType<EBShadowMenu> EB_SHADOW = register("eb_shadow", (id, inv, extraData) -> new EBShadowMenu(id, inv, extraData));
	public static final MenuType<EBVacuumMenu> EB_VACUUM = register("eb_vacuum", (id, inv, extraData) -> new EBVacuumMenu(id, inv, extraData));
	public static final MenuType<EBSunMenu> EB_SUN = register("eb_sun", (id, inv, extraData) -> new EBSunMenu(id, inv, extraData));
	public static final MenuType<EBMoonMenu> EB_MOON = register("eb_moon", (id, inv, extraData) -> new EBMoonMenu(id, inv, extraData));
	public static final MenuType<EBSpaceMenu> EB_SPACE = register("eb_space", (id, inv, extraData) -> new EBSpaceMenu(id, inv, extraData));
	public static final MenuType<EBTimeMenu> EB_TIME = register("eb_time", (id, inv, extraData) -> new EBTimeMenu(id, inv, extraData));
	public static final MenuType<EBCreationMenu> EB_CREATION = register("eb_creation",
			(id, inv, extraData) -> new EBCreationMenu(id, inv, extraData));
	public static final MenuType<EBDestructionMenu> EB_DESTRUCTION = register("eb_destruction",
			(id, inv, extraData) -> new EBDestructionMenu(id, inv, extraData));
	public static final MenuType<EBBloodMenu> EB_BLOOD = register("eb_blood", (id, inv, extraData) -> new EBBloodMenu(id, inv, extraData));
	public static final MenuType<EBTechnologyMenu> EB_TECHNOLOGY = register("eb_technology",
			(id, inv, extraData) -> new EBTechnologyMenu(id, inv, extraData));
	public static final MenuType<EBTeleportationMenu> EB_TELEPORTATION = register("eb_teleportation",
			(id, inv, extraData) -> new EBTeleportationMenu(id, inv, extraData));
	public static final MenuType<EBExplosionMenu> EB_EXPLOSION = register("eb_explosion",
			(id, inv, extraData) -> new EBExplosionMenu(id, inv, extraData));
	public static final MenuType<EBAmberMenu> EB_AMBER = register("eb_amber", (id, inv, extraData) -> new EBAmberMenu(id, inv, extraData));
	public static final MenuType<PointGUIMenu> POINT_GUI = register("point_gui", (id, inv, extraData) -> new PointGUIMenu(id, inv, extraData));
	public static final MenuType<ChoiseMagicStonesPage3Menu> CHOISE_MAGIC_STONES_PAGE_3 = register("choise_magic_stones_page_3",
			(id, inv, extraData) -> new ChoiseMagicStonesPage3Menu(id, inv, extraData));
	public static final MenuType<SpaceAtlasGUIMenu> SPACE_ATLAS_GUI = register("space_atlas_gui",
			(id, inv, extraData) -> new SpaceAtlasGUIMenu(id, inv, extraData));
	public static final MenuType<CheckPointTPMenu> CHECK_POINT_TP = register("check_point_tp",
			(id, inv, extraData) -> new CheckPointTPMenu(id, inv, extraData));
	public static final MenuType<LevelsAndSkillsPageMenu> LEVELS_AND_SKILLS_PAGE = register("levels_and_skills_page",
			(id, inv, extraData) -> new LevelsAndSkillsPageMenu(id, inv, extraData));
	public static final MenuType<BuyLevel2Menu> BUY_LEVEL_2 = register("buy_level_2", (id, inv, extraData) -> new BuyLevel2Menu(id, inv, extraData));
	public static final MenuType<BuyLevel3Menu> BUY_LEVEL_3 = register("buy_level_3", (id, inv, extraData) -> new BuyLevel3Menu(id, inv, extraData));
	public static final MenuType<BuyAquaPowerMenu> BUY_AQUA_POWER = register("buy_aqua_power",
			(id, inv, extraData) -> new BuyAquaPowerMenu(id, inv, extraData));
	public static final MenuType<EBMistMenu> EB_MIST = register("eb_mist", (id, inv, extraData) -> new EBMistMenu(id, inv, extraData));
	public static final MenuType<SoundImitateChoiceMenu> SOUND_IMITATE_CHOICE = register("sound_imitate_choice",
			(id, inv, extraData) -> new SoundImitateChoiceMenu(id, inv, extraData));
	public static final MenuType<EBSandMenu> EB_SAND = register("eb_sand", (id, inv, extraData) -> new EBSandMenu(id, inv, extraData));

	private static <T extends AbstractContainerMenu> MenuType<T> register(String registryname, IContainerFactory<T> containerFactory) {
		MenuType<T> menuType = new MenuType<T>(containerFactory);
		menuType.setRegistryName(registryname);
		REGISTRY.add(menuType);
		return menuType;
	}

	@SubscribeEvent
	public static void registerContainers(RegistryEvent.Register<MenuType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new MenuType[0]));
	}
}
