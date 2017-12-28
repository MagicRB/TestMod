package com.magic_rb.testmod;

import com.magic_rb.testmod.block.BlockFancyCobblestone;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModBlocks {
	// Block variable definitions
	public static BlockFancyCobblestone fancyCobble = new BlockFancyCobblestone(); 
	
	// Function to register the actual blocks
	public static void register(IForgeRegistry<Block> registry) {
		registry.registerAll(fancyCobble			
							);
	}
	
	// Function to register the associated item for blocks
	public static void regiterItemBlocks(IForgeRegistry<Item> registry) {
		registry.registerAll(fancyCobble.createItemBlock()
							);
	}
	
	// Function to register the models for the items associated with blocks 
	public static void registerModels() {
		fancyCobble.registerItemModel(Item.getItemFromBlock(fancyCobble));
	}
}
