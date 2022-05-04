
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ragemod.init;

import net.mcreator.ragemod.entity.RageiumBowEntity;
import net.mcreator.ragemod.entity.RageMiteEntity;
import net.mcreator.ragemod.entity.AtomRagerEntity;
import net.mcreator.ragemod.RagemodMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class RagemodModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, RagemodMod.MODID);
	public static final RegistryObject<EntityType<RageiumBowEntity>> RAGEIUM_BOW = register("projectile_rageium_bow",
			EntityType.Builder.<RageiumBowEntity>of(RageiumBowEntity::new, MobCategory.MISC).setCustomClientFactory(RageiumBowEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<RageMiteEntity>> RAGE_MITE = register("rage_mite",
			EntityType.Builder.<RageMiteEntity>of(RageMiteEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(32)
					.setUpdateInterval(3).setCustomClientFactory(RageMiteEntity::new).fireImmune().sized(0.4f, 0.3f));
	public static final RegistryObject<EntityType<AtomRagerEntity>> ATOM_RAGER = register("atom_rager",
			EntityType.Builder.<AtomRagerEntity>of(AtomRagerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AtomRagerEntity::new).fireImmune().sized(0.6f, 1.7f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			RageMiteEntity.init();
			AtomRagerEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(RAGE_MITE.get(), RageMiteEntity.createAttributes().build());
		event.put(ATOM_RAGER.get(), AtomRagerEntity.createAttributes().build());
	}
}
