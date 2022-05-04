package net.mcreator.ragemod.procedures;

import net.minecraftforge.eventbus.api.Event;

import net.mcreator.ragemod.init.RagemodModEnchantments;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class TosserEnchantProcProcedure {
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
		double enchantLevel = 0;
		enchantLevel = EnchantmentHelper.getItemEnchantmentLevel(RagemodModEnchantments.TOSSER_ENCHANTMENT.get(),
				(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY));
		if (enchantLevel > 0) {
			entity.setDeltaMovement(new Vec3(0, (2 + enchantLevel), 0));
		}
	}
}
