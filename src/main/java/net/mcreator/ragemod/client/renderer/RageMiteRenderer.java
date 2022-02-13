package net.mcreator.ragemod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.SilverfishModel;

import net.mcreator.ragemod.entity.RageMiteEntity;

public class RageMiteRenderer extends MobRenderer<RageMiteEntity, SilverfishModel<RageMiteEntity>> {
	public RageMiteRenderer(EntityRendererProvider.Context context) {
		super(context, new SilverfishModel(context.bakeLayer(ModelLayers.SILVERFISH)), 0.5f);
		this.addLayer(new EyesLayer<RageMiteEntity, SilverfishModel<RageMiteEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("ragemod:textures/ragemite.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(RageMiteEntity entity) {
		return new ResourceLocation("ragemod:textures/ragemite.png");
	}
}
