
package net.mcreator.ragemod.world.features;

import java.util.Set;
import java.util.List;

public class GlowingBiomesFlower7Feature extends Feature<NoneFeatureConfiguration> {
	public static GlowingBiomesFlower7Feature FEATURE = null;
	public static Holder<ConfiguredFeature<NoneFeatureConfiguration, ?>> CONFIGURED_FEATURE = null;
	public static Holder<PlacedFeature> PLACED_FEATURE = null;

	public static Feature<?> feature() {
		FEATURE = new GlowingBiomesFlower7Feature();
		CONFIGURED_FEATURE = FeatureUtils.register("ragemod:glowing_biomes_flower_7", FEATURE, FeatureConfiguration.NONE);
		PLACED_FEATURE = PlacementUtils.register("ragemod:glowing_biomes_flower_7", CONFIGURED_FEATURE, List.of());
		return FEATURE;
	}

	public static Holder<PlacedFeature> placedFeature() {
		return PLACED_FEATURE;
	}

	public static final Set<ResourceLocation> GENERATE_BIOMES = Set.of(new ResourceLocation("ragemod:snowy_spare_glowing_oak_forest"),
			new ResourceLocation("ragemod:glowing_oak_field"), new ResourceLocation("ragemod:glowing_oak_forest"),
			new ResourceLocation("ragemod:glowing_oak_forest_mountain"), new ResourceLocation("ragemod:spare_glowing_oak_forest"),
			new ResourceLocation("ragemod:snowy_glowing_oak_forest"));
	private final Set<ResourceKey<Level>> generate_dimensions = Set.of(Level.OVERWORLD);
	private final List<Block> base_blocks;
	private StructureTemplate template = null;

	public GlowingBiomesFlower7Feature() {
		super(NoneFeatureConfiguration.CODEC);
		base_blocks = List.of(Blocks.GRASS_BLOCK);
	}

	@Override
	public boolean place(FeaturePlaceContext<NoneFeatureConfiguration> context) {
		if (!generate_dimensions.contains(context.level().getLevel().dimension()))
			return false;
		if (template == null)
			template = context.level().getLevel().getStructureManager().getOrCreate(new ResourceLocation("ragemod", "gof_red_tulip"));
		if (template == null)
			return false;
		boolean anyPlaced = false;
		if ((context.random().nextInt(1000000) + 1) <= 300000) {
			int count = context.random().nextInt(6) + 1;
			for (int a = 0; a < count; a++) {
				int i = context.origin().getX() + context.random().nextInt(16);
				int k = context.origin().getZ() + context.random().nextInt(16);
				int j = context.level().getHeight(Heightmap.Types.OCEAN_FLOOR_WG, i, k) - 1;
				if (!base_blocks.contains(context.level().getBlockState(new BlockPos(i, j, k)).getBlock()))
					continue;
				BlockPos spawnTo = new BlockPos(i + 0, j + 1, k + 0);
				if (template.placeInWorld(
						context.level(), spawnTo, spawnTo, new StructurePlaceSettings().setMirror(Mirror.NONE).setRotation(Rotation.NONE)
								.setRandom(context.random()).addProcessor(BlockIgnoreProcessor.STRUCTURE_BLOCK).setIgnoreEntities(false),
						context.random(), 2)) {
					anyPlaced = true;
				}
			}
		}
		return anyPlaced;
	}
}
