package net.mcreator.ragemod.procedures;

import net.mcreator.ragemod.init.RagemodModBlocks;

import java.util.Iterator;

public class YellowGlowingOakTreeSaplingPlantRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.BONE_MEAL
				|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == Items.BONE_MEAL) {
			if (world instanceof Level _level) {
				BlockPos _bp = new BlockPos(x, y, z);
				if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp)
						|| BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
					if (!_level.isClientSide())
						_level.levelEvent(2005, _bp, 0);
				}
			}
			if (world.getBlockState(new BlockPos(x, y + 1, z)).canOcclude() == false) {
				if (Math.random() < 0.4) {
					if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == RagemodModBlocks.YELLOW_GLOWING_OAK_TREE_SAPLING.get()) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(new ResourceLocation("ragemod", "a_glow_oak3"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(x - 3, y, z - 3), new BlockPos(x - 3, y, z - 3),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
						if (new ResourceLocation("ragemod:dense_glowing_oak_forest")
								.equals(world.getBiome(new BlockPos(x, y + 1, z)).value().getRegistryName())
								|| new ResourceLocation("ragemod:glowing_oak_field")
										.equals(world.getBiome(new BlockPos(x, y + 1, z)).value().getRegistryName())
								|| new ResourceLocation("ragemod:glowing_oak_forest")
										.equals(world.getBiome(new BlockPos(x, y + 1, z)).value().getRegistryName())
								|| new ResourceLocation("ragemod:glowing_oak_forest_mountain")
										.equals(world.getBiome(new BlockPos(x, y + 1, z)).value().getRegistryName())
								|| new ResourceLocation("ragemod:snowy_spare_glowing_oak_forest")
										.equals(world.getBiome(new BlockPos(x, y + 1, z)).value().getRegistryName())
								|| new ResourceLocation("ragemod:snowy_glowing_oak_forest")
										.equals(world.getBiome(new BlockPos(x, y + 1, z)).value().getRegistryName())
								|| new ResourceLocation("ragemod:spare_glowing_oak_forest")
										.equals(world.getBiome(new BlockPos(x, y + 1, z)).value().getRegistryName())) {
							if (entity instanceof ServerPlayer _player) {
								Advancement _adv = _player.server.getAdvancements()
										.getAdvancement(new ResourceLocation("ragemod:rage_mod_advancement"));
								AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
								if (!_ap.isDone()) {
									Iterator _iterator = _ap.getRemainingCriteria().iterator();
									while (_iterator.hasNext())
										_player.getAdvancements().award(_adv, (String) _iterator.next());
								}
							}
						}
					} else {
						if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == RagemodModBlocks.BROWN_GLOWING_OAK_TREE_SAPLING.get()) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(new ResourceLocation("ragemod", "a_glow_oak4"));
								if (template != null) {
									template.placeInWorld(_serverworld, new BlockPos(x - 3, y, z - 3), new BlockPos(x - 3, y, z - 3),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
							if (new ResourceLocation("ragemod:dense_glowing_oak_forest")
									.equals(world.getBiome(new BlockPos(x, y + 1, z)).value().getRegistryName())
									|| new ResourceLocation("ragemod:glowing_oak_field")
											.equals(world.getBiome(new BlockPos(x, y + 1, z)).value().getRegistryName())
									|| new ResourceLocation("ragemod:glowing_oak_forest")
											.equals(world.getBiome(new BlockPos(x, y + 1, z)).value().getRegistryName())
									|| new ResourceLocation("ragemod:glowing_oak_forest_mountain")
											.equals(world.getBiome(new BlockPos(x, y + 1, z)).value().getRegistryName())
									|| new ResourceLocation("ragemod:snowy_spare_glowing_oak_forest")
											.equals(world.getBiome(new BlockPos(x, y + 1, z)).value().getRegistryName())
									|| new ResourceLocation("ragemod:snowy_glowing_oak_forest")
											.equals(world.getBiome(new BlockPos(x, y + 1, z)).value().getRegistryName())
									|| new ResourceLocation("ragemod:spare_glowing_oak_forest")
											.equals(world.getBiome(new BlockPos(x, y + 1, z)).value().getRegistryName())) {
								if (entity instanceof ServerPlayer _player) {
									Advancement _adv = _player.server.getAdvancements()
											.getAdvancement(new ResourceLocation("ragemod:rage_mod_advancement"));
									AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
									if (!_ap.isDone()) {
										Iterator _iterator = _ap.getRemainingCriteria().iterator();
										while (_iterator.hasNext())
											_player.getAdvancements().award(_adv, (String) _iterator.next());
									}
								}
							}
						} else {
							if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == RagemodModBlocks.RED_GLOWING_OAK_TREE_SAPLING.get()) {
								if (world instanceof ServerLevel _serverworld) {
									StructureTemplate template = _serverworld.getStructureManager()
											.getOrCreate(new ResourceLocation("ragemod", "a_glow_oak5"));
									if (template != null) {
										template.placeInWorld(_serverworld, new BlockPos(x - 3, y, z - 3), new BlockPos(x - 3, y, z - 3),
												new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE)
														.setIgnoreEntities(false),
												_serverworld.random, 3);
									}
								}
								if (new ResourceLocation("ragemod:dense_glowing_oak_forest")
										.equals(world.getBiome(new BlockPos(x, y + 1, z)).value().getRegistryName())
										|| new ResourceLocation("ragemod:glowing_oak_field")
												.equals(world.getBiome(new BlockPos(x, y + 1, z)).value().getRegistryName())
										|| new ResourceLocation("ragemod:glowing_oak_forest")
												.equals(world.getBiome(new BlockPos(x, y + 1, z)).value().getRegistryName())
										|| new ResourceLocation("ragemod:glowing_oak_forest_mountain")
												.equals(world.getBiome(new BlockPos(x, y + 1, z)).value().getRegistryName())
										|| new ResourceLocation("ragemod:snowy_spare_glowing_oak_forest")
												.equals(world.getBiome(new BlockPos(x, y + 1, z)).value().getRegistryName())
										|| new ResourceLocation("ragemod:snowy_glowing_oak_forest")
												.equals(world.getBiome(new BlockPos(x, y + 1, z)).value().getRegistryName())
										|| new ResourceLocation("ragemod:spare_glowing_oak_forest")
												.equals(world.getBiome(new BlockPos(x, y + 1, z)).value().getRegistryName())) {
									if (entity instanceof ServerPlayer _player) {
										Advancement _adv = _player.server.getAdvancements()
												.getAdvancement(new ResourceLocation("ragemod:rage_mod_advancement"));
										AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
										if (!_ap.isDone()) {
											Iterator _iterator = _ap.getRemainingCriteria().iterator();
											while (_iterator.hasNext())
												_player.getAdvancements().award(_adv, (String) _iterator.next());
										}
									}
								}
							} else {
								if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == RagemodModBlocks.GREEN_GLOWING_OAK_TREE_SAPLING
										.get()) {
									if (world instanceof ServerLevel _serverworld) {
										StructureTemplate template = _serverworld.getStructureManager()
												.getOrCreate(new ResourceLocation("ragemod", "a_glow_oak2"));
										if (template != null) {
											template.placeInWorld(_serverworld, new BlockPos(x - 3, y, z - 3), new BlockPos(x - 3, y, z - 3),
													new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE)
															.setIgnoreEntities(false),
													_serverworld.random, 3);
										}
									}
									if (new ResourceLocation("ragemod:dense_glowing_oak_forest")
											.equals(world.getBiome(new BlockPos(x, y + 1, z)).value().getRegistryName())
											|| new ResourceLocation("ragemod:glowing_oak_field")
													.equals(world.getBiome(new BlockPos(x, y + 1, z)).value().getRegistryName())
											|| new ResourceLocation("ragemod:glowing_oak_forest")
													.equals(world.getBiome(new BlockPos(x, y + 1, z)).value().getRegistryName())
											|| new ResourceLocation("ragemod:glowing_oak_forest_mountain")
													.equals(world.getBiome(new BlockPos(x, y + 1, z)).value().getRegistryName())
											|| new ResourceLocation("ragemod:snowy_spare_glowing_oak_forest")
													.equals(world.getBiome(new BlockPos(x, y + 1, z)).value().getRegistryName())
											|| new ResourceLocation("ragemod:snowy_glowing_oak_forest")
													.equals(world.getBiome(new BlockPos(x, y + 1, z)).value().getRegistryName())
											|| new ResourceLocation("ragemod:spare_glowing_oak_forest")
													.equals(world.getBiome(new BlockPos(x, y + 1, z)).value().getRegistryName())) {
										if (entity instanceof ServerPlayer _player) {
											Advancement _adv = _player.server.getAdvancements()
													.getAdvancement(new ResourceLocation("ragemod:rage_mod_advancement"));
											AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
											if (!_ap.isDone()) {
												Iterator _iterator = _ap.getRemainingCriteria().iterator();
												while (_iterator.hasNext())
													_player.getAdvancements().award(_adv, (String) _iterator.next());
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
