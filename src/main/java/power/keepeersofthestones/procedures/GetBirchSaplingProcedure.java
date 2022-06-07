package power.keepeersofthestones.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

public class GetBirchSaplingProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		world.setBlock(new BlockPos(x, y + 1, z), Blocks.BIRCH_SAPLING.defaultBlockState(), 3);
		if (entity instanceof Player _player)
			_player.closeContainer();
	}
}
