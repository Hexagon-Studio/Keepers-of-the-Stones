
package power.keepeersofthestones.client.renderer;

import power.keepeersofthestones.entity.PterodactylEntity;
import power.keepeersofthestones.client.model.ModelPterodactyl;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class PterodactylRenderer extends MobRenderer<PterodactylEntity, ModelPterodactyl<PterodactylEntity>> {
	public PterodactylRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelPterodactyl(context.bakeLayer(ModelPterodactyl.LAYER_LOCATION)), 1.2f);
	}

	@Override
	public ResourceLocation getTextureLocation(PterodactylEntity entity) {
		return new ResourceLocation("power:textures/entities/pterodactyl.png");
	}
}
