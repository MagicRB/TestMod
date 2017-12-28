package com.magic_rb.testmod.proxy;

import org.lwjgl.input.Keyboard;

import com.magic_rb.testmod.TestMod;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.client.registry.ClientRegistry;

public class ClientProxy extends CommonProxy {
	
	public void registerKeys() {
		TestMod.stealth = new KeyBinding("key.structure.desc", Keyboard.KEY_V, "key.categories.gameplay");
		ClientRegistry.registerKeyBinding(TestMod.stealth);
		System.out.println("test");
	}
	
	@Override
	public void registerItemRenderer(String prefix,Item item, int meta, String id) {
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(TestMod.modID + ":" + prefix + id, "inventory"));
	}

}
