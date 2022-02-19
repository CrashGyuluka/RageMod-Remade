package net.mcreator.ragemod.procedures;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class YellowGlowingVineNeighbourBlockChangesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)))
				.getMaterial() == net.minecraft.world.level.material.Material.LEAVES) == false
				&& BlockTags.getAllTags().getTagOrEmpty(new ResourceLocation("minecraft:leaves"))
						.contains((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock()) == false) {
			if (world instanceof Level) {
				Block.dropResources(world.getBlockState(new BlockPos((int) x, (int) y, (int) z)), (Level) world,
						new BlockPos((int) x, (int) y, (int) z));
				world.destroyBlock(new BlockPos((int) x, (int) y, (int) z), false);
			}
		}
	}
}
