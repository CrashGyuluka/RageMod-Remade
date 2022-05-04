
package net.mcreator.ragemod.block;

import net.minecraft.world.level.material.Material;

import net.mcreator.ragemod.init.RagemodModBlocks;

import java.util.List;
import java.util.Collections;

public class CaltenBricksSlabBlock extends SlabBlock {
	public CaltenBricksSlabBlock() {
		super(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(3f, 10f).requiresCorrectToolForDrops());
	}

	@Override
	public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
		if (player.getInventory().getSelected().getItem() instanceof TieredItem tieredItem)
			return tieredItem.getTier().getLevel() >= 0;
		return false;
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, state.getValue(TYPE) == SlabType.DOUBLE ? 2 : 1));
	}

	@OnlyIn(Dist.CLIENT)
	public static void registerRenderLayer() {
		ItemBlockRenderTypes.setRenderLayer(RagemodModBlocks.CALTEN_BRICKS_SLAB.get(), renderType -> renderType == RenderType.cutout());
	}

}
