
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ragemod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.core.Registry;

import net.mcreator.ragemod.world.features.plants.ToxicPlantFeature;
import net.mcreator.ragemod.world.features.plants.RageFlowerFeature;
import net.mcreator.ragemod.world.features.ores.ToxicToppedStoneFeature;
import net.mcreator.ragemod.world.features.ores.ToxicToppedStoneBricksFeature;
import net.mcreator.ragemod.world.features.ores.ToxicToppedSandFeature;
import net.mcreator.ragemod.world.features.ores.ToxicToppedRedSandFeature;
import net.mcreator.ragemod.world.features.ores.ToxicToppedRageiumOreFeature;
import net.mcreator.ragemod.world.features.ores.ToxicToppedRageiumBlockFeature;
import net.mcreator.ragemod.world.features.ores.ToxicToppedRageiumAlloyBlockFeature;
import net.mcreator.ragemod.world.features.ores.ToxicToppedObsidianFeature;
import net.mcreator.ragemod.world.features.ores.ToxicToppedOakPlanksFeature;
import net.mcreator.ragemod.world.features.ores.ToxicToppedOakLogFeature;
import net.mcreator.ragemod.world.features.ores.ToxicToppedNetherrackFeature;
import net.mcreator.ragemod.world.features.ores.ToxicToppedGravelFeature;
import net.mcreator.ragemod.world.features.ores.ToxicToppedGraniteFeature;
import net.mcreator.ragemod.world.features.ores.ToxicToppedEndstoneFeature;
import net.mcreator.ragemod.world.features.ores.ToxicToppedDirtFeature;
import net.mcreator.ragemod.world.features.ores.ToxicToppedDioriteFeature;
import net.mcreator.ragemod.world.features.ores.ToxicToppedCobblestoneFeature;
import net.mcreator.ragemod.world.features.ores.ToxicToppedBricksFeature;
import net.mcreator.ragemod.world.features.ores.ToxicToppedBoneBlockFeature;
import net.mcreator.ragemod.world.features.ores.ToxicToppedBlackstoneFeature;
import net.mcreator.ragemod.world.features.ores.ToxicToppedBasaltFeature;
import net.mcreator.ragemod.world.features.ores.ToxicToppedAndesiteFeature;
import net.mcreator.ragemod.world.features.ores.ToxicToppedAncientDebrisFeature;
import net.mcreator.ragemod.world.features.ores.ToxicCrystalOreFeature;
import net.mcreator.ragemod.world.features.ores.RageiumOreFeature;
import net.mcreator.ragemod.world.features.ores.OpalOreFeature;
import net.mcreator.ragemod.world.features.ores.MossyCloftinFeature;
import net.mcreator.ragemod.world.features.ores.CloftinFeature;
import net.mcreator.ragemod.world.features.ores.CerussiteOreFeature;
import net.mcreator.ragemod.world.features.ores.BoomStoneFeature;
import net.mcreator.ragemod.world.features.ores.BismuthOreFeature;
import net.mcreator.ragemod.world.features.ores.AzuriteOreFeature;
import net.mcreator.ragemod.world.features.ores.ApophylliteOreFeature;
import net.mcreator.ragemod.world.features.ores.AnapaitOreFeature;
import net.mcreator.ragemod.world.features.ores.AmazoniteOreFeature;
import net.mcreator.ragemod.world.features.ores.AdulariaOreFeature;
import net.mcreator.ragemod.world.features.ores.ActinoliteOreFeature;
import net.mcreator.ragemod.world.features.ores.AchatOreFeature;

