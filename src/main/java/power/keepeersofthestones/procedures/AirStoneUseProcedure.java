package power.keepeersofthestones.procedures;

import power.keepeersofthestones.network.PowerModVariables;
import power.keepeersofthestones.init.PowerModMobEffects;
import power.keepeersofthestones.init.PowerModItems;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

public class AirStoneUseProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == PowerModItems.AIR_STONE) {
			if (!(entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.RECHARGE_AIR_STONE) : false)) {
				if (!(entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new PowerModVariables.PlayerVariables())).active) {
					if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new PowerModVariables.PlayerVariables())).power_level == 2) {
						if (entity instanceof LivingEntity _entity)
							_entity.addEffect(new MobEffectInstance(PowerModMobEffects.AIR_MASTER, 18000, 0, (false), (false)));
					} else if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new PowerModVariables.PlayerVariables())).power_level >= 3) {
						if (entity instanceof LivingEntity _entity)
							_entity.addEffect(new MobEffectInstance(PowerModMobEffects.AIR_MASTER, 24000, 0, (false), (false)));
					} else {
						if (entity instanceof LivingEntity _entity)
							_entity.addEffect(new MobEffectInstance(PowerModMobEffects.AIR_MASTER, 12000, 0, (false), (false)));
					}
				}
			}
		}
	}
}
