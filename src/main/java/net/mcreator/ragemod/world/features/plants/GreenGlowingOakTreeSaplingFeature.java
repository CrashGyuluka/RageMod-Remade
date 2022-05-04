
package net.mcreator.ragemod.world.features.plants;

import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;

import net.mcreator.ragemod.init.RagemodModBlocks;

import java.util.Set;
import java.util.List;

public class GreenGlowingOakTreeSaplingFeature extends RandomPatchFeature {
	public static GreenGlowingOakTreeSaplingFeature FEATURE = null;
	public static Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> CONFIGURED_FEATURE = null;
	public static Holder<PlacedFeature> PLACED_FEATURE = null;

	public static Feature<?> feature() {
		FEATURE = new GreenGlowingOakTreeSaplingFeature();
		CONFIGURED_FEATURE = FeatureUtils
				.register("ragemod:green_glowing_oak_tree_sapling", FEATURE,
						FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK,
								new SimpleBlockConfiguration(
										BlockStateProvider.simple(RagemodModBlocks.GREEN_GLOWING_OAK_TREE_SAPLING.get().defaultBlockState())),
								List.of(), 5));
		PLACED_FEATURE = PlacementUtils.register("ragemod:green_glowing_oak_tree_sapling", CONFIGURED_FEATURE,
				List.of(RarityFilter.onAverageOnceEvery(32), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, CountPlacement.of(5)));
		return FEATURE;
	}

	public static Holder<PlacedFeature> placedFeature() {
		return PLACED_FEATURE;
	}

	public static final Set<ResourceLocation> GENERATE_BIOMES = Set.of(new ResourceLocation("ragemod:snowy_spare_glowing_oak_forest"),
			new ResourceLocation("ragemod:glowing_oak_field"), new ResourceLocation("ragemod:glowing_oak_forest"),
			new ResourceLocation("ragemod:spare_glowing_oak_forest"));
	private final Set<ResourceKey<Level>> generate_dimensions = Set.of(Level.OVERWORLD);

	public GreenGlowingOakTreeSaplingFeature() {
		super(RandomPatchConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<RandomPatchConfiguration> context) {
		WorldGenLevel world = context.level();
		if (!generate_dimensions.contains(world.getLevel().dimension()))
			return false;
		return super.place(context);
	}
}