import java.util.Set;
import java.util.Map;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class RagemodModFeatures {
	private static final Map<Feature<?>, FeatureRegistration> REGISTRY = new HashMap<>();
	static {
		REGISTRY.put(RageiumOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, RageiumOreFeature.GENERATE_BIOMES,
				RageiumOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(BoomStoneFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, BoomStoneFeature.GENERATE_BIOMES,
				BoomStoneFeature.CONFIGURED_FEATURE));
		REGISTRY.put(ToxicCrystalOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				ToxicCrystalOreFeature.GENERATE_BIOMES, ToxicCrystalOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(ToxicPlantFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION,
				ToxicPlantFeature.GENERATE_BIOMES, ToxicPlantFeature.CONFIGURED_FEATURE));
		REGISTRY.put(ToxicToppedStoneFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				ToxicToppedStoneFeature.GENERATE_BIOMES, ToxicToppedStoneFeature.CONFIGURED_FEATURE));
		REGISTRY.put(ToxicToppedNetherrackFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				ToxicToppedNetherrackFeature.GENERATE_BIOMES, ToxicToppedNetherrackFeature.CONFIGURED_FEATURE));
		REGISTRY.put(ToxicToppedEndstoneFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				ToxicToppedEndstoneFeature.GENERATE_BIOMES, ToxicToppedEndstoneFeature.CONFIGURED_FEATURE));
		REGISTRY.put(ToxicToppedDirtFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				ToxicToppedDirtFeature.GENERATE_BIOMES, ToxicToppedDirtFeature.CONFIGURED_FEATURE));
		REGISTRY.put(ToxicToppedOakLogFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				ToxicToppedOakLogFeature.GENERATE_BIOMES, ToxicToppedOakLogFeature.CONFIGURED_FEATURE));
		REGISTRY.put(ToxicToppedOakPlanksFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				ToxicToppedOakPlanksFeature.GENERATE_BIOMES, ToxicToppedOakPlanksFeature.CONFIGURED_FEATURE));
		REGISTRY.put(ToxicToppedAndesiteFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				ToxicToppedAndesiteFeature.GENERATE_BIOMES, ToxicToppedAndesiteFeature.CONFIGURED_FEATURE));
		REGISTRY.put(ToxicToppedDioriteFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				ToxicToppedDioriteFeature.GENERATE_BIOMES, ToxicToppedDioriteFeature.CONFIGURED_FEATURE));
		REGISTRY.put(ToxicToppedGraniteFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				ToxicToppedGraniteFeature.GENERATE_BIOMES, ToxicToppedGraniteFeature.CONFIGURED_FEATURE));
		REGISTRY.put(ToxicToppedBoneBlockFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				ToxicToppedBoneBlockFeature.GENERATE_BIOMES, ToxicToppedBoneBlockFeature.CONFIGURED_FEATURE));
		REGISTRY.put(ToxicToppedBricksFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				ToxicToppedBricksFeature.GENERATE_BIOMES, ToxicToppedBricksFeature.CONFIGURED_FEATURE));
		REGISTRY.put(ToxicToppedStoneBricksFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				ToxicToppedStoneBricksFeature.GENERATE_BIOMES, ToxicToppedStoneBricksFeature.CONFIGURED_FEATURE));
		REGISTRY.put(ToxicToppedAncientDebrisFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				ToxicToppedAncientDebrisFeature.GENERATE_BIOMES, ToxicToppedAncientDebrisFeature.CONFIGURED_FEATURE));
		REGISTRY.put(ToxicToppedBasaltFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				ToxicToppedBasaltFeature.GENERATE_BIOMES, ToxicToppedBasaltFeature.CONFIGURED_FEATURE));
		REGISTRY.put(ToxicToppedCobblestoneFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				ToxicToppedCobblestoneFeature.GENERATE_BIOMES, ToxicToppedCobblestoneFeature.CONFIGURED_FEATURE));
		REGISTRY.put(ToxicToppedGravelFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				ToxicToppedGravelFeature.GENERATE_BIOMES, ToxicToppedGravelFeature.CONFIGURED_FEATURE));
		REGISTRY.put(ToxicToppedBlackstoneFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				ToxicToppedBlackstoneFeature.GENERATE_BIOMES, ToxicToppedBlackstoneFeature.CONFIGURED_FEATURE));
		REGISTRY.put(ToxicToppedSandFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				ToxicToppedSandFeature.GENERATE_BIOMES, ToxicToppedSandFeature.CONFIGURED_FEATURE));
		REGISTRY.put(ToxicToppedRedSandFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				ToxicToppedRedSandFeature.GENERATE_BIOMES, ToxicToppedRedSandFeature.CONFIGURED_FEATURE));
		REGISTRY.put(ToxicToppedObsidianFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				ToxicToppedObsidianFeature.GENERATE_BIOMES, ToxicToppedObsidianFeature.CONFIGURED_FEATURE));
		REGISTRY.put(ToxicToppedRageiumOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				ToxicToppedRageiumOreFeature.GENERATE_BIOMES, ToxicToppedRageiumOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(ToxicToppedRageiumBlockFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				ToxicToppedRageiumBlockFeature.GENERATE_BIOMES, ToxicToppedRageiumBlockFeature.CONFIGURED_FEATURE));
		REGISTRY.put(ToxicToppedRageiumAlloyBlockFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				ToxicToppedRageiumAlloyBlockFeature.GENERATE_BIOMES, ToxicToppedRageiumAlloyBlockFeature.CONFIGURED_FEATURE));
		REGISTRY.put(RageFlowerFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION,
				RageFlowerFeature.GENERATE_BIOMES, RageFlowerFeature.CONFIGURED_FEATURE));
		REGISTRY.put(ActinoliteOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				ActinoliteOreFeature.GENERATE_BIOMES, ActinoliteOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(AchatOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, AchatOreFeature.GENERATE_BIOMES,
				AchatOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(AzuriteOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, AzuriteOreFeature.GENERATE_BIOMES,
				AzuriteOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(AmazoniteOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				AmazoniteOreFeature.GENERATE_BIOMES, AmazoniteOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(CerussiteOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				CerussiteOreFeature.GENERATE_BIOMES, CerussiteOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(BismuthOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, BismuthOreFeature.GENERATE_BIOMES,
				BismuthOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(ApophylliteOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				ApophylliteOreFeature.GENERATE_BIOMES, ApophylliteOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(OpalOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, OpalOreFeature.GENERATE_BIOMES,
				OpalOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(AnapaitOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, AnapaitOreFeature.GENERATE_BIOMES,
				AnapaitOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(AdulariaOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				AdulariaOreFeature.GENERATE_BIOMES, AdulariaOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(CloftinFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, CloftinFeature.GENERATE_BIOMES,
				CloftinFeature.CONFIGURED_FEATURE));
		REGISTRY.put(MossyCloftinFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				MossyCloftinFeature.GENERATE_BIOMES, MossyCloftinFeature.CONFIGURED_FEATURE));
	}

	@SubscribeEvent
	public static void registerFeature(RegistryEvent.Register<Feature<?>> event) {
		event.getRegistry().registerAll(REGISTRY.keySet().toArray(new Feature[0]));
		REGISTRY.forEach((feature, registration) -> Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, feature.getRegistryName(),
				registration.configuredFeature()));
	}

	@Mod.EventBusSubscriber
	private static class BiomeFeatureLoader {
		@SubscribeEvent
		public static void addFeatureToBiomes(BiomeLoadingEvent event) {
			for (FeatureRegistration registration : REGISTRY.values()) {
				if (registration.biomes() == null || registration.biomes().contains(event.getName())) {
					event.getGeneration().getFeatures(registration.stage()).add(() -> registration.configuredFeature());
				}
			}
		}
	}

	private static record FeatureRegistration(GenerationStep.Decoration stage, Set<ResourceLocation> biomes,
			ConfiguredFeature<?, ?> configuredFeature) {
	}
}
