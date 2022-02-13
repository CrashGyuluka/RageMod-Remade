
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ragemod.init;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.ragemod.entity.RageiumBowEntity;
import net.mcreator.ragemod.entity.RageMiteEntity;
import net.mcreator.ragemod.entity.AtomRagerEntity;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class RagemodModEntities {
	private static final List<EntityType<?>> REGISTRY = new ArrayList<>();
	public static final EntityType<RageiumBowEntity> RAGEIUM_BOW = register("entitybulletrageium_bow",
			EntityType.Builder.<RageiumBowEntity>of(RageiumBowEntity::new, MobCategory.MISC).setCustomClientFactory(RageiumBowEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<RageMiteEntity> RAGE_MITE = register("rage_mite",
			EntityType.Builder.<RageMiteEntity>of(RageMiteEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(32)
					.setUpdateInterval(3).setCustomClientFactory(RageMiteEntity::new).fireImmune().sized(0.4f, 0.3f));
	public static final EntityType<AtomRagerEntity> ATOM_RAGER = register("atom_rager",
			EntityType.Builder.<AtomRagerEntity>of(AtomRagerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AtomRagerEntity::new).fireImmune().sized(0.6f, 1.7f));

	private static <T extends Entity> EntityType<T> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		EntityType<T> entityType = (EntityType<T>) entityTypeBuilder.build(registryname).setRegistryName(registryname);
		REGISTRY.add(entityType);
		return entityType;
	}

	@SubscribeEvent
	public static void registerEntities(RegistryEvent.Register<EntityType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new EntityType[0]));
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
		event.put(RAGE_MITE, RageMiteEntity.createAttributes().build());
		event.put(ATOM_RAGER, AtomRagerEntity.createAttributes().build());
	}
}
