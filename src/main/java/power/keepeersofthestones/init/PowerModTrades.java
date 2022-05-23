
/*
*    MCreator note: This file will be REGENERATED on each build.
*/
package power.keepeersofthestones.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicItemListing;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.entity.npc.VillagerProfession;

import java.util.List;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class PowerModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
		if (event.getType() == VillagerProfession.LIBRARIAN) {
			trades.get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 32), new ItemStack(Items.BOOK),
					new ItemStack(PowerModItems.ELEMENTAL_COIN.get()), 1, 100, 0.55f));
		}
	}
}