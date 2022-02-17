package net.mcreator.ragemod.procedures;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.BoneMealItem;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.ragemod.init.RagemodModBlocks;

public class YellowGlowingOakTreeSaplingPlantRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.BONE_MEAL
				|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == Items.BONE_MEAL) {
			if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == RagemodModBlocks.YELLOW_GLOWING_OAK_TREE_SAPLING) {
				if (world.getBlockState(new BlockPos((int) x, (int) y, (int) z)).canOcclude() == false) {
					if (Math.random() < 0.4) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(new ResourceLocation("ragemod", "a_glow_oak3"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos((int) (x - 3), (int) y, (int) (z - 3)),
										new BlockPos((int) (x - 3), (int) y, (int) (z - 3)),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					}
				}
				if (world instanceof Level _level) {
					if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, new BlockPos((int) x, (int) y, (int) z))
							|| BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, new BlockPos((int) x, (int) y, (int) z), null)) {
						if (!_level.isClientSide())
							_level.levelEvent(2005, new BlockPos((int) x, (int) y, (int) z), 0);
					}
				}
			} else {
				if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == RagemodModBlocks.BROWN_GLOWING_OAK_TREE_SAPLING) {
					if (world.getBlockState(new BlockPos((int) x, (int) y, (int) z)).canOcclude() == false) {
						if (Math.random() < 0.4) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(new ResourceLocation("ragemod", "a_glow_oak4"));
								if (template != null) {
									template.placeInWorld(_serverworld, new BlockPos((int) (x - 3), (int) y, (int) (z - 3)),
											new BlockPos((int) (x - 3), (int) y, (int) (z - 3)),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						}
					}
					if (world instanceof Level _level) {
						if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, new BlockPos((int) x, (int) y, (int) z)) || BoneMealItem
								.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, new BlockPos((int) x, (int) y, (int) z), null)) {
							if (!_level.isClientSide())
								_level.levelEvent(2005, new BlockPos((int) x, (int) y, (int) z), 0);
						}
					}
				} else {
					if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == RagemodModBlocks.RED_GLOWING_OAK_TREE_SAPLING) {
						if (world.getBlockState(new BlockPos((int) x, (int) y, (int) z)).canOcclude() == false) {
							if (Math.random() < 0.4) {
								if (world instanceof ServerLevel _serverworld) {
									StructureTemplate template = _serverworld.getStructureManager()
											.getOrCreate(new ResourceLocation("ragemod", "a_glow_oak5"));
									if (template != null) {
										template.placeInWorld(_serverworld, new BlockPos((int) (x - 3), (int) y, (int) (z - 3)),
												new BlockPos((int) (x - 3), (int) y, (int) (z - 3)), new StructurePlaceSettings()
														.setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
												_serverworld.random, 3);
									}
								}
							}
						}
						if (world instanceof Level _level) {
							if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, new BlockPos((int) x, (int) y, (int) z)) || BoneMealItem
									.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, new BlockPos((int) x, (int) y, (int) z), null)) {
								if (!_level.isClientSide())
									_level.levelEvent(2005, new BlockPos((int) x, (int) y, (int) z), 0);
							}
						}
					} else {
						if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))
								.getBlock() == RagemodModBlocks.GREEN_GLOWING_OAK_TREE_SAPLING) {
							if (world.getBlockState(new BlockPos((int) x, (int) y, (int) z)).canOcclude() == false) {
								if (Math.random() < 0.4) {
									if (world instanceof ServerLevel _serverworld) {
										StructureTemplate template = _serverworld.getStructureManager()
												.getOrCreate(new ResourceLocation("ragemod", "a_glow_oak2"));
										if (template != null) {
											template.placeInWorld(_serverworld, new BlockPos((int) (x - 3), (int) y, (int) (z - 3)),
													new BlockPos((int) (x - 3), (int) y, (int) (z - 3)), new StructurePlaceSettings()
															.setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
													_serverworld.random, 3);
										}
									}
								}
							}
							if (world instanceof Level _level) {
								if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, new BlockPos((int) x, (int) y, (int) z))
										|| BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level,
												new BlockPos((int) x, (int) y, (int) z), null)) {
									if (!_level.isClientSide())
										_level.levelEvent(2005, new BlockPos((int) x, (int) y, (int) z), 0);
								}
							}
						}
					}
				}
			}
		}
	}
}
