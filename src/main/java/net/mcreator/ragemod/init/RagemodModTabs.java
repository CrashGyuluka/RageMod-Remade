
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ragemod.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class RagemodModTabs {
	public static CreativeModeTab TAB_RAGEMOD_TAB;

	public static void load() {
		TAB_RAGEMOD_TAB = new CreativeModeTab("tabragemod_tab") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(RagemodModItems.RAGEIUM_ALLOY.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
