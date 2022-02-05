
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ragemod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.ragemod.item.WaterRelicItem;
import net.mcreator.ragemod.item.ToxicSwordItem;
import net.mcreator.ragemod.item.ToxicShovelItem;
import net.mcreator.ragemod.item.ToxicPickaxeItem;
import net.mcreator.ragemod.item.ToxicHoeItem;
import net.mcreator.ragemod.item.ToxicDetonatorItem;
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
import net.mcreator.ragemod.item.OpalItem;
import net.mcreator.ragemod.item.FireRelicItem;
import net.mcreator.ragemod.item.EarthRelicItem;
import net.mcreator.ragemod.item.CerussiteItem;
import net.mcreator.ragemod.item.BizmuthItem;
import net.mcreator.ragemod.item.AzuriteItem;
import net.mcreator.ragemod.item.ApophylliteItem;
import net.mcreator.ragemod.item.AnapaitItem;
import net.mcreator.ragemod.item.AmazoniteItem;
import net.mcreator.ragemod.item.AirRelicItem;
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
	public static final Item BOOM_STONE = register(RagemodModBlocks.BOOM_STONE, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item TELEPORTER = register(RagemodModBlocks.TELEPORTER, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item RAW_TOXIC_CRYSTAL = register(new RawToxicCrystalItem());
	public static final Item TOXIC_CRYSTAL = register(new ToxicCrystalItem());
	public static final Item RAW_TOXIC_CRYSTAL_BLOCK = register(RagemodModBlocks.RAW_TOXIC_CRYSTAL_BLOCK, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item TOXIC_CRYSTAL_BLOCK = register(RagemodModBlocks.TOXIC_CRYSTAL_BLOCK, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item TOXIC_CRYSTAL_ORE = register(RagemodModBlocks.TOXIC_CRYSTAL_ORE, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item TOXIC_PLANT = register(RagemodModBlocks.TOXIC_PLANT, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item TOXIC_AXE = register(new ToxicAxeItem());
	public static final Item TOXIC_SWORD = register(new ToxicSwordItem());
	public static final Item TOXIC_PICKAXE = register(new ToxicPickaxeItem());
	public static final Item TOXIC_SHOVEL = register(new ToxicShovelItem());
	public static final Item TOXIC_HOE = register(new ToxicHoeItem());
	public static final Item TOXIC_ARMOR_HELMET = register(new ToxicArmorItem.Helmet());
	public static final Item TOXIC_ARMOR_CHESTPLATE = register(new ToxicArmorItem.Chestplate());
	public static final Item TOXIC_ARMOR_LEGGINGS = register(new ToxicArmorItem.Leggings());
	public static final Item TOXIC_ARMOR_BOOTS = register(new ToxicArmorItem.Boots());
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
	public static final Item TOXIC_DETONATOR = register(new ToxicDetonatorItem());
	public static final Item RAGE_FLOWER = register(RagemodModBlocks.RAGE_FLOWER, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item FIRE_RELIC = register(new FireRelicItem());
	public static final Item WATER_RELIC = register(new WaterRelicItem());
	public static final Item EARTH_RELIC = register(new EarthRelicItem());
	public static final Item AIR_RELIC = register(new AirRelicItem());
	public static final Item FLOOR_BLOCK = register(RagemodModBlocks.FLOOR_BLOCK, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item AMAZONITE = register(new AmazoniteItem());
	public static final Item APOPHYLLITE = register(new ApophylliteItem());
	public static final Item AZURITE = register(new AzuriteItem());
	public static final Item BISMUTH = register(new BizmuthItem());
	public static final Item ACHAT = register(new AchatItem());
	public static final Item ADULARIA = register(new AdulariaItem());
	public static final Item ACTINOLITE = register(new ActinoliteItem());
	public static final Item ANAPAIT = register(new AnapaitItem());
	public static final Item CERUSSITE = register(new CerussiteItem());
	public static final Item OPAL = register(new OpalItem());
	public static final Item ACTINOLITE_ORE = register(RagemodModBlocks.ACTINOLITE_ORE, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item ACHAT_ORE = register(RagemodModBlocks.ACHAT_ORE, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item AZURITE_ORE = register(RagemodModBlocks.AZURITE_ORE, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item AMAZONITE_ORE = register(RagemodModBlocks.AMAZONITE_ORE, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item CERUSSITE_ORE = register(RagemodModBlocks.CERUSSITE_ORE, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item BISMUTH_ORE = register(RagemodModBlocks.BISMUTH_ORE, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item APOPHYLLITE_ORE = register(RagemodModBlocks.APOPHYLLITE_ORE, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item OPAL_ORE = register(RagemodModBlocks.OPAL_ORE, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item ANAPAIT_ORE = register(RagemodModBlocks.ANAPAIT_ORE, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item ADULARIA_ORE = register(RagemodModBlocks.ADULARIA_ORE, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item CLOFTIN = register(RagemodModBlocks.CLOFTIN, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item MOSSY_CLOFTIN = register(RagemodModBlocks.MOSSY_CLOFTIN, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item CLOFTIN_STAIRS = register(RagemodModBlocks.CLOFTIN_STAIRS, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item CLOFTIN_SLAB = register(RagemodModBlocks.CLOFTIN_SLAB, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item CLOFTIN_WALL = register(RagemodModBlocks.CLOFTIN_WALL, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item CLOFTIN_PRESSURE_PLATE = register(RagemodModBlocks.CLOFTIN_PRESSURE_PLATE, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item MOSSY_CLOFTIN_STAIRS = register(RagemodModBlocks.MOSSY_CLOFTIN_STAIRS, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item MOSSY_CLOFTIN_SLAB = register(RagemodModBlocks.MOSSY_CLOFTIN_SLAB, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item MOSSY_CLOFTIN_WALL = register(RagemodModBlocks.MOSSY_CLOFTIN_WALL, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item MOSSY_CLOFTIN_PRESSURE_PLATE = register(RagemodModBlocks.MOSSY_CLOFTIN_PRESSURE_PLATE, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item SMOOTH_CLOFTIN = register(RagemodModBlocks.SMOOTH_CLOFTIN, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final Item CLOFTIN_BRICKS = register(RagemodModBlocks.CLOFTIN_BRICKS, RagemodModTabs.TAB_RAGEMOD_TAB);

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
