
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

import net.mcreator.ragemod.block.YellowGlowingVineBlock;
import net.mcreator.ragemod.block.YellowGlowingOakTreeSaplingBlock;
import net.mcreator.ragemod.block.YellowGlowingOakLeavesBlock;
import net.mcreator.ragemod.block.StrippedRageWoodLogBlock;
import net.mcreator.ragemod.block.StrippedRageWoodBlockBlock;
import net.mcreator.ragemod.block.StrippedBeechLogBlock;
import net.mcreator.ragemod.block.StippedBeechLogBlock;
import net.mcreator.ragemod.block.SmoothCaltenWallBlock;
import net.mcreator.ragemod.block.SmoothCaltenStairsBlock;
import net.mcreator.ragemod.block.SmoothCaltenSlabBlock;
import net.mcreator.ragemod.block.SmoothCaltenBlock;
import net.mcreator.ragemod.block.RedGlowingVineBlock;
import net.mcreator.ragemod.block.RedGlowingOakTreeSaplingBlock;
import net.mcreator.ragemod.block.RedGlowingOakLeavesBlock;
import net.mcreator.ragemod.block.RageiumOreBlock;
import net.mcreator.ragemod.block.RageiumBricksBlock;
import net.mcreator.ragemod.block.RageiumBrickWallBlock;
import net.mcreator.ragemod.block.RageiumBrickStairsBlock;
import net.mcreator.ragemod.block.RageiumBrickSlabBlock;
import net.mcreator.ragemod.block.RageiumBrickPressurePlateBlock;
import net.mcreator.ragemod.block.RageiumBrickButtonBlock;
import net.mcreator.ragemod.block.RageiumBlockBlock;
import net.mcreator.ragemod.block.RageiumAlloyBlockBlock;
import net.mcreator.ragemod.block.RageWoodTrapdoorBlock;
import net.mcreator.ragemod.block.RageWoodStairsBlock;
import net.mcreator.ragemod.block.RageWoodSlabBlock;
import net.mcreator.ragemod.block.RageWoodSaplingBlock;
import net.mcreator.ragemod.block.RageWoodPlanksBlock;
import net.mcreator.ragemod.block.RageWoodLogBlock;
import net.mcreator.ragemod.block.RageWoodLeavesBlock;
import net.mcreator.ragemod.block.RageWoodFenceGateBlock;
import net.mcreator.ragemod.block.RageWoodFenceBlock;
import net.mcreator.ragemod.block.RageWoodDoorBlock;
import net.mcreator.ragemod.block.RageWoodBlockBlock;
import net.mcreator.ragemod.block.RageFlowerBlock;
import net.mcreator.ragemod.block.MossyCaltenWallBlock;
import net.mcreator.ragemod.block.MossyCaltenStairsBlock;
import net.mcreator.ragemod.block.MossyCaltenSlabBlock;
import net.mcreator.ragemod.block.MossyCaltenBlock;
import net.mcreator.ragemod.block.GreenGlowingVineBlock;
import net.mcreator.ragemod.block.GreenGlowingOakTreeSaplingBlock;
import net.mcreator.ragemod.block.GreenGlowingOakLeavesBlock;
import net.mcreator.ragemod.block.GlowingVinesAirBlock;
import net.mcreator.ragemod.block.FultTrapdoorBlock;
import net.mcreator.ragemod.block.FultBlock;
import net.mcreator.ragemod.block.FultBarsBlock;
import net.mcreator.ragemod.block.FloorBlockBlock;
import net.mcreator.ragemod.block.CerussiteOreBlock;
import net.mcreator.ragemod.block.CaltenWallBlock;
import net.mcreator.ragemod.block.CaltenStairsBlock;
import net.mcreator.ragemod.block.CaltenSlabBlock;
import net.mcreator.ragemod.block.CaltenBricksWallBlock;
import net.mcreator.ragemod.block.CaltenBricksStairsBlock;
import net.mcreator.ragemod.block.CaltenBricksSlabBlock;
import net.mcreator.ragemod.block.CaltenBricksBlock;
import net.mcreator.ragemod.block.CaltenBlock;
import net.mcreator.ragemod.block.BrownGlowingVineBlock;
import net.mcreator.ragemod.block.BrownGlowingOakTreeSaplingBlock;
import net.mcreator.ragemod.block.BrownGlowingOakLeavesBlock;
import net.mcreator.ragemod.block.BoomStoneBlock;
import net.mcreator.ragemod.block.BetterStrippedRageWoodLogBlock;
import net.mcreator.ragemod.block.BetterStrippedRageWoodBlockBlock;
import net.mcreator.ragemod.block.BeechTrapdoorBlock;
import net.mcreator.ragemod.block.BeechStairsBlock;
import net.mcreator.ragemod.block.BeechSlabBlock;
import net.mcreator.ragemod.block.BeechSaplingBlock;
import net.mcreator.ragemod.block.BeechPlanksBlock;
import net.mcreator.ragemod.block.BeechLogBlock;
import net.mcreator.ragemod.block.BeechLeavesBlock;
import net.mcreator.ragemod.block.BeechFenceGateBlock;
import net.mcreator.ragemod.block.BeechFenceBlock;
import net.mcreator.ragemod.block.BeechDoorBlock;
import net.mcreator.ragemod.block.BeechBlockBlock;
import net.mcreator.ragemod.block.AzuriteOreBlock;
import net.mcreator.ragemod.block.ApophylliteOreBlock;
import net.mcreator.ragemod.block.AmazoniteOreBlock;
import net.mcreator.ragemod.block.AmazoniteBricksBlock;
import net.mcreator.ragemod.block.AmazoniteBrickWallBlock;
import net.mcreator.ragemod.block.AmazoniteBrickStairsBlock;
import net.mcreator.ragemod.block.AmazoniteBrickSlabBlock;
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
	public static final Block ACHAT_ORE = register(new AchatOreBlock());
	public static final Block AZURITE_ORE = register(new AzuriteOreBlock());
	public static final Block AMAZONITE_ORE = register(new AmazoniteOreBlock());
	public static final Block CERUSSITE_ORE = register(new CerussiteOreBlock());
	public static final Block APOPHYLLITE_ORE = register(new ApophylliteOreBlock());
	public static final Block FULT = register(new FultBlock());
	public static final Block FULT_BARS = register(new FultBarsBlock());
	public static final Block FULT_TRAPDOOR = register(new FultTrapdoorBlock());
	public static final Block CALTEN = register(new CaltenBlock());
	public static final Block MOSSY_CALTEN = register(new MossyCaltenBlock());
	public static final Block SMOOTH_CALTEN = register(new SmoothCaltenBlock());
	public static final Block CALTEN_BRICKS = register(new CaltenBricksBlock());
	public static final Block CALTEN_STAIRS = register(new CaltenStairsBlock());
	public static final Block CALTEN_SLAB = register(new CaltenSlabBlock());
	public static final Block CALTEN_WALL = register(new CaltenWallBlock());
	public static final Block MOSSY_CALTEN_STAIRS = register(new MossyCaltenStairsBlock());
	public static final Block MOSSY_CALTEN_SLAB = register(new MossyCaltenSlabBlock());
	public static final Block MOSSY_CALTEN_WALL = register(new MossyCaltenWallBlock());
	public static final Block SMOOTH_CALTEN_STAIRS = register(new SmoothCaltenStairsBlock());
	public static final Block SMOOTH_CALTEN_SLAB = register(new SmoothCaltenSlabBlock());
	public static final Block SMOOTH_CALTEN_WALL = register(new SmoothCaltenWallBlock());
	public static final Block CALTEN_BRICKS_STAIRS = register(new CaltenBricksStairsBlock());
	public static final Block CALTEN_BRICKS_SLAB = register(new CaltenBricksSlabBlock());
	public static final Block CALTEN_BRICKS_WALL = register(new CaltenBricksWallBlock());
	public static final Block BEECH_LOG = register(new BeechLogBlock());
	public static final Block BEECH_BLOCK = register(new BeechBlockBlock());
	public static final Block STRIPPED_BEECH_LOG = register(new StrippedBeechLogBlock());
	public static final Block STIPPED_BEECH_LOG = register(new StippedBeechLogBlock());
	public static final Block RAGE_WOOD_LOG = register(new RageWoodLogBlock());
	public static final Block RAGE_WOOD_BLOCK = register(new RageWoodBlockBlock());
	public static final Block STRIPPED_RAGE_WOOD_LOG = register(new StrippedRageWoodLogBlock());
	public static final Block BETTER_STRIPPED_RAGE_WOOD_LOG = register(new BetterStrippedRageWoodLogBlock());
	public static final Block STRIPPED_RAGE_WOOD_BLOCK = register(new StrippedRageWoodBlockBlock());
	public static final Block BETTER_STRIPPED_RAGE_WOOD_BLOCK = register(new BetterStrippedRageWoodBlockBlock());
	public static final Block BEECH_PLANKS = register(new BeechPlanksBlock());
	public static final Block BEECH_STAIRS = register(new BeechStairsBlock());
	public static final Block BEECH_SLAB = register(new BeechSlabBlock());
	public static final Block BEECH_FENCE = register(new BeechFenceBlock());
	public static final Block BEECH_FENCE_GATE = register(new BeechFenceGateBlock());
	public static final Block RAGE_WOOD_PLANKS = register(new RageWoodPlanksBlock());
	public static final Block RAGE_WOOD_STAIRS = register(new RageWoodStairsBlock());
	public static final Block RAGE_WOOD_SLAB = register(new RageWoodSlabBlock());
	public static final Block RAGE_WOOD_FENCE = register(new RageWoodFenceBlock());
	public static final Block RAGE_WOOD_FENCE_GATE = register(new RageWoodFenceGateBlock());
	public static final Block BEECH_DOOR = register(new BeechDoorBlock());
	public static final Block RAGE_WOOD_DOOR = register(new RageWoodDoorBlock());
	public static final Block BEECH_TRAPDOOR = register(new BeechTrapdoorBlock());
	public static final Block RAGE_WOOD_TRAPDOOR = register(new RageWoodTrapdoorBlock());
	public static final Block BEECH_LEAVES = register(new BeechLeavesBlock());
	public static final Block RAGE_WOOD_LEAVES = register(new RageWoodLeavesBlock());
	public static final Block BEECH_SAPLING = register(new BeechSaplingBlock());
	public static final Block RAGE_WOOD_SAPLING = register(new RageWoodSaplingBlock());
	public static final Block FLOOR_BLOCK = register(new FloorBlockBlock());
	public static final Block RAGE_FLOWER = register(new RageFlowerBlock());
	public static final Block YELLOW_GLOWING_OAK_LEAVES = register(new YellowGlowingOakLeavesBlock());
	public static final Block BROWN_GLOWING_OAK_LEAVES = register(new BrownGlowingOakLeavesBlock());
	public static final Block RED_GLOWING_OAK_LEAVES = register(new RedGlowingOakLeavesBlock());
	public static final Block GREEN_GLOWING_OAK_LEAVES = register(new GreenGlowingOakLeavesBlock());
	public static final Block YELLOW_GLOWING_OAK_TREE_SAPLING = register(new YellowGlowingOakTreeSaplingBlock());
	public static final Block BROWN_GLOWING_OAK_TREE_SAPLING = register(new BrownGlowingOakTreeSaplingBlock());
	public static final Block RED_GLOWING_OAK_TREE_SAPLING = register(new RedGlowingOakTreeSaplingBlock());
	public static final Block GREEN_GLOWING_OAK_TREE_SAPLING = register(new GreenGlowingOakTreeSaplingBlock());
	public static final Block YELLOW_GLOWING_VINE = register(new YellowGlowingVineBlock());
	public static final Block GLOWING_VINES_AIR = register(new GlowingVinesAirBlock());
	public static final Block BROWN_GLOWING_VINE = register(new BrownGlowingVineBlock());
	public static final Block RED_GLOWING_VINE = register(new RedGlowingVineBlock());
	public static final Block GREEN_GLOWING_VINE = register(new GreenGlowingVineBlock());
	public static final Block AMAZONITE_BRICKS = register(new AmazoniteBricksBlock());
	public static final Block AMAZONITE_BRICK_STAIRS = register(new AmazoniteBrickStairsBlock());
	public static final Block AMAZONITE_BRICK_SLAB = register(new AmazoniteBrickSlabBlock());
	public static final Block AMAZONITE_BRICK_WALL = register(new AmazoniteBrickWallBlock());

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
			FultBarsBlock.registerRenderLayer();
			FultTrapdoorBlock.registerRenderLayer();
			CaltenStairsBlock.registerRenderLayer();
			CaltenSlabBlock.registerRenderLayer();
			CaltenWallBlock.registerRenderLayer();
			MossyCaltenStairsBlock.registerRenderLayer();
			MossyCaltenSlabBlock.registerRenderLayer();
			MossyCaltenWallBlock.registerRenderLayer();
			SmoothCaltenStairsBlock.registerRenderLayer();
			SmoothCaltenSlabBlock.registerRenderLayer();
			SmoothCaltenWallBlock.registerRenderLayer();
			CaltenBricksStairsBlock.registerRenderLayer();
			CaltenBricksSlabBlock.registerRenderLayer();
			CaltenBricksWallBlock.registerRenderLayer();
			BeechStairsBlock.registerRenderLayer();
			BeechSlabBlock.registerRenderLayer();
			BeechFenceBlock.registerRenderLayer();
			BeechFenceGateBlock.registerRenderLayer();
			RageWoodStairsBlock.registerRenderLayer();
			RageWoodSlabBlock.registerRenderLayer();
			RageWoodFenceBlock.registerRenderLayer();
			RageWoodFenceGateBlock.registerRenderLayer();
			BeechDoorBlock.registerRenderLayer();
			RageWoodDoorBlock.registerRenderLayer();
			BeechTrapdoorBlock.registerRenderLayer();
			RageWoodTrapdoorBlock.registerRenderLayer();
			BeechSaplingBlock.registerRenderLayer();
			RageWoodSaplingBlock.registerRenderLayer();
			RageFlowerBlock.registerRenderLayer();
			YellowGlowingOakTreeSaplingBlock.registerRenderLayer();
			BrownGlowingOakTreeSaplingBlock.registerRenderLayer();
			RedGlowingOakTreeSaplingBlock.registerRenderLayer();
			GreenGlowingOakTreeSaplingBlock.registerRenderLayer();
			YellowGlowingVineBlock.registerRenderLayer();
			BrownGlowingVineBlock.registerRenderLayer();
			RedGlowingVineBlock.registerRenderLayer();
			GreenGlowingVineBlock.registerRenderLayer();
		}
	}
}
