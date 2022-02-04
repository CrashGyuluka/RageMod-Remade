
package net.mcreator.ragemod.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;

import net.mcreator.ragemod.init.RagemodModTabs;
import net.mcreator.ragemod.init.RagemodModItems;

public class ToxicHoeItem extends HoeItem {
	public ToxicHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 2000;
			}

			public float getSpeed() {
				return 5f;
			}

			public float getAttackDamageBonus() {
				return 0f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 12;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(RagemodModItems.RAW_TOXIC_CRYSTAL), new ItemStack(RagemodModItems.TOXIC_CRYSTAL));
			}
		}, 0, -3f, new Item.Properties().tab(RagemodModTabs.TAB_RAGEMOD_TAB));
		setRegistryName("toxic_hoe");
	}
}
