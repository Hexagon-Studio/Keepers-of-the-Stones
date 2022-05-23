package power.keepeersofthestones.procedures;

import power.keepeersofthestones.init.PowerModMobEffects;
import power.keepeersofthestones.init.PowerModItems;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

public class ForceReplicationUseProcedure {
	public static void execute(Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.FIRE_MASTER) : false) {
			if (!(sourceentity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.FIRE_MASTER) : false)) {
				if (sourceentity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(PowerModMobEffects.FIRE_MASTER, 6000, 0, (false), (false)));
			}
		}
		if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.AIR_MASTER) : false) {
			if (!(sourceentity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.AIR_MASTER) : false)) {
				if (sourceentity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(PowerModMobEffects.AIR_MASTER, 6000, 0, (false), (false)));
			}
		}
		if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.WATER_MASTER) : false) {
			if (!(sourceentity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.WATER_MASTER) : false)) {
				if (sourceentity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(PowerModMobEffects.WATER_MASTER, 6000, 0, (false), (false)));
			}
		}
		if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.EARTH_MASTER) : false) {
			if (!(sourceentity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.EARTH_MASTER) : false)) {
				if (sourceentity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(PowerModMobEffects.EARTH_MASTER, 6000, 0, (false), (false)));
			}
		}
		if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.ENERGY_MASTER) : false) {
			if (!(sourceentity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.ENERGY_MASTER) : false)) {
				if (sourceentity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(PowerModMobEffects.ENERGY_MASTER, 6000, 0, (false), (false)));
			}
		}
		if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.ICE_MASTER) : false) {
			if (!(sourceentity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.ICE_MASTER) : false)) {
				if (sourceentity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(PowerModMobEffects.ICE_MASTER, 6000, 0, (false), (false)));
			}
		}
		if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.LIGHTNING_MASTER) : false) {
			if (!(sourceentity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.LIGHTNING_MASTER) : false)) {
				if (sourceentity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(PowerModMobEffects.LIGHTNING_MASTER, 6000, 0, (false), (false)));
			}
		}
		if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.SOUND_MASTER) : false) {
			if (!(sourceentity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.SOUND_MASTER) : false)) {
				if (sourceentity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(PowerModMobEffects.SOUND_MASTER, 6000, 0, (false), (false)));
			}
		}
		if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.CRYSTAL_MASTER) : false) {
			if (!(sourceentity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.CRYSTAL_MASTER) : false)) {
				if (sourceentity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(PowerModMobEffects.CRYSTAL_MASTER, 6000, 0, (false), (false)));
			}
		}
		if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.LAVA_MASTER) : false) {
			if (!(sourceentity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.LAVA_MASTER) : false)) {
				if (sourceentity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(PowerModMobEffects.LAVA_MASTER, 6000, 0, (false), (false)));
			}
		}
		if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.RAIN_MASTER) : false) {
			if (!(sourceentity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.RAIN_MASTER) : false)) {
				if (sourceentity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(PowerModMobEffects.RAIN_MASTER, 6000, 0, (false), (false)));
			}
		}
		if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.TORNADO_MASTER) : false) {
			if (!(sourceentity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.TORNADO_MASTER) : false)) {
				if (sourceentity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(PowerModMobEffects.TORNADO_MASTER, 6000, 0, (false), (false)));
			}
		}
		if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.OCEAN_MASTER) : false) {
			if (!(sourceentity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.OCEAN_MASTER) : false)) {
				if (sourceentity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(PowerModMobEffects.OCEAN_MASTER, 6000, 0, (false), (false)));
			}
		}
		if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.GREENERY_MASTER) : false) {
			if (!(sourceentity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.GREENERY_MASTER) : false)) {
				if (sourceentity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(PowerModMobEffects.GREENERY_MASTER, 6000, 0, (false), (false)));
			}
		}
		if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.ANIMALS_MASTER) : false) {
			if (!(sourceentity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.ANIMALS_MASTER) : false)) {
				if (sourceentity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(PowerModMobEffects.ANIMALS_MASTER, 6000, 0, (false), (false)));
			}
		}
		if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.METAL_MASTER) : false) {
			if (!(sourceentity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.METAL_MASTER) : false)) {
				if (sourceentity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(PowerModMobEffects.METAL_MASTER, 6000, 0, (false), (false)));
			}
		}
		if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.LIGHT_MASTER) : false) {
			if (!(sourceentity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.LIGHT_MASTER) : false)) {
				if (sourceentity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(PowerModMobEffects.LIGHT_MASTER, 6000, 0, (false), (false)));
			}
		}
		if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.SHADOW_MASTER) : false) {
			if (!(sourceentity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.SHADOW_MASTER) : false)) {
				if (sourceentity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(PowerModMobEffects.SHADOW_MASTER, 6000, 0, (false), (false)));
			}
		}
		if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.VACUUM_MASTER) : false) {
			if (!(sourceentity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.VACUUM_MASTER) : false)) {
				if (sourceentity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(PowerModMobEffects.VACUUM_MASTER, 6000, 0, (false), (false)));
			}
		}
		if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.SUN_MASTER) : false) {
			if (!(sourceentity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.SUN_MASTER) : false)) {
				if (sourceentity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(PowerModMobEffects.SUN_MASTER, 6000, 0, (false), (false)));
			}
		}
		if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.MOON_MASTER) : false) {
			if (!(sourceentity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.MOON_MASTER) : false)) {
				if (sourceentity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(PowerModMobEffects.MOON_MASTER, 6000, 0, (false), (false)));
			}
		}
		if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.SPACE_MASTER) : false) {
			if (!(sourceentity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.SPACE_MASTER) : false)) {
				if (sourceentity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(PowerModMobEffects.SPACE_MASTER, 6000, 0, (false), (false)));
			}
		}
		if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.BLOOD_MASTER) : false) {
			if (!(sourceentity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.BLOOD_MASTER) : false)) {
				if (sourceentity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(PowerModMobEffects.BLOOD_MASTER, 6000, 0, (false), (false)));
			}
		}
		if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.TECHNOLOGY_MASTER) : false) {
			if (!(sourceentity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.TECHNOLOGY_MASTER) : false)) {
				if (sourceentity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(PowerModMobEffects.TECHNOLOGY_MASTER, 6000, 0, (false), (false)));
			}
		}
		if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.TIME_MASTER_EFFECT) : false) {
			if (!(sourceentity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.TIME_MASTER_EFFECT) : false)) {
				if (sourceentity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(PowerModMobEffects.TIME_MASTER_EFFECT, 6000, 0, (false), (false)));
			}
		}
		if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.TELEPORTATION_MASTER) : false) {
			if (!(sourceentity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.TELEPORTATION_MASTER) : false)) {
				if (sourceentity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(PowerModMobEffects.TELEPORTATION_MASTER, 6000, 0, (false), (false)));
			}
		}
		if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.EXPLOSION_MASTER) : false) {
			if (!(sourceentity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.EXPLOSION_MASTER) : false)) {
				if (sourceentity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(PowerModMobEffects.EXPLOSION_MASTER, 6000, 0, (false), (false)));
			}
		}
		if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.MIST_MASTER) : false) {
			if (!(sourceentity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.MIST_MASTER) : false)) {
				if (sourceentity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(PowerModMobEffects.MIST_MASTER, 6000, 0, (false), (false)));
			}
		}
		if (!(sourceentity instanceof Player _playerHasItem
				? _playerHasItem.getInventory().contains(new ItemStack(PowerModItems.FORCE_REPLICATION))
				: false)) {
			{
				Entity _ent = sourceentity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null)
					_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
							"give @s power:force_replication{Enchantments:[{id:binding_curse,lvl:1},{id:vanishing_curse,lvl:1}]}");
			}
		}
	}
}
