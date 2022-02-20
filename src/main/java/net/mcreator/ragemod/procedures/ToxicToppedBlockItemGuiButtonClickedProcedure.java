package net.mcreator.ragemod.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

import net.mcreator.ragemod.init.RagemodModBlocks;

import java.util.function.Supplier;
import java.util.Map;

public class ToxicToppedBlockItemGuiButtonClickedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get()instanceof Map _slots) {
			ItemStack _setstack = new ItemStack(RagemodModBlocks.TOXIC_TOPPED_STONE);
			_setstack.setCount(1);
			((Slot) _slots.get(0)).set(_setstack);
			_player.containerMenu.broadcastChanges();
		}
		if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get()instanceof Map _slots) {
			ItemStack _setstack = new ItemStack(RagemodModBlocks.TOXIC_TOPPED_NETHERRACK);
			_setstack.setCount(1);
			((Slot) _slots.get(1)).set(_setstack);
			_player.containerMenu.broadcastChanges();
		}
		if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get()instanceof Map _slots) {
			ItemStack _setstack = new ItemStack(RagemodModBlocks.TOXIC_TOPPED_ENDSTONE);
			_setstack.setCount(1);
			((Slot) _slots.get(2)).set(_setstack);
			_player.containerMenu.broadcastChanges();
		}
		if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get()instanceof Map _slots) {
			ItemStack _setstack = new ItemStack(RagemodModBlocks.TOXIC_TOPPED_DIRT);
			_setstack.setCount(1);
			((Slot) _slots.get(3)).set(_setstack);
			_player.containerMenu.broadcastChanges();
		}
		if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get()instanceof Map _slots) {
			ItemStack _setstack = new ItemStack(RagemodModBlocks.TOXIC_TOPPED_OAK_LOG);
			_setstack.setCount(1);
			((Slot) _slots.get(4)).set(_setstack);
			_player.containerMenu.broadcastChanges();
		}
		if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get()instanceof Map _slots) {
			ItemStack _setstack = new ItemStack(RagemodModBlocks.TOXIC_TOPPED_OAK_PLANKS);
			_setstack.setCount(1);
			((Slot) _slots.get(5)).set(_setstack);
			_player.containerMenu.broadcastChanges();
		}
		if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get()instanceof Map _slots) {
			ItemStack _setstack = new ItemStack(RagemodModBlocks.TOXIC_TOPPED_ANDESITE);
			_setstack.setCount(1);
			((Slot) _slots.get(6)).set(_setstack);
			_player.containerMenu.broadcastChanges();
		}
		if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get()instanceof Map _slots) {
			ItemStack _setstack = new ItemStack(RagemodModBlocks.TOXIC_TOPPED_DIORITE);
			_setstack.setCount(1);
			((Slot) _slots.get(7)).set(_setstack);
			_player.containerMenu.broadcastChanges();
		}
		if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get()instanceof Map _slots) {
			ItemStack _setstack = new ItemStack(RagemodModBlocks.TOXIC_TOPPED_GRANITE);
			_setstack.setCount(1);
			((Slot) _slots.get(8)).set(_setstack);
			_player.containerMenu.broadcastChanges();
		}
		if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get()instanceof Map _slots) {
			ItemStack _setstack = new ItemStack(RagemodModBlocks.TOXIC_TOPPED_BONE_BLOCK);
			_setstack.setCount(1);
			((Slot) _slots.get(9)).set(_setstack);
			_player.containerMenu.broadcastChanges();
		}
		if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get()instanceof Map _slots) {
			ItemStack _setstack = new ItemStack(RagemodModBlocks.TOXIC_TOPPED_BRICKS);
			_setstack.setCount(1);
			((Slot) _slots.get(10)).set(_setstack);
			_player.containerMenu.broadcastChanges();
		}
		if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get()instanceof Map _slots) {
			ItemStack _setstack = new ItemStack(RagemodModBlocks.TOXIC_TOPPED_STONE_BRICKS);
			_setstack.setCount(1);
			((Slot) _slots.get(11)).set(_setstack);
			_player.containerMenu.broadcastChanges();
		}
		if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get()instanceof Map _slots) {
			ItemStack _setstack = new ItemStack(RagemodModBlocks.TOXIC_TOPPED_ANCIENT_DEBRIS);
			_setstack.setCount(1);
			((Slot) _slots.get(12)).set(_setstack);
			_player.containerMenu.broadcastChanges();
		}
		if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get()instanceof Map _slots) {
			ItemStack _setstack = new ItemStack(RagemodModBlocks.TOXIC_TOPPED_BASALT);
			_setstack.setCount(1);
			((Slot) _slots.get(13)).set(_setstack);
			_player.containerMenu.broadcastChanges();
		}
		if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get()instanceof Map _slots) {
			ItemStack _setstack = new ItemStack(RagemodModBlocks.TOXIC_TOPPED_COBBLESTONE);
			_setstack.setCount(1);
			((Slot) _slots.get(14)).set(_setstack);
			_player.containerMenu.broadcastChanges();
		}
		if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get()instanceof Map _slots) {
			ItemStack _setstack = new ItemStack(RagemodModBlocks.TOXIC_TOPPED_GRAVEL);
			_setstack.setCount(1);
			((Slot) _slots.get(15)).set(_setstack);
			_player.containerMenu.broadcastChanges();
		}
		if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get()instanceof Map _slots) {
			ItemStack _setstack = new ItemStack(RagemodModBlocks.TOXIC_TOPPED_BLACKSTONE);
			_setstack.setCount(1);
			((Slot) _slots.get(16)).set(_setstack);
			_player.containerMenu.broadcastChanges();
		}
		if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get()instanceof Map _slots) {
			ItemStack _setstack = new ItemStack(RagemodModBlocks.TOXIC_TOPPED_SAND);
			_setstack.setCount(1);
			((Slot) _slots.get(17)).set(_setstack);
			_player.containerMenu.broadcastChanges();
		}
		if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get()instanceof Map _slots) {
			ItemStack _setstack = new ItemStack(RagemodModBlocks.TOXIC_TOPPED_RED_SAND);
			_setstack.setCount(1);
			((Slot) _slots.get(18)).set(_setstack);
			_player.containerMenu.broadcastChanges();
		}
		if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get()instanceof Map _slots) {
			ItemStack _setstack = new ItemStack(RagemodModBlocks.TOXIC_TOPPED_OBSIDIAN);
			_setstack.setCount(1);
			((Slot) _slots.get(19)).set(_setstack);
			_player.containerMenu.broadcastChanges();
		}
		if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get()instanceof Map _slots) {
			ItemStack _setstack = new ItemStack(RagemodModBlocks.TOXIC_TOPPED_RAGEIUM_ORE);
			_setstack.setCount(1);
			((Slot) _slots.get(20)).set(_setstack);
			_player.containerMenu.broadcastChanges();
		}
		if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get()instanceof Map _slots) {
			ItemStack _setstack = new ItemStack(RagemodModBlocks.TOXIC_TOPPED_RAGEIUM_BLOCK);
			_setstack.setCount(1);
			((Slot) _slots.get(21)).set(_setstack);
			_player.containerMenu.broadcastChanges();
		}
		if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get()instanceof Map _slots) {
			ItemStack _setstack = new ItemStack(RagemodModBlocks.TOXIC_TOPPED_RAGEIUM_ALLOY_BLOCK);
			_setstack.setCount(1);
			((Slot) _slots.get(22)).set(_setstack);
			_player.containerMenu.broadcastChanges();
		}
	}
}
