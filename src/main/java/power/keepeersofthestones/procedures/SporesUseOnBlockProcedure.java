package power.keepeersofthestones.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class SporesUseOnBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Math.random() < 0.5) {
			world.setBlock(new BlockPos(x, y + 1, z), Blocks.BROWN_MUSHROOM.defaultBlockState(), 3);
		} else if (Math.random() >= 0.5) {
			world.setBlock(new BlockPos(x, y + 1, z), Blocks.RED_MUSHROOM.defaultBlockState(), 3);
		}
	}
}
