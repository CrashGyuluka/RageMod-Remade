
package net.mcreator.ragemod.world.biome;

import net.mcreator.ragemod.init.RagemodModBiomes;

import java.util.List;

public class SnowyGlowingOakFieldBiome {
	public static final Climate.ParameterPoint PARAMETER_POINT = new Climate.ParameterPoint(Climate.Parameter.span(-0.55238095238f, -0.380952380952f),
			Climate.Parameter.span(-0.285714285714f, -0.114285714286f), Climate.Parameter.span(0.484285714286f, 0.655714285714f),
			Climate.Parameter.span(0.414285714286f, 0.585714285714f), Climate.Parameter.point(0),
			Climate.Parameter.span(-0.123354659178f, 0.04807391225f), 0);

	public static Biome createBiome() {
		BiomeSpecialEffects effects = new BiomeSpecialEffects.Builder().fogColor(12638463).waterColor(4159204).waterFogColor(329011).skyColor(7972607)
				.foliageColorOverride(-12030430).grassColorOverride(-801963).build();
		BiomeGenerationSettings.Builder biomeGenerationSettings = new BiomeGenerationSettings.Builder();
		biomeGenerationSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
				PlacementUtils.register("ragemod:grass_snowy_spare_glowing_oak_forest", VegetationFeatures.PATCH_GRASS,
						List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 10), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE,
								BiomeFilter.biome())));
		biomeGenerationSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, PlacementUtils
				.register("ragemod:seagrass_snowy_spare_glowing_oak_forest", AquaticFeatures.SEAGRASS_SHORT, AquaticPlacements.seagrassPlacement(1)));
		biomeGenerationSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
				PlacementUtils.register("ragemod:flower_snowy_spare_glowing_oak_forest", VegetationFeatures.FLOWER_DEFAULT,
						List.of(CountPlacement.of(11), RarityFilter.onAverageOnceEvery(32), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP,
								BiomeFilter.biome())));
		biomeGenerationSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
				PlacementUtils.register("ragemod:mushrooms_huge_snowy_spare_glowing_oak_forest", VegetationFeatures.MUSHROOM_ISLAND_VEGETATION,
						List.of(CountPlacement.of(1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome())));
		biomeGenerationSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
				PlacementUtils.register("ragemod:disk_gravel_snowy_spare_glowing_oak_forest",
						FeatureUtils.register("ragemod:disk_gravel_snowy_spare_glowing_oak_forest", Feature.DISK,
								new DiskConfiguration(Blocks.GRAVEL.defaultBlockState(), UniformInt.of(2, 5), 2,
										List.of(Blocks.GRASS_BLOCK.defaultBlockState(), Blocks.DIRT.defaultBlockState()))),
						List.of(CountPlacement.of(2), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_TOP_SOLID, BiomeFilter.biome())));
		BiomeDefaultFeatures.addFerns(biomeGenerationSettings);
		BiomeDefaultFeatures.addSavannaGrass(biomeGenerationSettings);
		BiomeDefaultFeatures.addDefaultCarversAndLakes(biomeGenerationSettings);
		BiomeDefaultFeatures.addDefaultOres(biomeGenerationSettings);
		BiomeDefaultFeatures.addSurfaceFreezing(biomeGenerationSettings);
		BiomeDefaultFeatures.addDefaultMonsterRoom(biomeGenerationSettings);
		BiomeDefaultFeatures.addMossyStoneBlock(biomeGenerationSettings);
		MobSpawnSettings.Builder mobSpawnInfo = new MobSpawnSettings.Builder();
		mobSpawnInfo.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.ZOMBIE, 12, 1, 2));
		mobSpawnInfo.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.FOX, 4, 1, 2));
		return new Biome.BiomeBuilder().precipitation(Biome.Precipitation.SNOW).biomeCategory(Biome.BiomeCategory.PLAINS).temperature(-0.2f)
				.downfall(0.4f).specialEffects(effects).mobSpawnSettings(mobSpawnInfo.build()).generationSettings(biomeGenerationSettings.build())
				.build();
	}

	public static void init() {
		BiomeDictionary.addTypes(
				ResourceKey.create(Registry.BIOME_REGISTRY, BuiltinRegistries.BIOME.getKey(RagemodModBiomes.SNOWY_SPARE_GLOWING_OAK_FOREST.get())),
				BiomeDictionary.Type.OVERWORLD, BiomeDictionary.Type.COLD, BiomeDictionary.Type.SNOWY, BiomeDictionary.Type.PLAINS);
	}
}
