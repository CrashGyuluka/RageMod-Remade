
package net.mcreator.ragemod.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class ProtectionAgainstToxicMobEffect extends MobEffect {
	public ProtectionAgainstToxicMobEffect() {
		super(MobEffectCategory.NEUTRAL, -13382656);
		setRegistryName("protection_against_toxic");
	}

	@Override
	public String getDescriptionId() {
		return "effect.ragemod.protection_against_toxic";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
