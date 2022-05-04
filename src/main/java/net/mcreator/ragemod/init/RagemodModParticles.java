
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ragemod.init;

import net.mcreator.ragemod.client.particle.YellowGlowingTreeParticleParticle;
import net.mcreator.ragemod.client.particle.RedGlowingTreeParticleParticle;
import net.mcreator.ragemod.client.particle.RageParticleParticle;
import net.mcreator.ragemod.client.particle.GreenGlowingTreeParticleParticle;
import net.mcreator.ragemod.client.particle.BrownGlowingTreeParticleParticle;
import net.mcreator.ragemod.client.particle.BlueCaveParticleParticle;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class RagemodModParticles {
	@SubscribeEvent
	public static void registerParticles(ParticleFactoryRegisterEvent event) {
		Minecraft.getInstance().particleEngine.register((SimpleParticleType) RagemodModParticleTypes.RAGE_PARTICLE.get(),
				RageParticleParticle::provider);
		Minecraft.getInstance().particleEngine.register((SimpleParticleType) RagemodModParticleTypes.BLUE_CAVE_PARTICLE.get(),
				BlueCaveParticleParticle::provider);
		Minecraft.getInstance().particleEngine.register((SimpleParticleType) RagemodModParticleTypes.YELLOW_GLOWING_TREE_PARTICLE.get(),
				YellowGlowingTreeParticleParticle::provider);
		Minecraft.getInstance().particleEngine.register((SimpleParticleType) RagemodModParticleTypes.BROWN_GLOWING_TREE_PARTICLE.get(),
				BrownGlowingTreeParticleParticle::provider);
		Minecraft.getInstance().particleEngine.register((SimpleParticleType) RagemodModParticleTypes.RED_GLOWING_TREE_PARTICLE.get(),
				RedGlowingTreeParticleParticle::provider);
		Minecraft.getInstance().particleEngine.register((SimpleParticleType) RagemodModParticleTypes.GREEN_GLOWING_TREE_PARTICLE.get(),
				GreenGlowingTreeParticleParticle::provider);
	}
}
