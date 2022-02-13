package net.mcreator.ragemod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.ragemod.init.RagemodModMobEffects;
import net.mcreator.ragemod.init.RagemodModGameRules;

public class ToxicToppedStoneEntityWalksOnTheBlockProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (world.getLevelData().getGameRules().getBoolean(RagemodModGameRules.TOXICGIVESBADEFFECTS) == true
				&& (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(RagemodModMobEffects.PROTECTION_AGAINST_TOXIC) : false) == false) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.POISON, 60, 1, (false), (false)));
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 60, 1, (false), (false)));
		}
	}
}
