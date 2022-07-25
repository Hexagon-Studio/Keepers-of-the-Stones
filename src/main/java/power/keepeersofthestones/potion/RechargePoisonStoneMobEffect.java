
package power.keepeersofthestones.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class RechargePoisonStoneMobEffect extends MobEffect {
	public RechargePoisonStoneMobEffect() {
		super(MobEffectCategory.NEUTRAL, -10040320);
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.recharge_poison_stone";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
