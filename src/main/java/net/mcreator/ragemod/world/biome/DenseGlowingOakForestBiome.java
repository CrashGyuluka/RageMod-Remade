
package net.mcreator.ragemod.world.biome;

import net.mcreator.ragemod.init.RagemodModBiomes;

import java.util.List;

public class DenseGlowingOakForestBiome {
	public static final Climate.ParameterPoint PARAMETER_POINT = new Climate.ParameterPoint(Climate.Parameter.span(-0.157142857143f, 0.157142857143f),
			Climate.Parameter.span(-0.557142857143f, -0.242857142857f), Climate.Parameter.span(0.412857142857f, 0.727142857143f),
			Climate.Parameter.span(0.542857142857f, 0.857142857143f), Climate.Parameter.point(0),
			Climate.Parameter.span(-0.926586139539f, -0.612300425253f), 0);

	public static Biome createBiome() {
		BiomeSpecialEffects effects = new BiomeSpecialEffects.Builder().fogColor(12638463).waterColor(4159204).waterFogColor(329011).skyColor(7972607)
				.foliageColorOverride(-12030430).grassColorOverride(-4558035).build();
		BiomeGenerationSettings.Builder biomeGenerationSettings = new BiomeGenerationSettings.Builder();
		biomeGenerationSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
				PlacementUtils.register("ragemod:grass_dense_glowing_oak_forest", VegetationFeatures.PATCH_GRASS,
						List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 31), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE,
								BiomeFilter.biome())));
		biomeGenerationSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, PlacementUtils
				.register("ragemod:seagrass_dense_glowing_oak_forest", AquaticFeatures.SEAGRASS_SHORT, AquaticPlacements.seagrassPlacement(3)));
		biomeGenerationSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
				PlacementUtils.register("ragemod:flower_dense_glowing_oak_forest", VegetationFeatures.FLOWER_DEFAULT, List.of(CountPlacement.of(26),
						RarityFilter.onAverageOnceEvery(32), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome())));
		biomeGenerationSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
				PlacementUtils.register("ragemod:brown_mushroom_dense_glowing_oak_forest", VegetationFeatures.PATCH_BROWN_MUSHROOM,
						List.of(CountPlacement.of(3), RarityFilter.onAverageOnceEvery(32), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP,
								BiomeFilter.biome())));
		biomeGenerationSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
				PlacementUtils.register("ragemod:red_mushroom_dense_glowing_oak_forest", VegetationFeatures.PATCH_RED_MUSHROOM,
						List.of(CountPlacement.of(3), RarityFilter.onAverageOnceEvery(32), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP,
								BiomeFilter.biome())));
		biomeGenerationSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
				PlacementUtils.register("ragemod:mushrooms_huge_dense_glowing_oak_forest", VegetationFeatures.MUSHROOM_ISLAND_VEGETATION,
						List.of(CountPlacement.of(4), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome())));
		biomeGenerationSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
				PlacementUtils.register("ragemod:disk_gravel_dense_glowing_oak_forest",
						FeatureUtils.register("ragemod:disk_gravel_dense_glowing_oak_forest", Feature.DISK,
								new DiskConfiguration(Blocks.GRAVEL.defaultBlockState(), UniformInt.of(2, 5), 2,
										List.of(Blocks.GRASS_BLOCK.defaultBlockState(), Blocks.DIRT.defaultBlockState()))),
						List.of(CountPlacement.of(1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_TOP_SOLID, BiomeFilter.biome())));
		BiomeDefaultFeatures.addFerns(biomeGenerationSettings);
		BiomeDefaultFeatures.addSavannaGrass(biomeGenerationSettings);
		BiomeDefaultFeatures.addBambooVegetation(biomeGenerationSettings);
		BiomeDefaultFeatures.addDefaultCarversAndLakes(biomeGenerationSettings);
		BiomeDefaultFeatures.addDefaultOres(biomeGenerationSettings);
		BiomeDefaultFeatures.addInfestedStone(biomeGenerationSettings);
		BiomeDefaultFeatures.addDefaultMonsterRoom(biomeGenerationSettings);
		BiomeDefaultFeatures.addDefaultExtraVegetation(biomeGenerationSettings);
		BiomeDefaultFeatures.addMossyStoneBlock(biomeGenerationSettings);
		BiomeDefaultFeatures.addDefaultSeagrass(biomeGenerationSettings);
		MobSpawnSettings.Builder mobSpawnInfo = new MobSpawnSettings.Builder();
		mobSpawnInfo.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.ZOMBIE, 20, 1, 2));
		mobSpawnInfo.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.FOX, 3, 1, 2));
		return new Biome.BiomeBuilder().precipitation(Biome.Precipitation.RAIN).biomeCategory(Biome.BiomeCategory.FOREST).temperature(0.5f)
				.downfall(0.3f).specialEffects(effects).mobSpawnSettings(mobSpawnInfo.build()).generationSettings(biomeGenerationSettings.build())
				.build();
	}

	public static void init() {
		BiomeDictionary.addTypes(
				ResourceKey.create(Registry.BIOME_REGISTRY, BuiltinRegistries.BIOME.getKey(RagemodModBiomes.DENSE_GLOWING_OAK_FOREST.get())),
				BiomeDictionary.Type.FOREST, BiomeDictionary.Type.PLAINS, BiomeDictionary.Type.OVERWORLD, BiomeDictionary.Type.DENSE);
	}
}
