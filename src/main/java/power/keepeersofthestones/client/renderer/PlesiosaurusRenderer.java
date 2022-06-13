
package power.keepeersofthestones.client.renderer;

import power.keepeersofthestones.entity.PlesiosaurusEntity;
import power.keepeersofthestones.client.model.ModelPlesiosaurus;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class PlesiosaurusRenderer extends MobRenderer<PlesiosaurusEntity, ModelPlesiosaurus<PlesiosaurusEntity>> {
	public PlesiosaurusRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelPlesiosaurus(context.bakeLayer(ModelPlesiosaurus.LAYER_LOCATION)), 1.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(PlesiosaurusEntity entity) {
		return new ResourceLocation("power:textures/entities/plesiosaurus.png");
	}
}
