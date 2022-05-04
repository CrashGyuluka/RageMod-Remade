
package net.mcreator.ragemod.world.features.ores;

import net.mcreator.ragemod.init.RagemodModBlocks;

import java.util.Set;
import java.util.Random;
import java.util.List;

public class CerussiteOreFeature extends OreFeature {
	public static CerussiteOreFeature FEATURE = null;
	public static Holder<ConfiguredFeature<OreConfiguration, ?>> CONFIGURED_FEATURE = null;
	public static Holder<PlacedFeature> PLACED_FEATURE = null;

	public static Feature<?> feature() {
		FEATURE = new CerussiteOreFeature();
		CONFIGURED_FEATURE = FeatureUtils.register("ragemod:cerussite_ore", FEATURE,
				new OreConfiguration(CerussiteOreFeatureRuleTest.INSTANCE, RagemodModBlocks.CERUSSITE_ORE.get().defaultBlockState(), 3));
		PLACED_FEATURE = PlacementUtils.register("ragemod:cerussite_ore", CONFIGURED_FEATURE, List.of(CountPlacement.of(8),
				InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.absolute(50), VerticalAnchor.absolute(128))));
		return FEATURE;
	}

	public static Holder<PlacedFeature> placedFeature() {
		return PLACED_FEATURE;
	}

	public static final Set<ResourceLocation> GENERATE_BIOMES = null;
	private final Set<ResourceKey<Level>> generate_dimensions = Set.of(Level.NETHER);

	public CerussiteOreFeature() {
		super(OreConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<OreConfiguration> context) {
		WorldGenLevel world = context.level();
		if (!generate_dimensions.contains(world.getLevel().dimension()))
			return false;
		return super.place(context);
	}

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
	private static class CerussiteOreFeatureRuleTest extends RuleTest {
		static final CerussiteOreFeatureRuleTest INSTANCE = new CerussiteOreFeatureRuleTest();
		private static final com.mojang.serialization.Codec<CerussiteOreFeatureRuleTest> CODEC = com.mojang.serialization.Codec.unit(() -> INSTANCE);
		private static final RuleTestType<CerussiteOreFeatureRuleTest> CUSTOM_MATCH = () -> CODEC;

		@SubscribeEvent
		public static void init(FMLCommonSetupEvent event) {
			Registry.register(Registry.RULE_TEST, new ResourceLocation("ragemod:cerussite_ore_match"), CUSTOM_MATCH);
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
