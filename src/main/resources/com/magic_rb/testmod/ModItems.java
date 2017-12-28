package com.magic_rb.testmod;

import com.magic_rb.testmod.item.copper_tools.ToolAxeCopper;
import com.magic_rb.testmod.item.copper_tools.ToolHoeCopper;
import com.magic_rb.testmod.item.ItemIngotCopper;
import com.magic_rb.testmod.item.copper_tools.ToolPickaxeCopper;
import com.magic_rb.testmod.item.copper_tools.ToolShovelCopper;
import com.magic_rb.testmod.item.copper_tools.ToolSwordCopper;

import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModItems {
	
	// Item variable definitions
	
	// Copper related definitions
	public static ItemIngotCopper ingotCopper = new ItemIngotCopper();
	
	public static ToolAxeCopper axeCopper = new ToolAxeCopper();
	public static ToolHoeCopper hoeCopper = new ToolHoeCopper();
	public static ToolPickaxeCopper pickaxeCopper = new ToolPickaxeCopper();
	public static ToolShovelCopper shovelCopper = new ToolShovelCopper();
	public static ToolSwordCopper swordCopper = new ToolSwordCopper();
	
	// Function to register the actual items
	public static void register(IForgeRegistry<Item> registry) {
		registry.registerAll(ingotCopper,
							 axeCopper,
							 hoeCopper,
							 pickaxeCopper,
							 shovelCopper,
							 swordCopper
							);
	}
	
	// Function to register the models for the Items
	public static void registerModels() {
		ingotCopper.registerItemModel();
		axeCopper.registerItemModel();
		hoeCopper.registerItemModel();
		pickaxeCopper.registerItemModel();
		shovelCopper.registerItemModel();
		swordCopper.registerItemModel();
	}
}
