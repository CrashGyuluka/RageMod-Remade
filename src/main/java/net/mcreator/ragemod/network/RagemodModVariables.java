package net.mcreator.ragemod.network;

import net.minecraftforge.network.PacketDistributor;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.common.util.FakePlayer;
import net.minecraftforge.common.capabilities.RegisterCapabilitiesEvent;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.common.capabilities.CapabilityToken;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.capabilities.Capability;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.nbt.Tag;
import net.minecraft.nbt.NbtUtils;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.Direction;
import net.minecraft.client.Minecraft;

import net.mcreator.ragemod.RagemodMod;

import java.util.function.Supplier;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class RagemodModVariables {
	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		RagemodMod.addNetworkMessage(PlayerVariablesSyncMessage.class, PlayerVariablesSyncMessage::buffer, PlayerVariablesSyncMessage::new,
				PlayerVariablesSyncMessage::handler);
	}

	@SubscribeEvent
	public static void init(RegisterCapabilitiesEvent event) {
		event.register(PlayerVariables.class);
	}

	@Mod.EventBusSubscriber
	public static class EventBusVariableHandlers {
		@SubscribeEvent
		public static void onPlayerLoggedInSyncPlayerVariables(PlayerEvent.PlayerLoggedInEvent event) {
			if (!event.getPlayer().level.isClientSide())
				((PlayerVariables) event.getPlayer().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()))
						.syncPlayerVariables(event.getPlayer());
		}

		@SubscribeEvent
		public static void onPlayerRespawnedSyncPlayerVariables(PlayerEvent.PlayerRespawnEvent event) {
			if (!event.getPlayer().level.isClientSide())
				((PlayerVariables) event.getPlayer().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()))
						.syncPlayerVariables(event.getPlayer());
		}

		@SubscribeEvent
		public static void onPlayerChangedDimensionSyncPlayerVariables(PlayerEvent.PlayerChangedDimensionEvent event) {
			if (!event.getPlayer().level.isClientSide())
				((PlayerVariables) event.getPlayer().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()))
						.syncPlayerVariables(event.getPlayer());
		}

		@SubscribeEvent
		public static void clonePlayer(PlayerEvent.Clone event) {
			event.getOriginal().revive();
			PlayerVariables original = ((PlayerVariables) event.getOriginal().getCapability(PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new PlayerVariables()));
			PlayerVariables clone = ((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new PlayerVariables()));
			clone.TTBCounter1 = original.TTBCounter1;
			clone.TTBCounter2 = original.TTBCounter2;
			clone.TTBCounter3 = original.TTBCounter3;
			clone.TTBCounter4 = original.TTBCounter4;
			clone.TTBCounter5 = original.TTBCounter5;
			clone.TTBCounter6 = original.TTBCounter6;
			clone.TTBCounter7 = original.TTBCounter7;
			clone.TTBCounter8 = original.TTBCounter8;
			clone.TTBCounter9 = original.TTBCounter9;
			clone.TTBCounter10 = original.TTBCounter10;
			clone.TTBCounter11 = original.TTBCounter11;
			clone.TTBCounter12 = original.TTBCounter12;
			clone.TTBCounter13 = original.TTBCounter13;
			clone.TTBCounter14 = original.TTBCounter14;
			clone.TTBCounter15 = original.TTBCounter15;
			clone.TTBCounter16 = original.TTBCounter16;
			clone.TTBCounter17 = original.TTBCounter17;
			clone.TTBCounter18 = original.TTBCounter18;
			clone.TTBCounter19 = original.TTBCounter19;
			clone.TTBCounter20 = original.TTBCounter20;
			clone.TTBCounter21 = original.TTBCounter21;
			clone.TTBCounter22 = original.TTBCounter22;
			clone.TTBCounter23 = original.TTBCounter23;
			if (!event.isWasDeath()) {
				clone.BlockLockVar = original.BlockLockVar;
			}
		}
	}

	public static final Capability<PlayerVariables> PLAYER_VARIABLES_CAPABILITY = CapabilityManager.get(new CapabilityToken<PlayerVariables>() {
	});

	@Mod.EventBusSubscriber
	private static class PlayerVariablesProvider implements ICapabilitySerializable<Tag> {
		@SubscribeEvent
		public static void onAttachCapabilities(AttachCapabilitiesEvent<Entity> event) {
			if (event.getObject() instanceof Player && !(event.getObject() instanceof FakePlayer))
				event.addCapability(new ResourceLocation("ragemod", "player_variables"), new PlayerVariablesProvider());
		}

		private final PlayerVariables playerVariables = new PlayerVariables();
		private final LazyOptional<PlayerVariables> instance = LazyOptional.of(() -> playerVariables);

		@Override
		public <T> LazyOptional<T> getCapability(Capability<T> cap, Direction side) {
			return cap == PLAYER_VARIABLES_CAPABILITY ? instance.cast() : LazyOptional.empty();
		}

		@Override
		public Tag serializeNBT() {
			return playerVariables.writeNBT();
		}

		@Override
		public void deserializeNBT(Tag nbt) {
			playerVariables.readNBT(nbt);
		}
	}

	public static class PlayerVariables {
		public BlockState BlockLockVar = Blocks.AIR.defaultBlockState();
		public boolean TTBCounter1 = false;
		public boolean TTBCounter2 = false;
		public boolean TTBCounter3 = false;
		public boolean TTBCounter4 = false;
		public boolean TTBCounter5 = false;
		public boolean TTBCounter6 = false;
		public boolean TTBCounter7 = false;
		public boolean TTBCounter8 = false;
		public boolean TTBCounter9 = false;
		public boolean TTBCounter10 = false;
		public boolean TTBCounter11 = false;
		public boolean TTBCounter12 = false;
		public boolean TTBCounter13 = false;
		public boolean TTBCounter14 = false;
		public boolean TTBCounter15 = false;
		public boolean TTBCounter16 = false;
		public boolean TTBCounter17 = false;
		public boolean TTBCounter18 = false;
		public boolean TTBCounter19 = false;
		public boolean TTBCounter20 = false;
		public boolean TTBCounter21 = false;
		public boolean TTBCounter22 = false;
		public boolean TTBCounter23 = false;

		public void syncPlayerVariables(Entity entity) {
			if (entity instanceof ServerPlayer serverPlayer)
				RagemodMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> serverPlayer), new PlayerVariablesSyncMessage(this));
		}

		public Tag writeNBT() {
			CompoundTag nbt = new CompoundTag();
			nbt.put("BlockLockVar", NbtUtils.writeBlockState(BlockLockVar));
			nbt.putBoolean("TTBCounter1", TTBCounter1);
			nbt.putBoolean("TTBCounter2", TTBCounter2);
			nbt.putBoolean("TTBCounter3", TTBCounter3);
			nbt.putBoolean("TTBCounter4", TTBCounter4);
			nbt.putBoolean("TTBCounter5", TTBCounter5);
			nbt.putBoolean("TTBCounter6", TTBCounter6);
			nbt.putBoolean("TTBCounter7", TTBCounter7);
			nbt.putBoolean("TTBCounter8", TTBCounter8);
			nbt.putBoolean("TTBCounter9", TTBCounter9);
			nbt.putBoolean("TTBCounter10", TTBCounter10);
			nbt.putBoolean("TTBCounter11", TTBCounter11);
			nbt.putBoolean("TTBCounter12", TTBCounter12);
			nbt.putBoolean("TTBCounter13", TTBCounter13);
			nbt.putBoolean("TTBCounter14", TTBCounter14);
			nbt.putBoolean("TTBCounter15", TTBCounter15);
			nbt.putBoolean("TTBCounter16", TTBCounter16);
			nbt.putBoolean("TTBCounter17", TTBCounter17);
			nbt.putBoolean("TTBCounter18", TTBCounter18);
			nbt.putBoolean("TTBCounter19", TTBCounter19);
			nbt.putBoolean("TTBCounter20", TTBCounter20);
			nbt.putBoolean("TTBCounter21", TTBCounter21);
			nbt.putBoolean("TTBCounter22", TTBCounter22);
			nbt.putBoolean("TTBCounter23", TTBCounter23);
			return nbt;
		}

		public void readNBT(Tag Tag) {
			CompoundTag nbt = (CompoundTag) Tag;
			BlockLockVar = NbtUtils.readBlockState(nbt.getCompound("BlockLockVar"));
			TTBCounter1 = nbt.getBoolean("TTBCounter1");
			TTBCounter2 = nbt.getBoolean("TTBCounter2");
			TTBCounter3 = nbt.getBoolean("TTBCounter3");
			TTBCounter4 = nbt.getBoolean("TTBCounter4");
			TTBCounter5 = nbt.getBoolean("TTBCounter5");
			TTBCounter6 = nbt.getBoolean("TTBCounter6");
			TTBCounter7 = nbt.getBoolean("TTBCounter7");
			TTBCounter8 = nbt.getBoolean("TTBCounter8");
			TTBCounter9 = nbt.getBoolean("TTBCounter9");
			TTBCounter10 = nbt.getBoolean("TTBCounter10");
			TTBCounter11 = nbt.getBoolean("TTBCounter11");
			TTBCounter12 = nbt.getBoolean("TTBCounter12");
			TTBCounter13 = nbt.getBoolean("TTBCounter13");
			TTBCounter14 = nbt.getBoolean("TTBCounter14");
			TTBCounter15 = nbt.getBoolean("TTBCounter15");
			TTBCounter16 = nbt.getBoolean("TTBCounter16");
			TTBCounter17 = nbt.getBoolean("TTBCounter17");
			TTBCounter18 = nbt.getBoolean("TTBCounter18");
			TTBCounter19 = nbt.getBoolean("TTBCounter19");
			TTBCounter20 = nbt.getBoolean("TTBCounter20");
			TTBCounter21 = nbt.getBoolean("TTBCounter21");
			TTBCounter22 = nbt.getBoolean("TTBCounter22");
			TTBCounter23 = nbt.getBoolean("TTBCounter23");
		}
	}

	public static class PlayerVariablesSyncMessage {
		public PlayerVariables data;

		public PlayerVariablesSyncMessage(FriendlyByteBuf buffer) {
			this.data = new PlayerVariables();
			this.data.readNBT(buffer.readNbt());
		}

		public PlayerVariablesSyncMessage(PlayerVariables data) {
			this.data = data;
		}

		public static void buffer(PlayerVariablesSyncMessage message, FriendlyByteBuf buffer) {
			buffer.writeNbt((CompoundTag) message.data.writeNBT());
		}

		public static void handler(PlayerVariablesSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				if (!context.getDirection().getReceptionSide().isServer()) {
					PlayerVariables variables = ((PlayerVariables) Minecraft.getInstance().player.getCapability(PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new PlayerVariables()));
					variables.BlockLockVar = message.data.BlockLockVar;
					variables.TTBCounter1 = message.data.TTBCounter1;
					variables.TTBCounter2 = message.data.TTBCounter2;
					variables.TTBCounter3 = message.data.TTBCounter3;
					variables.TTBCounter4 = message.data.TTBCounter4;
					variables.TTBCounter5 = message.data.TTBCounter5;
					variables.TTBCounter6 = message.data.TTBCounter6;
					variables.TTBCounter7 = message.data.TTBCounter7;
					variables.TTBCounter8 = message.data.TTBCounter8;
					variables.TTBCounter9 = message.data.TTBCounter9;
					variables.TTBCounter10 = message.data.TTBCounter10;
					variables.TTBCounter11 = message.data.TTBCounter11;
					variables.TTBCounter12 = message.data.TTBCounter12;
					variables.TTBCounter13 = message.data.TTBCounter13;
					variables.TTBCounter14 = message.data.TTBCounter14;
					variables.TTBCounter15 = message.data.TTBCounter15;
					variables.TTBCounter16 = message.data.TTBCounter16;
					variables.TTBCounter17 = message.data.TTBCounter17;
					variables.TTBCounter18 = message.data.TTBCounter18;
					variables.TTBCounter19 = message.data.TTBCounter19;
					variables.TTBCounter20 = message.data.TTBCounter20;
					variables.TTBCounter21 = message.data.TTBCounter21;
					variables.TTBCounter22 = message.data.TTBCounter22;
					variables.TTBCounter23 = message.data.TTBCounter23;
				}
			});
			context.setPacketHandled(true);
		}
	}
}
