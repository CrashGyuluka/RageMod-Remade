package net.mcreator.ragemod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.ragemod.init.RagemodModMobEffects;
import net.mcreator.ragemod.init.RagemodModItems;

public class ToxicSwordLivingEntityIsHitWithToolProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (Math.random() < 0.05) {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(RagemodModMobEffects.PROTECTION_AGAINST_TOXIC) : false) == false) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(RagemodModItems.RAW_TOXIC_CRYSTAL));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
	}
}
