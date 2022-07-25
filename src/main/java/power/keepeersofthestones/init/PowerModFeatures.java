
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package power.keepeersofthestones.init;

import power.keepeersofthestones.world.features.ores.CrystalYellowFeature;
import power.keepeersofthestones.world.features.ores.CrystalVioletFeature;
import power.keepeersofthestones.world.features.ores.CrystalRedFeature;
import power.keepeersofthestones.world.features.ores.CrystalPurpleFeature;
import power.keepeersofthestones.world.features.ores.CrystalPinkFeature;
import power.keepeersofthestones.world.features.ores.CrystalOrangeFeature;
import power.keepeersofthestones.world.features.ores.CrystalLimeFeature;
import power.keepeersofthestones.world.features.ores.CrystalLightBlueFeature;
import power.keepeersofthestones.world.features.ores.CrystalGreenFeature;
import power.keepeersofthestones.world.features.ores.CrystalGrayFeature;
import power.keepeersofthestones.world.features.ores.CrystalBrownFeature;
import power.keepeersofthestones.world.features.ores.CrystalBlueFeature;
import power.keepeersofthestones.world.features.lakes.MercuryLiquidFeature;
import power.keepeersofthestones.PowerMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Holder;

import java.util.function.Supplier;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber
public class PowerModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, PowerMod.MODID);
	private static final List<FeatureRegistration> FEATURE_REGISTRATIONS = new ArrayList<>();
	public static final RegistryObject<Feature<?>> CRYSTAL_BLUE = register("crystal_blue", CrystalBlueFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.UNDERGROUND_ORES, CrystalBlueFeature.GENERATE_BIOMES, CrystalBlueFeature::placedFeature));
	public static final RegistryObject<Feature<?>> CRYSTAL_BROWN = register("crystal_brown", CrystalBrownFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.UNDERGROUND_ORES, CrystalBrownFeature.GENERATE_BIOMES, CrystalBrownFeature::placedFeature));
	public static final RegistryObject<Feature<?>> CRYSTAL_GRAY = register("crystal_gray", CrystalGrayFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.UNDERGROUND_ORES, CrystalGrayFeature.GENERATE_BIOMES, CrystalGrayFeature::placedFeature));
	public static final RegistryObject<Feature<?>> CRYSTAL_GREEN = register("crystal_green", CrystalGreenFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.UNDERGROUND_ORES, CrystalGreenFeature.GENERATE_BIOMES, CrystalGreenFeature::placedFeature));
	public static final RegistryObject<Feature<?>> CRYSTAL_LIGHT_BLUE = register("crystal_light_blue", CrystalLightBlueFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, CrystalLightBlueFeature.GENERATE_BIOMES,
					CrystalLightBlueFeature::placedFeature));
	public static final RegistryObject<Feature<?>> CRYSTAL_LIME = register("crystal_lime", CrystalLimeFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.UNDERGROUND_ORES, CrystalLimeFeature.GENERATE_BIOMES, CrystalLimeFeature::placedFeature));
	public static final RegistryObject<Feature<?>> CRYSTAL_ORANGE = register("crystal_orange", CrystalOrangeFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.UNDERGROUND_ORES, CrystalOrangeFeature.GENERATE_BIOMES, CrystalOrangeFeature::placedFeature));
	public static final RegistryObject<Feature<?>> CRYSTAL_PINK = register("crystal_pink", CrystalPinkFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.UNDERGROUND_ORES, CrystalPinkFeature.GENERATE_BIOMES, CrystalPinkFeature::placedFeature));
	public static final RegistryObject<Feature<?>> CRYSTAL_PURPLE = register("crystal_purple", CrystalPurpleFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.UNDERGROUND_ORES, CrystalPurpleFeature.GENERATE_BIOMES, CrystalPurpleFeature::placedFeature));
	public static final RegistryObject<Feature<?>> CRYSTAL_RED = register("crystal_red", CrystalRedFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, CrystalRedFeature.GENERATE_BIOMES, CrystalRedFeature::placedFeature));
	public static final RegistryObject<Feature<?>> CRYSTAL_VIOLET = register("crystal_violet", CrystalVioletFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.UNDERGROUND_ORES, CrystalVioletFeature.GENERATE_BIOMES, CrystalVioletFeature::placedFeature));
	public static final RegistryObject<Feature<?>> CRYSTAL_YELLOW = register("crystal_yellow", CrystalYellowFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.UNDERGROUND_ORES, CrystalYellowFeature.GENERATE_BIOMES, CrystalYellowFeature::placedFeature));
	public static final RegistryObject<Feature<?>> MERCURY_LIQUID = register("mercury_liquid", MercuryLiquidFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.LAKES, MercuryLiquidFeature.GENERATE_BIOMES, MercuryLiquidFeature::placedFeature));

	private static RegistryObject<Feature<?>> register(String registryname, Supplier<Feature<?>> feature, FeatureRegistration featureRegistration) {
		FEATURE_REGISTRATIONS.add(featureRegistration);
		return REGISTRY.register(registryname, feature);
	}

	@SubscribeEvent
	public static void addFeaturesToBiomes(BiomeLoadingEvent event) {
		for (FeatureRegistration registration : FEATURE_REGISTRATIONS) {
			if (registration.biomes() == null || registration.biomes().contains(event.getName()))
				event.getGeneration().getFeatures(registration.stage()).add(registration.placedFeature().get());
		}
	}

	private static record FeatureRegistration(GenerationStep.Decoration stage, Set<ResourceLocation> biomes,
			Supplier<Holder<PlacedFeature>> placedFeature) {
	}
}
