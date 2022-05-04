package net.mcreator.ragemod.procedures;

import net.minecraftforge.eventbus.api.Event;

import net.mcreator.ragemod.init.RagemodModEnchantments;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class LifeStealerEnchantProcProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingAttackEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity());
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (EnchantmentHelper.getItemEnchantmentLevel(RagemodModEnchantments.LIFE_STEALER.get(),
				(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) > 0) {
			if (entity instanceof LivingEntity _entity)
				_entity.setHealth((float) ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1)
						+ EnchantmentHelper.getItemEnchantmentLevel(RagemodModEnchantments.LIFE_STEALER.get(),
								(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY))));
		}
	}
}
