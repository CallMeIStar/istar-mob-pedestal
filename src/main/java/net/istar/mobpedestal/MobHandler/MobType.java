package net.istar.mobpedestal.MobHandler;

import net.minecraft.entity.Entity;
import net.minecraft.entity.mob.*;

public enum MobType {
    DROWNED,
    ZOMBIFIED_PIGLIN,
    BLAZE,
    GUARDIAN,
    HOGLIN,
    WITHER_SKELETON,
    GHAST,
    SLIME,
    SKELETON,
    ZOMBIE,
    SPIDER,
    CREEPER,
    HUSK,
    STRAY,
    PHANTOM,
    WITCH,
    ENDERMAN,
    MAGMA_CUBE;

    public static MobType fromEntity(Entity entity) {
        if (entity instanceof DrownedEntity) {
            return DROWNED;
        }
        else if (entity instanceof ZombifiedPiglinEntity) {
            return ZOMBIFIED_PIGLIN;
        }
        else if (entity instanceof BlazeEntity) {
            return BLAZE;
        }
        else if (entity instanceof GuardianEntity) {
            return GUARDIAN;
        }
        else if (entity instanceof HoglinEntity) {
            return HOGLIN;
        }
        else if (entity instanceof MagmaCubeEntity) {
            return MAGMA_CUBE;
        }
        else if (entity instanceof WitherSkeletonEntity) {
            return WITHER_SKELETON;
        }
        else if (entity instanceof GhastEntity) {
            return GHAST;
        }
        else if (entity instanceof HuskEntity) {
            return HUSK;
        }
        else if (entity instanceof SkeletonEntity) {
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
        else if (entity instanceof SlimeEntity) {
            return SLIME;
        }

        return null;
    }
}