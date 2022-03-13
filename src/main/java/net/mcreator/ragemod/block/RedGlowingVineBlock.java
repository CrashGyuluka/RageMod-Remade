
package net.mcreator.ragemod.block;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.Minecraft;

import net.mcreator.ragemod.procedures.YellowGlowingVineNeighbourBlockChangesProcedure;
import net.mcreator.ragemod.procedures.YellowGlowingVineBlockValidPlacementConditionProcedure;
import net.mcreator.ragemod.procedures.YellowGlowingOakLeavesParticleSpawningConditionProcedure;
import net.mcreator.ragemod.init.RagemodModParticles;
import net.mcreator.ragemod.init.RagemodModBlocks;

import java.util.Random;
import java.util.List;
import java.util.Collections;

public class RedGlowingVineBlock extends Block {
	public RedGlowingVineBlock() {
		super(BlockBehaviour.Properties.of(Material.PLANT).sound(SoundType.GRASS).strength(0.7999999999999999f, 1f).noCollission().noOcclusion()
				.hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true).isRedstoneConductor((bs, br, bp) -> false));
		setRegistryName("red_glowing_vine");
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public boolean canSurvive(BlockState blockstate, LevelReader worldIn, BlockPos pos) {
		if (worldIn instanceof LevelAccessor world) {
			int x = pos.getX();
			int y = pos.getY();
			int z = pos.getZ();
			return YellowGlowingVineBlockValidPlacementConditionProcedure.execute(world, x, y, z);
		}
		return super.canSurvive(blockstate, worldIn, pos);
	}

	@Override
	public BlockState updateShape(BlockState state, Direction facing, BlockState facingState, LevelAccessor world, BlockPos currentPos,
			BlockPos facingPos) {
		return !state.canSurvive(world, currentPos)
				? Blocks.AIR.defaultBlockState()
				: super.updateShape(state, facing, facingState, world, currentPos, facingPos);
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 1));
	}

	@Override
	public void neighborChanged(BlockState blockstate, Level world, BlockPos pos, Block neighborBlock, BlockPos fromPos, boolean moving) {
		super.neighborChanged(blockstate, world, pos, neighborBlock, fromPos, moving);
		YellowGlowingVineNeighbourBlockChangesProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
	}

	@OnlyIn(Dist.CLIENT)
	@Override
	public void animateTick(BlockState blockstate, Level world, BlockPos pos, Random random) {
		super.animateTick(blockstate, world, pos, random);
		Player entity = Minecraft.getInstance().player;
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();
		if (YellowGlowingOakLeavesParticleSpawningConditionProcedure.execute())
			for (int l = 0; l < 1; ++l) {
				double x0 = x + 0.5 + (random.nextFloat() - 0.5) * 0.1D;
				double y0 = y + 1.2 + (random.nextFloat() - 0.5) * 0.1D * 100;
				double z0 = z + 0.5 + (random.nextFloat() - 0.5) * 0.1D;
				world.addParticle(RagemodModParticles.BROWN_GLOWING_TREE_PARTICLE, x0, y0, z0, 0, 0, 0);
			}
	}

	@OnlyIn(Dist.CLIENT)
	public static void registerRenderLayer() {
		ItemBlockRenderTypes.setRenderLayer(RagemodModBlocks.RED_GLOWING_VINE, renderType -> renderType == RenderType.cutout());
	}
}
