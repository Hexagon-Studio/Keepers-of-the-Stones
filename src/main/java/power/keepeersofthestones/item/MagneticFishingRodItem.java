
package power.keepeersofthestones.item;

import power.keepeersofthestones.procedures.MagneticPowerUseProcedure;
import power.keepeersofthestones.init.PowerModItems;

import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.FishingRodItem;
import net.minecraft.world.entity.projectile.FishingHook;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;
import net.minecraft.stats.Stats;
import net.minecraft.sounds.SoundSource;
import net.minecraft.sounds.SoundEvents;

public class MagneticFishingRodItem extends FishingRodItem {
	public MagneticFishingRodItem() {
		super(new Item.Properties().tab(null).durability(5000).fireResistant());
	}

	@Override
	public int getEnchantmentValue() {
		return 2;
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		ItemStack itemstack = entity.getItemInHand(hand);
		if (entity.fishing != null) {
			if (!world.isClientSide()) {
				itemstack.hurtAndBreak(entity.fishing.retrieve(itemstack), entity, i -> i.broadcastBreakEvent(hand));
			}
			world.playSound(null, entity.getX(), entity.getY(), entity.getZ(), SoundEvents.FISHING_BOBBER_RETRIEVE, SoundSource.NEUTRAL, 1,
					0.4f / (world.getRandom().nextFloat() * 0.4f + 0.8f));
			world.gameEvent(entity, GameEvent.FISHING_ROD_REEL_IN, entity);
		} else {
			world.playSound(null, entity.getX(), entity.getY(), entity.getZ(), SoundEvents.FISHING_BOBBER_THROW, SoundSource.NEUTRAL, 0.5f,
					0.4f / (world.getRandom().nextFloat() * 0.4f + 0.8f));
			if (!world.isClientSide()) {
				int k = EnchantmentHelper.getFishingSpeedBonus(itemstack);
				int j = EnchantmentHelper.getFishingLuckBonus(itemstack);
				world.addFreshEntity(new FishingHook(entity, world, j, k) {
					@Override
					public boolean shouldStopFishing(Player player) {
						if (!player.isRemoved() && player.isAlive()
								&& (player.getMainHandItem().is(PowerModItems.MAGNETIC_FISHING_ROD.get())
										|| player.getOffhandItem().is(PowerModItems.MAGNETIC_FISHING_ROD.get()))
								&& !(this.distanceToSqr(player) > 1024)) {
							return false;
						} else {
							this.discard();
							return true;
						}
					}
				});
			}
			entity.awardStat(Stats.ITEM_USED.get(this));
			world.gameEvent(entity, GameEvent.FISHING_ROD_CAST, entity);
		}

		MagneticPowerUseProcedure.execute(world, entity, itemstack);
		return InteractionResultHolder.sidedSuccess(itemstack, world.isClientSide());
	}
}
