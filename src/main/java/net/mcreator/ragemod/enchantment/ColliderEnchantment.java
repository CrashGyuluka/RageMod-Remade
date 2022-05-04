
package net.mcreator.ragemod.enchantment;

public class ColliderEnchantment extends Enchantment {
	public ColliderEnchantment(EquipmentSlot... slots) {
		super(Enchantment.Rarity.RARE, EnchantmentCategory.WEARABLE, slots);
	}

	@Override
	public int getMaxLevel() {
		return 2;
	}

	@Override
	public boolean canApplyAtEnchantingTable(ItemStack stack) {
		if (stack.getItem() == Items.ELYTRA)
			return true;
		return false;
	}
}
