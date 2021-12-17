
package ru.minefox.keepeersofthestones.item;

import ru.minefox.keepeersofthestones.procedures.GreeneryStoneUseProcedure;
import ru.minefox.keepeersofthestones.init.PowerModTabs;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

public class GreeneryStoneItem extends Item {
	public GreeneryStoneItem() {
		super(new Item.Properties().tab(PowerModTabs.TAB_EXPERIMENTAL_STONES).durability(10).fireResistant().rarity(Rarity.COMMON));
		setRegistryName("greenery_stone");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
		return 0F;
	}

	@Override
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ItemStack itemstack = ar.getObject();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		GreeneryStoneUseProcedure.execute(entity);
		return ar;
	}
}
