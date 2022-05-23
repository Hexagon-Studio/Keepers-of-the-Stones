
package power.keepeersofthestones.client.gui;


public class BuyLevel2Screen extends AbstractContainerScreen<BuyLevel2Menu> {

	private final Level world;
	private final int x, y, z;
	private final Player entity;


	public BuyLevel2Screen(BuyLevel2Menu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 400;
		this.imageHeight = 166;
	}


	private static final ResourceLocation texture = new ResourceLocation("power:textures/buy_level_2.png" );

	@Override public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);

	}

	@Override protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();

		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

				
					RenderSystem.setShaderTexture(0, new ResourceLocation("power:textures/elemental_coin.png"));
					this.blit(ms, this.leftPos + 172, this.topPos + 34, 0, 0,
						-1, -1,
						-1, -1);
				

		RenderSystem.disableBlend();
	}

	@Override public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}


		return super.keyPressed(key, b, c);
	}

	@Override public void containerTick() {
		super.containerTick();
	}

	@Override protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		    	this.font.draw(poseStack, "To buy, put the required number of coins in the slot (4)",
					46, 7, -12829636);
	}

	@Override public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
	}

	@Override public void init() {
		super.init();

		this.minecraft.keyboardHandler.setSendRepeatsToGui(true);

				this.addRenderableWidget(new Button(this.leftPos + 217, this.topPos + 34,
					40, 20, new TextComponent("Buy"), e -> {
							if (        true
) {
								PowerMod.PACKET_HANDLER.sendToServer(new BuyLevel2ButtonMessage(0, x, y, z));
								BuyLevel2ButtonMessage.handleButtonAction(entity, 0, x, y, z);
							}
					}
				)
);
	}

}
