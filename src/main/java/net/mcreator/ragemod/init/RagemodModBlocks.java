
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ragemod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.ragemod.block.YellowGlowingOakTreeSaplingBlock;
import net.mcreator.ragemod.block.YellowGlowingOakLeavesBlock;
import net.mcreator.ragemod.block.SmoothCaltenWallBlock;
import net.mcreator.ragemod.block.SmoothCaltenStairsBlock;
import net.mcreator.ragemod.block.SmoothCaltenSlabBlock;
import net.mcreator.ragemod.block.SmoothCaltenBlock;
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
import net.mcreator.ragemod.block.RageFlowerBlock;
import net.mcreator.ragemod.block.MossyCaltenWallBlock;
import net.mcreator.ragemod.block.MossyCaltenStairsBlock;
import net.mcreator.ragemod.block.MossyCaltenSlabBlock;
import net.mcreator.ragemod.block.MossyCaltenBlock;
import net.mcreator.ragemod.block.GreenGlowingOakTreeSaplingBlock;
import net.mcreator.ragemod.block.GreenGlowingOakLeavesBlock;
import net.mcreator.ragemod.block.FultTrapdoorBlock;
import net.mcreator.ragemod.block.FultBlock;
import net.mcreator.ragemod.block.FultBarsBlock;
import net.mcreator.ragemod.block.FloorBlockBlock;
import net.mcreator.ragemod.block.ChiseledFultBlock;
import net.mcreator.ragemod.block.CerussiteOreBlock;
import net.mcreator.ragemod.block.CaltenWallBlock;
import net.mcreator.ragemod.block.CaltenStairsBlock;
import net.mcreator.ragemod.block.CaltenSlabBlock;
import net.mcreator.ragemod.block.CaltenBricksWallBlock;
import net.mcreator.ragemod.block.CaltenBricksStairsBlock;
import net.mcreator.ragemod.block.CaltenBricksSlabBlock;
import net.mcreator.ragemod.block.CaltenBricksBlock;
import net.mcreator.ragemod.block.CaltenBlock;
import net.mcreator.ragemod.block.BrownGlowingOakTreeSaplingBlock;
import net.mcreator.ragemod.block.BrownGlowingOakLeavesBlock;
import net.mcreator.ragemod.block.AzuriteOreBlock;
import net.mcreator.ragemod.block.ApophylliteOreBlock;
import net.mcreator.ragemod.block.AmazoniteOreBlock;
import net.mcreator.ragemod.block.AmazoniteBricksBlock;
import net.mcreator.ragemod.block.AmazoniteBrickWallBlock;
import net.mcreator.ragemod.block.AmazoniteBrickStairsBlock;
import net.mcreator.ragemod.block.AmazoniteBrickSlabBlock;
import net.mcreator.ragemod.block.AchatOreBlock;
import net.mcreator.ragemod.RagemodMod;

