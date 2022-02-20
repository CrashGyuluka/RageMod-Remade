package net.mcreator.ragemod.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.ragemod.init.RagemodModBlocks;

public class GlowingVinesAirUpdateTickProcProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.AIR) {
			if (BlockTags.getAllTags().getTagOrEmpty(new ResourceLocation("forge:glowing_oak_leaves"))
					.contains((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock())) {
				if ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == RagemodModBlocks.YELLOW_GLOWING_OAK_LEAVES) {
					if (0.4 >= Math.random()) {
						world.setBlock(new BlockPos((int) x, (int) y, (int) z), RagemodModBlocks.YELLOW_GLOWING_VINE.defaultBlockState(), 3);
					}
				} else if ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)))
						.getBlock() == RagemodModBlocks.BROWN_GLOWING_OAK_LEAVES) {
					if (0.4 >= Math.random()) {
						world.setBlock(new BlockPos((int) x, (int) y, (int) z), RagemodModBlocks.BROWN_GLOWING_VINE.defaultBlockState(), 3);
					}
				} else if ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)))
						.getBlock() == RagemodModBlocks.RED_GLOWING_OAK_LEAVES) {
					if (0.4 >= Math.random()) {
						world.setBlock(new BlockPos((int) x, (int) y, (int) z), RagemodModBlocks.RED_GLOWING_VINE.defaultBlockState(), 3);
					}
				} else if ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)))
						.getBlock() == RagemodModBlocks.GREEN_GLOWING_OAK_LEAVES) {
					if (0.4 >= Math.random()) {
						world.setBlock(new BlockPos((int) x, (int) y, (int) z), RagemodModBlocks.GREEN_GLOWING_VINE.defaultBlockState(), 3);
					}
				}
			}
		}
	}
}
