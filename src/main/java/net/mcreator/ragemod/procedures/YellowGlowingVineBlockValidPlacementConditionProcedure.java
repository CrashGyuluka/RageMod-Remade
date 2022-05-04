package net.mcreator.ragemod.procedures;

public class YellowGlowingVineBlockValidPlacementConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(new BlockPos(x, y + 1, z))).getMaterial() == net.minecraft.world.level.material.Material.LEAVES
				|| (world.getBlockState(new BlockPos(x, y + 1, z))).is(BlockTags.create(new ResourceLocation("minecraft:leaves")))) {
			return true;
		}
		return false;
	}
}
