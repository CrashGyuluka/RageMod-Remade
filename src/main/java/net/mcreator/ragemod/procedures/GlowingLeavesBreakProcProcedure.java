package net.mcreator.ragemod.procedures;

import net.minecraftforge.eventbus.api.Event;

import net.mcreator.ragemod.init.RagemodModBlocks;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class GlowingLeavesBreakProcProcedure {
	@SubscribeEvent
	public static void onBlockBreak(BlockEvent.BreakEvent event) {
		execute(event, event.getWorld(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getPlayer());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == RagemodModBlocks.YELLOW_GLOWING_OAK_LEAVES.get()) {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.SHEARS
					|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == Items.SHEARS
					|| EnchantmentHelper.getItemEnchantmentLevel(Enchantments.SILK_TOUCH,
							(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0
					|| EnchantmentHelper.getItemEnchantmentLevel(Enchantments.SILK_TOUCH,
							(entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)) != 0) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(RagemodModBlocks.YELLOW_GLOWING_OAK_LEAVES.get()));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			} else if (Math.random() < 0.02) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(RagemodModBlocks.YELLOW_GLOWING_OAK_TREE_SAPLING.get()));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		} else {
			if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == RagemodModBlocks.BROWN_GLOWING_OAK_LEAVES.get()) {
				if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.SHEARS
						|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == Items.SHEARS
						|| EnchantmentHelper.getItemEnchantmentLevel(Enchantments.SILK_TOUCH,
								(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0
						|| EnchantmentHelper.getItemEnchantmentLevel(Enchantments.SILK_TOUCH,
								(entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)) != 0) {
					if (world instanceof Level _level && !_level.isClientSide()) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(RagemodModBlocks.BROWN_GLOWING_OAK_LEAVES.get()));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
				} else if (Math.random() < 0.02) {
					if (world instanceof Level _level && !_level.isClientSide()) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
								new ItemStack(RagemodModBlocks.BROWN_GLOWING_OAK_TREE_SAPLING.get()));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			} else {
				if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == RagemodModBlocks.RED_GLOWING_OAK_LEAVES.get()) {
					if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.SHEARS
							|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == Items.SHEARS
							|| EnchantmentHelper.getItemEnchantmentLevel(Enchantments.SILK_TOUCH,
									(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0
							|| EnchantmentHelper.getItemEnchantmentLevel(Enchantments.SILK_TOUCH,
									(entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)) != 0) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(RagemodModBlocks.RED_GLOWING_OAK_LEAVES.get()));
							entityToSpawn.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn);
						}
					} else if (Math.random() < 0.02) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
									new ItemStack(RagemodModBlocks.RED_GLOWING_OAK_TREE_SAPLING.get()));
							entityToSpawn.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else {
					if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == RagemodModBlocks.GREEN_GLOWING_OAK_LEAVES.get()) {
						if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.SHEARS
								|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == Items.SHEARS
								|| EnchantmentHelper.getItemEnchantmentLevel(Enchantments.SILK_TOUCH,
										(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0
								|| EnchantmentHelper.getItemEnchantmentLevel(Enchantments.SILK_TOUCH,
										(entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)) != 0) {
							if (world instanceof Level _level && !_level.isClientSide()) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
										new ItemStack(RagemodModBlocks.GREEN_GLOWING_OAK_LEAVES.get()));
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
						} else if (Math.random() < 0.02) {
							if (world instanceof Level _level && !_level.isClientSide()) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
										new ItemStack(RagemodModBlocks.GREEN_GLOWING_OAK_TREE_SAPLING.get()));
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				}
			}
		}
	}
}
