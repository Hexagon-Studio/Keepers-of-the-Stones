
package power.keepeersofthestones.client.renderer;

import power.keepeersofthestones.entity.RaptorEntity;
import power.keepeersofthestones.client.model.ModelRaptor;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class RaptorRenderer extends MobRenderer<RaptorEntity, ModelRaptor<RaptorEntity>> {
	public RaptorRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelRaptor(context.bakeLayer(ModelRaptor.LAYER_LOCATION)), 1.2f);
	}

	@Override
	public ResourceLocation getTextureLocation(RaptorEntity entity) {
		return new ResourceLocation("power:textures/entities/raptor.png");
	}
}
