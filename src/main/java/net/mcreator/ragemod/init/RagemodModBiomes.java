
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ragemod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.server.ServerAboutToStartEvent;

import net.minecraft.world.level.levelgen.placement.CaveSurface;
import net.minecraft.world.level.levelgen.WorldGenSettings;
import net.minecraft.world.level.levelgen.SurfaceRules;
import net.minecraft.world.level.levelgen.NoiseGeneratorSettings;
import net.minecraft.world.level.levelgen.NoiseBasedChunkGenerator;
import net.minecraft.world.level.dimension.LevelStem;
import net.minecraft.world.level.dimension.DimensionType;
import net.minecraft.world.level.chunk.ChunkGenerator;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.biome.MultiNoiseBiomeSource;
import net.minecraft.world.level.biome.Climate;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.server.MinecraftServer;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.Registry;
import net.minecraft.core.Holder;

import net.mcreator.ragemod.world.biome.SpareGlowingOakForestBiome;
import net.mcreator.ragemod.world.biome.SnowyGlowingOakFieldBiome;
import net.mcreator.ragemod.world.biome.GlowingOakForestMountainBiome;
import net.mcreator.ragemod.world.biome.GlowingOakForestBiome;
import net.mcreator.ragemod.world.biome.GlowingOakFieldBiome;
import net.mcreator.ragemod.RagemodMod;

import java.util.Map;
import java.util.List;
import java.util.ArrayList;

