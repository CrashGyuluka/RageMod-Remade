package net.mcreator.ragemod.procedures;

import net.minecraftforge.eventbus.api.Event;

import net.mcreator.ragemod.network.RagemodModVariables;
import net.mcreator.ragemod.init.RagemodModEnchantments;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class BlocklockEnchProc1Procedure {
	@SubscribeEvent
	public static void onLeftClickBlock(PlayerInteractEvent.LeftClickBlock event) {
		if (event.getHand() != event.getPlayer().getUsedItemHand())
			return;
		execute(event, event.getWorld(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getPlayer());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (EnchantmentHelper.getItemEnchantmentLevel(RagemodModEnchantments.BLOCK_LOCK.get(),
				(entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)) != 0
				|| EnchantmentHelper.getItemEnchantmentLevel(RagemodModEnchantments.BLOCK_LOCK.get(),
						(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0) {
			if (((world.getBlockState(new BlockPos(x, y, z)))
					.getBlock() == ((entity.getCapability(RagemodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new RagemodModVariables.PlayerVariables())).BlockLockVar).getBlock()) == false) {
				if (event != null && event.isCancelable()) {
					event.setCanceled(true);
				}
			}
		}
	}
}
