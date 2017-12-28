package com.magic_rb.testmod.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import com.magic_rb.testmod.TestMod;

public class ItemIngotCopper extends Item {
	protected String name = "ingot_copper";
	CreativeTabs tab = CreativeTabs.MATERIALS;

	public ItemIngotCopper() {
		setUnlocalizedName(TestMod.modID + "." + this.name);
		setRegistryName(this.name);
		super.setCreativeTab(tab);
	}
	
	public void registerItemModel() {
		TestMod.proxy.registerItemRenderer("", this, 0, name);
	}
}
