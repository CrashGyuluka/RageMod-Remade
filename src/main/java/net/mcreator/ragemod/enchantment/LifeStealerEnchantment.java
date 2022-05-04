
package net.mcreator.ragemod.enchantment;

public class LifeStealerEnchantment extends Enchantment {
	public LifeStealerEnchantment(EquipmentSlot... slots) {
		super(Enchantment.Rarity.RARE, EnchantmentCategory.WEAPON, slots);
	}

	@Override
	public int getMaxLevel() {
		return 3;
	}
}
