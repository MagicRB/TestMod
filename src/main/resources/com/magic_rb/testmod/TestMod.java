package com.magic_rb.testmod;
import com.magic_rb.testmod.proxy.ClientProxy;
import com.magic_rb.testmod.proxy.CommonProxy;

import net.minecraft.block.Block;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent.KeyInputEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod(modid = TestMod.modID, name = TestMod.name, version = TestMod.version)
public class TestMod {
	public static final String modID   = "testmod";
	public static final String name    = "Test Mod";
	public static final String version = "1.0.0";
	
	public static KeyBinding stealth;
	
	ClientEvents clientEvent = new ClientEvents();
	
	public static final Item.ToolMaterial copperToolMaterial = EnumHelper.addToolMaterial("COPPER", 2, 500, 6, 2, 14);
	
	@Mod.Instance(modID)
	public static TestMod instance;
	
	@SidedProxy(serverSide = "com.magic_rb.testmod.proxy.CommonProxy", clientSide = "com.magic_rb.testmod.proxy.ClientProxy")
	public static CommonProxy proxy;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {

	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.registerKeys();
		MinecraftForge.EVENT_BUS.register(clientEvent);
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}
	
	@Mod.EventBusSubscriber
	public static class RegistrationHandler {
		@SubscribeEvent
		public static void registerBlocks(RegistryEvent.Register<Block> event) {
			ModBlocks.register(event.getRegistry());
		}
		
		@SubscribeEvent
		public static void registerItems(RegistryEvent.Register<Item> event) {
			ModItems.register(event.getRegistry());
			ModBlocks.regiterItemBlocks(event.getRegistry());
		}
		 
		@SubscribeEvent
		public static void registerModels(ModelRegistryEvent event) {
			ModItems.registerModels();
			ModBlocks.registerModels();
		}
	}
}
