
package ru.minefox.keepeersofthestones.potion;

import ru.minefox.keepeersofthestones.procedures.IceMasterEffectStartProcedure;
import ru.minefox.keepeersofthestones.procedures.IceMasterEffectEndProcedure;
import ru.minefox.keepeersofthestones.procedures.IceEffectsProcedure;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class IceMasterMobEffect extends MobEffect {
	public IceMasterMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -16711681);
		setRegistryName("ice_master");
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.ice_master";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		IceMasterEffectStartProcedure.execute(entity);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		IceEffectsProcedure.execute(entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		IceMasterEffectEndProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}