
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ragemod.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.ragemod.block.ToxicToppedStoneBricksBlock;
import net.mcreator.ragemod.block.ToxicToppedStoneBlock;
import net.mcreator.ragemod.block.ToxicToppedSandBlock;
import net.mcreator.ragemod.block.ToxicToppedRedSandBlock;
import net.mcreator.ragemod.block.ToxicToppedRageiumOreBlock;
import net.mcreator.ragemod.block.ToxicToppedRageiumBlockBlock;
import net.mcreator.ragemod.block.ToxicToppedRageiumAlloyBlockBlock;
import net.mcreator.ragemod.block.ToxicToppedObsidianBlock;
import net.mcreator.ragemod.block.ToxicToppedOakPlanksBlock;
import net.mcreator.ragemod.block.ToxicToppedOakLogBlock;
import net.mcreator.ragemod.block.ToxicToppedNetherrackBlock;
import net.mcreator.ragemod.block.ToxicToppedGravelBlock;
import net.mcreator.ragemod.block.ToxicToppedGraniteBlock;
import net.mcreator.ragemod.block.ToxicToppedEndstoneBlock;
import net.mcreator.ragemod.block.ToxicToppedDirtBlock;
import net.mcreator.ragemod.block.ToxicToppedDioriteBlock;
import net.mcreator.ragemod.block.ToxicToppedCobblestoneBlock;
import net.mcreator.ragemod.block.ToxicToppedBricksBlock;
import net.mcreator.ragemod.block.ToxicToppedBoneBlockBlock;
import net.mcreator.ragemod.block.ToxicToppedBlackstoneBlock;
import net.mcreator.ragemod.block.ToxicToppedBasaltBlock;
import net.mcreator.ragemod.block.ToxicToppedAndesiteBlock;
import net.mcreator.ragemod.block.ToxicToppedAncientDebrisBlock;
import net.mcreator.ragemod.block.ToxicPlantBlock;
import net.mcreator.ragemod.block.ToxicCrystalOreBlock;
import net.mcreator.ragemod.block.ToxicCrystalBlockBlock;
import net.mcreator.ragemod.block.TeleporterBlock;
import net.mcreator.ragemod.block.RawToxicCrystalBlockBlock;
import net.mcreator.ragemod.block.RageiumOreBlock;
import net.mcreator.ragemod.block.RageiumBricksBlock;
import net.mcreator.ragemod.block.RageiumBrickWallBlock;
import net.mcreator.ragemod.block.RageiumBrickStairsBlock;
import net.mcreator.ragemod.block.RageiumBrickSlabBlock;
import net.mcreator.ragemod.block.RageiumBrickPressurePlateBlock;
import net.mcreator.ragemod.block.RageiumBrickButtonBlock;
import net.mcreator.ragemod.block.RageiumBlockBlock;
import net.mcreator.ragemod.block.RageiumAlloyBlockBlock;
import net.mcreator.ragemod.block.RageFlowerBlock;
import net.mcreator.ragemod.block.FloorBlockBlock;
import net.mcreator.ragemod.block.CerussiteOreBlock;
import net.mcreator.ragemod.block.BoomStoneBlock;
import net.mcreator.ragemod.block.BismuthOreBlock;
import net.mcreator.ragemod.block.AzuriteOreBlock;
import net.mcreator.ragemod.block.AmazoniteOreBlock;
import net.mcreator.ragemod.block.ActinoliteOreBlock;
import net.mcreator.ragemod.block.AchatOreBlock;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class RagemodModBlocks {
	private static final List<Block> REGISTRY = new ArrayList<>();
	public static final Block RAGEIUM_ORE = register(new RageiumOreBlock());
	public static final Block RAGEIUM_BLOCK = register(new RageiumBlockBlock());
	public static final Block RAGEIUM_ALLOY_BLOCK = register(new RageiumAlloyBlockBlock());
	public static final Block RAGEIUM_BRICKS = register(new RageiumBricksBlock());
	public static final Block RAGEIUM_BRICK_STAIRS = register(new RageiumBrickStairsBlock());
	public static final Block RAGEIUM_BRICK_SLAB = register(new RageiumBrickSlabBlock());
	public static final Block RAGEIUM_BRICK_WALL = register(new RageiumBrickWallBlock());
	public static final Block RAGEIUM_BRICK_PRESSURE_PLATE = register(new RageiumBrickPressurePlateBlock());
	public static final Block RAGEIUM_BRICK_BUTTON = register(new RageiumBrickButtonBlock());
	public static final Block BOOM_STONE = register(new BoomStoneBlock());
	public static final Block TELEPORTER = register(new TeleporterBlock());
	public static final Block RAW_TOXIC_CRYSTAL_BLOCK = register(new RawToxicCrystalBlockBlock());
	public static final Block TOXIC_CRYSTAL_BLOCK = register(new ToxicCrystalBlockBlock());
	public static final Block TOXIC_CRYSTAL_ORE = register(new ToxicCrystalOreBlock());
	public static final Block TOXIC_PLANT = register(new ToxicPlantBlock());
	public static final Block TOXIC_TOPPED_STONE = register(new ToxicToppedStoneBlock());
	public static final Block TOXIC_TOPPED_NETHERRACK = register(new ToxicToppedNetherrackBlock());
	public static final Block TOXIC_TOPPED_ENDSTONE = register(new ToxicToppedEndstoneBlock());
	public static final Block TOXIC_TOPPED_DIRT = register(new ToxicToppedDirtBlock());
	public static final Block TOXIC_TOPPED_OAK_LOG = register(new ToxicToppedOakLogBlock());
	public static final Block TOXIC_TOPPED_OAK_PLANKS = register(new ToxicToppedOakPlanksBlock());
	public static final Block TOXIC_TOPPED_ANDESITE = register(new ToxicToppedAndesiteBlock());
	public static final Block TOXIC_TOPPED_DIORITE = register(new ToxicToppedDioriteBlock());
	public static final Block TOXIC_TOPPED_GRANITE = register(new ToxicToppedGraniteBlock());
	public static final Block TOXIC_TOPPED_BONE_BLOCK = register(new ToxicToppedBoneBlockBlock());
	public static final Block TOXIC_TOPPED_BRICKS = register(new ToxicToppedBricksBlock());
	public static final Block TOXIC_TOPPED_STONE_BRICKS = register(new ToxicToppedStoneBricksBlock());
	public static final Block TOXIC_TOPPED_ANCIENT_DEBRIS = register(new ToxicToppedAncientDebrisBlock());
	public static final Block TOXIC_TOPPED_BASALT = register(new ToxicToppedBasaltBlock());
	public static final Block TOXIC_TOPPED_COBBLESTONE = register(new ToxicToppedCobblestoneBlock());
	public static final Block TOXIC_TOPPED_GRAVEL = register(new ToxicToppedGravelBlock());
	public static final Block TOXIC_TOPPED_BLACKSTONE = register(new ToxicToppedBlackstoneBlock());
	public static final Block TOXIC_TOPPED_SAND = register(new ToxicToppedSandBlock());
	public static final Block TOXIC_TOPPED_RED_SAND = register(new ToxicToppedRedSandBlock());
	public static final Block TOXIC_TOPPED_OBSIDIAN = register(new ToxicToppedObsidianBlock());
	public static final Block TOXIC_TOPPED_RAGEIUM_ORE = register(new ToxicToppedRageiumOreBlock());
	public static final Block TOXIC_TOPPED_RAGEIUM_BLOCK = register(new ToxicToppedRageiumBlockBlock());
	public static final Block TOXIC_TOPPED_RAGEIUM_ALLOY_BLOCK = register(new ToxicToppedRageiumAlloyBlockBlock());
	public static final Block RAGE_FLOWER = register(new RageFlowerBlock());
	public static final Block FLOOR_BLOCK = register(new FloorBlockBlock());
	public static final Block ACTINOLITE_ORE = register(new ActinoliteOreBlock());
	public static final Block ACHAT_ORE = register(new AchatOreBlock());
	public static final Block AZURITE_ORE = register(new AzuriteOreBlock());
	public static final Block AMAZONITE_ORE = register(new AmazoniteOreBlock());
	public static final Block CERUSSITE_ORE = register(new CerussiteOreBlock());
	public static final Block BISMUTH_ORE = register(new BismuthOreBlock());

	private static Block register(Block block) {
		REGISTRY.add(block);
		return block;
	}

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Block[0]));
	}

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			RageiumBrickStairsBlock.registerRenderLayer();
			RageiumBrickSlabBlock.registerRenderLayer();
			RageiumBrickWallBlock.registerRenderLayer();
			RageiumBrickPressurePlateBlock.registerRenderLayer();
			RageiumBrickButtonBlock.registerRenderLayer();
			TeleporterBlock.registerRenderLayer();
			ToxicPlantBlock.registerRenderLayer();
			RageFlowerBlock.registerRenderLayer();
			ActinoliteOreBlock.registerRenderLayer();
			AchatOreBlock.registerRenderLayer();
			AzuriteOreBlock.registerRenderLayer();
			AmazoniteOreBlock.registerRenderLayer();
			CerussiteOreBlock.registerRenderLayer();
			BismuthOreBlock.registerRenderLayer();
		}
	}
}
