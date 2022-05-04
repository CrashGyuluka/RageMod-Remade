
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ragemod.init;

import net.mcreator.ragemod.client.gui.AdvBookEasterEggScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class RagemodModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(RagemodModMenus.ADV_BOOK_EASTER_EGG, AdvBookEasterEggScreen::new);
		});
	}
}
