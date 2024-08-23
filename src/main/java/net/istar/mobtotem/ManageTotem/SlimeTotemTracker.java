package net.istar.mobtotem.ManageTotem;

import net.minecraft.util.math.BlockPos;

import java.util.HashSet;
import java.util.Set;

public class SlimeTotemTracker {

    private static final Set<BlockPos> SLIME_TOTEM_POSITIONS = new HashSet<>();

    public static void addTotem(BlockPos pos) {
        SLIME_TOTEM_POSITIONS.add(pos);
    }

    public static void removeTotem(BlockPos pos) {
        SLIME_TOTEM_POSITIONS.remove(pos);
    }

    public static boolean isNearTotem(BlockPos pos, int radius) {
        return SLIME_TOTEM_POSITIONS.stream().anyMatch(totemPos -> totemPos.isWithinDistance(pos, radius));
    }
}