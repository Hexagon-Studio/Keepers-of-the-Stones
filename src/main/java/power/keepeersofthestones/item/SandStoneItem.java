
package power.keepeersofthestones.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class SandStoneItem extends Item {
	public SandStoneItem() {
		super(new Item.Properties().tab(null).durability(10).fireResistant().rarity(Rarity.COMMON));
		setRegistryName("sand_stone");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
		return 0F;
	}
}
