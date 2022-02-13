package net.mcreator.ragemod.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.core.BlockPos;

import net.mcreator.ragemod.init.RagemodModMobEffects;
import net.mcreator.ragemod.init.RagemodModGameRules;
import net.mcreator.ragemod.init.RagemodModBlocks;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class ToxicPlantProcProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			Entity entity = event.player;
			execute(event, entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean found = false;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		sx = -2;
		found = false;
		for (int index0 = 0; index0 < (int) (4); index0++) {
			sy = -2;
			for (int index1 = 0; index1 < (int) (4); index1++) {
				sz = -2;
				for (int index2 = 0; index2 < (int) (4); index2++) {
					if ((world.getBlockState(new BlockPos((int) (x + sx), (int) (y + sy), (int) (z + sz))))
							.getBlock() == RagemodModBlocks.TOXIC_PLANT) {
						found = true;
					}
					sz = sz + 1;
				}
				sy = sy + 1;
			}
			sx = sx + 1;
		}
		if (found == true) {
			if (world.getLevelData().getGameRules().getBoolean(RagemodModGameRules.TOXICGIVESBADEFFECTS) == true
					&& (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(RagemodModMobEffects.PROTECTION_AGAINST_TOXIC) : false) == false) {
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 120, 1, (false), (false)));
			}
		}
	}
}
