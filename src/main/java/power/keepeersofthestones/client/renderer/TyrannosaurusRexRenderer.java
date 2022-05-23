package power.keepeersofthestones.client.renderer;

import power.keepeersofthestones.entity.TyrannosaurusRexEntity;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

public class TyrannosaurusRexRenderer extends HumanoidMobRenderer<TyrannosaurusRexEntity, HumanoidModel<TyrannosaurusRexEntity>> {
	public TyrannosaurusRexRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)),
				new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR))));
	}

	@Override
	public ResourceLocation getTextureLocation(TyrannosaurusRexEntity entity) {
		return new ResourceLocation("power:textures/tyrannosaurus_rex.png");
	}
}
