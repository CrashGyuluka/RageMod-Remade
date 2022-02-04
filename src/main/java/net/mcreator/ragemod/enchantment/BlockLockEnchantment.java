
package net.mcreator.ragemod.enchantment;

import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.EquipmentSlot;

import net.mcreator.ragemod.init.RagemodModItems;

public class BlockLockEnchantment extends Enchantment {
	public BlockLockEnchantment(EquipmentSlot... slots) {
		super(Enchantment.Rarity.COMMON, EnchantmentCategory.DIGGER, slots);
	}

	@Override
	public boolean canApplyAtEnchantingTable(ItemStack stack) {
		if (stack.getItem() == RagemodModItems.TOXIC_PICKAXE)
			return true;
		if (stack.getItem() == Items.WOODEN_PICKAXE)
			return true;
		if (stack.getItem() == Items.STONE_PICKAXE)
			return true;
		if (stack.getItem() == Items.IRON_PICKAXE)
			return true;
		if (stack.getItem() == Items.GOLDEN_PICKAXE)
			return true;
		if (stack.getItem() == Items.DIAMOND_PICKAXE)
			return true;
		if (stack.getItem() == Items.NETHERITE_PICKAXE)
			return true;
		if (stack.getItem() == RagemodModItems.TOXIC_SHOVEL)
			return true;
		if (stack.getItem() == Items.WOODEN_SHOVEL)
			return true;
		if (stack.getItem() == Items.STONE_SHOVEL)
			return true;
		if (stack.getItem() == Items.IRON_SHOVEL)
			return true;
		if (stack.getItem() == Items.GOLDEN_SHOVEL)
			return true;
		if (stack.getItem() == Items.DIAMOND_SHOVEL)
			return true;
		if (stack.getItem() == Items.NETHERITE_SHOVEL)
			return true;
		if (stack.getItem() == RagemodModItems.TOXIC_AXE)
			return true;
		if (stack.getItem() == Items.WOODEN_AXE)
			return true;
		if (stack.getItem() == Items.STONE_AXE)
			return true;
		if (stack.getItem() == Items.IRON_AXE)
			return true;
		if (stack.getItem() == Items.GOLDEN_AXE)
			return true;
		if (stack.getItem() == Items.DIAMOND_AXE)
			return true;
		if (stack.getItem() == Items.NETHERITE_AXE)
			return true;
		return false;
	}
}
