
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package power.keepeersofthestones.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class PowerModTabs {
	public static CreativeModeTab TAB_BASIC_GROUP;
	public static CreativeModeTab TAB_ADDITIONAL_GROUP;
	public static CreativeModeTab TAB_MIDDLE_GROUP;
	public static CreativeModeTab TAB_GREAT_GROUP;
	public static CreativeModeTab TAB_BATTERIES;
	public static CreativeModeTab TAB_EXPERIMENTAL_GROUP;
	public static CreativeModeTab TAB_MAGICAL_ARTIFACTS;

	public static void load() {
		TAB_BASIC_GROUP = new CreativeModeTab("tabbasic_group") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(PowerModItems.FIRE_STONE.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_ADDITIONAL_GROUP = new CreativeModeTab("tabadditional_group") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(PowerModItems.ICE_STONE.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_MIDDLE_GROUP = new CreativeModeTab("tabmiddle_group") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(PowerModItems.GREENERY_STONE.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_GREAT_GROUP = new CreativeModeTab("tabgreat_group") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(PowerModItems.COSMOS_STONE.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_BATTERIES = new CreativeModeTab("tabbatteries") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(PowerModItems.EMPTY_BATTERY.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_EXPERIMENTAL_GROUP = new CreativeModeTab("tabexperimental_group") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(PowerModItems.MIST_STONE.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_MAGICAL_ARTIFACTS = new CreativeModeTab("tabmagical_artifacts") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(PowerModItems.BOOK_OF_ELEMENTS.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
