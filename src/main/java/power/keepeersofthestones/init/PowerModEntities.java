
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package power.keepeersofthestones.init;

import power.keepeersofthestones.entity.WhirlpoolEntity;
import power.keepeersofthestones.entity.WaterFlowEntity;
import power.keepeersofthestones.entity.VacuumWebEntity;
import power.keepeersofthestones.entity.VacuumSpiralEntity;
import power.keepeersofthestones.entity.TyrannosaurusRexEntity;
import power.keepeersofthestones.entity.TornadoEntityEntity;
import power.keepeersofthestones.entity.TornadoCreateEntity;
import power.keepeersofthestones.entity.TimeDilationEntity;
import power.keepeersofthestones.entity.TigerClawEntity;
import power.keepeersofthestones.entity.SunExplodeEntity;
import power.keepeersofthestones.entity.SpikeEntity;
import power.keepeersofthestones.entity.ShurikenEntity;
import power.keepeersofthestones.entity.ShadowEntity;
import power.keepeersofthestones.entity.ShadowBallEntity;
import power.keepeersofthestones.entity.RainBowEntity;
import power.keepeersofthestones.entity.PortalBlastEntity;
import power.keepeersofthestones.entity.PlasmaBallEntity;
import power.keepeersofthestones.entity.PieceOfEarthEntity;
import power.keepeersofthestones.entity.MoonStonesEntity;
import power.keepeersofthestones.entity.MegawattEntity;
import power.keepeersofthestones.entity.MagicFireballEntity;
import power.keepeersofthestones.entity.LavaBallEntity;
import power.keepeersofthestones.entity.KunaiEntity;
import power.keepeersofthestones.entity.IceSpearEntity;
import power.keepeersofthestones.entity.IceSharpEntity;
import power.keepeersofthestones.entity.IceBallEntity;
import power.keepeersofthestones.entity.GoldenCrossbowEntity;
import power.keepeersofthestones.entity.GlowEntity;
import power.keepeersofthestones.entity.FlashLightEntity;
import power.keepeersofthestones.entity.ExplosiveFlowEntity;
import power.keepeersofthestones.entity.EnergySphereEntity;
import power.keepeersofthestones.entity.DestructionSphereEntity;
import power.keepeersofthestones.entity.ClusterSharpEntity;
import power.keepeersofthestones.entity.BlackHoleEntity;
import power.keepeersofthestones.entity.BlackHeartEntity;
import power.keepeersofthestones.entity.AmberStreaksEntity;
import power.keepeersofthestones.entity.AirFlowEntity;
import power.keepeersofthestones.entity.AcusticalExplodeEntity;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PowerModEntities {
	private static final List<EntityType<?>> REGISTRY = new ArrayList<>();
	public static final EntityType<TornadoEntityEntity> TORNADO_ENTITY = register("tornado_entity",
			EntityType.Builder.<TornadoEntityEntity>of(TornadoEntityEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(256).setUpdateInterval(3).setCustomClientFactory(TornadoEntityEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final EntityType<TyrannosaurusRexEntity> TYRANNOSAURUS_REX = register("tyrannosaurus_rex",
			EntityType.Builder.<TyrannosaurusRexEntity>of(TyrannosaurusRexEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(256).setUpdateInterval(3).setCustomClientFactory(TyrannosaurusRexEntity::new).sized(0.5f, 1f));
	public static final EntityType<MagicFireballEntity> MAGIC_FIREBALL = register("projectile_magic_fireball",
			EntityType.Builder.<MagicFireballEntity>of(MagicFireballEntity::new, MobCategory.MISC).setCustomClientFactory(MagicFireballEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<AirFlowEntity> AIR_FLOW = register("projectile_air_flow",
			EntityType.Builder.<AirFlowEntity>of(AirFlowEntity::new, MobCategory.MISC).setCustomClientFactory(AirFlowEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<WaterFlowEntity> WATER_FLOW = register("projectile_water_flow",
			EntityType.Builder.<WaterFlowEntity>of(WaterFlowEntity::new, MobCategory.MISC).setCustomClientFactory(WaterFlowEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<PieceOfEarthEntity> PIECE_OF_EARTH = register("projectile_piece_of_earth",
			EntityType.Builder.<PieceOfEarthEntity>of(PieceOfEarthEntity::new, MobCategory.MISC).setCustomClientFactory(PieceOfEarthEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<EnergySphereEntity> ENERGY_SPHERE = register("projectile_energy_sphere",
			EntityType.Builder.<EnergySphereEntity>of(EnergySphereEntity::new, MobCategory.MISC).setCustomClientFactory(EnergySphereEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<IceBallEntity> ICE_BALL = register("projectile_ice_ball",
			EntityType.Builder.<IceBallEntity>of(IceBallEntity::new, MobCategory.MISC).setCustomClientFactory(IceBallEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<IceSharpEntity> ICE_SHARP = register("projectile_ice_sharp",
			EntityType.Builder.<IceSharpEntity>of(IceSharpEntity::new, MobCategory.MISC).setCustomClientFactory(IceSharpEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<PlasmaBallEntity> PLASMA_BALL = register("projectile_plasma_ball",
			EntityType.Builder.<PlasmaBallEntity>of(PlasmaBallEntity::new, MobCategory.MISC).setCustomClientFactory(PlasmaBallEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<AcusticalExplodeEntity> ACUSTICAL_EXPLODE = register("projectile_acustical_explode",
			EntityType.Builder.<AcusticalExplodeEntity>of(AcusticalExplodeEntity::new, MobCategory.MISC)
					.setCustomClientFactory(AcusticalExplodeEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<ClusterSharpEntity> CLUSTER_SHARP = register("projectile_cluster_sharp",
			EntityType.Builder.<ClusterSharpEntity>of(ClusterSharpEntity::new, MobCategory.MISC).setCustomClientFactory(ClusterSharpEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<LavaBallEntity> LAVA_BALL = register("projectile_lava_ball",
			EntityType.Builder.<LavaBallEntity>of(LavaBallEntity::new, MobCategory.MISC).setCustomClientFactory(LavaBallEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<TornadoCreateEntity> TORNADO_CREATE = register("projectile_tornado_create",
			EntityType.Builder.<TornadoCreateEntity>of(TornadoCreateEntity::new, MobCategory.MISC).setCustomClientFactory(TornadoCreateEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<WhirlpoolEntity> WHIRLPOOL = register("projectile_whirlpool",
			EntityType.Builder.<WhirlpoolEntity>of(WhirlpoolEntity::new, MobCategory.MISC).setCustomClientFactory(WhirlpoolEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<RainBowEntity> RAIN_BOW = register("projectile_rain_bow",
			EntityType.Builder.<RainBowEntity>of(RainBowEntity::new, MobCategory.MISC).setCustomClientFactory(RainBowEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<SpikeEntity> SPIKE = register("projectile_spike",
			EntityType.Builder.<SpikeEntity>of(SpikeEntity::new, MobCategory.MISC).setCustomClientFactory(SpikeEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<TigerClawEntity> TIGER_CLAW = register("projectile_tiger_claw",
			EntityType.Builder.<TigerClawEntity>of(TigerClawEntity::new, MobCategory.MISC).setCustomClientFactory(TigerClawEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<ShurikenEntity> SHURIKEN = register("projectile_shuriken",
			EntityType.Builder.<ShurikenEntity>of(ShurikenEntity::new, MobCategory.MISC).setCustomClientFactory(ShurikenEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<GlowEntity> GLOW = register("glow", EntityType.Builder.<GlowEntity>of(GlowEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GlowEntity::new).sized(1f, 1f));
	public static final EntityType<FlashLightEntity> FLASH_LIGHT = register("projectile_flash_light",
			EntityType.Builder.<FlashLightEntity>of(FlashLightEntity::new, MobCategory.MISC).setCustomClientFactory(FlashLightEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<ShadowEntity> SHADOW = register("shadow",
			EntityType.Builder.<ShadowEntity>of(ShadowEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(ShadowEntity::new).sized(1f, 1f));
	public static final EntityType<ShadowBallEntity> SHADOW_BALL = register("projectile_shadow_ball",
			EntityType.Builder.<ShadowBallEntity>of(ShadowBallEntity::new, MobCategory.MISC).setCustomClientFactory(ShadowBallEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<VacuumSpiralEntity> VACUUM_SPIRAL = register("projectile_vacuum_spiral",
			EntityType.Builder.<VacuumSpiralEntity>of(VacuumSpiralEntity::new, MobCategory.MISC).setCustomClientFactory(VacuumSpiralEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<VacuumWebEntity> VACUUM_WEB = register("projectile_vacuum_web",
			EntityType.Builder.<VacuumWebEntity>of(VacuumWebEntity::new, MobCategory.MISC).setCustomClientFactory(VacuumWebEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<SunExplodeEntity> SUN_EXPLODE = register("projectile_sun_explode",
			EntityType.Builder.<SunExplodeEntity>of(SunExplodeEntity::new, MobCategory.MISC).setCustomClientFactory(SunExplodeEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<MoonStonesEntity> MOON_STONES = register("projectile_moon_stones",
			EntityType.Builder.<MoonStonesEntity>of(MoonStonesEntity::new, MobCategory.MISC).setCustomClientFactory(MoonStonesEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<BlackHoleEntity> BLACK_HOLE = register("projectile_black_hole",
			EntityType.Builder.<BlackHoleEntity>of(BlackHoleEntity::new, MobCategory.MISC).setCustomClientFactory(BlackHoleEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<BlackHeartEntity> BLACK_HEART = register("projectile_black_heart",
			EntityType.Builder.<BlackHeartEntity>of(BlackHeartEntity::new, MobCategory.MISC).setCustomClientFactory(BlackHeartEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<TimeDilationEntity> TIME_DILATION = register("projectile_time_dilation",
			EntityType.Builder.<TimeDilationEntity>of(TimeDilationEntity::new, MobCategory.MISC).setCustomClientFactory(TimeDilationEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<MegawattEntity> MEGAWATT = register("projectile_megawatt",
			EntityType.Builder.<MegawattEntity>of(MegawattEntity::new, MobCategory.MISC).setCustomClientFactory(MegawattEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<PortalBlastEntity> PORTAL_BLAST = register("projectile_portal_blast",
			EntityType.Builder.<PortalBlastEntity>of(PortalBlastEntity::new, MobCategory.MISC).setCustomClientFactory(PortalBlastEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<ExplosiveFlowEntity> EXPLOSIVE_FLOW = register("projectile_explosive_flow",
			EntityType.Builder.<ExplosiveFlowEntity>of(ExplosiveFlowEntity::new, MobCategory.MISC).setCustomClientFactory(ExplosiveFlowEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<IceSpearEntity> ICE_SPEAR = register("projectile_ice_spear",
			EntityType.Builder.<IceSpearEntity>of(IceSpearEntity::new, MobCategory.MISC).setCustomClientFactory(IceSpearEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<GoldenCrossbowEntity> GOLDEN_CROSSBOW = register("projectile_golden_crossbow",
			EntityType.Builder.<GoldenCrossbowEntity>of(GoldenCrossbowEntity::new, MobCategory.MISC).setCustomClientFactory(GoldenCrossbowEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<DestructionSphereEntity> DESTRUCTION_SPHERE = register("projectile_destruction_sphere",
			EntityType.Builder.<DestructionSphereEntity>of(DestructionSphereEntity::new, MobCategory.MISC)
					.setCustomClientFactory(DestructionSphereEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<AmberStreaksEntity> AMBER_STREAKS = register("projectile_amber_streaks",
			EntityType.Builder.<AmberStreaksEntity>of(AmberStreaksEntity::new, MobCategory.MISC).setCustomClientFactory(AmberStreaksEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<KunaiEntity> KUNAI = register("projectile_kunai",
			EntityType.Builder.<KunaiEntity>of(KunaiEntity::new, MobCategory.MISC).setCustomClientFactory(KunaiEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> EntityType<T> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		EntityType<T> entityType = (EntityType<T>) entityTypeBuilder.build(registryname).setRegistryName(registryname);
		REGISTRY.add(entityType);
		return entityType;
	}

	@SubscribeEvent
	public static void registerEntities(RegistryEvent.Register<EntityType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new EntityType[0]));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			TornadoEntityEntity.init();
			TyrannosaurusRexEntity.init();
			GlowEntity.init();
			ShadowEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(TORNADO_ENTITY, TornadoEntityEntity.createAttributes().build());
		event.put(TYRANNOSAURUS_REX, TyrannosaurusRexEntity.createAttributes().build());
		event.put(GLOW, GlowEntity.createAttributes().build());
		event.put(SHADOW, ShadowEntity.createAttributes().build());
	}
}
