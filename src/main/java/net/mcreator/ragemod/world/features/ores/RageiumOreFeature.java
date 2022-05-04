
package net.mcreator.ragemod.world.features.ores;

import net.mcreator.ragemod.init.RagemodModBlocks;

import java.util.Set;
import java.util.Random;
import java.util.List;

public class RageiumOreFeature extends OreFeature {
	public static RageiumOreFeature FEATURE = null;
	public static Holder<ConfiguredFeature<OreConfiguration, ?>> CONFIGURED_FEATURE = null;
	public static Holder<PlacedFeature> PLACED_FEATURE = null;

	public static Feature<?> feature() {
		FEATURE = new RageiumOreFeature();
		CONFIGURED_FEATURE = FeatureUtils.register("ragemod:rageium_ore", FEATURE,
				new OreConfiguration(RageiumOreFeatureRuleTest.INSTANCE, RagemodModBlocks.RAGEIUM_ORE.get().defaultBlockState(), 5));
		PLACED_FEATURE = PlacementUtils.register("ragemod:rageium_ore", CONFIGURED_FEATURE, List.of(CountPlacement.of(9), InSquarePlacement.spread(),
				HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(120))));
		return FEATURE;
	}

	public static Holder<PlacedFeature> placedFeature() {
		return PLACED_FEATURE;
	}

	public static final Set<ResourceLocation> GENERATE_BIOMES = null;
	private final Set<ResourceKey<Level>> generate_dimensions = Set.of(Level.OVERWORLD);

	public RageiumOreFeature() {
		super(OreConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<OreConfiguration> context) {
		WorldGenLevel world = context.level();
		if (!generate_dimensions.contains(world.getLevel().dimension()))
			return false;
		return super.place(context);
	}

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
	private static class RageiumOreFeatureRuleTest extends RuleTest {
		static final RageiumOreFeatureRuleTest INSTANCE = new RageiumOreFeatureRuleTest();
		private static final com.mojang.serialization.Codec<RageiumOreFeatureRuleTest> CODEC = com.mojang.serialization.Codec.unit(() -> INSTANCE);
		private static final RuleTestType<RageiumOreFeatureRuleTest> CUSTOM_MATCH = () -> CODEC;

		@SubscribeEvent
		public static void init(FMLCommonSetupEvent event) {
			Registry.register(Registry.RULE_TEST, new ResourceLocation("ragemod:rageium_ore_match"), CUSTOM_MATCH);
		}

		private List<Block> base_blocks = null;

		public boolean test(BlockState blockAt, Random random) {
			if (base_blocks == null) {
				base_blocks = List.of(Blocks.STONE);
			}
			return base_blocks.contains(blockAt.getBlock());
		}

		protected RuleTestType<?> getType() {
			return CUSTOM_MATCH;
		}
	}
}
