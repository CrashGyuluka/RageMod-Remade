
package net.mcreator.ragemod.block;

import net.minecraft.world.level.material.Material;

public class FultBlock extends Block {
	public FultBlock() {
		super(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.BASALT).strength(5f, 10f).requiresCorrectToolForDrops());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}

	@Override
	public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
		if (player.getInventory().getSelected().getItem() instanceof TieredItem tieredItem)
			return tieredItem.getTier().getLevel() >= 1;
		return false;
	}
}
