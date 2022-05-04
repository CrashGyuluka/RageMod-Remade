
package net.mcreator.ragemod.world.features.ores;

import net.mcreator.ragemod.init.RagemodModBlocks;

import java.util.Set;
import java.util.Random;
import java.util.List;

public class AmazoniteOreFeature extends OreFeature {
	public static AmazoniteOreFeature FEATURE = null;
	public static Holder<ConfiguredFeature<OreConfiguration, ?>> CONFIGURED_FEATURE = null;
	public static Holder<PlacedFeature> PLACED_FEATURE = null;

	public static Feature<?> feature() {
		FEATURE = new AmazoniteOreFeature();
		CONFIGURED_FEATURE = FeatureUtils.register("ragemod:amazonite_ore", FEATURE,
				new OreConfiguration(AmazoniteOreFeatureRuleTest.INSTANCE, RagemodModBlocks.AMAZONITE_ORE.get().defaultBlockState(), 3));
		PLACED_FEATURE = PlacementUtils.register("ragemod:amazonite_ore", CONFIGURED_FEATURE, List.of(CountPlacement.of(9),
				InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.absolute(30), VerticalAnchor.absolute(128))));
		return FEATURE;
	}

	public static Holder<PlacedFeature> placedFeature() {
		return PLACED_FEATURE;
	}

	public static final Set<ResourceLocation> GENERATE_BIOMES = null;
	private final Set<ResourceKey<Level>> generate_dimensions = Set.of(Level.NETHER);

	public AmazoniteOreFeature() {
		super(OreConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<OreConfiguration> context) {
		WorldGenLevel world = context.level();
		if (!generate_dimensions.contains(world.getLevel().dimension()))
			return false;
		return super.place(context);
	}

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
	private static class AmazoniteOreFeatureRuleTest extends RuleTest {
		static final AmazoniteOreFeatureRuleTest INSTANCE = new AmazoniteOreFeatureRuleTest();
		private static final com.mojang.serialization.Codec<AmazoniteOreFeatureRuleTest> CODEC = com.mojang.serialization.Codec.unit(() -> INSTANCE);
		private static final RuleTestType<AmazoniteOreFeatureRuleTest> CUSTOM_MATCH = () -> CODEC;

		@SubscribeEvent
		public static void init(FMLCommonSetupEvent event) {
			Registry.register(Registry.RULE_TEST, new ResourceLocation("ragemod:amazonite_ore_match"), CUSTOM_MATCH);
		}

		private List<Block> base_blocks = null;

		public boolean test(BlockState blockAt, Random random) {
			if (base_blocks == null) {
				base_blocks = List.of(Blocks.NETHERRACK);
			}
			return base_blocks.contains(blockAt.getBlock());
		}

		protected RuleTestType<?> getType() {
			return CUSTOM_MATCH;
		}
	}
}
