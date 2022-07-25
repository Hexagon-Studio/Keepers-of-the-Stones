
package power.keepeersofthestones.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class RechargeMercuryStoneMobEffect extends MobEffect {
	public RechargeMercuryStoneMobEffect() {
		super(MobEffectCategory.NEUTRAL, -3355444);
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.recharge_mercury_stone";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
