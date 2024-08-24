package net.istar.mobpedestal.MobHandler;

import net.fabricmc.fabric.api.event.lifecycle.v1.ServerEntityEvents;
import net.istar.mobpedestal.ManageTotem.MobPedestalTracker;
import net.istar.mobpedestal.blocks.pedestalblocks.MobPedestalBlockEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.mob.SlimeEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;

import java.util.List;
import java.util.function.Predicate;


public class MobPedestalHandler {

    public static void register() {
        ServerEntityEvents.ENTITY_LOAD.register(MobPedestalHandler::onEntityLoad);
    }

    private static void onEntityLoad(Entity entity, ServerWorld world) {
        if (entity instanceof MobEntity) {
            BlockPos spawnPos = entity.getBlockPos();
            MobType mobType = MobType.fromEntity(entity);

            if (mobType != null) {
                System.out.println("Detected mobType " + mobType + " at position " + spawnPos);
                if (MobPedestalTracker.isNearTotem(mobType, spawnPos)) {
                    System.out.println("Preventing spawn for " + mobType + " at " + spawnPos);
                    entity.discard();
                }
            } else {
                System.out.println("Unrecognized mob type for entity at position " + spawnPos);
            }
        }
    }
}