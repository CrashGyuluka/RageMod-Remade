
package net.mcreator.ragemod.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.core.BlockPos;

import net.mcreator.ragemod.procedures.ToxicToolBlockDestroyedWithToolProcedure;
import net.mcreator.ragemod.init.RagemodModTabs;
import net.mcreator.ragemod.init.RagemodModItems;

public class ToxicAxeItem extends AxeItem {
	public ToxicAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 2000;
			}

			public float getSpeed() {
				return 6.5f;
			}

			public float getAttackDamageBonus() {
				return 3f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 10;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(RagemodModItems.RAW_TOXIC_CRYSTAL), new ItemStack(RagemodModItems.TOXIC_CRYSTAL));
			}
		}, 1, -2.9000000000000001f, new Item.Properties().tab(RagemodModTabs.TAB_RAGEMOD_TAB));
		setRegistryName("toxic_axe");
	}

	@Override
	public boolean mineBlock(ItemStack itemstack, Level world, BlockState blockstate, BlockPos pos, LivingEntity entity) {
		boolean retval = super.mineBlock(itemstack, world, blockstate, pos, entity);
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();

		ToxicToolBlockDestroyedWithToolProcedure.execute(world, x, y, z);
		return retval;
	}
}
