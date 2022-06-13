
package power.keepeersofthestones.potion;

import power.keepeersofthestones.procedures.SpeedMasterEffectsProcedure;
import power.keepeersofthestones.procedures.SpeedMasterEffectStartProcedure;
import power.keepeersofthestones.procedures.SpeedMasterEffectEndProcedure;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class SpeedMasterMobEffect extends MobEffect {
	public SpeedMasterMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -16711732);
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.speed_master";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		SpeedMasterEffectStartProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		SpeedMasterEffectsProcedure.execute(entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		SpeedMasterEffectEndProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
