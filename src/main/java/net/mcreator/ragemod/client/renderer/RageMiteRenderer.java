
package net.mcreator.ragemod.client.renderer;

import net.mcreator.ragemod.entity.RageMiteEntity;

public class RageMiteRenderer extends MobRenderer<RageMiteEntity, SilverfishModel<RageMiteEntity>> {
	public RageMiteRenderer(EntityRendererProvider.Context context) {
		super(context, new SilverfishModel(context.bakeLayer(ModelLayers.SILVERFISH)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(RageMiteEntity entity) {
		return new ResourceLocation("ragemod:textures/ragemite.png");
	}
}
