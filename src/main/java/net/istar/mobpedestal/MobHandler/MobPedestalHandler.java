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
            MobEntity mobEntity = (MobEntity) entity;
            BlockPos spawnPos = entity.getBlockPos();
            MobType mobType = MobType.fromEntity(mobEntity);

            if (mobEntity.isPersistent() || mobEntity.hasVehicle()) {
                return;  // Skip processing if the entity is named, has passengers, or is in a vehicle
            }

            if (mobType != null && MobPedestalTracker.isNearTotem(mobType, spawnPos)) {
                // Do not discard if the entity should not be discarded based on custom conditions
                // Optionally, add additional logic for persistence if needed
                entity.discard();
            }
            }
        }
    }