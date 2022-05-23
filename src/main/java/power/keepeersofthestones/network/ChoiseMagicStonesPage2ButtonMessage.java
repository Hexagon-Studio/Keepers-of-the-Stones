
package power.keepeersofthestones.network;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD) public class ChoiseMagicStonesPage2ButtonMessage {

	private final int buttonID, x, y, z;

	public ChoiseMagicStonesPage2ButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public ChoiseMagicStonesPage2ButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(ChoiseMagicStonesPage2ButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(ChoiseMagicStonesPage2ButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		HashMap guistate = ChoiseMagicStonesPage2Menu.guistate;

		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;

        	    	if (buttonID == 0) {
    

    MoonGetProcedure.execute(world,entity)
;
					}
        	    	if (buttonID == 1) {
    

    AmberGetProcedure.execute(world,entity)
;
					}
        	    	if (buttonID == 2) {
    

    DestructionGetProcedure.execute(world,entity)
;
					}
        	    	if (buttonID == 3) {
    

    SpaceGetProcedure.execute(world,entity)
;
					}
        	    	if (buttonID == 4) {
    

    BloodGetProcedure.execute(world,entity)
;
					}
        	    	if (buttonID == 5) {
    

    TimeGetProcedure.execute(world,entity)
;
					}
        	    	if (buttonID == 6) {
    

    TechnologyGetProcedure.execute(world,entity)
;
					}
        	    	if (buttonID == 7) {
    

    ExplosionGetProcedure.execute(world,entity)
;
					}
        	    	if (buttonID == 8) {
    

    TeleportationGetProcedure.execute(world,entity)
;
					}
        	    	if (buttonID == 9) {
    

    CreationGetProcedure.execute(world,entity)
;
					}
        	    	if (buttonID == 10) {
    

    MistGetProcedure.execute(world,entity)
;
					}
        	    	if (buttonID == 13) {
    

    PreviousPageGUIChoiceStonesProcedure.execute(world,x,y,z,entity)
;
					}
        	    	if (buttonID == 21) {
    

    NextToPage3Procedure.execute(world,x,y,z,entity)
;
					}
	}

	@SubscribeEvent public static void registerMessage(FMLCommonSetupEvent event) {
		PowerMod.addNetworkMessage(ChoiseMagicStonesPage2ButtonMessage.class, ChoiseMagicStonesPage2ButtonMessage::buffer, ChoiseMagicStonesPage2ButtonMessage::new, ChoiseMagicStonesPage2ButtonMessage::handler);
	}

}
