
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ragemod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Holder;

import net.mcreator.ragemod.world.features.plants.YellowGlowingOakTreeSaplingFeature;
import net.mcreator.ragemod.world.features.plants.RedGlowingOakTreeSaplingFeature;
import net.mcreator.ragemod.world.features.plants.RageFlowerFeature;
import net.mcreator.ragemod.world.features.plants.GreenGlowingOakTreeSaplingFeature;
import net.mcreator.ragemod.world.features.plants.BrownGlowingOakTreeSaplingFeature;
import net.mcreator.ragemod.world.features.ores.RageiumOreFeature;
import net.mcreator.ragemod.world.features.ores.MossyCaltenFeature;
import net.mcreator.ragemod.world.features.ores.FultFeature;
import net.mcreator.ragemod.world.features.ores.CerussiteOreFeature;
import net.mcreator.ragemod.world.features.ores.CaltenFeature;
import net.mcreator.ragemod.world.features.ores.AzuriteOreFeature;
import net.mcreator.ragemod.world.features.ores.ApophylliteOreFeature;
import net.mcreator.ragemod.world.features.ores.AmazoniteOreFeature;
import net.mcreator.ragemod.world.features.ores.AchatOreFeature;
import net.mcreator.ragemod.world.features.SpareGlowingOakTree5Feature;
import net.mcreator.ragemod.world.features.SpareGlowingOakTree4Feature;
import net.mcreator.ragemod.world.features.SpareGlowingOakTree3Feature;
import net.mcreator.ragemod.world.features.SpareGlowingOakTree2Feature;
import net.mcreator.ragemod.world.features.SpareGlowingOakTree1Feature;
import net.mcreator.ragemod.world.features.GlowingVineAirStrFeature;
import net.mcreator.ragemod.world.features.GlowingOakTree5Feature;
import net.mcreator.ragemod.world.features.GlowingOakTree4Feature;
import net.mcreator.ragemod.world.features.GlowingOakTree3Feature;
import net.mcreator.ragemod.world.features.GlowingOakTree2Feature;
import net.mcreator.ragemod.world.features.GlowingOakTree1Feature;
import net.mcreator.ragemod.world.features.GlowingOakFieldTree5Feature;
import net.mcreator.ragemod.world.features.GlowingOakFieldTree4Feature;
import net.mcreator.ragemod.world.features.GlowingOakFieldTree3Feature;
import net.mcreator.ragemod.world.features.GlowingOakFieldTree2Feature;
import net.mcreator.ragemod.world.features.GlowingOakFieldTree1Feature;
import net.mcreator.ragemod.world.features.GlowingBiomesFlower8Feature;
import net.mcreator.ragemod.world.features.GlowingBiomesFlower7Feature;
import net.mcreator.ragemod.world.features.GlowingBiomesFlower6Feature;
import net.mcreator.ragemod.world.features.GlowingBiomesFlower5Feature;
import net.mcreator.ragemod.world.features.GlowingBiomesFlower4Feature;
import net.mcreator.ragemod.world.features.GlowingBiomesFlower3Feature;
import net.mcreator.ragemod.world.features.GlowingBiomesFlower2Feature;
import net.mcreator.ragemod.world.features.GlowingBiomesFlower1Feature;
import net.mcreator.ragemod.world.features.GlowingBiomesBush4Feature;
import net.mcreator.ragemod.world.features.GlowingBiomesBush3Feature;
import net.mcreator.ragemod.world.features.GlowingBiomesBush2Feature;
import net.mcreator.ragemod.world.features.GlowingBiomesBush1Feature;
import net.mcreator.ragemod.world.features.CaltenStructure01Feature;
import net.mcreator.ragemod.world.features.BeeStructure02Feature;
import net.mcreator.ragemod.world.features.BeeStructure01Feature;
import net.mcreator.ragemod.RagemodMod;

