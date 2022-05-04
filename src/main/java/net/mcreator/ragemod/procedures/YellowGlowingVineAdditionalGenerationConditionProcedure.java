package net.mcreator.ragemod.procedures;

public class YellowGlowingVineAdditionalGenerationConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(new BlockPos(x, y + 1, z))).is(BlockTags.create(new ResourceLocation("forge:glowing_oak_leaves"))) == true) {
			return true;
		}
		return false;
	}
}
