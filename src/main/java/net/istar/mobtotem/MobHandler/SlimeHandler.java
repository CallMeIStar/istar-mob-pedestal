package net.istar.mobtotem.MobHandler;

import net.fabricmc.fabric.api.event.lifecycle.v1.ServerEntityEvents;
import net.istar.mobtotem.ManageTotem.SlimeTotemTracker;
import net.istar.mobtotem.blocks.ModBlocks;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.mob.SlimeEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.List;

public class SlimeHandler {
    private static final int RADIUS = 64;

    public static void register() {
        ServerEntityEvents.ENTITY_LOAD.register(SlimeHandler::onEntityLoad);
    }

    private static void onEntityLoad(Entity entity, ServerWorld world) {
        if (entity instanceof SlimeEntity) {
            BlockPos spawnPos = entity.getBlockPos();
            if (SlimeTotemTracker.isNearTotem(spawnPos, RADIUS)) {
                entity.discard();
            }
        }
    }
}