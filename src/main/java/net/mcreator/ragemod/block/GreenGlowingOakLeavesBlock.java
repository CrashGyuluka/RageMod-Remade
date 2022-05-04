
package net.mcreator.ragemod.block;

import net.minecraft.world.level.material.Material;

import net.mcreator.ragemod.procedures.GreenGlowingOakLeavesBlockDestroyedByPlayerProcedure;

public class GreenGlowingOakLeavesBlock extends LeavesBlock {
	public GreenGlowingOakLeavesBlock() {
		super(BlockBehaviour.Properties.of(Material.LEAVES).sound(SoundType.GRASS).strength(0.25f, 2f).lightLevel(s -> 9)
				.requiresCorrectToolForDrops().noOcclusion().noDrops());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 2;
	}

	@Override
	public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
		if (player.getInventory().getSelected().getItem() instanceof TieredItem tieredItem)
			return tieredItem.getTier().getLevel() >= -1;
		return false;
	}

	@Override
	public boolean onDestroyedByPlayer(BlockState blockstate, Level world, BlockPos pos, Player entity, boolean willHarvest, FluidState fluid) {
		boolean retval = super.onDestroyedByPlayer(blockstate, world, pos, entity, willHarvest, fluid);
		GreenGlowingOakLeavesBlockDestroyedByPlayerProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ(), entity);
		return retval;
	}
}
