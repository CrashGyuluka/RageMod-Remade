package net.mcreator.ragemod.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.gen.feature.template.Template;
import net.minecraft.world.gen.feature.template.PlacementSettings;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Rotation;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Mirror;
import net.minecraft.util.Direction;
import net.minecraft.server.MinecraftServer;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.BoneMealItem;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import net.mcreator.ragemod.block.YellowGlowingOakTreeSaplingBlock;
import net.mcreator.ragemod.block.RedGlowingOakTreeSaplingBlock;
import net.mcreator.ragemod.block.GreenGlowingOakTreeSaplingBlock;
import net.mcreator.ragemod.block.BrownGlowingOakTreeSaplingBlock;
import net.mcreator.ragemod.RagemodMod;

import java.util.Map;
import java.util.Iterator;

public class YellowGlowingOakTreeSaplingPlantRightClickedProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				RagemodMod.LOGGER.warn("Failed to load dependency world for procedure YellowGlowingOakTreeSaplingPlantRightClicked!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				RagemodMod.LOGGER.warn("Failed to load dependency x for procedure YellowGlowingOakTreeSaplingPlantRightClicked!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				RagemodMod.LOGGER.warn("Failed to load dependency y for procedure YellowGlowingOakTreeSaplingPlantRightClicked!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				RagemodMod.LOGGER.warn("Failed to load dependency z for procedure YellowGlowingOakTreeSaplingPlantRightClicked!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				RagemodMod.LOGGER.warn("Failed to load dependency entity for procedure YellowGlowingOakTreeSaplingPlantRightClicked!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem() == Items.BONE_MEAL
				|| ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY).getItem() == Items.BONE_MEAL) {
			if (world instanceof World) {
				if (BoneMealItem.applyBonemeal(new ItemStack(Items.BONE_MEAL), (World) world, new BlockPos(x, y, z))
						|| BoneMealItem.growSeagrass(new ItemStack(Items.BONE_MEAL), (World) world, new BlockPos(x, y, z), (Direction) null)) {
					if (!world.isRemote())
						((World) world).playEvent(2005, new BlockPos(x, y, z), 0);
				}
			}
			if (world.getBlockState(new BlockPos(x, y + 1, z)).isSolid() == false) {
				if (Math.random() < 0.4) {
					if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == YellowGlowingOakTreeSaplingBlock.block) {
						if (world instanceof ServerWorld) {
							Template template = ((ServerWorld) world).getStructureTemplateManager()
									.getTemplateDefaulted(new ResourceLocation("ragemod", "a_glow_oak3"));
							if (template != null) {
								template.func_237144_a_((ServerWorld) world, new BlockPos(x - 3, y, z - 3), new PlacementSettings()
										.setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
										((World) world).rand);
							}
						}
						if (world.func_241828_r().getRegistry(Registry.BIOME_KEY).getKey(world.getBiome(new BlockPos(x, y + 1, z))) != null
								&& world.func_241828_r().getRegistry(Registry.BIOME_KEY).getKey(world.getBiome(new BlockPos(x, y + 1, z)))
										.equals(new ResourceLocation("ragemod:dense_glowing_oak_forest"))
								|| world.func_241828_r().getRegistry(Registry.BIOME_KEY).getKey(world.getBiome(new BlockPos(x, y + 1, z))) != null
										&& world.func_241828_r().getRegistry(Registry.BIOME_KEY).getKey(world.getBiome(new BlockPos(x, y + 1, z)))
												.equals(new ResourceLocation("ragemod:glowing_oak_field"))
								|| world.func_241828_r().getRegistry(Registry.BIOME_KEY).getKey(world.getBiome(new BlockPos(x, y + 1, z))) != null
										&& world.func_241828_r().getRegistry(Registry.BIOME_KEY).getKey(world.getBiome(new BlockPos(x, y + 1, z)))
												.equals(new ResourceLocation("ragemod:glowing_oak_forest"))
								|| world.func_241828_r().getRegistry(Registry.BIOME_KEY).getKey(world.getBiome(new BlockPos(x, y + 1, z))) != null
										&& world.func_241828_r().getRegistry(Registry.BIOME_KEY).getKey(world.getBiome(new BlockPos(x, y + 1, z)))
												.equals(new ResourceLocation("ragemod:glowing_oak_forest_mountain"))
								|| world.func_241828_r().getRegistry(Registry.BIOME_KEY).getKey(world.getBiome(new BlockPos(x, y + 1, z))) != null
										&& world.func_241828_r().getRegistry(Registry.BIOME_KEY).getKey(world.getBiome(new BlockPos(x, y + 1, z)))
												.equals(new ResourceLocation("ragemod:snowy_spare_glowing_oak_forest"))
								|| world.func_241828_r().getRegistry(Registry.BIOME_KEY).getKey(world.getBiome(new BlockPos(x, y + 1, z))) != null
										&& world.func_241828_r().getRegistry(Registry.BIOME_KEY).getKey(world.getBiome(new BlockPos(x, y + 1, z)))
												.equals(new ResourceLocation("ragemod:snowy_glowing_oak_forest"))
								|| world.func_241828_r().getRegistry(Registry.BIOME_KEY).getKey(world.getBiome(new BlockPos(x, y + 1, z))) != null
										&& world.func_241828_r().getRegistry(Registry.BIOME_KEY).getKey(world.getBiome(new BlockPos(x, y + 1, z)))
												.equals(new ResourceLocation("ragemod:spare_glowing_oak_forest"))) {
							if (entity instanceof ServerPlayerEntity) {
								Advancement _adv = ((MinecraftServer) ((ServerPlayerEntity) entity).server).getAdvancementManager()
										.getAdvancement(new ResourceLocation("ragemod:rage_mod_advancement"));
								AdvancementProgress _ap = ((ServerPlayerEntity) entity).getAdvancements().getProgress(_adv);
								if (!_ap.isDone()) {
									Iterator _iterator = _ap.getRemaningCriteria().iterator();
									while (_iterator.hasNext()) {
										String _criterion = (String) _iterator.next();
										((ServerPlayerEntity) entity).getAdvancements().grantCriterion(_adv, _criterion);
									}
								}
							}
						}
					} else {
						if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == BrownGlowingOakTreeSaplingBlock.block) {
							if (world instanceof ServerWorld) {
								Template template = ((ServerWorld) world).getStructureTemplateManager()
										.getTemplateDefaulted(new ResourceLocation("ragemod", "a_glow_oak4"));
								if (template != null) {
									template.func_237144_a_((ServerWorld) world, new BlockPos(x - 3, y, z - 3), new PlacementSettings()
											.setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
											((World) world).rand);
								}
							}
							if (world.func_241828_r().getRegistry(Registry.BIOME_KEY).getKey(world.getBiome(new BlockPos(x, y + 1, z))) != null
									&& world.func_241828_r().getRegistry(Registry.BIOME_KEY).getKey(world.getBiome(new BlockPos(x, y + 1, z)))
											.equals(new ResourceLocation("ragemod:dense_glowing_oak_forest"))
									|| world.func_241828_r().getRegistry(Registry.BIOME_KEY).getKey(world.getBiome(new BlockPos(x, y + 1, z))) != null
											&& world.func_241828_r().getRegistry(Registry.BIOME_KEY).getKey(world.getBiome(new BlockPos(x, y + 1, z)))
													.equals(new ResourceLocation("ragemod:glowing_oak_field"))
									|| world.func_241828_r().getRegistry(Registry.BIOME_KEY).getKey(world.getBiome(new BlockPos(x, y + 1, z))) != null
											&& world.func_241828_r().getRegistry(Registry.BIOME_KEY).getKey(world.getBiome(new BlockPos(x, y + 1, z)))
													.equals(new ResourceLocation("ragemod:glowing_oak_forest"))
									|| world.func_241828_r().getRegistry(Registry.BIOME_KEY).getKey(world.getBiome(new BlockPos(x, y + 1, z))) != null
											&& world.func_241828_r().getRegistry(Registry.BIOME_KEY).getKey(world.getBiome(new BlockPos(x, y + 1, z)))
													.equals(new ResourceLocation("ragemod:glowing_oak_forest_mountain"))
									|| world.func_241828_r().getRegistry(Registry.BIOME_KEY).getKey(world.getBiome(new BlockPos(x, y + 1, z))) != null
											&& world.func_241828_r().getRegistry(Registry.BIOME_KEY).getKey(world.getBiome(new BlockPos(x, y + 1, z)))
													.equals(new ResourceLocation("ragemod:snowy_spare_glowing_oak_forest"))
									|| world.func_241828_r().getRegistry(Registry.BIOME_KEY).getKey(world.getBiome(new BlockPos(x, y + 1, z))) != null
											&& world.func_241828_r().getRegistry(Registry.BIOME_KEY).getKey(world.getBiome(new BlockPos(x, y + 1, z)))
													.equals(new ResourceLocation("ragemod:snowy_glowing_oak_forest"))
									|| world.func_241828_r().getRegistry(Registry.BIOME_KEY).getKey(world.getBiome(new BlockPos(x, y + 1, z))) != null
											&& world.func_241828_r().getRegistry(Registry.BIOME_KEY).getKey(world.getBiome(new BlockPos(x, y + 1, z)))
													.equals(new ResourceLocation("ragemod:spare_glowing_oak_forest"))) {
								if (entity instanceof ServerPlayerEntity) {
									Advancement _adv = ((MinecraftServer) ((ServerPlayerEntity) entity).server).getAdvancementManager()
											.getAdvancement(new ResourceLocation("ragemod:rage_mod_advancement"));
									AdvancementProgress _ap = ((ServerPlayerEntity) entity).getAdvancements().getProgress(_adv);
									if (!_ap.isDone()) {
										Iterator _iterator = _ap.getRemaningCriteria().iterator();
										while (_iterator.hasNext()) {
											String _criterion = (String) _iterator.next();
											((ServerPlayerEntity) entity).getAdvancements().grantCriterion(_adv, _criterion);
										}
									}
								}
							}
						} else {
							if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == RedGlowingOakTreeSaplingBlock.block) {
								if (world instanceof ServerWorld) {
									Template template = ((ServerWorld) world).getStructureTemplateManager()
											.getTemplateDefaulted(new ResourceLocation("ragemod", "a_glow_oak5"));
									if (template != null) {
										template.func_237144_a_((ServerWorld) world, new BlockPos(x - 3, y, z - 3), new PlacementSettings()
												.setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
												((World) world).rand);
									}
								}
								if (world.func_241828_r().getRegistry(Registry.BIOME_KEY).getKey(world.getBiome(new BlockPos(x, y + 1, z))) != null
										&& world.func_241828_r().getRegistry(Registry.BIOME_KEY).getKey(world.getBiome(new BlockPos(x, y + 1, z)))
												.equals(new ResourceLocation("ragemod:dense_glowing_oak_forest"))
										|| world.func_241828_r().getRegistry(Registry.BIOME_KEY)
												.getKey(world.getBiome(new BlockPos(x, y + 1, z))) != null
												&& world.func_241828_r().getRegistry(Registry.BIOME_KEY)
														.getKey(world.getBiome(new BlockPos(x, y + 1, z)))
														.equals(new ResourceLocation("ragemod:glowing_oak_field"))
										|| world.func_241828_r().getRegistry(Registry.BIOME_KEY)
												.getKey(world.getBiome(new BlockPos(x, y + 1, z))) != null
												&& world.func_241828_r().getRegistry(Registry.BIOME_KEY)
														.getKey(world.getBiome(new BlockPos(x, y + 1, z)))
														.equals(new ResourceLocation("ragemod:glowing_oak_forest"))
										|| world.func_241828_r().getRegistry(Registry.BIOME_KEY)
												.getKey(world.getBiome(new BlockPos(x, y + 1, z))) != null
												&& world.func_241828_r().getRegistry(Registry.BIOME_KEY)
														.getKey(world.getBiome(new BlockPos(x, y + 1, z)))
														.equals(new ResourceLocation("ragemod:glowing_oak_forest_mountain"))
										|| world.func_241828_r().getRegistry(Registry.BIOME_KEY)
												.getKey(world.getBiome(new BlockPos(x, y + 1, z))) != null
												&& world.func_241828_r().getRegistry(Registry.BIOME_KEY)
														.getKey(world.getBiome(new BlockPos(x, y + 1, z)))
														.equals(new ResourceLocation("ragemod:snowy_spare_glowing_oak_forest"))
										|| world.func_241828_r().getRegistry(Registry.BIOME_KEY)
												.getKey(world.getBiome(new BlockPos(x, y + 1, z))) != null
												&& world.func_241828_r().getRegistry(Registry.BIOME_KEY)
														.getKey(world.getBiome(new BlockPos(x, y + 1, z)))
														.equals(new ResourceLocation("ragemod:snowy_glowing_oak_forest"))
										|| world.func_241828_r().getRegistry(Registry.BIOME_KEY)
												.getKey(world.getBiome(new BlockPos(x, y + 1, z))) != null
												&& world.func_241828_r().getRegistry(Registry.BIOME_KEY)
														.getKey(world.getBiome(new BlockPos(x, y + 1, z)))
														.equals(new ResourceLocation("ragemod:spare_glowing_oak_forest"))) {
									if (entity instanceof ServerPlayerEntity) {
										Advancement _adv = ((MinecraftServer) ((ServerPlayerEntity) entity).server).getAdvancementManager()
												.getAdvancement(new ResourceLocation("ragemod:rage_mod_advancement"));
										AdvancementProgress _ap = ((ServerPlayerEntity) entity).getAdvancements().getProgress(_adv);
										if (!_ap.isDone()) {
											Iterator _iterator = _ap.getRemaningCriteria().iterator();
											while (_iterator.hasNext()) {
												String _criterion = (String) _iterator.next();
												((ServerPlayerEntity) entity).getAdvancements().grantCriterion(_adv, _criterion);
											}
										}
									}
								}
							} else {
								if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == GreenGlowingOakTreeSaplingBlock.block) {
									if (world instanceof ServerWorld) {
										Template template = ((ServerWorld) world).getStructureTemplateManager()
												.getTemplateDefaulted(new ResourceLocation("ragemod", "a_glow_oak2"));
										if (template != null) {
											template.func_237144_a_((ServerWorld) world, new BlockPos(x - 3, y, z - 3), new PlacementSettings()
													.setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
													((World) world).rand);
										}
									}
									if (world.func_241828_r().getRegistry(Registry.BIOME_KEY)
											.getKey(world.getBiome(new BlockPos(x, y + 1, z))) != null
											&& world.func_241828_r().getRegistry(Registry.BIOME_KEY).getKey(world.getBiome(new BlockPos(x, y + 1, z)))
													.equals(new ResourceLocation("ragemod:dense_glowing_oak_forest"))
											|| world.func_241828_r().getRegistry(Registry.BIOME_KEY)
													.getKey(world.getBiome(new BlockPos(x, y + 1, z))) != null
													&& world.func_241828_r().getRegistry(Registry.BIOME_KEY)
															.getKey(world.getBiome(new BlockPos(x, y + 1, z)))
															.equals(new ResourceLocation("ragemod:glowing_oak_field"))
											|| world.func_241828_r().getRegistry(Registry.BIOME_KEY)
													.getKey(world.getBiome(new BlockPos(x, y + 1, z))) != null
													&& world.func_241828_r().getRegistry(Registry.BIOME_KEY)
															.getKey(world.getBiome(new BlockPos(x, y + 1, z)))
															.equals(new ResourceLocation("ragemod:glowing_oak_forest"))
											|| world.func_241828_r().getRegistry(Registry.BIOME_KEY)
													.getKey(world.getBiome(new BlockPos(x, y + 1, z))) != null
													&& world.func_241828_r().getRegistry(Registry.BIOME_KEY)
															.getKey(world.getBiome(new BlockPos(x, y + 1, z)))
															.equals(new ResourceLocation("ragemod:glowing_oak_forest_mountain"))
											|| world.func_241828_r().getRegistry(Registry.BIOME_KEY)
													.getKey(world.getBiome(new BlockPos(x, y + 1, z))) != null
													&& world.func_241828_r().getRegistry(Registry.BIOME_KEY)
															.getKey(world.getBiome(new BlockPos(x, y + 1, z)))
															.equals(new ResourceLocation("ragemod:snowy_spare_glowing_oak_forest"))
											|| world.func_241828_r().getRegistry(Registry.BIOME_KEY)
													.getKey(world.getBiome(new BlockPos(x, y + 1, z))) != null
													&& world.func_241828_r().getRegistry(Registry.BIOME_KEY)
															.getKey(world.getBiome(new BlockPos(x, y + 1, z)))
															.equals(new ResourceLocation("ragemod:snowy_glowing_oak_forest"))
											|| world.func_241828_r().getRegistry(Registry.BIOME_KEY)
													.getKey(world.getBiome(new BlockPos(x, y + 1, z))) != null
													&& world.func_241828_r().getRegistry(Registry.BIOME_KEY)
															.getKey(world.getBiome(new BlockPos(x, y + 1, z)))
															.equals(new ResourceLocation("ragemod:spare_glowing_oak_forest"))) {
										if (entity instanceof ServerPlayerEntity) {
											Advancement _adv = ((MinecraftServer) ((ServerPlayerEntity) entity).server).getAdvancementManager()
													.getAdvancement(new ResourceLocation("ragemod:rage_mod_advancement"));
											AdvancementProgress _ap = ((ServerPlayerEntity) entity).getAdvancements().getProgress(_adv);
											if (!_ap.isDone()) {
												Iterator _iterator = _ap.getRemaningCriteria().iterator();
												while (_iterator.hasNext()) {
													String _criterion = (String) _iterator.next();
													((ServerPlayerEntity) entity).getAdvancements().grantCriterion(_adv, _criterion);
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
}
