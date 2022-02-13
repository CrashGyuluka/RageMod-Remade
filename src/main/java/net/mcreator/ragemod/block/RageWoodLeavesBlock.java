
package net.mcreator.ragemod.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.TieredItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.core.BlockPos;

import net.mcreator.ragemod.procedures.RageWoodLeavesBlockDestroyedByPlayerProcedure;

public class RageWoodLeavesBlock extends LeavesBlock {
	public RageWoodLeavesBlock() {
		super(BlockBehaviour.Properties.of(Material.LEAVES).sound(SoundType.GRASS).strength(0.15f, 2f).requiresCorrectToolForDrops().noOcclusion()
				.noDrops());
		setRegistryName("rage_wood_leaves");
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 1;
	}

	@Override
	public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
		if (player.getInventory().getSelected().getItem()instanceof TieredItem tieredItem)
			return tieredItem.getTier().getLevel() >= -1;
		return false;
	}

	@Override
	public boolean removedByPlayer(BlockState blockstate, Level world, BlockPos pos, Player entity, boolean willHarvest, FluidState fluid) {
		boolean retval = super.removedByPlayer(blockstate, world, pos, entity, willHarvest, fluid);
		RageWoodLeavesBlockDestroyedByPlayerProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ(), entity);
		return retval;
	}
}
