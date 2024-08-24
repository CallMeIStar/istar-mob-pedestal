package net.istar.mobpedestal.MobHandler;

import net.minecraft.entity.Entity;
import net.minecraft.entity.mob.*;

public enum MobType {
    SLIME,
    SKELETON,
    ZOMBIE,
    SPIDER,
    CREEPER,
    HUSK,
    STRAY,
    PHANTOM,
    WITCH,
    ENDERMAN; // Added new mob types

    public static MobType fromEntity(Entity entity) {
        if (entity instanceof SlimeEntity) {
            return SLIME;
        } else if (entity instanceof SkeletonEntity) {
            return SKELETON;
        }
        else if (entity instanceof ZombieEntity) {
            return ZOMBIE;
        }
        else if (entity instanceof SpiderEntity) {
            return SPIDER;
        }
        else if (entity instanceof CreeperEntity) {
            return CREEPER;
        }
        else if (entity instanceof HuskEntity) {
            return HUSK;
        }
        else if (entity instanceof StrayEntity) {
            return STRAY;
        }
        else if (entity instanceof PhantomEntity){
            return PHANTOM;
        }
        else if (entity instanceof WitchEntity){
            return WITCH;
        }
        else if (entity instanceof EndermanEntity){
            return ENDERMAN;
        }
        return null;
    }
}