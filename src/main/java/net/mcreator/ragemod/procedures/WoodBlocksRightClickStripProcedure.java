package net.mcreator.ragemod.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.ragemod.init.RagemodModBlocks;

import javax.annotation.Nullable;

import java.util.Map;

@Mod.EventBusSubscriber
public class WoodBlocksRightClickStripProcedure {
	@SubscribeEvent
	public static void onRightClickBlock(PlayerInteractEvent.RightClickBlock event) {
		Player entity = event.getPlayer();
		if (event.getHand() != entity.getUsedItemHand())
			return;
		execute(event, event.getWorld(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), entity);
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() instanceof AxeItem
				|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() instanceof AxeItem) {
			if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == RagemodModBlocks.BEECH_LOG) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = RagemodModBlocks.STRIPPED_BEECH_LOG.defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos((int) x, (int) y, (int) z),
								ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.axe.strip")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.axe.strip")),
								SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				if (entity instanceof Player _player) {
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					_player.level.getBlockState(_bp).use(_player.level, _player, InteractionHand.MAIN_HAND,
							BlockHitResult.miss(new Vec3(_bp.getX(), _bp.getY(), _bp.getZ()), Direction.UP, _bp));
				}
			} else {
				if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == RagemodModBlocks.BEECH_BLOCK) {
					{
						BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
						BlockState _bs = RagemodModBlocks.STIPPED_BEECH_LOG.defaultBlockState();
						BlockState _bso = world.getBlockState(_bp);
						for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
							Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
							if (_property != null && _bs.getValue(_property) != null)
								try {
									_bs = _bs.setValue(_property, (Comparable) entry.getValue());
								} catch (Exception e) {
								}
						}
						world.setBlock(_bp, _bs, 3);
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, new BlockPos((int) x, (int) y, (int) z),
									ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.axe.strip")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.axe.strip")),
									SoundSource.NEUTRAL, 1, 1, false);
						}
					}
					if (entity instanceof Player _player) {
						BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
						_player.level.getBlockState(_bp).use(_player.level, _player, InteractionHand.MAIN_HAND,
								BlockHitResult.miss(new Vec3(_bp.getX(), _bp.getY(), _bp.getZ()), Direction.UP, _bp));
					}
				} else {
					if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == RagemodModBlocks.STRIPPED_RAGE_WOOD_LOG) {
						{
							BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
							BlockState _bs = RagemodModBlocks.BETTER_STRIPPED_RAGE_WOOD_LOG.defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, new BlockPos((int) x, (int) y, (int) z),
										ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.axe.strip")), SoundSource.NEUTRAL, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.axe.strip")),
										SoundSource.NEUTRAL, 1, 1, false);
							}
						}
						if (entity instanceof Player _player) {
							BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
							_player.level.getBlockState(_bp).use(_player.level, _player, InteractionHand.MAIN_HAND,
									BlockHitResult.miss(new Vec3(_bp.getX(), _bp.getY(), _bp.getZ()), Direction.UP, _bp));
						}
					} else {
						if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == RagemodModBlocks.RAGE_WOOD_LOG) {
							{
								BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
								BlockState _bs = RagemodModBlocks.STRIPPED_RAGE_WOOD_LOG.defaultBlockState();
								BlockState _bso = world.getBlockState(_bp);
								for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
									Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
									if (_property != null && _bs.getValue(_property) != null)
										try {
											_bs = _bs.setValue(_property, (Comparable) entry.getValue());
										} catch (Exception e) {
										}
								}
								world.setBlock(_bp, _bs, 3);
							}
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, new BlockPos((int) x, (int) y, (int) z),
											ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.axe.strip")), SoundSource.NEUTRAL, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.axe.strip")),
											SoundSource.NEUTRAL, 1, 1, false);
								}
							}
							if (entity instanceof Player _player) {
								BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
								_player.level.getBlockState(_bp).use(_player.level, _player, InteractionHand.MAIN_HAND,
										BlockHitResult.miss(new Vec3(_bp.getX(), _bp.getY(), _bp.getZ()), Direction.UP, _bp));
							}
						} else {
							if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))
									.getBlock() == RagemodModBlocks.STRIPPED_RAGE_WOOD_BLOCK) {
								{
									BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
									BlockState _bs = RagemodModBlocks.BETTER_STRIPPED_RAGE_WOOD_BLOCK.defaultBlockState();
									BlockState _bso = world.getBlockState(_bp);
									for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
										Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
										if (_property != null && _bs.getValue(_property) != null)
											try {
												_bs = _bs.setValue(_property, (Comparable) entry.getValue());
											} catch (Exception e) {
											}
									}
									world.setBlock(_bp, _bs, 3);
								}
								if (world instanceof Level _level) {
									if (!_level.isClientSide()) {
										_level.playSound(null, new BlockPos((int) x, (int) y, (int) z),
												ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.axe.strip")), SoundSource.NEUTRAL, 1,
												1);
									} else {
										_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.axe.strip")),
												SoundSource.NEUTRAL, 1, 1, false);
									}
								}
								if (entity instanceof Player _player) {
									BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
									_player.level.getBlockState(_bp).use(_player.level, _player, InteractionHand.MAIN_HAND,
											BlockHitResult.miss(new Vec3(_bp.getX(), _bp.getY(), _bp.getZ()), Direction.UP, _bp));
								}
							} else {
								if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == RagemodModBlocks.RAGE_WOOD_BLOCK) {
									{
										BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
										BlockState _bs = RagemodModBlocks.STRIPPED_RAGE_WOOD_BLOCK.defaultBlockState();
										BlockState _bso = world.getBlockState(_bp);
										for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
											Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
											if (_property != null && _bs.getValue(_property) != null)
												try {
													_bs = _bs.setValue(_property, (Comparable) entry.getValue());
												} catch (Exception e) {
												}
										}
										world.setBlock(_bp, _bs, 3);
									}
									if (world instanceof Level _level) {
										if (!_level.isClientSide()) {
											_level.playSound(null, new BlockPos((int) x, (int) y, (int) z),
													ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.axe.strip")),
													SoundSource.NEUTRAL, 1, 1);
										} else {
											_level.playLocalSound(x, y, z,
													ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.axe.strip")),
													SoundSource.NEUTRAL, 1, 1, false);
										}
									}
									if (entity instanceof Player _player) {
										BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
										_player.level.getBlockState(_bp).use(_player.level, _player, InteractionHand.MAIN_HAND,
												BlockHitResult.miss(new Vec3(_bp.getX(), _bp.getY(), _bp.getZ()), Direction.UP, _bp));
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
