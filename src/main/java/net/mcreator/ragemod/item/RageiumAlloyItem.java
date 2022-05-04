
package net.mcreator.ragemod.item;

import net.mcreator.ragemod.init.RagemodModTabs;

public class RageiumAlloyItem extends Item {
	public RageiumAlloyItem() {
		super(new Item.Properties().tab(RagemodModTabs.TAB_RAGEMOD_TAB).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
