
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ragemod.init;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.biome.Biome;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.ragemod.world.biome.ToxicWasteBiome;
import net.mcreator.ragemod.world.biome.SpareGlowingOakForestBiome;
import net.mcreator.ragemod.world.biome.GlowingOakForestMountainBiome;
import net.mcreator.ragemod.world.biome.GlowingOakForestBiome;
import net.mcreator.ragemod.world.biome.GlowingOakFieldBiome;
import net.mcreator.ragemod.RagemodMod;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class RagemodModBiomes {
	private static final List<Biome> REGISTRY = new ArrayList<>();
	public static Biome TOXIC_WASTE = register("toxic_waste", ToxicWasteBiome.createBiome());
	public static Biome GLOWING_OAK_FOREST = register("glowing_oak_forest", GlowingOakForestBiome.createBiome());
	public static Biome SPARE_GLOWING_OAK_FOREST = register("spare_glowing_oak_forest", SpareGlowingOakForestBiome.createBiome());
	public static Biome GLOWING_OAK_FIELD = register("glowing_oak_field", GlowingOakFieldBiome.createBiome());
	public static Biome GLOWING_OAK_FOREST_MOUNTAIN = register("glowing_oak_forest_mountain", GlowingOakForestMountainBiome.createBiome());

	private static Biome register(String registryname, Biome biome) {
		REGISTRY.add(biome.setRegistryName(new ResourceLocation(RagemodMod.MODID, registryname)));
		return biome;
	}

	@SubscribeEvent
	public static void registerBiomes(RegistryEvent.Register<Biome> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Biome[0]));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			ToxicWasteBiome.init();
			GlowingOakForestBiome.init();
			SpareGlowingOakForestBiome.init();
			GlowingOakFieldBiome.init();
			GlowingOakForestMountainBiome.init();
		});
	}
}
