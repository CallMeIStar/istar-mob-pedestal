package net.istar.mobpedestal.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.istar.mobpedestal.IStarsMobPedestal;
import net.istar.mobpedestal.MobHandler.MobType;
import net.istar.mobpedestal.blocks.pedestalblocks.MobPedestalBlockEntity;
import net.minecraft.block.Block;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlockEntities {
    public static final BlockEntityType<MobPedestalBlockEntity> MOB_PEDESTAL_BLOCK_ENTITY =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(IStarsMobPedestal.MOD_ID, "mob_pedestal_block_entity"),
                    FabricBlockEntityTypeBuilder.create(
                            (pos, state) -> {
                                Block block = state.getBlock();

                                // Slime Pedestals
                                if (block == ModBlocks.GOLDEN_SLIME_PEDESTAL) {
                                    return new MobPedestalBlockEntity(pos, state, MobType.SLIME, 24);
                                } else if (block == ModBlocks.DIAMOND_SLIME_PEDESTAL) {
                                    return new MobPedestalBlockEntity(pos, state, MobType.SLIME, 64);
                                } else if (block == ModBlocks.NETHERITE_SLIME_PEDESTAL) {
                                    return new MobPedestalBlockEntity(pos, state, MobType.SLIME, 128);
                                }

                                // Skeleton Pedestals
                                else if (block == ModBlocks.GOLDEN_SKELETON_PEDESTAL) {
                                    return new MobPedestalBlockEntity(pos, state, MobType.SKELETON, 24);
                                } else if (block == ModBlocks.DIAMOND_SKELETON_PEDESTAL) {
                                    return new MobPedestalBlockEntity(pos, state, MobType.SKELETON, 64);
                                } else if (block == ModBlocks.NETHERITE_SKELETON_PEDESTAL) {
                                    return new MobPedestalBlockEntity(pos, state, MobType.SKELETON, 128);
                                }

                                // Husk Pedestals
                                else if (block == ModBlocks.GOLDEN_HUSK_PEDESTAL) {
                                    return new MobPedestalBlockEntity(pos, state, MobType.HUSK, 24);
                                } else if (block == ModBlocks.DIAMOND_HUSK_PEDESTAL) {
                                    return new MobPedestalBlockEntity(pos, state, MobType.HUSK, 64);
                                } else if (block == ModBlocks.NETHERITE_HUSK_PEDESTAL) {
                                    return new MobPedestalBlockEntity(pos, state, MobType.HUSK, 128);
                                }

                                // Creeper Pedestals
                                else if (block == ModBlocks.GOLDEN_CREEPER_PEDESTAL) {
                                    return new MobPedestalBlockEntity(pos, state, MobType.CREEPER, 24);
                                } else if (block == ModBlocks.DIAMOND_CREEPER_PEDESTAL) {
                                    return new MobPedestalBlockEntity(pos, state, MobType.CREEPER, 64);
                                } else if (block == ModBlocks.NETHERITE_CREEPER_PEDESTAL) {
                                    return new MobPedestalBlockEntity(pos, state, MobType.CREEPER, 128);
                                }

                                // Zombie Pedestals
                                else if (block == ModBlocks.GOLDEN_ZOMBIE_PEDESTAL) {
                                    return new MobPedestalBlockEntity(pos, state, MobType.ZOMBIE, 24);
                                } else if (block == ModBlocks.DIAMOND_ZOMBIE_PEDESTAL) {
                                    return new MobPedestalBlockEntity(pos, state, MobType.ZOMBIE, 64);
                                } else if (block == ModBlocks.NETHERITE_ZOMBIE_PEDESTAL) {
                                    return new MobPedestalBlockEntity(pos, state, MobType.ZOMBIE, 128);
                                }

                                // Spider Pedestals
                                else if (block == ModBlocks.GOLDEN_SPIDER_PEDESTAL) {
                                    return new MobPedestalBlockEntity(pos, state, MobType.SPIDER, 24);
                                } else if (block == ModBlocks.DIAMOND_SPIDER_PEDESTAL) {
                                    return new MobPedestalBlockEntity(pos, state, MobType.SPIDER, 64);
                                } else if (block == ModBlocks.NETHERITE_SPIDER_PEDESTAL) {
                                    return new MobPedestalBlockEntity(pos, state, MobType.SPIDER, 128);
                                }

                                // Stray Pedestals
                                else if (block == ModBlocks.GOLDEN_STRAY_PEDESTAL) {
                                    return new MobPedestalBlockEntity(pos, state, MobType.STRAY, 24);
                                } else if (block == ModBlocks.DIAMOND_STRAY_PEDESTAL) {
                                    return new MobPedestalBlockEntity(pos, state, MobType.STRAY, 64);
                                } else if (block == ModBlocks.NETHERITE_STRAY_PEDESTAL) {
                                    return new MobPedestalBlockEntity(pos, state, MobType.STRAY, 128);
                                }

                                // Phantom Pedestals
                                else if (block == ModBlocks.GOLDEN_PHANTOM_PEDESTAL) {
                                    return new MobPedestalBlockEntity(pos, state, MobType.PHANTOM, 24);
                                } else if (block == ModBlocks.DIAMOND_PHANTOM_PEDESTAL) {
                                    return new MobPedestalBlockEntity(pos, state, MobType.PHANTOM, 64);
                                } else if (block == ModBlocks.NETHERITE_PHANTOM_PEDESTAL) {
                                    return new MobPedestalBlockEntity(pos, state, MobType.PHANTOM, 128);
                                }

                                return null;  // Should not happen, add a fallback or throw an exception if needed.
                            },
                            ModBlocks.GOLDEN_SLIME_PEDESTAL,
                            ModBlocks.DIAMOND_SLIME_PEDESTAL,
                            ModBlocks.NETHERITE_SLIME_PEDESTAL,
                            ModBlocks.GOLDEN_SKELETON_PEDESTAL,
                            ModBlocks.DIAMOND_SKELETON_PEDESTAL,
                            ModBlocks.NETHERITE_SKELETON_PEDESTAL,
                            ModBlocks.GOLDEN_HUSK_PEDESTAL,
                            ModBlocks.DIAMOND_HUSK_PEDESTAL,
                            ModBlocks.NETHERITE_HUSK_PEDESTAL,
                            ModBlocks.GOLDEN_CREEPER_PEDESTAL,
                            ModBlocks.DIAMOND_CREEPER_PEDESTAL,
                            ModBlocks.NETHERITE_CREEPER_PEDESTAL,
                            ModBlocks.GOLDEN_ZOMBIE_PEDESTAL,
                            ModBlocks.DIAMOND_ZOMBIE_PEDESTAL,
                            ModBlocks.NETHERITE_ZOMBIE_PEDESTAL,
                            ModBlocks.GOLDEN_SPIDER_PEDESTAL,
                            ModBlocks.DIAMOND_SPIDER_PEDESTAL,
                            ModBlocks.NETHERITE_SPIDER_PEDESTAL,
                            ModBlocks.GOLDEN_STRAY_PEDESTAL,
                            ModBlocks.DIAMOND_STRAY_PEDESTAL,
                            ModBlocks.NETHERITE_STRAY_PEDESTAL,
                            ModBlocks.GOLDEN_PHANTOM_PEDESTAL,
                            ModBlocks.DIAMOND_PHANTOM_PEDESTAL,
                            ModBlocks.NETHERITE_PHANTOM_PEDESTAL,
                            ModBlocks.GOLDEN_PHANTOM_PEDESTAL,
                            ModBlocks.DIAMOND_WITCH_PEDESTAL,
                            ModBlocks.NETHERITE_WITCH_PEDESTAL,
                            ModBlocks.GOLDEN_ENDERMAN_PEDESTAL,
                            ModBlocks.DIAMOND_ENDERMAN_PEDESTAL,
                            ModBlocks.NETHERITE_ENDERMAN_PEDESTAL
                    ).build());


    public static void registerBlockEntities() {
        IStarsMobPedestal.LOGGER.info("Registering Block Entities for " + IStarsMobPedestal.MOD_ID);
    }
}