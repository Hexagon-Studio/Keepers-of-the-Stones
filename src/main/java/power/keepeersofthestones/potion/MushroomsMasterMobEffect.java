
package power.keepeersofthestones.potion;

import power.keepeersofthestones.procedures.MushroomsMasterEffectsProcedure;
import power.keepeersofthestones.procedures.MushroomsMasterEffectStartProcedure;
import power.keepeersofthestones.procedures.MushroomsMasterEffectEndProcedure;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class MushroomsMasterMobEffect extends MobEffect {
	public MushroomsMasterMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -6750055);
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.mushrooms_master";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		MushroomsMasterEffectStartProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		MushroomsMasterEffectsProcedure.execute(entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		MushroomsMasterEffectEndProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
