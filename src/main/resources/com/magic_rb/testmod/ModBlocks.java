package com.magic_rb.testmod;

import com.magic_rb.testmod.block.FancyCobblestone;
import com.magic_rb.testmod.tile_entity.EnergyCubeEntity;
import com.magic_rb.testmod.block.EnergyCube;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.IForgeRegistry;

public class ModBlocks {
	
	public static FancyCobblestone fancyCobble = new FancyCobblestone(); 
	public static EnergyCube	   energyCube  = new EnergyCube();
	
	public static void register(IForgeRegistry<Block> registry) {
		registry.registerAll(fancyCobble,
							energyCube				
							);
        
        GameRegistry.registerTileEntity(EnergyCubeEntity.class, TestMod.modID + "_energycube");
	}
	
	public static void regiterItemBlocks(IForgeRegistry<Item> registry) {
		registry.registerAll(fancyCobble.createItemBlock(),
							energyCube.createItemBlock()
							);
	}
	
	public static void registerModels() {
		fancyCobble.registerItemModel(Item.getItemFromBlock(fancyCobble));
		energyCube.registerItemModel(Item.getItemFromBlock(energyCube));
	}
}
