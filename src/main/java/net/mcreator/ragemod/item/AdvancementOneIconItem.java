
package net.mcreator.ragemod.item;

import net.mcreator.ragemod.procedures.AdvBookEaProcProcedure;

public class AdvancementOneIconItem extends Item {
	public AdvancementOneIconItem() {
		super(new Item.Properties().tab(null).stacksTo(1).rarity(Rarity.EPIC));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
		return 0F;
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ItemStack itemstack = ar.getObject();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		AdvBookEaProcProcedure.execute(world, x, y, z, entity);
		return ar;
	}
}
