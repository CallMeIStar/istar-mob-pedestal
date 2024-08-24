package net.istar.mobpedestal.ManageTotem;

import net.istar.mobpedestal.MobHandler.MobType;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MobPedestalTracker {

    private static final Map<MobType, Map<Integer, Set<BlockPos>>> PEDSTAL_POSITIONS = new HashMap<>();

    public static void addTotem(MobType mobType, BlockPos pos, int radius) {
        PEDSTAL_POSITIONS
                .computeIfAbsent(mobType, k -> new HashMap<>())
                .computeIfAbsent(radius, k -> new HashSet<>())
                .add(pos);
        System.out.println("Added totem for mobType " + mobType + " at " + pos + " with radius " + radius);
    }

    public static void removeTotem(MobType mobType, BlockPos pos, int radius) {
        Map<Integer, Set<BlockPos>> tierMap = PEDSTAL_POSITIONS.get(mobType);
        if (tierMap != null) {
            Set<BlockPos> positions = tierMap.get(radius);
            if (positions != null) {
                positions.remove(pos);
                if (positions.isEmpty()) {
                    tierMap.remove(radius);
                }
                if (tierMap.isEmpty()) {
                    PEDSTAL_POSITIONS.remove(mobType);
                }
            }
        }
        System.out.println("Removed totem for mobType " + mobType + " at " + pos + " with radius " + radius);
    }

    public static boolean isNearTotem(MobType mobType, BlockPos pos) {
        Map<Integer, Set<BlockPos>> tierMap = PEDSTAL_POSITIONS.get(mobType);
        if (tierMap != null) {
            for (Map.Entry<Integer, Set<BlockPos>> entry : tierMap.entrySet()) {
                int radius = entry.getKey();
                Set<BlockPos> positions = entry.getValue();
                for (BlockPos totemPos : positions) {
                    double distanceSquared = totemPos.getSquaredDistance(pos.getX(), pos.getY(), pos.getZ());
                    double radiusSquared = radius * radius;
                    if (distanceSquared <= radiusSquared) {
                        System.out.println("Position " + pos + " is within radius of totem at " + totemPos + " with radius " + radius);
                        return true;
                    }
                }
            }
        } else {
            System.out.println("MobType " + mobType + " is not recognized or has no associated totems.");
        }
        System.out.println("Position " + pos + " is not within radius of any totem for mobType " + mobType);
        return false;
    }
    public static void printTotemMap() {
        System.out.println("Current Totem Map:");
        for (Map.Entry<MobType, Map<Integer, Set<BlockPos>>> entry : PEDSTAL_POSITIONS.entrySet()) {
            System.out.println("MobType: " + entry.getKey());
            for (Map.Entry<Integer, Set<BlockPos>> radiusEntry : entry.getValue().entrySet()) {
                System.out.println("  Radius: " + radiusEntry.getKey());
                for (BlockPos pos : radiusEntry.getValue()) {
                    System.out.println("    Position: " + pos);
                }
            }
        }
    }
}