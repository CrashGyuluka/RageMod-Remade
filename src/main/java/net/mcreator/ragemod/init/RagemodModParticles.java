
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ragemod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.client.event.ParticleFactoryRegisterEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;
import net.minecraft.client.particle.SpriteSet;
import net.minecraft.client.particle.ParticleProvider;
import net.minecraft.client.Minecraft;

import net.mcreator.ragemod.client.particle.YellowGlowingTreeParticleParticle;
import net.mcreator.ragemod.client.particle.ToxicParticleParticle;
import net.mcreator.ragemod.client.particle.RedGlowingTreeParticleParticle;
import net.mcreator.ragemod.client.particle.RageParticleParticle;
import net.mcreator.ragemod.client.particle.GreenGlowingTreeParticleParticle;
import net.mcreator.ragemod.client.particle.BrownGlowingTreeParticleParticle;
import net.mcreator.ragemod.client.particle.BlueCaveParticleParticle;

import java.util.function.Function;
import java.util.Map;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class RagemodModParticles {
	private static final Map<ParticleType<?>, Function<SpriteSet, ParticleProvider<SimpleParticleType>>> REGISTRY = new HashMap<>();
	public static final SimpleParticleType RAGE_PARTICLE = register(new SimpleParticleType(false).setRegistryName("rage_particle"),
			RageParticleParticle::provider);
	public static final SimpleParticleType TOXIC_PARTICLE = register(new SimpleParticleType(false).setRegistryName("toxic_particle"),
			ToxicParticleParticle::provider);
	public static final SimpleParticleType BLUE_CAVE_PARTICLE = register(new SimpleParticleType(false).setRegistryName("blue_cave_particle"),
			BlueCaveParticleParticle::provider);
	public static final SimpleParticleType YELLOW_GLOWING_TREE_PARTICLE = register(
			new SimpleParticleType(false).setRegistryName("yellow_glowing_tree_particle"), YellowGlowingTreeParticleParticle::provider);
	public static final SimpleParticleType BROWN_GLOWING_TREE_PARTICLE = register(
			new SimpleParticleType(false).setRegistryName("brown_glowing_tree_particle"), BrownGlowingTreeParticleParticle::provider);
	public static final SimpleParticleType RED_GLOWING_TREE_PARTICLE = register(
			new SimpleParticleType(false).setRegistryName("red_glowing_tree_particle"), RedGlowingTreeParticleParticle::provider);
	public static final SimpleParticleType GREEN_GLOWING_TREE_PARTICLE = register(
			new SimpleParticleType(false).setRegistryName("green_glowing_tree_particle"), GreenGlowingTreeParticleParticle::provider);

	private static SimpleParticleType register(ParticleType<?> particle, Function<SpriteSet, ParticleProvider<SimpleParticleType>> provider) {
		REGISTRY.put(particle, provider);
		return (SimpleParticleType) particle;
	}

	@SubscribeEvent
	public static void registerParticleTypes(RegistryEvent.Register<ParticleType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.keySet().toArray(new ParticleType[0]));
	}

	@SubscribeEvent
	public static void registerParticles(ParticleFactoryRegisterEvent event) {
		REGISTRY.forEach((particle, provider) -> Minecraft.getInstance().particleEngine.register((SimpleParticleType) particle,
				spriteSet -> provider.apply(spriteSet)));
	}
}
