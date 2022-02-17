
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ragemod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.ragemod.item.WaterRelicItem;
import net.mcreator.ragemod.item.ToxicSwordItem;
import net.mcreator.ragemod.item.ToxicShovelItem;
import net.mcreator.ragemod.item.ToxicPickaxeItem;
import net.mcreator.ragemod.item.ToxicHoeItem;
import net.mcreator.ragemod.item.ToxicCrystalItem;
import net.mcreator.ragemod.item.ToxicAxeItem;
import net.mcreator.ragemod.item.ToxicArmorItem;
import net.mcreator.ragemod.item.RawToxicCrystalItem;
import net.mcreator.ragemod.item.RageiumItem;
import net.mcreator.ragemod.item.RageiumBowItem;
import net.mcreator.ragemod.item.RageiumArrowItem;
import net.mcreator.ragemod.item.RageiumArmorItem;
import net.mcreator.ragemod.item.RageiumAlloyItem;
import net.mcreator.ragemod.item.RagePotionItem;
import net.mcreator.ragemod.item.PatPotionItem;
import net.mcreator.ragemod.item.OpalItem;
import net.mcreator.ragemod.item.FultScrapItem;
import net.mcreator.ragemod.item.FultIngotItem;
import net.mcreator.ragemod.item.FireRelicItem;
import net.mcreator.ragemod.item.EarthRelicItem;
import net.mcreator.ragemod.item.CerussiteItem;
import net.mcreator.ragemod.item.BizmuthItem;
import net.mcreator.ragemod.item.AzuriteItem;
import net.mcreator.ragemod.item.ApophylliteItem;
import net.mcreator.ragemod.item.AnapaitItem;
import net.mcreator.ragemod.item.AmazoniteItem;
import net.mcreator.ragemod.item.AirRelicItem;
import net.mcreator.ragemod.item.AdvancementOneIconItem;
import net.mcreator.ragemod.item.AdvancementEasterEggIconItem;
import net.mcreator.ragemod.item.AdulariaItem;
import net.mcreator.ragemod.item.ActinoliteItem;
import net.mcreator.ragemod.item.AchatItem;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class RagemodModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item RAGEIUM = register(new RageiumItem());
	public static final Item RAGEIUM_ALLOY = register(new RageiumAlloyItem());
	public static final Item RAGEIUM_ORE = register(RagemodModBlocks.RAGEIUM_ORE, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item RAGEIUM_BLOCK = register(RagemodModBlocks.RAGEIUM_BLOCK, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item RAGEIUM_ALLOY_BLOCK = register(RagemodModBlocks.RAGEIUM_ALLOY_BLOCK, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item RAGEIUM_ARMOR_HELMET = register(new RageiumArmorItem.Helmet());
	public static final Item RAGEIUM_ARMOR_CHESTPLATE = register(new RageiumArmorItem.Chestplate());
	public static final Item RAGEIUM_ARMOR_LEGGINGS = register(new RageiumArmorItem.Leggings());
	public static final Item RAGEIUM_ARMOR_BOOTS = register(new RageiumArmorItem.Boots());
	public static final Item RAGEIUM_BRICKS = register(RagemodModBlocks.RAGEIUM_BRICKS, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item RAGEIUM_BRICK_STAIRS = register(RagemodModBlocks.RAGEIUM_BRICK_STAIRS, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item RAGEIUM_BRICK_SLAB = register(RagemodModBlocks.RAGEIUM_BRICK_SLAB, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item RAGEIUM_BRICK_WALL = register(RagemodModBlocks.RAGEIUM_BRICK_WALL, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item RAGEIUM_BRICK_PRESSURE_PLATE = register(RagemodModBlocks.RAGEIUM_BRICK_PRESSURE_PLATE, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item RAGEIUM_BRICK_BUTTON = register(RagemodModBlocks.RAGEIUM_BRICK_BUTTON, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item RAGEIUM_BOW = register(new RageiumBowItem());
	public static final Item RAGEIUM_ARROW = register(new RageiumArrowItem());
	public static final Item RAGE_POTION = register(new RagePotionItem());
	public static final Item PAT_POTION = register(new PatPotionItem());
	public static final Item BOOM_STONE = register(RagemodModBlocks.BOOM_STONE, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item TELEPORTER = register(RagemodModBlocks.TELEPORTER, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item TOXIC_CRYSTAL_ORE = register(RagemodModBlocks.TOXIC_CRYSTAL_ORE, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item RAW_TOXIC_CRYSTAL = register(new RawToxicCrystalItem());
	public static final Item TOXIC_CRYSTAL = register(new ToxicCrystalItem());
	public static final Item RAW_TOXIC_CRYSTAL_BLOCK = register(RagemodModBlocks.RAW_TOXIC_CRYSTAL_BLOCK, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item TOXIC_CRYSTAL_BLOCK = register(RagemodModBlocks.TOXIC_CRYSTAL_BLOCK, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item TOXIC_PLANT = register(RagemodModBlocks.TOXIC_PLANT, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item TOXIC_SWORD = register(new ToxicSwordItem());
	public static final Item TOXIC_PICKAXE = register(new ToxicPickaxeItem());
	public static final Item TOXIC_AXE = register(new ToxicAxeItem());
	public static final Item TOXIC_SHOVEL = register(new ToxicShovelItem());
	public static final Item TOXIC_HOE = register(new ToxicHoeItem());
	public static final Item TOXIC_ARMOR_HELMET = register(new ToxicArmorItem.Helmet());
	public static final Item TOXIC_ARMOR_CHESTPLATE = register(new ToxicArmorItem.Chestplate());
	public static final Item TOXIC_ARMOR_LEGGINGS = register(new ToxicArmorItem.Leggings());
	public static final Item TOXIC_ARMOR_BOOTS = register(new ToxicArmorItem.Boots());
	public static final Item ACTINOLITE = register(new ActinoliteItem());
	public static final Item ACHAT = register(new AchatItem());
	public static final Item AZURITE = register(new AzuriteItem());
	public static final Item ANAPAIT = register(new AnapaitItem());
	public static final Item ADULARIA = register(new AdulariaItem());
	public static final Item AMAZONITE = register(new AmazoniteItem());
	public static final Item CERUSSITE = register(new CerussiteItem());
	public static final Item BISMUTH = register(new BizmuthItem());
	public static final Item APOPHYLLITE = register(new ApophylliteItem());
	public static final Item OPAL = register(new OpalItem());
	public static final Item ACTINOLITE_ORE = register(RagemodModBlocks.ACTINOLITE_ORE, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item ACHAT_ORE = register(RagemodModBlocks.ACHAT_ORE, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item AZURITE_ORE = register(RagemodModBlocks.AZURITE_ORE, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item ANAPAIT_ORE = register(RagemodModBlocks.ANAPAIT_ORE, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item ADULARIA_ORE = register(RagemodModBlocks.ADULARIA_ORE, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item AMAZONITE_ORE = register(RagemodModBlocks.AMAZONITE_ORE, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item CERUSSITE_ORE = register(RagemodModBlocks.CERUSSITE_ORE, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item BISMUTH_ORE = register(RagemodModBlocks.BISMUTH_ORE, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item APOPHYLLITE_ORE = register(RagemodModBlocks.APOPHYLLITE_ORE, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item OPAL_ORE = register(RagemodModBlocks.OPAL_ORE, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item FULT = register(RagemodModBlocks.FULT, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item FULT_SCRAP = register(new FultScrapItem());
	public static final Item FULT_INGOT = register(new FultIngotItem());
	public static final Item FULT_BARS = register(RagemodModBlocks.FULT_BARS, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item FULT_TRAPDOOR = register(RagemodModBlocks.FULT_TRAPDOOR, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item CALTEN = register(RagemodModBlocks.CALTEN, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item MOSSY_CALTEN = register(RagemodModBlocks.MOSSY_CALTEN, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item SMOOTH_CALTEN = register(RagemodModBlocks.SMOOTH_CALTEN, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item CALTEN_BRICKS = register(RagemodModBlocks.CALTEN_BRICKS, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item CALTEN_STAIRS = register(RagemodModBlocks.CALTEN_STAIRS, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item CALTEN_SLAB = register(RagemodModBlocks.CALTEN_SLAB, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item CALTEN_WALL = register(RagemodModBlocks.CALTEN_WALL, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item MOSSY_CALTEN_STAIRS = register(RagemodModBlocks.MOSSY_CALTEN_STAIRS, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item MOSSY_CALTEN_SLAB = register(RagemodModBlocks.MOSSY_CALTEN_SLAB, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item MOSSY_CALTEN_WALL = register(RagemodModBlocks.MOSSY_CALTEN_WALL, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item SMOOTH_CALTEN_STAIRS = register(RagemodModBlocks.SMOOTH_CALTEN_STAIRS, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item SMOOTH_CALTEN_SLAB = register(RagemodModBlocks.SMOOTH_CALTEN_SLAB, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item SMOOTH_CALTEN_WALL = register(RagemodModBlocks.SMOOTH_CALTEN_WALL, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item CALTEN_BRICKS_STAIRS = register(RagemodModBlocks.CALTEN_BRICKS_STAIRS, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item CALTEN_BRICKS_SLAB = register(RagemodModBlocks.CALTEN_BRICKS_SLAB, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item CALTEN_BRICKS_WALL = register(RagemodModBlocks.CALTEN_BRICKS_WALL, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item RAGE_MITE = register(
			new SpawnEggItem(RagemodModEntities.RAGE_MITE, -16764007, -65485, new Item.Properties().tab(RagemodModTabs.TAB_RAGEMOD_TAB))
					.setRegistryName("rage_mite_spawn_egg"));
	public static final Item ATOM_RAGER = register(
			new SpawnEggItem(RagemodModEntities.ATOM_RAGER, -3407872, -11382019, new Item.Properties().tab(RagemodModTabs.TAB_RAGEMOD_TAB))
					.setRegistryName("atom_rager_spawn_egg"));
	public static final Item BEECH_LOG = register(RagemodModBlocks.BEECH_LOG, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item BEECH_BLOCK = register(RagemodModBlocks.BEECH_BLOCK, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item STRIPPED_BEECH_LOG = register(RagemodModBlocks.STRIPPED_BEECH_LOG, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item STIPPED_BEECH_LOG = register(RagemodModBlocks.STIPPED_BEECH_LOG, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item RAGE_WOOD_LOG = register(RagemodModBlocks.RAGE_WOOD_LOG, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item RAGE_WOOD_BLOCK = register(RagemodModBlocks.RAGE_WOOD_BLOCK, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item STRIPPED_RAGE_WOOD_LOG = register(RagemodModBlocks.STRIPPED_RAGE_WOOD_LOG, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item BETTER_STRIPPED_RAGE_WOOD_LOG = register(RagemodModBlocks.BETTER_STRIPPED_RAGE_WOOD_LOG, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item STRIPPED_RAGE_WOOD_BLOCK = register(RagemodModBlocks.STRIPPED_RAGE_WOOD_BLOCK, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item BETTER_STRIPPED_RAGE_WOOD_BLOCK = register(RagemodModBlocks.BETTER_STRIPPED_RAGE_WOOD_BLOCK,
			RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item ROBTAI_LOG = register(RagemodModBlocks.ROBTAI_LOG, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item ROBTAI_BLOCK = register(RagemodModBlocks.ROBTAI_BLOCK, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item STRIPPED_ROBTAI_LOG = register(RagemodModBlocks.STRIPPED_ROBTAI_LOG, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item STRIPPED_ROBTAI_BLOCK = register(RagemodModBlocks.STRIPPED_ROBTAI_BLOCK, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item BEECH_PLANKS = register(RagemodModBlocks.BEECH_PLANKS, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item BEECH_STAIRS = register(RagemodModBlocks.BEECH_STAIRS, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item BEECH_SLAB = register(RagemodModBlocks.BEECH_SLAB, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item BEECH_FENCE = register(RagemodModBlocks.BEECH_FENCE, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item BEECH_FENCE_GATE = register(RagemodModBlocks.BEECH_FENCE_GATE, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item RAGE_WOOD_PLANKS = register(RagemodModBlocks.RAGE_WOOD_PLANKS, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item RAGE_WOOD_STAIRS = register(RagemodModBlocks.RAGE_WOOD_STAIRS, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item RAGE_WOOD_SLAB = register(RagemodModBlocks.RAGE_WOOD_SLAB, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item RAGE_WOOD_FENCE = register(RagemodModBlocks.RAGE_WOOD_FENCE, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item RAGE_WOOD_FENCE_GATE = register(RagemodModBlocks.RAGE_WOOD_FENCE_GATE, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item ROBTAI_PLANKS = register(RagemodModBlocks.ROBTAI_PLANKS, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item ROBTAI_STAIRS = register(RagemodModBlocks.ROBTAI_STAIRS, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item ROBTAI_SLAB = register(RagemodModBlocks.ROBTAI_SLAB, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item ROBTAI_FENCE = register(RagemodModBlocks.ROBTAI_FENCE, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item ROBTAI_FENCE_GATE = register(RagemodModBlocks.ROBTAI_FENCE_GATE, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item BEECH_DOOR = register(RagemodModBlocks.BEECH_DOOR, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item RAGE_WOOD_DOOR = register(RagemodModBlocks.RAGE_WOOD_DOOR, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item ROBTAI_DOOR = register(RagemodModBlocks.ROBTAI_DOOR, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item BEECH_TRAPDOOR = register(RagemodModBlocks.BEECH_TRAPDOOR, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item RAGE_WOOD_TRAPDOOR = register(RagemodModBlocks.RAGE_WOOD_TRAPDOOR, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item ROBTAI_TRAPDOOR = register(RagemodModBlocks.ROBTAI_TRAPDOOR, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item BEECH_LEAVES = register(RagemodModBlocks.BEECH_LEAVES, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item RAGE_WOOD_LEAVES = register(RagemodModBlocks.RAGE_WOOD_LEAVES, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item ROBTAI_LEAVES = register(RagemodModBlocks.ROBTAI_LEAVES, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item BEECH_SAPLING = register(RagemodModBlocks.BEECH_SAPLING, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item RAGE_WOOD_SAPLING = register(RagemodModBlocks.RAGE_WOOD_SAPLING, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item ROBTAI_SAPLING = register(RagemodModBlocks.ROBTAI_SAPLING, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item TOXIC_TOPPED_STONE = register(RagemodModBlocks.TOXIC_TOPPED_STONE, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item TOXIC_TOPPED_NETHERRACK = register(RagemodModBlocks.TOXIC_TOPPED_NETHERRACK, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item TOXIC_TOPPED_ENDSTONE = register(RagemodModBlocks.TOXIC_TOPPED_ENDSTONE, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item TOXIC_TOPPED_DIRT = register(RagemodModBlocks.TOXIC_TOPPED_DIRT, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item TOXIC_TOPPED_OAK_LOG = register(RagemodModBlocks.TOXIC_TOPPED_OAK_LOG, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item TOXIC_TOPPED_OAK_PLANKS = register(RagemodModBlocks.TOXIC_TOPPED_OAK_PLANKS, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item TOXIC_TOPPED_ANDESITE = register(RagemodModBlocks.TOXIC_TOPPED_ANDESITE, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item TOXIC_TOPPED_DIORITE = register(RagemodModBlocks.TOXIC_TOPPED_DIORITE, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item TOXIC_TOPPED_GRANITE = register(RagemodModBlocks.TOXIC_TOPPED_GRANITE, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item TOXIC_TOPPED_BONE_BLOCK = register(RagemodModBlocks.TOXIC_TOPPED_BONE_BLOCK, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item TOXIC_TOPPED_BRICKS = register(RagemodModBlocks.TOXIC_TOPPED_BRICKS, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item TOXIC_TOPPED_STONE_BRICKS = register(RagemodModBlocks.TOXIC_TOPPED_STONE_BRICKS, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item TOXIC_TOPPED_ANCIENT_DEBRIS = register(RagemodModBlocks.TOXIC_TOPPED_ANCIENT_DEBRIS, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item TOXIC_TOPPED_BASALT = register(RagemodModBlocks.TOXIC_TOPPED_BASALT, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item TOXIC_TOPPED_COBBLESTONE = register(RagemodModBlocks.TOXIC_TOPPED_COBBLESTONE, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item TOXIC_TOPPED_GRAVEL = register(RagemodModBlocks.TOXIC_TOPPED_GRAVEL, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item TOXIC_TOPPED_BLACKSTONE = register(RagemodModBlocks.TOXIC_TOPPED_BLACKSTONE, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item TOXIC_TOPPED_SAND = register(RagemodModBlocks.TOXIC_TOPPED_SAND, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item TOXIC_TOPPED_RED_SAND = register(RagemodModBlocks.TOXIC_TOPPED_RED_SAND, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item TOXIC_TOPPED_OBSIDIAN = register(RagemodModBlocks.TOXIC_TOPPED_OBSIDIAN, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item TOXIC_TOPPED_RAGEIUM_ORE = register(RagemodModBlocks.TOXIC_TOPPED_RAGEIUM_ORE, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item TOXIC_TOPPED_RAGEIUM_BLOCK = register(RagemodModBlocks.TOXIC_TOPPED_RAGEIUM_BLOCK, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item TOXIC_TOPPED_RAGEIUM_ALLOY_BLOCK = register(RagemodModBlocks.TOXIC_TOPPED_RAGEIUM_ALLOY_BLOCK,
			RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item FLOOR_BLOCK = register(RagemodModBlocks.FLOOR_BLOCK, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item RAGE_FLOWER = register(RagemodModBlocks.RAGE_FLOWER, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item FIRE_RELIC = register(new FireRelicItem());
	public static final Item WATER_RELIC = register(new WaterRelicItem());
	public static final Item EARTH_RELIC = register(new EarthRelicItem());
	public static final Item AIR_RELIC = register(new AirRelicItem());
	public static final Item ADVANCEMENT_ONE_ICON = register(new AdvancementOneIconItem());
	public static final Item ADVANCEMENT_EASTER_EGG_ICON = register(new AdvancementEasterEggIconItem());
	public static final Item YELLOW_GLOWING_OAK_LEAVES = register(RagemodModBlocks.YELLOW_GLOWING_OAK_LEAVES, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item BROWN_GLOWING_OAK_LEAVES = register(RagemodModBlocks.BROWN_GLOWING_OAK_LEAVES, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item RED_GLOWING_OAK_LEAVES = register(RagemodModBlocks.RED_GLOWING_OAK_LEAVES, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item GREEN_GLOWING_OAK_LEAVES = register(RagemodModBlocks.GREEN_GLOWING_OAK_LEAVES, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item YELLOW_GLOWING_OAK_TREE_SAPLING = register(RagemodModBlocks.YELLOW_GLOWING_OAK_TREE_SAPLING,
			CreativeModeTab.TAB_DECORATIONS);
	public static final Item BROWN_GLOWING_OAK_TREE_SAPLING = register(RagemodModBlocks.BROWN_GLOWING_OAK_TREE_SAPLING,
			CreativeModeTab.TAB_DECORATIONS);
	public static final Item RED_GLOWING_OAK_TREE_SAPLING = register(RagemodModBlocks.RED_GLOWING_OAK_TREE_SAPLING, CreativeModeTab.TAB_DECORATIONS);
	public static final Item GREEN_GLOWING_OAK_TREE_SAPLING = register(RagemodModBlocks.GREEN_GLOWING_OAK_TREE_SAPLING,
			CreativeModeTab.TAB_DECORATIONS);

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	private static Item register(Block block, CreativeModeTab tab) {
		return register(new BlockItem(block, new Item.Properties().tab(tab)).setRegistryName(block.getRegistryName()));
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
