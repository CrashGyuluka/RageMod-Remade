
package net.mcreator.ragemod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.ragemod.init.RagemodModTabs;

public class AdulariaItem extends Item {
	public AdulariaItem() {
		super(new Item.Properties().tab(RagemodModTabs.TAB_RAGEMOD_TAB).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("adularia");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
