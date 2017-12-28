package com.magic_rb.testmod.item.copper_tools;

import com.magic_rb.testmod.TestMod;

import net.minecraft.creativetab.CreativeTabs;

public class ToolAxeCopper extends net.minecraft.item.ItemAxe {

    protected     String       name     = "axe_copper";
	
	public static ToolMaterial material = TestMod.copperToolMaterial;
	       static CreativeTabs tab      = CreativeTabs.TOOLS;
	
	public ToolAxeCopper() {
		super(material, 8f, -3.1f);
		
		setUnlocalizedName(TestMod.modID + "." + this.name);
		setRegistryName(this.name);
		super.setCreativeTab(tab);
	}
	
	public void registerItemModel() {
		TestMod.proxy.registerItemRenderer("copper_tools/", this, 0, name);
	}
}
