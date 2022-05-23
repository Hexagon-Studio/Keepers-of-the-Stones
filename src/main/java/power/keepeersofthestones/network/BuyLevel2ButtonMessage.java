
package power.keepeersofthestones.network;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD) public class BuyLevel2ButtonMessage {

	private final int buttonID, x, y, z;

	public BuyLevel2ButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public BuyLevel2ButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(BuyLevel2ButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(BuyLevel2ButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			Player entity = context.getSender();
			int buttonID = message.buttonID;
			int x = message.x;
			int y = message.y;
			int z = message.z;

			handleButtonAction(entity, buttonID, x, y, z);
		});
		context.setPacketHandled(true);
	}

	public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
		Level world = entity.level;
		HashMap guistate = BuyLevel2Menu.guistate;

		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;

        	    	if (buttonID == 0) {
    

    UpdateToLevel2Procedure.execute(world,x,y,z,entity)
;
					}
	}

	@SubscribeEvent public static void registerMessage(FMLCommonSetupEvent event) {
		PowerMod.addNetworkMessage(BuyLevel2ButtonMessage.class, BuyLevel2ButtonMessage::buffer, BuyLevel2ButtonMessage::new, BuyLevel2ButtonMessage::handler);
	}

}
