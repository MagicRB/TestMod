package com.magic_rb.testmod;

import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.ClientTickEvent;
import net.minecraftforge.fml.relauncher.Side;

public class ClientEvents {
	@SubscribeEvent
	public void onUpdate(ClientTickEvent event)
	{
		if (event.side == Side.CLIENT) {
			if (TestMod.stealth.isKeyDown()) {
				System.out.println("stealth");
			}
		}
	}
}
