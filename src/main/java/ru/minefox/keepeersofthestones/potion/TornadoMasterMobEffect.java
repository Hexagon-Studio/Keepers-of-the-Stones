
package ru.minefox.keepeersofthestones.potion;

import ru.minefox.keepeersofthestones.procedures.TornadoEffectsProcedure;
import ru.minefox.keepeersofthestones.procedures.TornadoEffectStartProcedure;
import ru.minefox.keepeersofthestones.procedures.TornadoEffectEndProcedure;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class TornadoMasterMobEffect extends MobEffect {
	public TornadoMasterMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -10066432);
		setRegistryName("tornado_master");
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.tornado_master";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		TornadoEffectStartProcedure.execute(entity);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		TornadoEffectsProcedure.execute(entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		TornadoEffectEndProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}