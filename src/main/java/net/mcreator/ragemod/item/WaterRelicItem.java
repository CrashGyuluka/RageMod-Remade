
package net.mcreator.ragemod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.ragemod.init.RagemodModTabs;

public class WaterRelicItem extends Item {
	public WaterRelicItem() {
		super(new Item.Properties().tab(RagemodModTabs.TAB_RAGEMOD_TAB).stacksTo(4).rarity(Rarity.RARE));
		setRegistryName("water_relic");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
