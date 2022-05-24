
package power.keepeersofthestones.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class RechargeMistStoneMobEffect extends MobEffect {
	public RechargeMistStoneMobEffect() {
		super(MobEffectCategory.NEUTRAL, -13434778);
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.recharge_mist_stone";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
