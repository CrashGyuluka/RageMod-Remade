package net.mcreator.ragemod.procedures;

import java.util.Map;

public class YellowGlowingOakLeavesParticleSpawningConditionProcedure {

	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (Math.random() > 0.8) {
			return true;
		}
		return false;
	}
}
