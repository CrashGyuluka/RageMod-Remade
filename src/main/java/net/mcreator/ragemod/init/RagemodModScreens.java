
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ragemod.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.ragemod.client.gui.ToxicToppedBlocksItemGuiScreen;
import net.mcreator.ragemod.client.gui.AdvBookEasterEggScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class RagemodModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(RagemodModMenus.ADV_BOOK_EASTER_EGG, AdvBookEasterEggScreen::new);
			MenuScreens.register(RagemodModMenus.TOXIC_TOPPED_BLOCKS_ITEM_GUI, ToxicToppedBlocksItemGuiScreen::new);
		});
	}
}
