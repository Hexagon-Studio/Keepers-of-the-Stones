
package power.keepeersofthestones.potion;

import power.keepeersofthestones.procedures.MistMasterEffectsProcedure;
import power.keepeersofthestones.procedures.MistMasterEffectStartProcedure;
import power.keepeersofthestones.procedures.MistMasterEffectEndProcedure;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class MistMasterMobEffect extends MobEffect {
	public MistMasterMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -13434778);
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.mist_master";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		MistMasterEffectStartProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		MistMasterEffectsProcedure.execute(entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		MistMasterEffectEndProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
