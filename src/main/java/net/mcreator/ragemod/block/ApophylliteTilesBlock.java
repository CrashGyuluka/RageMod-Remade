
package net.mcreator.ragemod.block;

import net.minecraft.world.level.material.Material;

import java.util.List;
import java.util.Collections;

public class ApophylliteTilesBlock extends Block {
	public ApophylliteTilesBlock() {
		super(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.NETHERITE_BLOCK).strength(2f, 10f).requiresCorrectToolForDrops());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}

	@Override
	public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
		if (player.getInventory().getSelected().getItem() instanceof TieredItem tieredItem)
			return tieredItem.getTier().getLevel() >= 2;
		return false;
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 1));
	}
}
