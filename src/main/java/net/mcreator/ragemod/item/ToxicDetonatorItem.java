
package net.mcreator.ragemod.item;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;

import net.mcreator.ragemod.procedures.ToxicDetonatorRightClickedOnBlockProcedure;
import net.mcreator.ragemod.init.RagemodModTabs;

public class ToxicDetonatorItem extends Item {
	public ToxicDetonatorItem() {
		super(new Item.Properties().tab(RagemodModTabs.TAB_RAGEMOD_TAB).durability(10).rarity(Rarity.COMMON));
		setRegistryName("toxic_detonator");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		InteractionResult retval = super.useOn(context);
		ToxicDetonatorRightClickedOnBlockProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(),
				context.getClickedPos().getZ(), context.getPlayer());
		return retval;
	}
}