import java.util.function.Supplier;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber
public class RagemodModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, RagemodMod.MODID);
	private static final List<FeatureRegistration> FEATURE_REGISTRATIONS = new ArrayList<>();
	public static final RegistryObject<Feature<?>> RAGEIUM_ORE = register("rageium_ore", RageiumOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, RageiumOreFeature.GENERATE_BIOMES, RageiumOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> ACHAT_ORE = register("achat_ore", AchatOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, AchatOreFeature.GENERATE_BIOMES, AchatOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> AZURITE_ORE = register("azurite_ore", AzuriteOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, AzuriteOreFeature.GENERATE_BIOMES, AzuriteOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> AMAZONITE_ORE = register("amazonite_ore", AmazoniteOreFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.UNDERGROUND_ORES, AmazoniteOreFeature.GENERATE_BIOMES, AmazoniteOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> CERUSSITE_ORE = register("cerussite_ore", CerussiteOreFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.UNDERGROUND_ORES, CerussiteOreFeature.GENERATE_BIOMES, CerussiteOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> APOPHYLLITE_ORE = register("apophyllite_ore", ApophylliteOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, ApophylliteOreFeature.GENERATE_BIOMES,
					ApophylliteOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> FULT = register("fult", FultFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, FultFeature.GENERATE_BIOMES, FultFeature::placedFeature));
	public static final RegistryObject<Feature<?>> CALTEN = register("calten", CaltenFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, CaltenFeature.GENERATE_BIOMES, CaltenFeature::placedFeature));
	public static final RegistryObject<Feature<?>> MOSSY_CALTEN = register("mossy_calten", MossyCaltenFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.UNDERGROUND_ORES, MossyCaltenFeature.GENERATE_BIOMES, MossyCaltenFeature::placedFeature));
	public static final RegistryObject<Feature<?>> RAGE_FLOWER = register("rage_flower", RageFlowerFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.VEGETAL_DECORATION, RageFlowerFeature.GENERATE_BIOMES, RageFlowerFeature::placedFeature));
	public static final RegistryObject<Feature<?>> YELLOW_GLOWING_OAK_TREE_SAPLING = register("yellow_glowing_oak_tree_sapling",
			YellowGlowingOakTreeSaplingFeature::feature, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION,
					YellowGlowingOakTreeSaplingFeature.GENERATE_BIOMES, YellowGlowingOakTreeSaplingFeature::placedFeature));
	public static final RegistryObject<Feature<?>> BROWN_GLOWING_OAK_TREE_SAPLING = register("brown_glowing_oak_tree_sapling",
			BrownGlowingOakTreeSaplingFeature::feature, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION,
					BrownGlowingOakTreeSaplingFeature.GENERATE_BIOMES, BrownGlowingOakTreeSaplingFeature::placedFeature));
	public static final RegistryObject<Feature<?>> RED_GLOWING_OAK_TREE_SAPLING = register("red_glowing_oak_tree_sapling",
			RedGlowingOakTreeSaplingFeature::feature, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION,
					RedGlowingOakTreeSaplingFeature.GENERATE_BIOMES, RedGlowingOakTreeSaplingFeature::placedFeature));
	public static final RegistryObject<Feature<?>> GREEN_GLOWING_OAK_TREE_SAPLING = register("green_glowing_oak_tree_sapling",
			GreenGlowingOakTreeSaplingFeature::feature, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION,
					GreenGlowingOakTreeSaplingFeature.GENERATE_BIOMES, GreenGlowingOakTreeSaplingFeature::placedFeature));
	public static final RegistryObject<Feature<?>> GLOWING_OAK_TREE_1 = register("glowing_oak_tree_1", GlowingOakTree1Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, GlowingOakTree1Feature.GENERATE_BIOMES,
					GlowingOakTree1Feature::placedFeature));
	public static final RegistryObject<Feature<?>> GLOWING_OAK_TREE_2 = register("glowing_oak_tree_2", GlowingOakTree2Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, GlowingOakTree2Feature.GENERATE_BIOMES,
					GlowingOakTree2Feature::placedFeature));
	public static final RegistryObject<Feature<?>> GLOWING_OAK_TREE_3 = register("glowing_oak_tree_3", GlowingOakTree3Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, GlowingOakTree3Feature.GENERATE_BIOMES,
					GlowingOakTree3Feature::placedFeature));
	public static final RegistryObject<Feature<?>> GLOWING_OAK_TREE_4 = register("glowing_oak_tree_4", GlowingOakTree4Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, GlowingOakTree4Feature.GENERATE_BIOMES,
					GlowingOakTree4Feature::placedFeature));
	public static final RegistryObject<Feature<?>> GLOWING_OAK_TREE_5 = register("glowing_oak_tree_5", GlowingOakTree5Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, GlowingOakTree5Feature.GENERATE_BIOMES,
					GlowingOakTree5Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SPARE_GLOWING_OAK_TREE_1 = register("spare_glowing_oak_tree_1",
			SpareGlowingOakTree1Feature::feature, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
					SpareGlowingOakTree1Feature.GENERATE_BIOMES, SpareGlowingOakTree1Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SPARE_GLOWING_OAK_TREE_2 = register("spare_glowing_oak_tree_2",
			SpareGlowingOakTree2Feature::feature, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
					SpareGlowingOakTree2Feature.GENERATE_BIOMES, SpareGlowingOakTree2Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SPARE_GLOWING_OAK_TREE_3 = register("spare_glowing_oak_tree_3",
			SpareGlowingOakTree3Feature::feature, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
					SpareGlowingOakTree3Feature.GENERATE_BIOMES, SpareGlowingOakTree3Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SPARE_GLOWING_OAK_TREE_4 = register("spare_glowing_oak_tree_4",
			SpareGlowingOakTree4Feature::feature, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
					SpareGlowingOakTree4Feature.GENERATE_BIOMES, SpareGlowingOakTree4Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SPARE_GLOWING_OAK_TREE_5 = register("spare_glowing_oak_tree_5",
			SpareGlowingOakTree5Feature::feature, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
					SpareGlowingOakTree5Feature.GENERATE_BIOMES, SpareGlowingOakTree5Feature::placedFeature));
	public static final RegistryObject<Feature<?>> GLOWING_OAK_FIELD_TREE_1 = register("glowing_oak_field_tree_1",
			GlowingOakFieldTree1Feature::feature, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
					GlowingOakFieldTree1Feature.GENERATE_BIOMES, GlowingOakFieldTree1Feature::placedFeature));
	public static final RegistryObject<Feature<?>> GLOWING_OAK_FIELD_TREE_2 = register("glowing_oak_field_tree_2",
			GlowingOakFieldTree2Feature::feature, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
					GlowingOakFieldTree2Feature.GENERATE_BIOMES, GlowingOakFieldTree2Feature::placedFeature));
	public static final RegistryObject<Feature<?>> GLOWING_OAK_FIELD_TREE_3 = register("glowing_oak_field_tree_3",
			GlowingOakFieldTree3Feature::feature, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
					GlowingOakFieldTree3Feature.GENERATE_BIOMES, GlowingOakFieldTree3Feature::placedFeature));
	public static final RegistryObject<Feature<?>> GLOWING_OAK_FIELD_TREE_4 = register("glowing_oak_field_tree_4",
			GlowingOakFieldTree4Feature::feature, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
					GlowingOakFieldTree4Feature.GENERATE_BIOMES, GlowingOakFieldTree4Feature::placedFeature));
	public static final RegistryObject<Feature<?>> GLOWING_OAK_FIELD_TREE_5 = register("glowing_oak_field_tree_5",
			GlowingOakFieldTree5Feature::feature, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
					GlowingOakFieldTree5Feature.GENERATE_BIOMES, GlowingOakFieldTree5Feature::placedFeature));
	public static final RegistryObject<Feature<?>> GLOWING_BIOMES_FLOWER_1 = register("glowing_biomes_flower_1", GlowingBiomesFlower1Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, GlowingBiomesFlower1Feature.GENERATE_BIOMES,
					GlowingBiomesFlower1Feature::placedFeature));
	public static final RegistryObject<Feature<?>> GLOWING_BIOMES_FLOWER_2 = register("glowing_biomes_flower_2", GlowingBiomesFlower2Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, GlowingBiomesFlower2Feature.GENERATE_BIOMES,
					GlowingBiomesFlower2Feature::placedFeature));
	public static final RegistryObject<Feature<?>> GLOWING_BIOMES_FLOWER_3 = register("glowing_biomes_flower_3", GlowingBiomesFlower3Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, GlowingBiomesFlower3Feature.GENERATE_BIOMES,
					GlowingBiomesFlower3Feature::placedFeature));
	public static final RegistryObject<Feature<?>> GLOWING_BIOMES_FLOWER_4 = register("glowing_biomes_flower_4", GlowingBiomesFlower4Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, GlowingBiomesFlower4Feature.GENERATE_BIOMES,
					GlowingBiomesFlower4Feature::placedFeature));
	public static final RegistryObject<Feature<?>> GLOWING_BIOMES_FLOWER_5 = register("glowing_biomes_flower_5", GlowingBiomesFlower5Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, GlowingBiomesFlower5Feature.GENERATE_BIOMES,
					GlowingBiomesFlower5Feature::placedFeature));
	public static final RegistryObject<Feature<?>> GLOWING_BIOMES_FLOWER_6 = register("glowing_biomes_flower_6", GlowingBiomesFlower6Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, GlowingBiomesFlower6Feature.GENERATE_BIOMES,
					GlowingBiomesFlower6Feature::placedFeature));
	public static final RegistryObject<Feature<?>> GLOWING_BIOMES_FLOWER_7 = register("glowing_biomes_flower_7", GlowingBiomesFlower7Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, GlowingBiomesFlower7Feature.GENERATE_BIOMES,
					GlowingBiomesFlower7Feature::placedFeature));
	public static final RegistryObject<Feature<?>> GLOWING_BIOMES_FLOWER_8 = register("glowing_biomes_flower_8", GlowingBiomesFlower8Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, GlowingBiomesFlower8Feature.GENERATE_BIOMES,
					GlowingBiomesFlower8Feature::placedFeature));
	public static final RegistryObject<Feature<?>> GLOWING_BIOMES_BUSH_1 = register("glowing_biomes_bush_1", GlowingBiomesBush1Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, GlowingBiomesBush1Feature.GENERATE_BIOMES,
					GlowingBiomesBush1Feature::placedFeature));
	public static final RegistryObject<Feature<?>> GLOWING_BIOMES_BUSH_2 = register("glowing_biomes_bush_2", GlowingBiomesBush2Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, GlowingBiomesBush2Feature.GENERATE_BIOMES,
					GlowingBiomesBush2Feature::placedFeature));
	public static final RegistryObject<Feature<?>> GLOWING_BIOMES_BUSH_3 = register("glowing_biomes_bush_3", GlowingBiomesBush3Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, GlowingBiomesBush3Feature.GENERATE_BIOMES,
					GlowingBiomesBush3Feature::placedFeature));
	public static final RegistryObject<Feature<?>> GLOWING_BIOMES_BUSH_4 = register("glowing_biomes_bush_4", GlowingBiomesBush4Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, GlowingBiomesBush4Feature.GENERATE_BIOMES,
					GlowingBiomesBush4Feature::placedFeature));
	public static final RegistryObject<Feature<?>> GLOWING_VINE_AIR_STR = register("glowing_vine_air_str", GlowingVineAirStrFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, GlowingVineAirStrFeature.GENERATE_BIOMES,
					GlowingVineAirStrFeature::placedFeature));
	public static final RegistryObject<Feature<?>> CALTEN_STRUCTURE_01 = register("calten_structure_01", CaltenStructure01Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, CaltenStructure01Feature.GENERATE_BIOMES,
					CaltenStructure01Feature::placedFeature));
	public static final RegistryObject<Feature<?>> BEE_STRUCTURE_01 = register("bee_structure_01", BeeStructure01Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, BeeStructure01Feature.GENERATE_BIOMES,
					BeeStructure01Feature::placedFeature));
	public static final RegistryObject<Feature<?>> BEE_STRUCTURE_02 = register("bee_structure_02", BeeStructure02Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, BeeStructure02Feature.GENERATE_BIOMES,
					BeeStructure02Feature::placedFeature));

	private static RegistryObject<Feature<?>> register(String registryname, Supplier<Feature<?>> feature, FeatureRegistration featureRegistration) {
		FEATURE_REGISTRATIONS.add(featureRegistration);
		return REGISTRY.register(registryname, feature);
	}

	@SubscribeEvent
	public static void addFeaturesToBiomes(BiomeLoadingEvent event) {
		for (FeatureRegistration registration : FEATURE_REGISTRATIONS) {
			if (registration.biomes() == null || registration.biomes().contains(event.getName()))
				event.getGeneration().getFeatures(registration.stage()).add(registration.placedFeature().get());
		}
	}

	private static record FeatureRegistration(GenerationStep.Decoration stage, Set<ResourceLocation> biomes,
			Supplier<Holder<PlacedFeature>> placedFeature) {
	}
}
