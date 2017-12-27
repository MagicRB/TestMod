package com.magic_rb.testmod.block;

import com.magic_rb.testmod.TestMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class FancyCobblestone extends Block {
	protected String name = "fancy_cobblestone";
	CreativeTabs tab = CreativeTabs.BUILDING_BLOCKS;
	
	public FancyCobblestone() {
		super(Material.ROCK);
		
		setUnlocalizedName(this.name);
		setRegistryName(this.name);
		
		setHardness(3f);
		setResistance(5f);
		
		super.setCreativeTab(tab);
	}
	
	public void registerItemModel(Item itemBlock) {
		TestMod.proxy.registerItemRenderer(itemBlock, 0, name);
	}
	
	public Item createItemBlock() {
		return new ItemBlock(this).setRegistryName(getRegistryName());
	}
}
