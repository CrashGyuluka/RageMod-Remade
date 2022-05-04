
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ragemod.init;

import net.mcreator.ragemod.RagemodMod;

public class RagemodModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, RagemodMod.MODID);
	public static final RegistryObject<ParticleType<?>> RAGE_PARTICLE = REGISTRY.register("rage_particle", () -> new SimpleParticleType(false));
	public static final RegistryObject<ParticleType<?>> BLUE_CAVE_PARTICLE = REGISTRY.register("blue_cave_particle",
			() -> new SimpleParticleType(false));
	public static final RegistryObject<ParticleType<?>> YELLOW_GLOWING_TREE_PARTICLE = REGISTRY.register("yellow_glowing_tree_particle",
			() -> new SimpleParticleType(false));
	public static final RegistryObject<ParticleType<?>> BROWN_GLOWING_TREE_PARTICLE = REGISTRY.register("brown_glowing_tree_particle",
			() -> new SimpleParticleType(false));
	public static final RegistryObject<ParticleType<?>> RED_GLOWING_TREE_PARTICLE = REGISTRY.register("red_glowing_tree_particle",
			() -> new SimpleParticleType(false));
	public static final RegistryObject<ParticleType<?>> GREEN_GLOWING_TREE_PARTICLE = REGISTRY.register("green_glowing_tree_particle",
			() -> new SimpleParticleType(false));
}
