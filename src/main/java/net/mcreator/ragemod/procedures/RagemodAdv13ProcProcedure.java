package net.mcreator.ragemod.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.world.BlockEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.BlockTags;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import net.mcreator.ragemod.network.RagemodModVariables;
import net.mcreator.ragemod.init.RagemodModBlocks;

import javax.annotation.Nullable;

import java.util.Iterator;

@Mod.EventBusSubscriber
public class RagemodAdv13ProcProcedure {
	@SubscribeEvent
	public static void onBlockPlace(BlockEvent.EntityPlaceEvent event) {
		Entity entity = event.getEntity();
		execute(event, event.getWorld(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), entity);
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (BlockTags.getAllTags().getTagOrEmpty(new ResourceLocation("forge:toxic_topped_blocks"))
				.contains((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock())) {
			if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == RagemodModBlocks.TOXIC_TOPPED_STONE) {
				{
					boolean _setval = true;
					entity.getCapability(RagemodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.TTBCounter1 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else {
				if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == RagemodModBlocks.TOXIC_TOPPED_NETHERRACK) {
					{
						boolean _setval = true;
						entity.getCapability(RagemodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.TTBCounter2 = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else {
					if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == RagemodModBlocks.TOXIC_TOPPED_ENDSTONE) {
						{
							boolean _setval = true;
							entity.getCapability(RagemodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.TTBCounter3 = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					} else {
						if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == RagemodModBlocks.TOXIC_TOPPED_DIRT) {
							{
								boolean _setval = true;
								entity.getCapability(RagemodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.TTBCounter4 = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
						} else {
							if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == RagemodModBlocks.TOXIC_TOPPED_OAK_LOG) {
								{
									boolean _setval = true;
									entity.getCapability(RagemodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.TTBCounter5 = _setval;
										capability.syncPlayerVariables(entity);
									});
								}
							} else {
								if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))
										.getBlock() == RagemodModBlocks.TOXIC_TOPPED_OAK_PLANKS) {
									{
										boolean _setval = true;
										entity.getCapability(RagemodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
											capability.TTBCounter6 = _setval;
											capability.syncPlayerVariables(entity);
										});
									}
								} else {
									if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))
											.getBlock() == RagemodModBlocks.TOXIC_TOPPED_ANDESITE) {
										{
											boolean _setval = true;
											entity.getCapability(RagemodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
												capability.TTBCounter7 = _setval;
												capability.syncPlayerVariables(entity);
											});
										}
									} else {
										if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))
												.getBlock() == RagemodModBlocks.TOXIC_TOPPED_DIORITE) {
											{
												boolean _setval = true;
												entity.getCapability(RagemodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
													capability.TTBCounter8 = _setval;
													capability.syncPlayerVariables(entity);
												});
											}
										} else {
											if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))
													.getBlock() == RagemodModBlocks.TOXIC_TOPPED_GRANITE) {
												{
													boolean _setval = true;
													entity.getCapability(RagemodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
															.ifPresent(capability -> {
																capability.TTBCounter9 = _setval;
																capability.syncPlayerVariables(entity);
															});
												}
											} else {
												if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))
														.getBlock() == RagemodModBlocks.TOXIC_TOPPED_BONE_BLOCK) {
													{
														boolean _setval = true;
														entity.getCapability(RagemodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																.ifPresent(capability -> {
																	capability.TTBCounter10 = _setval;
																	capability.syncPlayerVariables(entity);
																});
													}
												} else {
													if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))
															.getBlock() == RagemodModBlocks.TOXIC_TOPPED_BRICKS) {
														{
															boolean _setval = true;
															entity.getCapability(RagemodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																	.ifPresent(capability -> {
																		capability.TTBCounter11 = _setval;
																		capability.syncPlayerVariables(entity);
																	});
														}
													} else {
														if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))
																.getBlock() == RagemodModBlocks.TOXIC_TOPPED_STONE_BRICKS) {
															{
																boolean _setval = true;
																entity.getCapability(RagemodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																		.ifPresent(capability -> {
																			capability.TTBCounter12 = _setval;
																			capability.syncPlayerVariables(entity);
																		});
															}
														} else {
															if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))
																	.getBlock() == RagemodModBlocks.TOXIC_TOPPED_ANCIENT_DEBRIS) {
																{
																	boolean _setval = true;
																	entity.getCapability(RagemodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																			.ifPresent(capability -> {
																				capability.TTBCounter13 = _setval;
																				capability.syncPlayerVariables(entity);
																			});
																}
															} else {
																if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))
																		.getBlock() == RagemodModBlocks.TOXIC_TOPPED_BASALT) {
																	{
																		boolean _setval = true;
																		entity.getCapability(RagemodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																				.ifPresent(capability -> {
																					capability.TTBCounter14 = _setval;
																					capability.syncPlayerVariables(entity);
																				});
																	}
																} else {
																	if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))
																			.getBlock() == RagemodModBlocks.TOXIC_TOPPED_COBBLESTONE) {
																		{
																			boolean _setval = true;
																			entity.getCapability(RagemodModVariables.PLAYER_VARIABLES_CAPABILITY,
																					null).ifPresent(capability -> {
																						capability.TTBCounter15 = _setval;
																						capability.syncPlayerVariables(entity);
																					});
																		}
																	} else {
																		if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))
																				.getBlock() == RagemodModBlocks.TOXIC_TOPPED_GRAVEL) {
																			{
																				boolean _setval = true;
																				entity.getCapability(RagemodModVariables.PLAYER_VARIABLES_CAPABILITY,
																						null).ifPresent(capability -> {
																							capability.TTBCounter16 = _setval;
																							capability.syncPlayerVariables(entity);
																						});
																			}
																		} else {
																			if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))
																					.getBlock() == RagemodModBlocks.TOXIC_TOPPED_BLACKSTONE) {
																				{
																					boolean _setval = true;
																					entity.getCapability(
																							RagemodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																							.ifPresent(capability -> {
																								capability.TTBCounter17 = _setval;
																								capability.syncPlayerVariables(entity);
																							});
																				}
																			} else {
																				if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))
																						.getBlock() == RagemodModBlocks.TOXIC_TOPPED_SAND) {
																					{
																						boolean _setval = true;
																						entity.getCapability(
																								RagemodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																								.ifPresent(capability -> {
																									capability.TTBCounter18 = _setval;
																									capability.syncPlayerVariables(entity);
																								});
																					}
																				} else {
																					if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))
																							.getBlock() == RagemodModBlocks.TOXIC_TOPPED_RED_SAND) {
																						{
																							boolean _setval = true;
																							entity.getCapability(
																									RagemodModVariables.PLAYER_VARIABLES_CAPABILITY,
																									null).ifPresent(capability -> {
																										capability.TTBCounter19 = _setval;
																										capability.syncPlayerVariables(entity);
																									});
																						}
																					} else {
																						if ((world.getBlockState(
																								new BlockPos((int) x, (int) y, (int) z)))
																										.getBlock() == RagemodModBlocks.TOXIC_TOPPED_OBSIDIAN) {
																							{
																								boolean _setval = true;
																								entity.getCapability(
																										RagemodModVariables.PLAYER_VARIABLES_CAPABILITY,
																										null).ifPresent(capability -> {
																											capability.TTBCounter20 = _setval;
																											capability.syncPlayerVariables(entity);
																										});
																							}
																						} else {
																							if ((world.getBlockState(
																									new BlockPos((int) x, (int) y, (int) z)))
																											.getBlock() == RagemodModBlocks.TOXIC_TOPPED_RAGEIUM_ORE) {
																								{
																									boolean _setval = true;
																									entity.getCapability(
																											RagemodModVariables.PLAYER_VARIABLES_CAPABILITY,
																											null).ifPresent(capability -> {
																												capability.TTBCounter21 = _setval;
																												capability
																														.syncPlayerVariables(entity);
																											});
																								}
																							} else {
																								if ((world.getBlockState(
																										new BlockPos((int) x, (int) y, (int) z)))
																												.getBlock() == RagemodModBlocks.TOXIC_TOPPED_RAGEIUM_BLOCK) {
																									{
																										boolean _setval = true;
																										entity.getCapability(
																												RagemodModVariables.PLAYER_VARIABLES_CAPABILITY,
																												null).ifPresent(capability -> {
																													capability.TTBCounter22 = _setval;
																													capability.syncPlayerVariables(
																															entity);
																												});
																									}
																								} else {
																									if ((world.getBlockState(
																											new BlockPos((int) x, (int) y, (int) z)))
																													.getBlock() == RagemodModBlocks.TOXIC_TOPPED_RAGEIUM_ALLOY_BLOCK) {
																										{
																											boolean _setval = true;
																											entity.getCapability(
																													RagemodModVariables.PLAYER_VARIABLES_CAPABILITY,
																													null).ifPresent(capability -> {
																														capability.TTBCounter23 = _setval;
																														capability
																																.syncPlayerVariables(
																																		entity);
																													});
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
			if ((entity.getCapability(RagemodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new RagemodModVariables.PlayerVariables())).TTBCounter1 == true
					&& (entity.getCapability(RagemodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new RagemodModVariables.PlayerVariables())).TTBCounter2 == true
					&& (entity.getCapability(RagemodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new RagemodModVariables.PlayerVariables())).TTBCounter3 == true
					&& (entity.getCapability(RagemodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new RagemodModVariables.PlayerVariables())).TTBCounter4 == true
					&& (entity.getCapability(RagemodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new RagemodModVariables.PlayerVariables())).TTBCounter5 == true
					&& (entity.getCapability(RagemodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new RagemodModVariables.PlayerVariables())).TTBCounter6 == true
					&& (entity.getCapability(RagemodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new RagemodModVariables.PlayerVariables())).TTBCounter7 == true
					&& (entity.getCapability(RagemodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new RagemodModVariables.PlayerVariables())).TTBCounter8 == true
					&& (entity.getCapability(RagemodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new RagemodModVariables.PlayerVariables())).TTBCounter9 == true
					&& (entity.getCapability(RagemodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new RagemodModVariables.PlayerVariables())).TTBCounter10 == true
					&& (entity.getCapability(RagemodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new RagemodModVariables.PlayerVariables())).TTBCounter11 == true
					&& (entity.getCapability(RagemodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new RagemodModVariables.PlayerVariables())).TTBCounter12 == true
					&& (entity.getCapability(RagemodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new RagemodModVariables.PlayerVariables())).TTBCounter13 == true
					&& (entity.getCapability(RagemodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new RagemodModVariables.PlayerVariables())).TTBCounter14 == true
					&& (entity.getCapability(RagemodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new RagemodModVariables.PlayerVariables())).TTBCounter15 == true
					&& (entity.getCapability(RagemodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new RagemodModVariables.PlayerVariables())).TTBCounter16 == true
					&& (entity.getCapability(RagemodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new RagemodModVariables.PlayerVariables())).TTBCounter17 == true
					&& (entity.getCapability(RagemodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new RagemodModVariables.PlayerVariables())).TTBCounter18 == true
					&& (entity.getCapability(RagemodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new RagemodModVariables.PlayerVariables())).TTBCounter19 == true
					&& (entity.getCapability(RagemodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new RagemodModVariables.PlayerVariables())).TTBCounter20 == true
					&& (entity.getCapability(RagemodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new RagemodModVariables.PlayerVariables())).TTBCounter21 == true
					&& (entity.getCapability(RagemodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new RagemodModVariables.PlayerVariables())).TTBCounter22 == true
					&& (entity.getCapability(RagemodModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new RagemodModVariables.PlayerVariables())).TTBCounter23 == true) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("ragemod:ragemod_adv_13"));
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
