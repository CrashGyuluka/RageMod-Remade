
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ragemod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.ragemod.client.renderer.RageMiteRenderer;
import net.mcreator.ragemod.client.renderer.AtomRagerRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class RagemodModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(RagemodModEntities.RAGEIUM_BOW, ThrownItemRenderer::new);
		event.registerEntityRenderer(RagemodModEntities.RAGE_MITE, RageMiteRenderer::new);
		event.registerEntityRenderer(RagemodModEntities.ATOM_RAGER, AtomRagerRenderer::new);
	}
}
