package com.magic_rb.testmod;

import com.magic_rb.testmod.item.IngotCopper;

import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModItems {
	public static IngotCopper ingotCopper = new IngotCopper();
	
	public static void register(IForgeRegistry<Item> registry) {
		registry.registerAll(ingotCopper);
	}
	
	public static void registerModels() {
		ingotCopper.registerItemModel();
	}
}
