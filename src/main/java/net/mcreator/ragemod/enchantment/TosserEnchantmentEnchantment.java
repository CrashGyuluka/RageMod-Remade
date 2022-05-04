
package net.mcreator.ragemod.enchantment;

import net.mcreator.ragemod.init.RagemodModItems;

public class TosserEnchantmentEnchantment extends Enchantment {
	public TosserEnchantmentEnchantment(EquipmentSlot... slots) {
		super(Enchantment.Rarity.VERY_RARE, EnchantmentCategory.ARMOR_CHEST, slots);
	}

	@Override
	public int getMaxLevel() {
		return 4;
	}

	@Override
	public boolean canApplyAtEnchantingTable(ItemStack stack) {
		if (stack.getItem() == RagemodModItems.RAGEIUM_ARMOR_LEGGINGS.get())
			return true;
		return false;
	}
}
