package power.keepeersofthestones.procedures;

import power.keepeersofthestones.init.PowerModItems;

import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import net.minecraft.client.Minecraft;

import java.util.Random;

public class RandomItemUseProcedure {
	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == PowerModItems.RANDOM_ITEM.get()) {
			if (world.isClientSide())
				Minecraft.getInstance().gameRenderer.displayItemActivation(itemstack);
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(itemstack.getItem(), 400);
			new Object() {
				private int ticks = 0;
				private float waitTicks;
				private LevelAccessor world;

				public void start(LevelAccessor world, int waitTicks) {
					this.waitTicks = waitTicks;
					MinecraftForge.EVENT_BUS.register(this);
					this.world = world;
				}

				@SubscribeEvent
				public void tick(TickEvent.ServerTickEvent event) {
					if (event.phase == TickEvent.Phase.END) {
						this.ticks += 1;
						if (this.ticks >= this.waitTicks)
							run();
					}
				}

				private void run() {
					if (Mth.nextInt(new Random(), 1, 25) == 1) {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(Items.BREAD);
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
					} else if (Mth.nextInt(new Random(), 1, 25) == 2) {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(Items.COOKED_BEEF);
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
					} else if (Mth.nextInt(new Random(), 1, 25) == 3) {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(Blocks.CAKE);
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
					} else if (Mth.nextInt(new Random(), 1, 25) == 4) {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(Items.STICK);
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
					} else if (Mth.nextInt(new Random(), 1, 25) == 5) {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(Items.IRON_INGOT);
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
					} else if (Mth.nextInt(new Random(), 1, 25) == 6) {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(Items.GOLD_INGOT);
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
					} else if (Mth.nextInt(new Random(), 1, 25) == 7) {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(Items.IRON_HOE);
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
					} else if (Mth.nextInt(new Random(), 1, 25) == 8) {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(Items.IRON_SHOVEL);
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
					} else if (Mth.nextInt(new Random(), 1, 25) == 9) {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(Items.IRON_AXE);
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
					} else if (Mth.nextInt(new Random(), 1, 25) == 10) {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(Items.IRON_SWORD);
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
					} else if (Mth.nextInt(new Random(), 1, 25) == 11) {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(Items.IRON_PICKAXE);
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
					} else if (Mth.nextInt(new Random(), 1, 25) == 12) {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(Items.DIAMOND);
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
					} else if (Mth.nextInt(new Random(), 1, 25) == 13) {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(Items.ENDER_PEARL);
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
					} else if (Mth.nextInt(new Random(), 1, 25) == 14) {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(Blocks.OBSIDIAN);
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
					} else if (Mth.nextInt(new Random(), 1, 25) == 15) {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(Blocks.BONE_BLOCK);
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
					} else if (Mth.nextInt(new Random(), 1, 25) == 16) {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(Blocks.IRON_BLOCK);
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
					} else if (Mth.nextInt(new Random(), 1, 25) == 17) {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(Blocks.GOLD_BLOCK);
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
					} else if (Mth.nextInt(new Random(), 1, 25) == 18) {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(Items.NETHERITE_INGOT);
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
					} else if (Mth.nextInt(new Random(), 1, 25) == 19) {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(Items.EXPERIENCE_BOTTLE);
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
					} else if (Mth.nextInt(new Random(), 1, 25) == 20) {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(Items.SADDLE);
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
					} else if (Mth.nextInt(new Random(), 1, 25) == 21) {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(Items.DIAMOND_HORSE_ARMOR);
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
					} else if (Mth.nextInt(new Random(), 1, 25) == 22) {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(Blocks.TNT);
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
					} else if (Mth.nextInt(new Random(), 1, 25) == 23) {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(Items.TOTEM_OF_UNDYING);
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
					} else if (Mth.nextInt(new Random(), 1, 25) == 24) {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(Blocks.DIAMOND_BLOCK);
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
					} else if (Mth.nextInt(new Random(), 1, 25) == 25) {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(Items.NETHER_STAR);
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
					}
					MinecraftForge.EVENT_BUS.unregister(this);
				}
			}.start(world, 3);
		}
	}
}