public class RagemodModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, RagemodMod.MODID);
	public static final RegistryObject<Block> RAGEIUM_ORE = REGISTRY.register("rageium_ore", () -> new RageiumOreBlock());
	public static final RegistryObject<Block> RAGEIUM_BLOCK = REGISTRY.register("rageium_block", () -> new RageiumBlockBlock());
	public static final RegistryObject<Block> RAGEIUM_ALLOY_BLOCK = REGISTRY.register("rageium_alloy_block", () -> new RageiumAlloyBlockBlock());
	public static final RegistryObject<Block> RAGEIUM_BRICKS = REGISTRY.register("rageium_bricks", () -> new RageiumBricksBlock());
	public static final RegistryObject<Block> RAGEIUM_BRICK_STAIRS = REGISTRY.register("rageium_brick_stairs", () -> new RageiumBrickStairsBlock());
	public static final RegistryObject<Block> RAGEIUM_BRICK_SLAB = REGISTRY.register("rageium_brick_slab", () -> new RageiumBrickSlabBlock());
	public static final RegistryObject<Block> RAGEIUM_BRICK_WALL = REGISTRY.register("rageium_brick_wall", () -> new RageiumBrickWallBlock());
	public static final RegistryObject<Block> RAGEIUM_BRICK_PRESSURE_PLATE = REGISTRY.register("rageium_brick_pressure_plate",
			() -> new RageiumBrickPressurePlateBlock());
	public static final RegistryObject<Block> RAGEIUM_BRICK_BUTTON = REGISTRY.register("rageium_brick_button", () -> new RageiumBrickButtonBlock());
	public static final RegistryObject<Block> ACHAT_ORE = REGISTRY.register("achat_ore", () -> new AchatOreBlock());
	public static final RegistryObject<Block> AZURITE_ORE = REGISTRY.register("azurite_ore", () -> new AzuriteOreBlock());
	public static final RegistryObject<Block> AMAZONITE_ORE = REGISTRY.register("amazonite_ore", () -> new AmazoniteOreBlock());
	public static final RegistryObject<Block> CERUSSITE_ORE = REGISTRY.register("cerussite_ore", () -> new CerussiteOreBlock());
	public static final RegistryObject<Block> APOPHYLLITE_ORE = REGISTRY.register("apophyllite_ore", () -> new ApophylliteOreBlock());
	public static final RegistryObject<Block> FULT = REGISTRY.register("fult", () -> new FultBlock());
	public static final RegistryObject<Block> FULT_BARS = REGISTRY.register("fult_bars", () -> new FultBarsBlock());
	public static final RegistryObject<Block> FULT_TRAPDOOR = REGISTRY.register("fult_trapdoor", () -> new FultTrapdoorBlock());
	public static final RegistryObject<Block> CHISELED_FULT = REGISTRY.register("chiseled_fult", () -> new ChiseledFultBlock());
	public static final RegistryObject<Block> CALTEN = REGISTRY.register("calten", () -> new CaltenBlock());
	public static final RegistryObject<Block> MOSSY_CALTEN = REGISTRY.register("mossy_calten", () -> new MossyCaltenBlock());
	public static final RegistryObject<Block> SMOOTH_CALTEN = REGISTRY.register("smooth_calten", () -> new SmoothCaltenBlock());
	public static final RegistryObject<Block> CALTEN_BRICKS = REGISTRY.register("calten_bricks", () -> new CaltenBricksBlock());
	public static final RegistryObject<Block> CALTEN_STAIRS = REGISTRY.register("calten_stairs", () -> new CaltenStairsBlock());
	public static final RegistryObject<Block> CALTEN_SLAB = REGISTRY.register("calten_slab", () -> new CaltenSlabBlock());
	public static final RegistryObject<Block> CALTEN_WALL = REGISTRY.register("calten_wall", () -> new CaltenWallBlock());
	public static final RegistryObject<Block> MOSSY_CALTEN_STAIRS = REGISTRY.register("mossy_calten_stairs", () -> new MossyCaltenStairsBlock());
	public static final RegistryObject<Block> MOSSY_CALTEN_SLAB = REGISTRY.register("mossy_calten_slab", () -> new MossyCaltenSlabBlock());
	public static final RegistryObject<Block> MOSSY_CALTEN_WALL = REGISTRY.register("mossy_calten_wall", () -> new MossyCaltenWallBlock());
	public static final RegistryObject<Block> SMOOTH_CALTEN_STAIRS = REGISTRY.register("smooth_calten_stairs", () -> new SmoothCaltenStairsBlock());
	public static final RegistryObject<Block> SMOOTH_CALTEN_SLAB = REGISTRY.register("smooth_calten_slab", () -> new SmoothCaltenSlabBlock());
	public static final RegistryObject<Block> SMOOTH_CALTEN_WALL = REGISTRY.register("smooth_calten_wall", () -> new SmoothCaltenWallBlock());
	public static final RegistryObject<Block> CALTEN_BRICKS_STAIRS = REGISTRY.register("calten_bricks_stairs", () -> new CaltenBricksStairsBlock());
	public static final RegistryObject<Block> CALTEN_BRICKS_SLAB = REGISTRY.register("calten_bricks_slab", () -> new CaltenBricksSlabBlock());
	public static final RegistryObject<Block> CALTEN_BRICKS_WALL = REGISTRY.register("calten_bricks_wall", () -> new CaltenBricksWallBlock());
	public static final RegistryObject<Block> FLOOR_BLOCK = REGISTRY.register("floor_block", () -> new FloorBlockBlock());
	public static final RegistryObject<Block> RAGE_FLOWER = REGISTRY.register("rage_flower", () -> new RageFlowerBlock());
	public static final RegistryObject<Block> YELLOW_GLOWING_OAK_LEAVES = REGISTRY.register("yellow_glowing_oak_leaves",
			() -> new YellowGlowingOakLeavesBlock());
	public static final RegistryObject<Block> BROWN_GLOWING_OAK_LEAVES = REGISTRY.register("brown_glowing_oak_leaves",
			() -> new BrownGlowingOakLeavesBlock());
	public static final RegistryObject<Block> RED_GLOWING_OAK_LEAVES = REGISTRY.register("red_glowing_oak_leaves",
			() -> new RedGlowingOakLeavesBlock());
	public static final RegistryObject<Block> GREEN_GLOWING_OAK_LEAVES = REGISTRY.register("green_glowing_oak_leaves",
			() -> new GreenGlowingOakLeavesBlock());
	public static final RegistryObject<Block> YELLOW_GLOWING_OAK_TREE_SAPLING = REGISTRY.register("yellow_glowing_oak_tree_sapling",
			() -> new YellowGlowingOakTreeSaplingBlock());
	public static final RegistryObject<Block> BROWN_GLOWING_OAK_TREE_SAPLING = REGISTRY.register("brown_glowing_oak_tree_sapling",
			() -> new BrownGlowingOakTreeSaplingBlock());
	public static final RegistryObject<Block> RED_GLOWING_OAK_TREE_SAPLING = REGISTRY.register("red_glowing_oak_tree_sapling",
			() -> new RedGlowingOakTreeSaplingBlock());
	public static final RegistryObject<Block> GREEN_GLOWING_OAK_TREE_SAPLING = REGISTRY.register("green_glowing_oak_tree_sapling",
			() -> new GreenGlowingOakTreeSaplingBlock());
	public static final RegistryObject<Block> AMAZONITE_BRICKS = REGISTRY.register("amazonite_bricks", () -> new AmazoniteBricksBlock());
	public static final RegistryObject<Block> AMAZONITE_BRICK_STAIRS = REGISTRY.register("amazonite_brick_stairs",
			() -> new AmazoniteBrickStairsBlock());
	public static final RegistryObject<Block> AMAZONITE_BRICK_SLAB = REGISTRY.register("amazonite_brick_slab", () -> new AmazoniteBrickSlabBlock());
	public static final RegistryObject<Block> AMAZONITE_BRICK_WALL = REGISTRY.register("amazonite_brick_wall", () -> new AmazoniteBrickWallBlock());

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
			RageFlowerBlock.registerRenderLayer();
			YellowGlowingOakTreeSaplingBlock.registerRenderLayer();
			BrownGlowingOakTreeSaplingBlock.registerRenderLayer();
			RedGlowingOakTreeSaplingBlock.registerRenderLayer();
			GreenGlowingOakTreeSaplingBlock.registerRenderLayer();
		}
	}
}
