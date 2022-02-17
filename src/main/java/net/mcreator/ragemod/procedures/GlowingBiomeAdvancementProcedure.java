package net.mcreator.ragemod.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.BonemealEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import javax.annotation.Nullable;

import java.util.Iterator;

@Mod.EventBusSubscriber
public class GlowingBiomeAdvancementProcedure {
	@SubscribeEvent
	public static void onBonemeal(BonemealEvent event) {
		Player entity = event.getPlayer();
		execute(event, event.getWorld(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), entity);
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (new ResourceLocation("ragemod:glowing_oak_field")
				.equals(world.getBiome(new BlockPos((int) x, (int) y, (int) z)).getRegistryName()) == true
				|| new ResourceLocation("ragemod:glowing_oak_forest")
						.equals(world.getBiome(new BlockPos((int) x, (int) y, (int) z)).getRegistryName()) == true
				|| new ResourceLocation("ragemod:glowing_oak_forest_mountain")
						.equals(world.getBiome(new BlockPos((int) x, (int) y, (int) z)).getRegistryName()) == true
				|| new ResourceLocation("ragemod:spare_glowing_oak_forest")
						.equals(world.getBiome(new BlockPos((int) x, (int) y, (int) z)).getRegistryName()) == true) {
			if (entity instanceof ServerPlayer _player) {
				Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("ragemod:ragemod_adv_15"));
				AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
				if (!_ap.isDone()) {
					Iterator _iterator = _ap.getRemainingCriteria().iterator();
					while (_iterator.hasNext())
						_player.getAdvancements().award(_adv, (String) _iterator.next());
				}
			}
		}
	}
}