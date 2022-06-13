
package power.keepeersofthestones.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class RechargeSandStoneMobEffect extends MobEffect {
	public RechargeSandStoneMobEffect() {
		super(MobEffectCategory.NEUTRAL, -13159);
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.recharge_sand_stone";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