import com.mojang.datafixers.util.Pair;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class RagemodModBiomes {
	public static final DeferredRegister<Biome> REGISTRY = DeferredRegister.create(ForgeRegistries.BIOMES, RagemodMod.MODID);
	public static final RegistryObject<Biome> GLOWING_OAK_FOREST = REGISTRY.register("glowing_oak_forest", () -> GlowingOakForestBiome.createBiome());
	public static final RegistryObject<Biome> SPARE_GLOWING_OAK_FOREST = REGISTRY.register("spare_glowing_oak_forest",
			() -> SpareGlowingOakForestBiome.createBiome());
	public static final RegistryObject<Biome> GLOWING_OAK_FIELD = REGISTRY.register("glowing_oak_field", () -> GlowingOakFieldBiome.createBiome());
	public static final RegistryObject<Biome> SNOWY_GLOWING_OAK_FIELD = REGISTRY.register("snowy_glowing_oak_field",
			() -> SnowyGlowingOakFieldBiome.createBiome());
	public static final RegistryObject<Biome> GLOWING_OAK_FOREST_MOUNTAIN = REGISTRY.register("glowing_oak_forest_mountain",
			() -> GlowingOakForestMountainBiome.createBiome());

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			GlowingOakForestBiome.init();
			SpareGlowingOakForestBiome.init();
			GlowingOakFieldBiome.init();
			SnowyGlowingOakFieldBiome.init();
			GlowingOakForestMountainBiome.init();
		});
	}

	@Mod.EventBusSubscriber
	public static class BiomeInjector {
		@SubscribeEvent
		public static void onServerAboutToStart(ServerAboutToStartEvent event) {
			MinecraftServer server = event.getServer();
			Registry<DimensionType> dimensionTypeRegistry = server.registryAccess().registryOrThrow(Registry.DIMENSION_TYPE_REGISTRY);
			Registry<Biome> biomeRegistry = server.registryAccess().registryOrThrow(Registry.BIOME_REGISTRY);
			WorldGenSettings worldGenSettings = server.getWorldData().worldGenSettings();
			for (Map.Entry<ResourceKey<LevelStem>, LevelStem> entry : worldGenSettings.dimensions().entrySet()) {
				DimensionType dimensionType = entry.getValue().typeHolder().value();
				if (dimensionType == dimensionTypeRegistry.getOrThrow(DimensionType.OVERWORLD_LOCATION)) {
					ChunkGenerator chunkGenerator = entry.getValue().generator();
					// Inject biomes to biome source
					if (chunkGenerator.getBiomeSource()instanceof MultiNoiseBiomeSource noiseSource) {
						List<Pair<Climate.ParameterPoint, Holder<Biome>>> parameters = new ArrayList<>(noiseSource.parameters.values());
						parameters.add(new Pair<>(GlowingOakForestBiome.PARAMETER_POINT,
								biomeRegistry.getOrCreateHolder(ResourceKey.create(Registry.BIOME_REGISTRY, GLOWING_OAK_FOREST.getId()))));
						parameters.add(new Pair<>(SpareGlowingOakForestBiome.PARAMETER_POINT,
								biomeRegistry.getOrCreateHolder(ResourceKey.create(Registry.BIOME_REGISTRY, SPARE_GLOWING_OAK_FOREST.getId()))));
						parameters.add(new Pair<>(GlowingOakFieldBiome.PARAMETER_POINT,
								biomeRegistry.getOrCreateHolder(ResourceKey.create(Registry.BIOME_REGISTRY, GLOWING_OAK_FIELD.getId()))));
						parameters.add(new Pair<>(SnowyGlowingOakFieldBiome.PARAMETER_POINT,
								biomeRegistry.getOrCreateHolder(ResourceKey.create(Registry.BIOME_REGISTRY, SNOWY_GLOWING_OAK_FIELD.getId()))));
						parameters.add(new Pair<>(GlowingOakForestMountainBiome.PARAMETER_POINT,
								biomeRegistry.getOrCreateHolder(ResourceKey.create(Registry.BIOME_REGISTRY, GLOWING_OAK_FOREST_MOUNTAIN.getId()))));

						MultiNoiseBiomeSource moddedNoiseSource = new MultiNoiseBiomeSource(new Climate.ParameterList<>(parameters),
								noiseSource.preset);
						chunkGenerator.biomeSource = moddedNoiseSource;
						chunkGenerator.runtimeBiomeSource = moddedNoiseSource;
					}
					// Inject surface rules
					if (chunkGenerator instanceof NoiseBasedChunkGenerator noiseGenerator) {
						NoiseGeneratorSettings noiseGeneratorSettings = noiseGenerator.settings.value();
						SurfaceRules.RuleSource currentRuleSource = noiseGeneratorSettings.surfaceRule();
						if (currentRuleSource instanceof SurfaceRules.SequenceRuleSource sequenceRuleSource) {
							List<SurfaceRules.RuleSource> surfaceRules = new ArrayList<>(sequenceRuleSource.sequence());
							surfaceRules.add(1, overworldRule(ResourceKey.create(Registry.BIOME_REGISTRY, GLOWING_OAK_FOREST.getId()),
									Blocks.GRASS_BLOCK.defaultBlockState(), Blocks.DIRT.defaultBlockState()));
							surfaceRules.add(1, overworldRule(ResourceKey.create(Registry.BIOME_REGISTRY, SPARE_GLOWING_OAK_FOREST.getId()),
									Blocks.GRASS_BLOCK.defaultBlockState(), Blocks.DIRT.defaultBlockState()));
							surfaceRules.add(1, overworldRule(ResourceKey.create(Registry.BIOME_REGISTRY, GLOWING_OAK_FIELD.getId()),
									Blocks.GRASS_BLOCK.defaultBlockState(), Blocks.DIRT.defaultBlockState()));
							surfaceRules.add(1, overworldRule(ResourceKey.create(Registry.BIOME_REGISTRY, SNOWY_GLOWING_OAK_FIELD.getId()),
									Blocks.GRASS_BLOCK.defaultBlockState(), Blocks.DIRT.defaultBlockState()));
							surfaceRules.add(1, overworldRule(ResourceKey.create(Registry.BIOME_REGISTRY, GLOWING_OAK_FOREST_MOUNTAIN.getId()),
									Blocks.GRASS_BLOCK.defaultBlockState(), Blocks.DIRT.defaultBlockState()));
							NoiseGeneratorSettings moddedNoiseGeneratorSettings = new NoiseGeneratorSettings(noiseGeneratorSettings.noiseSettings(),
									noiseGeneratorSettings.defaultBlock(), noiseGeneratorSettings.defaultFluid(),
									noiseGeneratorSettings.noiseRouter(),
									SurfaceRules.sequence(surfaceRules.toArray(i -> new SurfaceRules.RuleSource[i])),
									noiseGeneratorSettings.seaLevel(), noiseGeneratorSettings.disableMobGeneration(),
									noiseGeneratorSettings.aquifersEnabled(), noiseGeneratorSettings.oreVeinsEnabled(),
									noiseGeneratorSettings.useLegacyRandomSource());
							noiseGenerator.settings = new Holder.Direct(moddedNoiseGeneratorSettings);
						}
					}
				}
			}
		}

		private static SurfaceRules.RuleSource overworldRule(ResourceKey<Biome> biomeKey, BlockState groundBlock, BlockState undergroundBlock) {
			return SurfaceRules
					.ifTrue(SurfaceRules.isBiome(biomeKey),
							SurfaceRules
									.ifTrue(SurfaceRules.abovePreliminarySurface(),
											SurfaceRules.sequence(
													SurfaceRules.ifTrue(SurfaceRules.stoneDepthCheck(0, false, 0, CaveSurface.FLOOR),
															SurfaceRules.sequence(SurfaceRules.ifTrue(SurfaceRules.waterBlockCheck(-1, 0),
																	SurfaceRules.state(groundBlock)), SurfaceRules.state(undergroundBlock))),
													SurfaceRules.ifTrue(SurfaceRules.stoneDepthCheck(0, true, 0, CaveSurface.FLOOR),
															SurfaceRules.state(undergroundBlock)))));
		}
	}
}
