
package power.keepeersofthestones.command;

import org.checkerframework.checker.units.qual.s;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.common.util.FakePlayerFactory;

import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.Direction;
import net.minecraft.commands.Commands;

import java.util.Objects;
import java.util.HashMap;
import java.util.Arrays;

import com.mojang.brigadier.arguments.StringArgumentType;

@Mod.EventBusSubscriber
public class OnEarthCommand {
	@SubscribeEvent
	public static void registerCommand(RegisterCommandsEvent event) {
		event.getDispatcher().register(Commands.literal("onearth").requires(s -> s.hasPermission(1))
				.then(Commands.argument("arguments", StringArgumentType.greedyString()).executes(cmdargs -> {
					ServerLevel world = cmdargs.getSource().getLevel();
					double x = cmdargs.getSource().getPosition().x();
					double y = cmdargs.getSource().getPosition().y();
					double z = cmdargs.getSource().getPosition().z();
					Entity entity = cmdargs.getSource().getEntity();
					Direction direction = Objects.requireNonNull(entity).getDirection();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);
					HashMap<String, String> cmdparams = new HashMap<>();
					int[] index = {-1};
					Arrays.stream(cmdargs.getInput().split("\\s+")).forEach(param -> {
						if (index[0] >= 0)
							cmdparams.put(Integer.toString(index[0]), param);
						index[0]++;
					});
					return 0;
				})));
	}
}
