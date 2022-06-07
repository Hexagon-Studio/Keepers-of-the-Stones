
package power.keepeersofthestones.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class RechargeSpeedStoneMobEffect extends MobEffect {
	public RechargeSpeedStoneMobEffect() {
		super(MobEffectCategory.NEUTRAL, -16711732);
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.recharge_speed_stone";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
