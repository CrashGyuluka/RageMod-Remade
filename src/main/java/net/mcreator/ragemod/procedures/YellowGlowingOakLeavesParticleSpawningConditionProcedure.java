package net.mcreator.ragemod.procedures;

public class YellowGlowingOakLeavesParticleSpawningConditionProcedure {
	public static boolean execute() {
		if (Math.random() > 0.8) {
			return true;
		}
		return false;
	}
}
