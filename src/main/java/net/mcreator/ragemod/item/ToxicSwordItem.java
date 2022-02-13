
package net.mcreator.ragemod.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.ragemod.procedures.ToxicSwordLivingEntityIsHitWithToolProcedure;
import net.mcreator.ragemod.init.RagemodModTabs;
import net.mcreator.ragemod.init.RagemodModItems;

public class ToxicSwordItem extends SwordItem {
	public ToxicSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 2000;
			}

			public float getSpeed() {
				return 0f;
			}

			public float getAttackDamageBonus() {
				return 4f;
			}

			public int getLevel() {
				return 0;
			}

			public int getEnchantmentValue() {
				return 13;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(RagemodModItems.RAW_TOXIC_CRYSTAL), new ItemStack(RagemodModItems.TOXIC_CRYSTAL));
			}
		}, 3, -2.7f, new Item.Properties().tab(RagemodModTabs.TAB_RAGEMOD_TAB));
		setRegistryName("toxic_sword");
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		Level world = entity.level;

		ToxicSwordLivingEntityIsHitWithToolProcedure.execute(world, x, y, z, entity);
		return retval;
	}
}
