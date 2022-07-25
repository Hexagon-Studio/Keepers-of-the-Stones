package power.keepeersofthestones.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.GameRules;
import net.minecraft.world.entity.Entity;

public class TimeStopEffectEndProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof Level _level)
			_level.getGameRules().getRule(GameRules.RULE_RANDOMTICKING).set(1, _level.getServer());
		if (world instanceof Level _level)
			_level.getGameRules().getRule(GameRules.RULE_DAYLIGHT).set((true), _level.getServer());
		{
			Entity _ent = entity;
			if (!_ent.level.isClientSide() && _ent.getServer() != null)
				_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
						"scale set pehkui:motion 1 @e");
		}
	}
}
