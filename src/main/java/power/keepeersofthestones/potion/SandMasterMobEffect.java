
package power.keepeersofthestones.potion;

import power.keepeersofthestones.procedures.SandMasterEffectsProcedure;
import power.keepeersofthestones.procedures.SandMasterEffectStartProcedure;
import power.keepeersofthestones.procedures.SandMasterEffectEndProcedure;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class SandMasterMobEffect extends MobEffect {
	public SandMasterMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -13159);
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.sand_master";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		SandMasterEffectStartProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		SandMasterEffectsProcedure.execute(entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		SandMasterEffectEndProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
