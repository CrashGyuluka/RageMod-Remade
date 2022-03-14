package net.mcreator.ragemod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class YellowGlowingVineBlockValidPlacementConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getMaterial() == net.minecraft.world.level.material.Material.LEAVES
				|| (world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)))
						.is(BlockTags.create(new ResourceLocation("minecraft:leaves")))) {
			return true;
		}
		return false;
	}
}
