
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package power.keepeersofthestones.init;

import power.keepeersofthestones.world.biome.VenusLandBiome;
import power.keepeersofthestones.world.biome.VenusDesertBiome;
import power.keepeersofthestones.world.biome.TriassicPlainsBiome;
import power.keepeersofthestones.world.biome.TriassicDesertBiome;
import power.keepeersofthestones.world.biome.OblivionPlainsBiome;
import power.keepeersofthestones.world.biome.OblivionForestBiome;
import power.keepeersofthestones.world.biome.OblivionDesertBiome;
import power.keepeersofthestones.world.biome.MoonLandBiome;
import power.keepeersofthestones.world.biome.MarsLandBiome;
import power.keepeersofthestones.world.biome.JurassicSwampBiome;
import power.keepeersofthestones.world.biome.JurassicJungleBiome;
import power.keepeersofthestones.world.biome.EnceladusIceDesertBiome;
import power.keepeersofthestones.world.biome.CrystallizedLandsBiome;
import power.keepeersofthestones.world.biome.CretaceousTaigaBiome;
import power.keepeersofthestones.world.biome.CretaceousPineForestBiome;
import power.keepeersofthestones.PowerMod;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.biome.Biome;
import net.minecraft.resources.ResourceLocation;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PowerModBiomes {
	private static final List<Biome> REGISTRY = new ArrayList<>();
	public static Biome MOON_LAND = register("moon_land", MoonLandBiome.createBiome());
	public static Biome MARS_LAND = register("mars_land", MarsLandBiome.createBiome());
	public static Biome VENUS_LAND = register("venus_land", VenusLandBiome.createBiome());
	public static Biome VENUS_DESERT = register("venus_desert", VenusDesertBiome.createBiome());
	public static Biome TRIASSIC_DESERT = register("triassic_desert", TriassicDesertBiome.createBiome());
	public static Biome TRIASSIC_PLAINS = register("triassic_plains", TriassicPlainsBiome.createBiome());
	public static Biome JURASSIC_JUNGLE = register("jurassic_jungle", JurassicJungleBiome.createBiome());
	public static Biome JURASSIC_SWAMP = register("jurassic_swamp", JurassicSwampBiome.createBiome());
	public static Biome CRETACEOUS_TAIGA = register("cretaceous_taiga", CretaceousTaigaBiome.createBiome());
	public static Biome CRETACEOUS_PINE_FOREST = register("cretaceous_pine_forest", CretaceousPineForestBiome.createBiome());
	public static Biome ENCELADUS_ICE_DESERT = register("enceladus_ice_desert", EnceladusIceDesertBiome.createBiome());
	public static Biome CRYSTALLIZED_LANDS = register("crystallized_lands", CrystallizedLandsBiome.createBiome());
	public static Biome OBLIVION_FOREST = register("oblivion_forest", OblivionForestBiome.createBiome());
	public static Biome OBLIVION_PLAINS = register("oblivion_plains", OblivionPlainsBiome.createBiome());
	public static Biome OBLIVION_DESERT = register("oblivion_desert", OblivionDesertBiome.createBiome());

	private static Biome register(String registryname, Biome biome) {
		REGISTRY.add(biome.setRegistryName(new ResourceLocation(PowerMod.MODID, registryname)));
		return biome;
	}

	@SubscribeEvent
	public static void registerBiomes(RegistryEvent.Register<Biome> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Biome[0]));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			MoonLandBiome.init();
			MarsLandBiome.init();
			VenusLandBiome.init();
			VenusDesertBiome.init();
			TriassicDesertBiome.init();
			TriassicPlainsBiome.init();
			JurassicJungleBiome.init();
			JurassicSwampBiome.init();
			CretaceousTaigaBiome.init();
			CretaceousPineForestBiome.init();
			EnceladusIceDesertBiome.init();
			CrystallizedLandsBiome.init();
			OblivionForestBiome.init();
			OblivionPlainsBiome.init();
			OblivionDesertBiome.init();
		});
	}
}
