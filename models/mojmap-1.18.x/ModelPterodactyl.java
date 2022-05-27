// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelPterodactyl<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "pterodactyl"), "main");
	private final ModelPart body;
	private final ModelPart wings;
	private final ModelPart head;
	private final ModelPart legs0;
	private final ModelPart legs1;
	private final ModelPart tail;
	private final ModelPart left_wing;
	private final ModelPart left_wing2;
	private final ModelPart bb_main;

	public ModelPterodactyl(ModelPart root) {
		this.body = root.getChild("body");
		this.wings = root.getChild("wings");
		this.head = root.getChild("head");
		this.legs0 = root.getChild("legs0");
		this.legs1 = root.getChild("legs1");
		this.tail = root.getChild("tail");
		this.left_wing = root.getChild("left_wing");
		this.left_wing2 = root.getChild("left_wing2");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(),
				PartPose.offset(-1.0F, 8.5F, 4.0F));

		PartDefinition body_r1 = body
				.addOrReplaceChild("body_r1",
						CubeListBuilder.create().texOffs(0, 91).addBox(-3.0F, -0.5F, -16.0F, 6.0F, 5.0F, 32.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition wings = partdefinition.addOrReplaceChild("wings", CubeListBuilder.create(),
				PartPose.offset(-1.0F, 6.5F, 5.0F));

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(),
				PartPose.offset(-1.0F, 6.9578F, -11.5664F));

		PartDefinition head_r1 = head.addOrReplaceChild("head_r1",
				CubeListBuilder.create().texOffs(32, 48).addBox(-2.5F, -5.1805F, -9.5783F, 5.0F, 5.0F, 11.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.5F, -3.5586F, 0.1309F, 0.0F, 0.0F));

		PartDefinition upper_beak = head.addOrReplaceChild("upper_beak", CubeListBuilder.create(),
				PartPose.offset(0.0F, 1.6673F, -10.4391F));

		PartDefinition upper_beak1_r1 = upper_beak.addOrReplaceChild("upper_beak1_r1",
				CubeListBuilder.create().texOffs(3, 41)
						.addBox(-1.5F, -2.2371F, -20.838F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(3, 40)
						.addBox(-2.0F, -3.2576F, -15.5712F, 4.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.1673F, 6.8805F, 0.1309F, 0.0F, 0.0F));

		PartDefinition lower_beak = head.addOrReplaceChild("lower_beak", CubeListBuilder.create(),
				PartPose.offset(0.0F, 2.1289F, -10.1981F));

		PartDefinition lower_beak1_r1 = lower_beak.addOrReplaceChild("lower_beak1_r1",
				CubeListBuilder.create().texOffs(68, 24)
						.addBox(-2.0F, -0.2813F, -8.658F, 4.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(0, 45)
						.addBox(-1.5F, -0.2813F, -20.658F, 3.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.6288F, 6.6395F, 0.1309F, 0.0F, 0.0F));

		PartDefinition crest = head.addOrReplaceChild("crest", CubeListBuilder.create(),
				PartPose.offset(0.0F, -3.3578F, -4.9336F));

		PartDefinition crest_r1 = crest.addOrReplaceChild("crest_r1",
				CubeListBuilder.create().texOffs(109, 117).addBox(-0.5F, -8.8578F, -7.625F, 1.0F, 4.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.8578F, 1.375F, 0.0873F, 0.0F, 0.0F));

		PartDefinition legs0 = partdefinition.addOrReplaceChild("legs0", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-4.0F, 14.6465F, 17.8826F, -0.1745F, 0.0F, 0.0F));

		PartDefinition leg0_r1 = legs0.addOrReplaceChild("leg0_r1",
				CubeListBuilder.create().texOffs(108, 119).addBox(-1.0F, -0.3105F, -0.8434F, 2.0F, 1.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 0.0F, 0.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition paw0 = legs0.addOrReplaceChild("paw0", CubeListBuilder.create(),
				PartPose.offset(-1.0F, 2.356F, 5.9748F));

		PartDefinition paw0_r1 = paw0.addOrReplaceChild(
				"paw0_r1", CubeListBuilder.create().texOffs(122, 125).addBox(-1.0F, -0.0341F, -0.2412F, 2.0F, 2.0F,
						1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition legs1 = partdefinition.addOrReplaceChild("legs1", CubeListBuilder.create(),
				PartPose.offsetAndRotation(3.0F, 14.6465F, 17.8826F, -0.1745F, 0.0F, 0.0F));

		PartDefinition leg1_r1 = legs1.addOrReplaceChild(
				"leg1_r1", CubeListBuilder.create().texOffs(108, 119).addBox(-1.0F, -0.3105F, -0.8434F, 2.0F, 1.0F,
						8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition paw1 = legs1.addOrReplaceChild("paw1", CubeListBuilder.create(),
				PartPose.offset(0.0F, 2.356F, 5.9748F));

		PartDefinition paw1_r1 = paw1.addOrReplaceChild(
				"paw1_r1", CubeListBuilder.create().texOffs(122, 125).addBox(-1.0F, -0.0341F, -0.2412F, 2.0F, 2.0F,
						1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition tail = partdefinition.addOrReplaceChild("tail", CubeListBuilder.create(),
				PartPose.offset(-1.0F, 8.909F, 19.9166F));

		PartDefinition tail_r1 = tail
				.addOrReplaceChild("tail_r1",
						CubeListBuilder.create().texOffs(31, 119).addBox(-1.5F, 1.8333F, -0.1819F, 3.0F, 2.0F, 4.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 2.0F, 0.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition left_wing = partdefinition.addOrReplaceChild("left_wing",
				CubeListBuilder.create().texOffs(77, 29).addBox(-1.1117F, -2.1889F, -1.2964F, 4.0F, 3.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.1117F, 6.1889F, -6.7036F, -0.2618F, 0.0F, 0.0F));

		PartDefinition left_wing_r1 = left_wing.addOrReplaceChild("left_wing_r1",
				CubeListBuilder.create().texOffs(74, 30).addBox(-1.5F, -1.0F, -1.0F, 8.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.3883F, -0.1889F, 0.7036F, 0.0F, -0.3491F, 0.0F));

		PartDefinition left_wing_r2 = left_wing.addOrReplaceChild("left_wing_r2",
				CubeListBuilder.create().texOffs(64, 22).addBox(-4.5F, -0.1F, 1.0F, 10.0F, 1.0F, 10.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.3883F, -0.1889F, 0.7036F, 0.0F, -0.1745F, 0.0F));

		PartDefinition left_wing_r3 = left_wing.addOrReplaceChild("left_wing_r3",
				CubeListBuilder.create().texOffs(63, 19)
						.addBox(1.1693F, -0.4F, -13.3825F, 8.0F, 1.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(71, 21)
						.addBox(-0.8307F, -1.0F, -11.3825F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.6087F, -0.1889F, 2.9465F, 0.0F, -1.1345F, 0.0F));

		PartDefinition left_wing_r4 = left_wing.addOrReplaceChild("left_wing_r4",
				CubeListBuilder.create().texOffs(66, 22).addBox(-4.0F, -0.5F, -5.0F, 8.0F, 1.0F, 10.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.6854F, 0.1111F, 9.1968F, 0.0F, -0.5236F, 0.0F));

		PartDefinition left_wing_r5 = left_wing.addOrReplaceChild("left_wing_r5",
				CubeListBuilder.create().texOffs(80, 31).addBox(-1.0F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(16.7916F, 0.3111F, -2.8892F, 0.0F, -0.8727F, 0.0F));

		PartDefinition left_wing_r6 = left_wing.addOrReplaceChild("left_wing_r6",
				CubeListBuilder.create().texOffs(81, 31).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(17.6979F, 0.3111F, -3.3118F, 0.0F, -1.1345F, 0.0F));

		PartDefinition left_wing_r7 = left_wing.addOrReplaceChild("left_wing_r7",
				CubeListBuilder.create().texOffs(80, 31).addBox(-1.0F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(18.6042F, 0.3111F, -3.7344F, 0.0F, -1.3963F, 0.0F));

		PartDefinition left_wing_part = left_wing.addOrReplaceChild("left_wing_part", CubeListBuilder.create(),
				PartPose.offset(22.827F, -0.1889F, 1.9566F));

		PartDefinition left_wing_part_r1 = left_wing_part.addOrReplaceChild("left_wing_part_r1",
				CubeListBuilder.create().texOffs(33, 68)
						.addBox(-44.5F, 0.0F, -3.5F, 43.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(37, 68)
						.addBox(-44.5F, 0.0F, -5.5F, 39.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(46, 69)
						.addBox(-44.5F, 0.0F, -6.5F, 31.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 67)
						.addBox(-44.5F, 0.0F, -1.5F, 47.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(42.5613F, -0.5F, 9.2469F, 0.0F, -0.1309F, 0.0F));

		PartDefinition left_wing_part_r2 = left_wing_part.addOrReplaceChild("left_wing_part_r2",
				CubeListBuilder.create().texOffs(63, 13).addBox(-1.2443F, -1.0F, -18.9409F, 2.0F, 2.0F, 19.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.5802F, 0.0F, -3.0481F, 0.0F, -1.6581F, 0.0F));

		PartDefinition left_wing_part_r3 = left_wing_part.addOrReplaceChild("left_wing_part_r3",
				CubeListBuilder.create().texOffs(57, 7).addBox(-2.0459F, -1.0F, -24.4543F, 2.0F, 2.0F, 25.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.7662F, 0.0F, -0.6383F, 0.0F, -1.789F, 0.0F));

		PartDefinition left_wing_part_r4 = left_wing_part.addOrReplaceChild("left_wing_part_r4",
				CubeListBuilder.create().texOffs(71, 21).addBox(-0.8895F, -1.0F, -9.1216F, 2.0F, 2.0F, 11.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(38.7487F, 0.0F, 4.7157F, 0.0F, -2.1817F, 0.0F));

		PartDefinition left_wing2 = partdefinition.addOrReplaceChild("left_wing2",
				CubeListBuilder.create().texOffs(78, 64).addBox(-1.1117F, -2.1889F, -1.2964F, 4.0F, 3.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.8883F, 6.1889F, -6.7036F, -2.8798F, 3.1416F, 0.0F));

		PartDefinition left_wing_r8 = left_wing2.addOrReplaceChild("left_wing_r8",
				CubeListBuilder.create().texOffs(75, 65).addBox(-1.5F, -1.0F, -1.0F, 8.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.3883F, -0.1889F, 0.7036F, 0.0F, -0.3491F, 0.0F));

		PartDefinition left_wing_r9 = left_wing2.addOrReplaceChild("left_wing_r9",
				CubeListBuilder.create().texOffs(64, 57).addBox(-4.5F, -0.1F, 1.0F, 10.0F, 1.0F, 10.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.3883F, -0.1889F, 0.7036F, 0.0F, -0.1745F, 0.0F));

		PartDefinition left_wing_r10 = left_wing2.addOrReplaceChild("left_wing_r10",
				CubeListBuilder.create().texOffs(64, 54)
						.addBox(1.1693F, -0.4F, -13.3825F, 8.0F, 1.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(72, 56)
						.addBox(-0.8307F, -1.0F, -11.3825F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.6087F, -0.1889F, 2.9465F, 0.0F, -1.1345F, 0.0F));

		PartDefinition left_wing_r11 = left_wing2.addOrReplaceChild("left_wing_r11",
				CubeListBuilder.create().texOffs(67, 57).addBox(-4.0F, -0.5F, -5.0F, 8.0F, 1.0F, 10.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.6854F, 0.1111F, 9.1968F, 0.0F, -0.5236F, 0.0F));

		PartDefinition left_wing_r12 = left_wing2.addOrReplaceChild("left_wing_r12",
				CubeListBuilder.create().texOffs(80, 31).addBox(-1.0F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(16.7916F, 0.3111F, -2.8892F, 0.0F, -0.8727F, 0.0F));

		PartDefinition left_wing_r13 = left_wing2.addOrReplaceChild("left_wing_r13",
				CubeListBuilder.create().texOffs(81, 31).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(17.6979F, 0.3111F, -3.3118F, 0.0F, -1.1345F, 0.0F));

		PartDefinition left_wing_r14 = left_wing2.addOrReplaceChild("left_wing_r14",
				CubeListBuilder.create().texOffs(80, 31).addBox(-1.0F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(18.6042F, 0.3111F, -3.7344F, 0.0F, -1.3963F, 0.0F));

		PartDefinition left_wing_part2 = left_wing2.addOrReplaceChild("left_wing_part2", CubeListBuilder.create(),
				PartPose.offset(22.827F, -0.1889F, 1.9566F));

		PartDefinition left_wing_part_r5 = left_wing_part2.addOrReplaceChild("left_wing_part_r5",
				CubeListBuilder.create().texOffs(33, 68)
						.addBox(-44.5F, 0.0F, -3.5F, 43.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(37, 68)
						.addBox(-44.5F, 0.0F, -5.5F, 39.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(46, 69)
						.addBox(-44.5F, 0.0F, -6.5F, 31.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 67)
						.addBox(-44.5F, 0.0F, -1.5F, 47.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(42.5613F, -0.5F, 9.2469F, 0.0F, -0.1309F, 0.0F));

		PartDefinition left_wing_part_r6 = left_wing_part2.addOrReplaceChild("left_wing_part_r6",
				CubeListBuilder.create().texOffs(64, 48).addBox(-1.2443F, -1.0F, -18.9409F, 2.0F, 2.0F, 19.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.5802F, 0.0F, -3.0481F, 0.0F, -1.6581F, 0.0F));

		PartDefinition left_wing_part_r7 = left_wing_part2.addOrReplaceChild("left_wing_part_r7",
				CubeListBuilder.create().texOffs(58, 42).addBox(-2.0459F, -1.0F, -24.4543F, 2.0F, 2.0F, 25.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.7662F, 0.0F, -0.6383F, 0.0F, -1.789F, 0.0F));

		PartDefinition left_wing_part_r8 = left_wing_part2.addOrReplaceChild("left_wing_part_r8",
				CubeListBuilder.create().texOffs(72, 56).addBox(-0.8895F, -1.0F, -9.1216F, 2.0F, 2.0F, 11.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(38.7487F, 0.0F, 4.7157F, 0.0F, -2.1817F, 0.0F));

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = bb_main.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(76, 30)
						.addBox(-3.5F, -0.9F, -10.5F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(76, 30)
						.addBox(-3.5F, -0.9F, 6.5F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(63, 17)
						.addBox(-3.5F, -1.9F, -8.5F, 6.0F, 2.0F, 15.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, -15.5F, 6.5F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r2 = bb_main.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(31, 119).addBox(-1.5F, -2.35F, -5.0F, 3.0F, 4.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -17.3631F, -13.1623F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r3 = bb_main.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(30, 119).addBox(-2.0F, -6.0F, 0.0F, 4.0F, 4.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -14.5F, -16.0F, -0.2618F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		wings.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legs0.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legs1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		tail.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_wing.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_wing2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
	}
}