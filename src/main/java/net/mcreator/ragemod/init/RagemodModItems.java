
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ragemod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.ragemod.item.RageiumItem;
import net.mcreator.ragemod.item.RageiumBowItem;
import net.mcreator.ragemod.item.RageiumArrowItem;
import net.mcreator.ragemod.item.RageiumArmorItem;
import net.mcreator.ragemod.item.RageiumAlloyItem;
import net.mcreator.ragemod.item.RagePotionItem;
import net.mcreator.ragemod.item.FultScrapItem;
import net.mcreator.ragemod.item.FultIngotItem;
import net.mcreator.ragemod.item.CerussiteItem;
import net.mcreator.ragemod.item.AzuriteItem;
import net.mcreator.ragemod.item.ApophylliteItem;
import net.mcreator.ragemod.item.AmazoniteItem;
import net.mcreator.ragemod.item.AdvancementOneIconItem;
import net.mcreator.ragemod.item.AdvancementEasterEggIconItem;
import net.mcreator.ragemod.item.AchatItem;
import net.mcreator.ragemod.RagemodMod;

public class RagemodModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, RagemodMod.MODID);
	public static final RegistryObject<Item> RAGEIUM = REGISTRY.register("rageium", () -> new RageiumItem());
	public static final RegistryObject<Item> RAGEIUM_ALLOY = REGISTRY.register("rageium_alloy", () -> new RageiumAlloyItem());
	public static final RegistryObject<Item> RAGEIUM_ORE = block(RagemodModBlocks.RAGEIUM_ORE, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final RegistryObject<Item> RAGEIUM_BLOCK = block(RagemodModBlocks.RAGEIUM_BLOCK, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final RegistryObject<Item> RAGEIUM_ALLOY_BLOCK = block(RagemodModBlocks.RAGEIUM_ALLOY_BLOCK, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final RegistryObject<Item> RAGEIUM_ARMOR_HELMET = REGISTRY.register("rageium_armor_helmet", () -> new RageiumArmorItem.Helmet());
	public static final RegistryObject<Item> RAGEIUM_ARMOR_CHESTPLATE = REGISTRY.register("rageium_armor_chestplate",
			() -> new RageiumArmorItem.Chestplate());
	public static final RegistryObject<Item> RAGEIUM_ARMOR_LEGGINGS = REGISTRY.register("rageium_armor_leggings",
			() -> new RageiumArmorItem.Leggings());
	public static final RegistryObject<Item> RAGEIUM_ARMOR_BOOTS = REGISTRY.register("rageium_armor_boots", () -> new RageiumArmorItem.Boots());
	public static final RegistryObject<Item> RAGEIUM_BRICKS = block(RagemodModBlocks.RAGEIUM_BRICKS, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final RegistryObject<Item> RAGEIUM_BRICK_STAIRS = block(RagemodModBlocks.RAGEIUM_BRICK_STAIRS, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final RegistryObject<Item> RAGEIUM_BRICK_SLAB = block(RagemodModBlocks.RAGEIUM_BRICK_SLAB, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final RegistryObject<Item> RAGEIUM_BRICK_WALL = block(RagemodModBlocks.RAGEIUM_BRICK_WALL, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final RegistryObject<Item> RAGEIUM_BRICK_PRESSURE_PLATE = block(RagemodModBlocks.RAGEIUM_BRICK_PRESSURE_PLATE,
			RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final RegistryObject<Item> RAGEIUM_BRICK_BUTTON = block(RagemodModBlocks.RAGEIUM_BRICK_BUTTON, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final RegistryObject<Item> RAGEIUM_BOW = REGISTRY.register("rageium_bow", () -> new RageiumBowItem());
	public static final RegistryObject<Item> RAGEIUM_ARROW = REGISTRY.register("rageium_arrow", () -> new RageiumArrowItem());
	public static final RegistryObject<Item> RAGE_POTION = REGISTRY.register("rage_potion", () -> new RagePotionItem());
	public static final RegistryObject<Item> ACHAT = REGISTRY.register("achat", () -> new AchatItem());
	public static final RegistryObject<Item> AZURITE = REGISTRY.register("azurite", () -> new AzuriteItem());
	public static final RegistryObject<Item> AMAZONITE = REGISTRY.register("amazonite", () -> new AmazoniteItem());
	public static final RegistryObject<Item> CERUSSITE = REGISTRY.register("cerussite", () -> new CerussiteItem());
	public static final RegistryObject<Item> APOPHYLLITE = REGISTRY.register("apophyllite", () -> new ApophylliteItem());
	public static final RegistryObject<Item> ACHAT_ORE = block(RagemodModBlocks.ACHAT_ORE, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final RegistryObject<Item> AZURITE_ORE = block(RagemodModBlocks.AZURITE_ORE, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final RegistryObject<Item> AMAZONITE_ORE = block(RagemodModBlocks.AMAZONITE_ORE, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final RegistryObject<Item> CERUSSITE_ORE = block(RagemodModBlocks.CERUSSITE_ORE, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final RegistryObject<Item> APOPHYLLITE_ORE = block(RagemodModBlocks.APOPHYLLITE_ORE, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final RegistryObject<Item> FULT = block(RagemodModBlocks.FULT, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final RegistryObject<Item> FULT_SCRAP = REGISTRY.register("fult_scrap", () -> new FultScrapItem());
	public static final RegistryObject<Item> FULT_INGOT = REGISTRY.register("fult_ingot", () -> new FultIngotItem());
	public static final RegistryObject<Item> FULT_BARS = block(RagemodModBlocks.FULT_BARS, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final RegistryObject<Item> FULT_TRAPDOOR = block(RagemodModBlocks.FULT_TRAPDOOR, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final RegistryObject<Item> CHISELED_FULT = block(RagemodModBlocks.CHISELED_FULT, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final RegistryObject<Item> CALTEN = block(RagemodModBlocks.CALTEN, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final RegistryObject<Item> MOSSY_CALTEN = block(RagemodModBlocks.MOSSY_CALTEN, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final RegistryObject<Item> SMOOTH_CALTEN = block(RagemodModBlocks.SMOOTH_CALTEN, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final RegistryObject<Item> CALTEN_BRICKS = block(RagemodModBlocks.CALTEN_BRICKS, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final RegistryObject<Item> CALTEN_STAIRS = block(RagemodModBlocks.CALTEN_STAIRS, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final RegistryObject<Item> CALTEN_SLAB = block(RagemodModBlocks.CALTEN_SLAB, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final RegistryObject<Item> CALTEN_WALL = block(RagemodModBlocks.CALTEN_WALL, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final RegistryObject<Item> MOSSY_CALTEN_STAIRS = block(RagemodModBlocks.MOSSY_CALTEN_STAIRS, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final RegistryObject<Item> MOSSY_CALTEN_SLAB = block(RagemodModBlocks.MOSSY_CALTEN_SLAB, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final RegistryObject<Item> MOSSY_CALTEN_WALL = block(RagemodModBlocks.MOSSY_CALTEN_WALL, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final RegistryObject<Item> SMOOTH_CALTEN_STAIRS = block(RagemodModBlocks.SMOOTH_CALTEN_STAIRS, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final RegistryObject<Item> SMOOTH_CALTEN_SLAB = block(RagemodModBlocks.SMOOTH_CALTEN_SLAB, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final RegistryObject<Item> SMOOTH_CALTEN_WALL = block(RagemodModBlocks.SMOOTH_CALTEN_WALL, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final RegistryObject<Item> CALTEN_BRICKS_STAIRS = block(RagemodModBlocks.CALTEN_BRICKS_STAIRS, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final RegistryObject<Item> CALTEN_BRICKS_SLAB = block(RagemodModBlocks.CALTEN_BRICKS_SLAB, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final RegistryObject<Item> CALTEN_BRICKS_WALL = block(RagemodModBlocks.CALTEN_BRICKS_WALL, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final RegistryObject<Item> RAGE_MITE = REGISTRY.register("rage_mite_spawn_egg",
			() -> new ForgeSpawnEggItem(RagemodModEntities.RAGE_MITE, -16764007, -65485, new Item.Properties().tab(RagemodModTabs.TAB_RAGEMOD_TAB)));
	public static final RegistryObject<Item> ATOM_RAGER = REGISTRY.register("atom_rager_spawn_egg",
			() -> new ForgeSpawnEggItem(RagemodModEntities.ATOM_RAGER, -3407872, -11382019,
					new Item.Properties().tab(RagemodModTabs.TAB_RAGEMOD_TAB)));
	public static final RegistryObject<Item> FLOOR_BLOCK = block(RagemodModBlocks.FLOOR_BLOCK, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final RegistryObject<Item> RAGE_FLOWER = block(RagemodModBlocks.RAGE_FLOWER, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final RegistryObject<Item> YELLOW_GLOWING_OAK_LEAVES = block(RagemodModBlocks.YELLOW_GLOWING_OAK_LEAVES,
			RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final RegistryObject<Item> BROWN_GLOWING_OAK_LEAVES = block(RagemodModBlocks.BROWN_GLOWING_OAK_LEAVES,
			RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final RegistryObject<Item> RED_GLOWING_OAK_LEAVES = block(RagemodModBlocks.RED_GLOWING_OAK_LEAVES, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final RegistryObject<Item> GREEN_GLOWING_OAK_LEAVES = block(RagemodModBlocks.GREEN_GLOWING_OAK_LEAVES,
			RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final RegistryObject<Item> YELLOW_GLOWING_OAK_TREE_SAPLING = block(RagemodModBlocks.YELLOW_GLOWING_OAK_TREE_SAPLING,
			RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final RegistryObject<Item> BROWN_GLOWING_OAK_TREE_SAPLING = block(RagemodModBlocks.BROWN_GLOWING_OAK_TREE_SAPLING,
			RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final RegistryObject<Item> RED_GLOWING_OAK_TREE_SAPLING = block(RagemodModBlocks.RED_GLOWING_OAK_TREE_SAPLING,
			RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final RegistryObject<Item> GREEN_GLOWING_OAK_TREE_SAPLING = block(RagemodModBlocks.GREEN_GLOWING_OAK_TREE_SAPLING,
			RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final RegistryObject<Item> AMAZONITE_BRICKS = block(RagemodModBlocks.AMAZONITE_BRICKS, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final RegistryObject<Item> AMAZONITE_BRICK_STAIRS = block(RagemodModBlocks.AMAZONITE_BRICK_STAIRS, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final RegistryObject<Item> AMAZONITE_BRICK_SLAB = block(RagemodModBlocks.AMAZONITE_BRICK_SLAB, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final RegistryObject<Item> AMAZONITE_BRICK_WALL = block(RagemodModBlocks.AMAZONITE_BRICK_WALL, RagemodModTabs.TAB_RAGEMOD_TAB);
	public static final RegistryObject<Item> ADVANCEMENT_ONE_ICON = REGISTRY.register("advancement_one_icon", () -> new AdvancementOneIconItem());
	public static final RegistryObject<Item> ADVANCEMENT_EASTER_EGG_ICON = REGISTRY.register("advancement_easter_egg_icon",
			() -> new AdvancementEasterEggIconItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
