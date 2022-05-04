package net.mcreator.ragemod.procedures;

public class YellowGlowingVineNeighbourBlockChangesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (((world.getBlockState(new BlockPos(x, y + 1, z))).getMaterial() == net.minecraft.world.level.material.Material.LEAVES) == false
				&& (world.getBlockState(new BlockPos(x, y + 1, z))).is(BlockTags.create(new ResourceLocation("minecraft:leaves"))) == false) {
			{
				BlockPos _pos = new BlockPos(x, y, z);
				Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
				world.destroyBlock(_pos, false);
			}
		}
	}
}
