package net.mcreator.ragemod.procedures;

import net.minecraftforge.eventbus.api.Event;

import net.mcreator.ragemod.init.RagemodModEnchantments;

import javax.annotation.Nullable;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

@Mod.EventBusSubscriber
public class ColliderEnchProcProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level, event.player.getX(), event.player.getY(), event.player.getZ(), event.player);
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (EnchantmentHelper.getItemEnchantmentLevel(RagemodModEnchantments.COLLIDER.get(),
				(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY)) != 0) {
			if (!world.getEntitiesOfClass(LivingEntity.class, AABB.ofSize(new Vec3(x, y, z), 2, 2, 2), e -> true).isEmpty()) {
				if ((entity instanceof LivingEntity _livEnt ? _livEnt.isFallFlying() : false) == true) {
					if (Math.random() < 0.15) {
						{
							final Vec3 _center = new Vec3(x, y, z);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(2 / 2d), e -> true)
									.stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (entityiterator.getType()
										.is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("forge:all_mobs_rt")))) {
									entityiterator.hurt(DamageSource.GENERIC,
											(float) (EnchantmentHelper.getItemEnchantmentLevel(RagemodModEnchantments.COLLIDER.get(),
													(entity instanceof LivingEntity _entGetArmor
															? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST)
															: ItemStack.EMPTY))
													* 2));
								}
							}
						}
					}
				}
			}
		}
	}
}
