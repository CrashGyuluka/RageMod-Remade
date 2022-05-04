
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ragemod.init;

import net.mcreator.ragemod.client.renderer.RageMiteRenderer;
import net.mcreator.ragemod.client.renderer.AtomRagerRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class RagemodModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(RagemodModEntities.RAGEIUM_BOW.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(RagemodModEntities.RAGE_MITE.get(), RageMiteRenderer::new);
		event.registerEntityRenderer(RagemodModEntities.ATOM_RAGER.get(), AtomRagerRenderer::new);
	}
}
