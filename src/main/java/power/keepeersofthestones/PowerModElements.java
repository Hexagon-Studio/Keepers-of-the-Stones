/*
 *    MCreator note:
 *
 *    This file is autogenerated to connect all MCreator mod elements together.
 *
 */
package power.keepeersofthestones;

import net.minecraftforge.forgespi.language.ModFileScanData;
import net.minecraftforge.fml.network.NetworkEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.tags.Tag;
import net.minecraft.network.PacketBuffer;
import net.minecraft.item.Item;
import net.minecraft.entity.EntityType;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.block.Block;

import java.util.function.Supplier;
import java.util.function.Function;
import java.util.function.BiConsumer;
import java.util.Set;
import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.Collections;
import java.util.ArrayList;

import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;

public class PowerModElements {
	public final List<ModElement> elements = new ArrayList<>();
	public final List<Supplier<Block>> blocks = new ArrayList<>();
	public final List<Supplier<Item>> items = new ArrayList<>();
	public final List<Supplier<EntityType<?>>> entities = new ArrayList<>();
	public final List<Supplier<Enchantment>> enchantments = new ArrayList<>();
	public static Map<ResourceLocation, net.minecraft.util.SoundEvent> sounds = new HashMap<>();

	public PowerModElements() {
		sounds.put(new ResourceLocation("power", "stone_activation"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("power", "stone_activation")));
		sounds.put(new ResourceLocation("power", "stone_deactivation"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("power", "stone_deactivation")));
		sounds.put(new ResourceLocation("power", "powerful_stone"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("power", "powerful_stone")));
		sounds.put(new ResourceLocation("power", "time_power"), new net.minecraft.util.SoundEvent(new ResourceLocation("power", "time_power")));
		sounds.put(new ResourceLocation("power", "tyrannosaurus_rex.hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("power", "tyrannosaurus_rex.hurt")));
		sounds.put(new ResourceLocation("power", "tyrannosaurus_rex.dead"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("power", "tyrannosaurus_rex.dead")));
		sounds.put(new ResourceLocation("power", "tyrannosaurus_rex.attack"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("power", "tyrannosaurus_rex.attack")));
		sounds.put(new ResourceLocation("power", "tyrannosaurus_rex.ambient"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("power", "tyrannosaurus_rex.ambient")));
		try {
			ModFileScanData modFileInfo = ModList.get().getModFileById("power").getFile().getScanResult();
			Set<ModFileScanData.AnnotationData> annotations = modFileInfo.getAnnotations();
			for (ModFileScanData.AnnotationData annotationData : annotations) {
				if (annotationData.getAnnotationType().getClassName().equals(ModElement.Tag.class.getName())) {
					Class<?> clazz = Class.forName(annotationData.getClassType().getClassName());
					if (clazz.getSuperclass() == PowerModElements.ModElement.class)
						elements.add((PowerModElements.ModElement) clazz.getConstructor(this.getClass()).newInstance(this));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		Collections.sort(elements);
		elements.forEach(PowerModElements.ModElement::initElements);
		MinecraftForge.EVENT_BUS.register(new PowerModVariables(this));
	}

	public void registerSounds(RegistryEvent.Register<net.minecraft.util.SoundEvent> event) {
		for (Map.Entry<ResourceLocation, net.minecraft.util.SoundEvent> sound : sounds.entrySet())
			event.getRegistry().register(sound.getValue().setRegistryName(sound.getKey()));
	}

	private int messageID = 0;

	public <T> void addNetworkMessage(Class<T> messageType, BiConsumer<T, PacketBuffer> encoder, Function<PacketBuffer, T> decoder,
			BiConsumer<T, Supplier<NetworkEvent.Context>> messageConsumer) {
		PowerMod.PACKET_HANDLER.registerMessage(messageID, messageType, encoder, decoder, messageConsumer);
		messageID++;
	}

	public List<ModElement> getElements() {
		return elements;
	}

	public List<Supplier<Block>> getBlocks() {
		return blocks;
	}

	public List<Supplier<Item>> getItems() {
		return items;
	}

	public List<Supplier<EntityType<?>>> getEntities() {
		return entities;
	}

	public List<Supplier<Enchantment>> getEnchantments() {
		return enchantments;
	}

	public static class ModElement implements Comparable<ModElement> {
		@Retention(RetentionPolicy.RUNTIME)
		public @interface Tag {
		}

		protected final PowerModElements elements;
		protected final int sortid;

		public ModElement(PowerModElements elements, int sortid) {
			this.elements = elements;
			this.sortid = sortid;
		}

		public void initElements() {
		}

		public void init(FMLCommonSetupEvent event) {
		}

		public void serverLoad(FMLServerStartingEvent event) {
		}

		@OnlyIn(Dist.CLIENT)
		public void clientLoad(FMLClientSetupEvent event) {
		}

		@Override
		public int compareTo(ModElement other) {
			return this.sortid - other.sortid;
		}
	}
}
