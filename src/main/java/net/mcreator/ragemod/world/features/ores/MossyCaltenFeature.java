
package net.mcreator.ragemod.world.features.ores;

import net.mcreator.ragemod.init.RagemodModBlocks;

import java.util.Set;
import java.util.Random;
import java.util.List;

public class MossyCaltenFeature extends OreFeature {
	public static MossyCaltenFeature FEATURE = null;
	public static Holder<ConfiguredFeature<OreConfiguration, ?>> CONFIGURED_FEATURE = null;
	public static Holder<PlacedFeature> PLACED_FEATURE = null;

	public static Feature<?> feature() {
		FEATURE = new MossyCaltenFeature();
		CONFIGURED_FEATURE = FeatureUtils.register("ragemod:mossy_calten", FEATURE,
				new OreConfiguration(MossyCaltenFeatureRuleTest.INSTANCE, RagemodModBlocks.MOSSY_CALTEN.get().defaultBlockState(), 3));
		PLACED_FEATURE = PlacementUtils.register("ragemod:mossy_calten", CONFIGURED_FEATURE, List.of(CountPlacement.of(3), InSquarePlacement.spread(),
				HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(256))));
		return FEATURE;
	}

	public static Holder<PlacedFeature> placedFeature() {
		return PLACED_FEATURE;
	}

	public static final Set<ResourceLocation> GENERATE_BIOMES = null;
	private final Set<ResourceKey<Level>> generate_dimensions = Set.of(Level.OVERWORLD);

	public MossyCaltenFeature() {
		super(OreConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<OreConfiguration> context) {
		WorldGenLevel world = context.level();
		if (!generate_dimensions.contains(world.getLevel().dimension()))
			return false;
		return super.place(context);
	}

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
	private static class MossyCaltenFeatureRuleTest extends RuleTest {
		static final MossyCaltenFeatureRuleTest INSTANCE = new MossyCaltenFeatureRuleTest();
		private static final com.mojang.serialization.Codec<MossyCaltenFeatureRuleTest> CODEC = com.mojang.serialization.Codec.unit(() -> INSTANCE);
		private static final RuleTestType<MossyCaltenFeatureRuleTest> CUSTOM_MATCH = () -> CODEC;

		@SubscribeEvent
		public static void init(FMLCommonSetupEvent event) {
			Registry.register(Registry.RULE_TEST, new ResourceLocation("ragemod:mossy_calten_match"), CUSTOM_MATCH);
		}

		private List<Block> base_blocks = null;

		public boolean test(BlockState blockAt, Random random) {
			if (base_blocks == null) {
				base_blocks = List.of(RagemodModBlocks.CALTEN.get());
			}
			return base_blocks.contains(blockAt.getBlock());
		}

		protected RuleTestType<?> getType() {
			return CUSTOM_MATCH;
		}
	}
}
