package net.mcreator.ragemod;

import net.minecraftforge.fml.network.PacketDistributor;
import net.minecraftforge.fml.network.NetworkEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.common.util.FakePlayer;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.common.capabilities.Capability;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Direction;
import net.minecraft.network.PacketBuffer;
import net.minecraft.nbt.NBTUtil;
import net.minecraft.nbt.INBT;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.client.Minecraft;
import net.minecraft.block.Blocks;
import net.minecraft.block.BlockState;

import java.util.function.Supplier;

public class RagemodModVariables {
	public RagemodModVariables(RagemodModElements elements) {
		elements.addNetworkMessage(PlayerVariablesSyncMessage.class, PlayerVariablesSyncMessage::buffer, PlayerVariablesSyncMessage::new,
				PlayerVariablesSyncMessage::handler);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::init);
	}

	private void init(FMLCommonSetupEvent event) {
		CapabilityManager.INSTANCE.register(PlayerVariables.class, new PlayerVariablesStorage(), PlayerVariables::new);
	}

	@CapabilityInject(PlayerVariables.class)
	public static Capability<PlayerVariables> PLAYER_VARIABLES_CAPABILITY = null;

	@SubscribeEvent
	public void onAttachCapabilities(AttachCapabilitiesEvent<Entity> event) {
		if (event.getObject() instanceof PlayerEntity && !(event.getObject() instanceof FakePlayer))
			event.addCapability(new ResourceLocation("ragemod", "player_variables"), new PlayerVariablesProvider());
	}

	private static class PlayerVariablesProvider implements ICapabilitySerializable<INBT> {
		private final LazyOptional<PlayerVariables> instance = LazyOptional.of(PLAYER_VARIABLES_CAPABILITY::getDefaultInstance);

		@Override
		public <T> LazyOptional<T> getCapability(Capability<T> cap, Direction side) {
			return cap == PLAYER_VARIABLES_CAPABILITY ? instance.cast() : LazyOptional.empty();
		}

		@Override
		public INBT serializeNBT() {
			return PLAYER_VARIABLES_CAPABILITY.getStorage().writeNBT(PLAYER_VARIABLES_CAPABILITY, this.instance.orElseThrow(RuntimeException::new),
					null);
		}

		@Override
		public void deserializeNBT(INBT nbt) {
			PLAYER_VARIABLES_CAPABILITY.getStorage().readNBT(PLAYER_VARIABLES_CAPABILITY, this.instance.orElseThrow(RuntimeException::new), null,
					nbt);
		}
	}

	private static class PlayerVariablesStorage implements Capability.IStorage<PlayerVariables> {
		@Override
		public INBT writeNBT(Capability<PlayerVariables> capability, PlayerVariables instance, Direction side) {
			CompoundNBT nbt = new CompoundNBT();
			nbt.put("BlockLockVar", NBTUtil.writeBlockState(instance.BlockLockVar));
			nbt.putBoolean("TTBCounter1", instance.TTBCounter1);
			nbt.putBoolean("TTBCounter2", instance.TTBCounter2);
			nbt.putBoolean("TTBCounter3", instance.TTBCounter3);
			nbt.putBoolean("TTBCounter4", instance.TTBCounter4);
			nbt.putBoolean("TTBCounter5", instance.TTBCounter5);
			nbt.putBoolean("TTBCounter6", instance.TTBCounter6);
			nbt.putBoolean("TTBCounter7", instance.TTBCounter7);
			nbt.putBoolean("TTBCounter8", instance.TTBCounter8);
			nbt.putBoolean("TTBCounter9", instance.TTBCounter9);
			nbt.putBoolean("TTBCounter10", instance.TTBCounter10);
			nbt.putBoolean("TTBCounter11", instance.TTBCounter11);
			nbt.putBoolean("TTBCounter12", instance.TTBCounter12);
			nbt.putBoolean("TTBCounter13", instance.TTBCounter13);
			nbt.putBoolean("TTBCounter14", instance.TTBCounter14);
			nbt.putBoolean("TTBCounter15", instance.TTBCounter15);
			nbt.putBoolean("TTBCounter16", instance.TTBCounter16);
			nbt.putBoolean("TTBCounter17", instance.TTBCounter17);
			nbt.putBoolean("TTBCounter18", instance.TTBCounter18);
			nbt.putBoolean("TTBCounter19", instance.TTBCounter19);
			nbt.putBoolean("TTBCounter20", instance.TTBCounter20);
			nbt.putBoolean("TTBCounter21", instance.TTBCounter21);
			nbt.putBoolean("TTBCounter22", instance.TTBCounter22);
			nbt.putBoolean("TTBCounter23", instance.TTBCounter23);
			return nbt;
		}

		@Override
		public void readNBT(Capability<PlayerVariables> capability, PlayerVariables instance, Direction side, INBT inbt) {
			CompoundNBT nbt = (CompoundNBT) inbt;
			instance.BlockLockVar = NBTUtil.readBlockState(nbt.getCompound("BlockLockVar"));
			instance.TTBCounter1 = nbt.getBoolean("TTBCounter1");
			instance.TTBCounter2 = nbt.getBoolean("TTBCounter2");
			instance.TTBCounter3 = nbt.getBoolean("TTBCounter3");
			instance.TTBCounter4 = nbt.getBoolean("TTBCounter4");
			instance.TTBCounter5 = nbt.getBoolean("TTBCounter5");
			instance.TTBCounter6 = nbt.getBoolean("TTBCounter6");
			instance.TTBCounter7 = nbt.getBoolean("TTBCounter7");
			instance.TTBCounter8 = nbt.getBoolean("TTBCounter8");
			instance.TTBCounter9 = nbt.getBoolean("TTBCounter9");
			instance.TTBCounter10 = nbt.getBoolean("TTBCounter10");
			instance.TTBCounter11 = nbt.getBoolean("TTBCounter11");
			instance.TTBCounter12 = nbt.getBoolean("TTBCounter12");
			instance.TTBCounter13 = nbt.getBoolean("TTBCounter13");
			instance.TTBCounter14 = nbt.getBoolean("TTBCounter14");
			instance.TTBCounter15 = nbt.getBoolean("TTBCounter15");
			instance.TTBCounter16 = nbt.getBoolean("TTBCounter16");
			instance.TTBCounter17 = nbt.getBoolean("TTBCounter17");
			instance.TTBCounter18 = nbt.getBoolean("TTBCounter18");
			instance.TTBCounter19 = nbt.getBoolean("TTBCounter19");
			instance.TTBCounter20 = nbt.getBoolean("TTBCounter20");
			instance.TTBCounter21 = nbt.getBoolean("TTBCounter21");
			instance.TTBCounter22 = nbt.getBoolean("TTBCounter22");
			instance.TTBCounter23 = nbt.getBoolean("TTBCounter23");
		}
	}

	public static class PlayerVariables {
		public BlockState BlockLockVar = Blocks.AIR.getDefaultState();
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
			if (entity instanceof ServerPlayerEntity)
				RagemodMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayerEntity) entity),
						new PlayerVariablesSyncMessage(this));
		}
	}

	@SubscribeEvent
	public void onPlayerLoggedInSyncPlayerVariables(PlayerEvent.PlayerLoggedInEvent event) {
		if (!event.getPlayer().world.isRemote())
			((PlayerVariables) event.getPlayer().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()))
					.syncPlayerVariables(event.getPlayer());
	}

	@SubscribeEvent
	public void onPlayerRespawnedSyncPlayerVariables(PlayerEvent.PlayerRespawnEvent event) {
		if (!event.getPlayer().world.isRemote())
			((PlayerVariables) event.getPlayer().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()))
					.syncPlayerVariables(event.getPlayer());
	}

	@SubscribeEvent
	public void onPlayerChangedDimensionSyncPlayerVariables(PlayerEvent.PlayerChangedDimensionEvent event) {
		if (!event.getPlayer().world.isRemote())
			((PlayerVariables) event.getPlayer().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()))
					.syncPlayerVariables(event.getPlayer());
	}

	@SubscribeEvent
	public void clonePlayer(PlayerEvent.Clone event) {
		PlayerVariables original = ((PlayerVariables) event.getOriginal().getCapability(PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new PlayerVariables()));
		PlayerVariables clone = ((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
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

	public static class PlayerVariablesSyncMessage {
		public PlayerVariables data;

		public PlayerVariablesSyncMessage(PacketBuffer buffer) {
			this.data = new PlayerVariables();
			new PlayerVariablesStorage().readNBT(null, this.data, null, buffer.readCompoundTag());
		}

		public PlayerVariablesSyncMessage(PlayerVariables data) {
			this.data = data;
		}

		public static void buffer(PlayerVariablesSyncMessage message, PacketBuffer buffer) {
			buffer.writeCompoundTag((CompoundNBT) new PlayerVariablesStorage().writeNBT(null, message.data, null));
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
