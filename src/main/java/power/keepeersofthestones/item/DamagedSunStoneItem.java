
package power.keepeersofthestones.item;

import power.keepeersofthestones.init.PowerModTabs;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class DamagedSunStoneItem extends Item {
	public DamagedSunStoneItem() {
		super(new Item.Properties().tab(PowerModTabs.TAB_DAMAGED_STONES).stacksTo(1).fireResistant().rarity(Rarity.COMMON));
		setRegistryName("damaged_sun_stone");
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
