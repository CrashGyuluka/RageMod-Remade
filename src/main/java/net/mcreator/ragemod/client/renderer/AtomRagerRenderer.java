
package net.mcreator.ragemod.client.renderer;

import net.mcreator.ragemod.entity.AtomRagerEntity;

public class AtomRagerRenderer extends MobRenderer<AtomRagerEntity, CreeperModel<AtomRagerEntity>> {
	public AtomRagerRenderer(EntityRendererProvider.Context context) {
		super(context, new CreeperModel(context.bakeLayer(ModelLayers.CREEPER)), 0.5f);
		this.addLayer(new EyesLayer<AtomRagerEntity, CreeperModel<AtomRagerEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("ragemod:textures/atomrager.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(AtomRagerEntity entity) {
		return new ResourceLocation("ragemod:textures/atomrager.png");
	}
}
