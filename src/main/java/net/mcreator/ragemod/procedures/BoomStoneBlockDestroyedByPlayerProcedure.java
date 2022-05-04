package net.mcreator.ragemod.procedures;

public class BoomStoneBlockDestroyedByPlayerProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof Level _level && !_level.isClientSide())
			_level.explode(null, x, y, z, 3, Explosion.BlockInteraction.NONE);
	}
}
