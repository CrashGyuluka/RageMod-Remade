
package net.mcreator.ragemod.world.features.ores;

import net.mcreator.ragemod.init.RagemodModBlocks;

import java.util.Set;
import java.util.Random;
import java.util.List;

public class ApophylliteOreFeature extends OreFeature {
	public static ApophylliteOreFeature FEATURE = null;
	public static Holder<ConfiguredFeature<OreConfiguration, ?>> CONFIGURED_FEATURE = null;
	public static Holder<PlacedFeature> PLACED_FEATURE = null;

	public static Feature<?> feature() {
		FEATURE = new ApophylliteOreFeature();
		CONFIGURED_FEATURE = FeatureUtils.register("ragemod:apophyllite_ore", FEATURE,
				new OreConfiguration(ApophylliteOreFeatureRuleTest.INSTANCE, RagemodModBlocks.APOPHYLLITE_ORE.get().defaultBlockState(), 3));
		PLACED_FEATURE = PlacementUtils.register("ragemod:apophyllite_ore", CONFIGURED_FEATURE, List.of(CountPlacement.of(8),
				InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(128))));
		return FEATURE;
	}

	public static Holder<PlacedFeature> placedFeature() {
		return PLACED_FEATURE;
	}

	public static final Set<ResourceLocation> GENERATE_BIOMES = null;
	private final Set<ResourceKey<Level>> generate_dimensions = Set.of(Level.END);

	public ApophylliteOreFeature() {
		super(OreConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<OreConfiguration> context) {
		WorldGenLevel world = context.level();
		if (!generate_dimensions.contains(world.getLevel().dimension()))
			return false;
		return super.place(context);
	}

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
	private static class ApophylliteOreFeatureRuleTest extends RuleTest {
		static final ApophylliteOreFeatureRuleTest INSTANCE = new ApophylliteOreFeatureRuleTest();
		private static final com.mojang.serialization.Codec<ApophylliteOreFeatureRuleTest> CODEC = com.mojang.serialization.Codec
				.unit(() -> INSTANCE);
		private static final RuleTestType<ApophylliteOreFeatureRuleTest> CUSTOM_MATCH = () -> CODEC;

		@SubscribeEvent
		public static void init(FMLCommonSetupEvent event) {
			Registry.register(Registry.RULE_TEST, new ResourceLocation("ragemod:apophyllite_ore_match"), CUSTOM_MATCH);
		}

		private List<Block> base_blocks = null;

		public boolean test(BlockState blockAt, Random random) {
			if (base_blocks == null) {
				base_blocks = List.of(Blocks.END_STONE);
			}
			return base_blocks.contains(blockAt.getBlock());
		}

		protected RuleTestType<?> getType() {
			return CUSTOM_MATCH;
		}
	}
}
