// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modeltyrannosaurus_rex<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "tyrannosaurus_rex"), "main");
	private final ModelPart body;
	private final ModelPart thigh1;
	private final ModelPart head;
	private final ModelPart thigh2;
	private final ModelPart scallop;

	public Modeltyrannosaurus_rex(ModelPart root) {
		this.body = root.getChild("body");
		this.thigh1 = root.getChild("thigh1");
		this.head = root.getChild("head");
		this.thigh2 = root.getChild("thigh2");
		this.scallop = root.getChild("scallop");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition
				.addOrReplaceChild("body",
						CubeListBuilder.create().texOffs(0, 26).addBox(-5.0F, -10.5F, -13.0F, 10.0F, 15.0F, 10.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, -1.5F, 6.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition shoulder = body.addOrReplaceChild("shoulder", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-4.5F, -6.5F, -21.0F, 9.0F, 13.0F, 13.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -0.4F, -5.0F));

		PartDefinition neck1 = shoulder.addOrReplaceChild("neck1",
				CubeListBuilder.create().texOffs(3, 26).addBox(-3.5F, -5.0F, -5.0F, 7.0F, 8.0F, 10.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.3836F, -25.0237F, -0.2182F, 0.0F, 0.0F));

		PartDefinition neck2 = neck1.addOrReplaceChild("neck2", CubeListBuilder.create().texOffs(55, 68).addBox(-2.5F,
				-0.8F, -2.75F, 5.0F, 3.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 3.5F, -2.0F));

		PartDefinition arm0 = shoulder.addOrReplaceChild("arm0", CubeListBuilder.create(),
				PartPose.offset(-3.5F, 6.4F, -20.0F));

		PartDefinition forearm0 = arm0
				.addOrReplaceChild("forearm0",
						CubeListBuilder.create().texOffs(0, 26).addBox(-0.9F, -2.0F, 0.0F, 2.0F, 6.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(1.0F, 1.0F, 0.0F, -0.4363F, 0.0F, 0.0F));

		PartDefinition paw0 = forearm0.addOrReplaceChild("paw0", CubeListBuilder.create().texOffs(0, 27).addBox(-0.9F,
				-1.5F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 4.5F, 2.0F));

		PartDefinition arm1 = shoulder.addOrReplaceChild("arm1", CubeListBuilder.create(),
				PartPose.offset(3.5F, 6.4F, -20.0F));

		PartDefinition forearm1 = arm1
				.addOrReplaceChild("forearm1",
						CubeListBuilder.create().texOffs(0, 26).addBox(-1.1F, -1.0F, 0.0F, 2.0F, 6.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.4363F, 0.0F, 0.0F));

		PartDefinition paw1 = forearm1.addOrReplaceChild("paw1", CubeListBuilder.create().texOffs(0, 27).addBox(-1.1F,
				-0.5F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 4.5F, 2.0F));

		PartDefinition tail0 = body.addOrReplaceChild("tail0", CubeListBuilder.create().texOffs(4, 29).addBox(-4.5F,
				-8.3F, -2.0F, 9.0F, 14.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -2.0F, -1.0F));

		PartDefinition tail1 = tail0.addOrReplaceChild("tail1", CubeListBuilder.create(),
				PartPose.offset(0.0F, -1.0F, 14.0F));

		PartDefinition tail2 = tail1.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(27, 38).addBox(-2.5F,
				-3.5F, -6.5F, 5.0F, 7.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -3.4F, -2.5F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(34, 14).addBox(-1.5F,
				-2.7F, 0.0F, 3.0F, 5.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.4F, 6.5F));

		PartDefinition thigh1 = partdefinition.addOrReplaceChild("thigh1", CubeListBuilder.create().texOffs(6, 27)
				.addBox(0.0F, -5.0F, -4.0F, 5.0F, 14.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offset(4.0F, 3.0F, -4.0F));

		PartDefinition knee1 = thigh1.addOrReplaceChild("knee1", CubeListBuilder.create().texOffs(58, 67).addBox(-2.0F,
				-2.0F, -3.0F, 4.0F, 5.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(2.5F, 8.0F, 0.0F));

		PartDefinition shin1 = knee1.addOrReplaceChild("shin1", CubeListBuilder.create().texOffs(67, 70).addBox(-1.5F,
				0.0F, -1.5F, 3.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 3.0F, 5.5F));

		PartDefinition feet1 = shin1.addOrReplaceChild("feet1",
				CubeListBuilder.create().texOffs(52, 70)
						.addBox(-3.5F, 0.0F, -7.0F, 7.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 125)
						.addBox(2.0F, 1.0F, -9.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 125)
						.addBox(-3.0F, 1.0F, -9.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 125)
						.addBox(-0.5F, 1.0F, -9.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 8.0F, -0.5F));

		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(56, 51).addBox(-4.0F, -5.0F, -3.5F, 8.0F, 10.0F, 7.0F,
						new CubeDeformation(0.02F)),
				PartPose.offsetAndRotation(0.0F, -10.35F, -25.6F, 0.0873F, 0.0F, 0.0F));

		PartDefinition upper_jaw0 = head.addOrReplaceChild("upper_jaw0", CubeListBuilder.create().texOffs(31, 0)
				.addBox(-3.5F, -5.95F, -3.1F, 7.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 1.95F, -3.4F));

		PartDefinition upper_jaw1 = upper_jaw0.addOrReplaceChild("upper_jaw1",
				CubeListBuilder.create().texOffs(75, 28)
						.addBox(-3.5F, -1.5F, -6.1F, 7.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(124, 0)
						.addBox(-3.4F, 3.35F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(124, 0)
						.addBox(-3.4F, 3.35F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(124, 0)
						.addBox(-3.4F, 3.35F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(124, 0)
						.addBox(2.4F, 3.35F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(124, 0)
						.addBox(2.4F, 3.35F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(124, 0)
						.addBox(2.4F, 3.35F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(124, 0)
						.addBox(0.5F, 3.35F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(124, 0)
						.addBox(-1.5F, 3.35F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -3.45F, -3.0F));

		PartDefinition lower_jaw = head.addOrReplaceChild("lower_jaw",
				CubeListBuilder.create().texOffs(23, 70)
						.addBox(-3.5F, 0.05F, -8.6F, 7.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(124, 0)
						.addBox(-3.4F, -0.9F, -8.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(124, 0)
						.addBox(-1.5F, -0.9F, -8.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(124, 0)
						.addBox(0.5F, -0.9F, -8.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(124, 0)
						.addBox(2.4F, -0.9F, -8.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(124, 0)
						.addBox(2.4F, -0.9F, -6.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(124, 0)
						.addBox(-3.4F, -0.9F, -6.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.95F, -3.4F, 0.3491F, 0.0F, 0.0F));

		PartDefinition thigh2 = partdefinition.addOrReplaceChild("thigh2", CubeListBuilder.create().texOffs(6, 27)
				.addBox(0.0F, -5.0F, -4.0F, 5.0F, 14.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-9.0F, 3.0F, -4.0F));

		PartDefinition knee2 = thigh2.addOrReplaceChild("knee2", CubeListBuilder.create().texOffs(58, 67).addBox(-2.0F,
				-2.0F, -3.0F, 4.0F, 5.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(2.5F, 8.0F, 0.0F));

		PartDefinition shin2 = knee2.addOrReplaceChild("shin2", CubeListBuilder.create().texOffs(67, 70).addBox(-1.5F,
				0.0F, -1.5F, 3.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 3.0F, 5.5F));

		PartDefinition feet2 = shin2.addOrReplaceChild("feet2",
				CubeListBuilder.create().texOffs(51, 70)
						.addBox(-3.5F, 0.0F, -7.0F, 7.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 125)
						.addBox(2.0F, 1.0F, -9.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 125)
						.addBox(-3.0F, 1.0F, -9.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 125)
						.addBox(-0.5F, 1.0F, -9.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 8.0F, -0.5F));

		PartDefinition scallop = partdefinition.addOrReplaceChild("scallop",
				CubeListBuilder.create().texOffs(120, 123).addBox(-1.0F, -0.5F, -0.5F, 3.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, -16.5F, -29.5F, -0.5236F, 0.0F, 0.0F));

		PartDefinition scallop1 = scallop
				.addOrReplaceChild("scallop1",
						CubeListBuilder.create().texOffs(122, 124).addBox(-0.5F, -1.5F, -0.5F, 2.0F, 3.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(2.5F, 0.0F, 2.0F, -0.3491F, 0.0F, 0.0F));

		PartDefinition scallop2 = scallop.addOrReplaceChild("scallop2",
				CubeListBuilder.create().texOffs(122, 124).addBox(-0.5F, -1.5F, -0.5F, 2.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.5F, 0.0F, 2.0F, -0.3491F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		thigh1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		thigh2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		scallop.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.thigh2.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.thigh1.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}