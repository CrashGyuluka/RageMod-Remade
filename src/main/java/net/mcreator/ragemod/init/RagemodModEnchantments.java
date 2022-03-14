
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ragemod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;

import net.mcreator.ragemod.enchantment.TosserEnchantmentEnchantment;
import net.mcreator.ragemod.enchantment.LifeStealerEnchantment;
import net.mcreator.ragemod.enchantment.ColliderEnchantment;
import net.mcreator.ragemod.enchantment.BlockLockEnchantment;
import net.mcreator.ragemod.RagemodMod;

public class RagemodModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, RagemodMod.MODID);
	public static final RegistryObject<Enchantment> TOSSER_ENCHANTMENT = REGISTRY.register("tosser_enchantment",
			() -> new TosserEnchantmentEnchantment());
	public static final RegistryObject<Enchantment> LIFE_STEALER = REGISTRY.register("life_stealer", () -> new LifeStealerEnchantment());
	public static final RegistryObject<Enchantment> COLLIDER = REGISTRY.register("collider", () -> new ColliderEnchantment());
	public static final RegistryObject<Enchantment> BLOCK_LOCK = REGISTRY.register("block_lock", () -> new BlockLockEnchantment());
}
