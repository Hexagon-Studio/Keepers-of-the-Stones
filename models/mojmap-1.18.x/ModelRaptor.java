// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelRaptor<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "raptor"), "main");
	private final ModelPart body;
	private final ModelPart legs0;
	private final ModelPart legs1;
	private final ModelPart head;
	private final ModelPart arms;
	private final ModelPart tail2;

	public ModelRaptor(ModelPart root) {
		this.body = root.getChild("body");
		this.legs0 = root.getChild("legs0");
		this.legs1 = root.getChild("legs1");
		this.head = root.getChild("head");
		this.arms = root.getChild("arms");
		this.tail2 = root.getChild("tail2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 12.6944F, 1.0304F, 0.0873F, 0.0F, 0.0F));

		PartDefinition body0_r1 = body
				.addOrReplaceChild("body0_r1",
						CubeListBuilder.create().texOffs(5, 31).addBox(-4.5F, -3.5F, -2.5F, 9.0F, 7.0F, 5.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition body1 = body.addOrReplaceChild("body1", CubeListBuilder.create(),
				PartPose.offset(0.0F, -0.7433F, -6.9428F));

		PartDefinition body1_r1 = body1
				.addOrReplaceChild("body1_r1",
						CubeListBuilder.create().texOffs(4, 4).addBox(-4.5F, -3.5F, -4.5F, 9.0F, 7.0F, 9.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition legs0 = partdefinition.addOrReplaceChild("legs0",
				CubeListBuilder.create().texOffs(63, 73)
						.addBox(-1.0F, 11.5694F, -3.7756F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(67, 70)
						.addBox(-1.0F, 8.9694F, -1.7756F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(4.5F, 11.4306F, 2.0256F));

		PartDefinition thigh0_r1 = legs0.addOrReplaceChild("thigh0_r1",
				CubeListBuilder.create().texOffs(10, 55).addBox(-1.5F, -1.0304F, -1.1527F, 3.0F, 6.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.3957F, -0.5104F, -0.1745F, 0.0F, 0.0F));

		PartDefinition knee0_r1 = legs0.addOrReplaceChild("knee0_r1",
				CubeListBuilder.create().texOffs(67, 74).addBox(-1.0F, -0.0076F, -1.1743F, 2.0F, 4.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 5.0656F, -0.9384F, 0.0873F, 0.0F, 0.0F));

		PartDefinition legs1 = partdefinition.addOrReplaceChild("legs1",
				CubeListBuilder.create().texOffs(63, 73)
						.addBox(-1.0F, 11.5107F, -3.7774F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(67, 70)
						.addBox(-1.0F, 8.9107F, -1.7774F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-4.5F, 11.4893F, 2.0274F));

		PartDefinition knee1_r1 = legs1.addOrReplaceChild("knee1_r1",
				CubeListBuilder.create().texOffs(67, 71).addBox(-1.0F, -0.0076F, -1.1743F, 2.0F, 4.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 5.0069F, -0.9403F, 0.0873F, 0.0F, 0.0F));

		PartDefinition thigh1_r1 = legs1.addOrReplaceChild("thigh1_r1",
				CubeListBuilder.create().texOffs(10, 55).addBox(-1.5F, -1.0304F, -1.1527F, 3.0F, 6.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.5716F, -0.5049F, -0.1745F, 0.0F, 0.0F));

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(56, 51)
				.addBox(-2.5F, -7.0F, -11.5F, 5.0F, 4.0F, 9.0F, new CubeDeformation(0.02F)),
				PartPose.offset(0.0F, 9.5F, -9.1F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create().texOffs(60, 72).addBox(-2.0F, -0.5F,
				-7.0F, 4.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -2.5F, -3.4F));

		PartDefinition neck1 = head.addOrReplaceChild("neck1", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.2567F, 0.0702F, -0.2182F, 0.0F, 0.0F));

		PartDefinition neck1_r1 = neck1.addOrReplaceChild("neck1_r1",
				CubeListBuilder.create().texOffs(53, 33).addBox(-2.5F, -0.7929F, -7.5355F, 5.0F, 3.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.496F, 0.3981F, -0.7854F, 0.0F, 0.0F));

		PartDefinition arms = partdefinition.addOrReplaceChild("arms", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-0.1F, 14.5188F, -10.6673F, -0.4363F, 0.0F, 0.0F));

		PartDefinition forearm2_r1 = arms.addOrReplaceChild("forearm2_r1",
				CubeListBuilder.create().texOffs(122, 0)
						.addBox(-1.0F, -2.0F, -0.5F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(122, 0)
						.addBox(4.0F, -2.0F, -0.5F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.5F, 0.0F, 0.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition paw1 = arms.addOrReplaceChild("paw1", CubeListBuilder.create(),
				PartPose.offset(0.0F, 2.6494F, 0.5662F));

		PartDefinition paw2_r1 = paw1.addOrReplaceChild("paw2_r1",
				CubeListBuilder.create().texOffs(118, 124).addBox(-1.0F, -0.2283F, -0.4155F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.5F, -0.5F, -1.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition paw1_r1 = paw1.addOrReplaceChild("paw1_r1",
				CubeListBuilder.create().texOffs(118, 124).addBox(-1.0F, -0.2283F, -0.4155F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5F, -0.5F, -1.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition tail2 = partdefinition.addOrReplaceChild("tail2", CubeListBuilder.create(),
				PartPose.offset(0.0F, 10.6809F, 3.6662F));

		PartDefinition tail2_r1 = tail2.addOrReplaceChild("tail2_r1",
				CubeListBuilder.create().texOffs(34, 43).addBox(-1.5F, -0.8412F, -0.4494F, 3.0F, 2.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.0038F, 0.4459F, 0.0436F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(40, 18).addBox(-0.5F,
				-0.5F, -1.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -0.6123F, 8.1548F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legs0.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legs1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		arms.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		tail2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.legs0.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.legs1.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}