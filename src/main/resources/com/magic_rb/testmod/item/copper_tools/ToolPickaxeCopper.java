package com.magic_rb.testmod.item.copper_tools;

import com.magic_rb.testmod.TestMod;

import net.minecraft.creativetab.CreativeTabs;

public class ToolPickaxeCopper extends net.minecraft.item.ItemPickaxe {

    protected     String       name     = "pickaxe_copper";
	
	public static ToolMaterial material = TestMod.copperToolMaterial;
	       static CreativeTabs tab      = CreativeTabs.TOOLS;
	
	public ToolPickaxeCopper() {
		super(material);
		
		setUnlocalizedName(TestMod.modID + "." + this.name);
		setRegistryName(this.name);
		super.setCreativeTab(tab);
	}
	
	public void registerItemModel() {
		TestMod.proxy.registerItemRenderer("copper_tools/", this, 0, name);
	}
}
