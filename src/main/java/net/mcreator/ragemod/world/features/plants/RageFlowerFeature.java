
package net.mcreator.ragemod.world.features.plants;

import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;

import net.mcreator.ragemod.init.RagemodModBlocks;

import java.util.Set;
import java.util.List;

public class RageFlowerFeature extends RandomPatchFeature {
	public static RageFlowerFeature FEATURE = null;
	public static Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> CONFIGURED_FEATURE = null;
	public static Holder<PlacedFeature> PLACED_FEATURE = null;

	public static Feature<?> feature() {
		FEATURE = new RageFlowerFeature();
		CONFIGURED_FEATURE = FeatureUtils.register("ragemod:rage_flower", FEATURE, FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK,
				new SimpleBlockConfiguration(BlockStateProvider.simple(RagemodModBlocks.RAGE_FLOWER.get().defaultBlockState())), List.of(), 12));
		PLACED_FEATURE = PlacementUtils.register("ragemod:rage_flower", CONFIGURED_FEATURE,
				List.of(RarityFilter.onAverageOnceEvery(32), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, CountPlacement.of(6)));
		return FEATURE;
	}

	public static Holder<PlacedFeature> placedFeature() {
		return PLACED_FEATURE;
	}

	public static final Set<ResourceLocation> GENERATE_BIOMES = null;
	private final Set<ResourceKey<Level>> generate_dimensions = Set.of(Level.OVERWORLD);

	public RageFlowerFeature() {
		super(RandomPatchConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<RandomPatchConfiguration> context) {
		WorldGenLevel world = context.level();
		if (!generate_dimensions.contains(world.getLevel().dimension()))
			return false;
		return super.place(context);
	}
}
