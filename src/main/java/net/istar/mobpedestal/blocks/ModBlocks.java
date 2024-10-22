package net.istar.mobpedestal.blocks;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.istar.mobpedestal.IStarsMobPedestal;
import net.istar.mobpedestal.MobHandler.MobType;
import net.istar.mobpedestal.blocks.pedestalblocks.*;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block GOLDEN_DROWNED_PEDESTAL = registerBlock(
            "golden_drowned_pedestal",
            new MobPedestalBlock(
                    FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)
                            .nonOpaque()
                            .notSolid()
                            .luminance(MobPedestalBlock::getLuminance),
                    MobType.DROWNED, 28 // Mob type and radius for the golden pedestal
            )
    );

    public static final Block DIAMOND_DROWNED_PEDESTAL = registerBlock(
            "diamond_drowned_pedestal",
            new MobPedestalBlock(
                    FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)
                            .nonOpaque()
                            .notSolid()
                            .luminance(MobPedestalBlock::getLuminance),
                    MobType.DROWNED, 64 // Mob type and radius for the diamond pedestal
            )
    );

    public static final Block NETHERITE_DROWNED_PEDESTAL = registerBlock(
            "netherite_drowned_pedestal",
            new MobPedestalBlock(
                    FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)
                            .nonOpaque()
                            .notSolid()
                            .luminance(MobPedestalBlock::getLuminance),
                    MobType.DROWNED, 128 // Mob type and radius for the netherite pedestal
            )
    );

    public static final Block GOLDEN_ZOMBIFIED_PIGLIN_PEDESTAL = registerBlock(
            "golden_zombified_piglin_pedestal",
            new MobPedestalBlock(
                    FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)
                            .nonOpaque()
                            .notSolid()
                            .luminance(MobPedestalBlock::getLuminance),
                    MobType.ZOMBIFIED_PIGLIN, 28 // Mob type and radius for the golden pedestal
            )
    );

    public static final Block DIAMOND_ZOMBIFIED_PIGLIN_PEDESTAL = registerBlock(
            "diamond_zombified_piglin_pedestal",
            new MobPedestalBlock(
                    FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)
                            .nonOpaque()
                            .notSolid()
                            .luminance(MobPedestalBlock::getLuminance),
                    MobType.ZOMBIFIED_PIGLIN, 64 // Mob type and radius for the diamond pedestal
            )
    );

    public static final Block NETHERITE_ZOMBIFIED_PIGLIN_PEDESTAL = registerBlock(
            "netherite_zombified_piglin_pedestal",
            new MobPedestalBlock(
                    FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)
                            .nonOpaque()
                            .notSolid()
                            .luminance(MobPedestalBlock::getLuminance),
                    MobType.ZOMBIFIED_PIGLIN, 128 // Mob type and radius for the netherite pedestal
            )
    );

    public static final Block GOLDEN_BLAZE_PEDESTAL = registerBlock(
            "golden_blaze_pedestal",
            new MobPedestalBlock(
                    FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)
                            .nonOpaque()
                            .notSolid()
                            .luminance(MobPedestalBlock::getLuminance),
                    MobType.BLAZE, 28 // Mob type and radius for the golden pedestal
            )
    );

    public static final Block DIAMOND_BLAZE_PEDESTAL = registerBlock(
            "diamond_blaze_pedestal",
            new MobPedestalBlock(
                    FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)
                            .nonOpaque()
                            .notSolid()
                            .luminance(MobPedestalBlock::getLuminance),
                    MobType.BLAZE, 64 // Mob type and radius for the diamond pedestal
            )
    );

    public static final Block NETHERITE_BLAZE_PEDESTAL = registerBlock(
            "netherite_blaze_pedestal",
            new MobPedestalBlock(
                    FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)
                            .nonOpaque()
                            .notSolid()
                            .luminance(MobPedestalBlock::getLuminance),
                    MobType.BLAZE, 128 // Mob type and radius for the netherite pedestal
            )
    );

    public static final Block GOLDEN_GUARDIAN_PEDESTAL = registerBlock(
            "golden_guardian_pedestal",
            new MobPedestalBlock(
                    FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)
                            .nonOpaque()
                            .notSolid()
                            .luminance(MobPedestalBlock::getLuminance),
                    MobType.GUARDIAN, 28 // Mob type and radius for the golden pedestal
            )
    );

    public static final Block DIAMOND_GUARDIAN_PEDESTAL = registerBlock(
            "diamond_guardian_pedestal",
            new MobPedestalBlock(
                    FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)
                            .nonOpaque()
                            .notSolid()
                            .luminance(MobPedestalBlock::getLuminance),
                    MobType.GUARDIAN, 64 // Mob type and radius for the diamond pedestal
            )
    );

    public static final Block NETHERITE_GUARDIAN_PEDESTAL = registerBlock(
            "netherite_guardian_pedestal",
            new MobPedestalBlock(
                    FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)
                            .nonOpaque()
                            .notSolid()
                            .luminance(MobPedestalBlock::getLuminance),
                    MobType.GUARDIAN, 128 // Mob type and radius for the netherite pedestal
            )
    );

    public static final Block GOLDEN_HOGLIN_PEDESTAL = registerBlock(
            "golden_hoglin_pedestal",
            new MobPedestalBlock(
                    FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)
                            .nonOpaque()
                            .notSolid()
                            .luminance(MobPedestalBlock::getLuminance),
                    MobType.HOGLIN, 28 // Mob type and radius for the golden pedestal
            )
    );

    public static final Block DIAMOND_HOGLIN_PEDESTAL = registerBlock(
            "diamond_hoglin_pedestal",
            new MobPedestalBlock(
                    FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)
                            .nonOpaque()
                            .notSolid()
                            .luminance(MobPedestalBlock::getLuminance),
                    MobType.HOGLIN, 64 // Mob type and radius for the diamond pedestal
            )
    );

    public static final Block NETHERITE_HOGLIN_PEDESTAL = registerBlock(
            "netherite_hoglin_pedestal",
            new MobPedestalBlock(
                    FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)
                            .nonOpaque()
                            .notSolid()
                            .luminance(MobPedestalBlock::getLuminance),
                    MobType.HOGLIN, 128 // Mob type and radius for the netherite pedestal
            )
    );


    public static final Block GOLDEN_WITHER_SKELETON_PEDESTAL = registerBlock(
            "golden_wither_skeleton_pedestal",
            new MobPedestalBlock(
                    FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)
                            .nonOpaque()
                            .notSolid()
                            .luminance(MobPedestalBlock::getLuminance),
                    MobType.WITHER_SKELETON, 28 // Mob type and radius for the golden pedestal
            )
    );

    public static final Block DIAMOND_WITHER_SKELETON_PEDESTAL = registerBlock(
            "diamond_wither_skeleton_pedestal",
            new MobPedestalBlock(
                    FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)
                            .nonOpaque()
                            .notSolid()
                            .luminance(MobPedestalBlock::getLuminance),
                    MobType.WITHER_SKELETON, 64 // Mob type and radius for the diamond pedestal
            )
    );

    public static final Block NETHERITE_WITHER_SKELETON_PEDESTAL = registerBlock(
            "netherite_wither_skeleton_pedestal",
            new MobPedestalBlock(
                    FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)
                            .nonOpaque()
                            .notSolid()
                            .luminance(MobPedestalBlock::getLuminance),
                    MobType.WITHER_SKELETON, 128 // Mob type and radius for the netherite pedestal
            )
    );

    public static final Block GOLDEN_GHAST_PEDESTAL = registerBlock(
            "golden_ghast_pedestal",
            new MobPedestalBlock(
                    FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)
                            .nonOpaque()
                            .notSolid()
                            .luminance(MobPedestalBlock::getLuminance),
                    MobType.GHAST, 28 // Mob type and radius for the golden pedestal
            )
    );

    public static final Block DIAMOND_GHAST_PEDESTAL = registerBlock(
            "diamond_ghast_pedestal",
            new MobPedestalBlock(
                    FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)
                            .nonOpaque()
                            .notSolid()
                            .luminance(MobPedestalBlock::getLuminance),
                    MobType.GHAST, 64 // Mob type and radius for the diamond pedestal
            )
    );

    public static final Block NETHERITE_GHAST_PEDESTAL = registerBlock(
            "netherite_ghast_pedestal",
            new MobPedestalBlock(
                    FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)
                            .nonOpaque()
                            .notSolid()
                            .luminance(MobPedestalBlock::getLuminance),
                    MobType.GHAST, 128 // Mob type and radius for the netherite pedestal
            )
    );

    public static final Block GOLDEN_MAGMA_CUBE_PEDESTAL = registerBlock(
            "golden_magma_cube_pedestal",
            new MobPedestalBlock(
                    FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)
                            .nonOpaque()
                            .notSolid()
                            .luminance(MobPedestalBlock::getLuminance),
                    MobType.MAGMA_CUBE, 28 // Mob type and radius for the golden pedestal
            )
    );


    public static final Block DIAMOND_MAGMA_CUBE_PEDESTAL = registerBlock(
            "diamond_magma_cube_pedestal",
            new MobPedestalBlock(
                    FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)
                            .nonOpaque()
                            .notSolid()
                            .luminance(MobPedestalBlock::getLuminance),
                    MobType.MAGMA_CUBE, 64 // Mob type and radius for the diamond pedestal
            )
    );


    public static final Block NETHERITE_MAGMA_CUBE_PEDESTAL = registerBlock(
            "netherite_magma_cube_pedestal",
            new MobPedestalBlock(
                    FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)
                            .nonOpaque()
                            .notSolid()
                            .luminance(MobPedestalBlock::getLuminance),
                    MobType.MAGMA_CUBE, 128 // Mob type and radius for the netherite pedestal
            )
    );

    public static final Block GOLDEN_SLIME_PEDESTAL = registerBlock(
            "golden_slime_pedestal",
            new MobPedestalBlock(
                    FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)
                            .nonOpaque()
                            .notSolid()
                            .luminance(MobPedestalBlock::getLuminance),
                    MobType.SLIME, 28 // Mob type and radius for the golden pedestal
            )
    );


    public static final Block DIAMOND_SLIME_PEDESTAL = registerBlock(
            "diamond_slime_pedestal",
            new MobPedestalBlock(
                    FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)
                            .nonOpaque()
                            .notSolid()
                            .luminance(MobPedestalBlock::getLuminance),
                    MobType.SLIME, 64 // Mob type and radius for the diamond pedestal
            )
    );


    public static final Block NETHERITE_SLIME_PEDESTAL = registerBlock(
            "netherite_slime_pedestal",
            new MobPedestalBlock(
                    FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)
                            .nonOpaque()
                            .notSolid()
                            .luminance(MobPedestalBlock::getLuminance),
                    MobType.SLIME, 128 // Mob type and radius for the netherite pedestal
            )
    );


    public static final Block GOLDEN_SKELETON_PEDESTAL = registerBlock(
            "golden_skeleton_pedestal",
            new MobPedestalBlock(
                    FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)
                            .nonOpaque()
                            .notSolid()
                            .luminance(MobPedestalBlock::getLuminance),
                    MobType.SKELETON, 28 // Mob type and radius for the golden pedestal
            )
    );


    public static final Block DIAMOND_SKELETON_PEDESTAL = registerBlock(
            "diamond_skeleton_pedestal",
            new MobPedestalBlock(
                    FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)
                            .nonOpaque()
                            .notSolid()
                            .luminance(MobPedestalBlock::getLuminance),
                    MobType.SKELETON, 64 // Mob type and radius for the diamond pedestal
            )
    );


    public static final Block NETHERITE_SKELETON_PEDESTAL = registerBlock(
            "netherite_skeleton_pedestal",
            new MobPedestalBlock(
                    FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)
                            .nonOpaque()
                            .notSolid()
                            .luminance(MobPedestalBlock::getLuminance),
                    MobType.SKELETON, 128 // Mob type and radius for the netherite pedestal
            )
    );


    public static final Block GOLDEN_HUSK_PEDESTAL = registerBlock(
            "golden_husk_pedestal",
            new MobPedestalBlock(
                    FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)
                            .nonOpaque()
                            .notSolid()
                            .luminance(MobPedestalBlock::getLuminance),
                    MobType.HUSK, 28 // Mob type and radius for the golden pedestal
            )
    );


    public static final Block DIAMOND_HUSK_PEDESTAL = registerBlock(
            "diamond_husk_pedestal",
            new MobPedestalBlock(
                    FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)
                            .nonOpaque()
                            .notSolid()
                            .luminance(MobPedestalBlock::getLuminance),
                    MobType.HUSK, 64 // Mob type and radius for the diamond pedestal
            )
    );


    public static final Block NETHERITE_HUSK_PEDESTAL = registerBlock(
            "netherite_husk_pedestal",
            new MobPedestalBlock(
                    FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)
                            .nonOpaque()
                            .notSolid()
                            .luminance(MobPedestalBlock::getLuminance),
                    MobType.HUSK, 128 // Mob type and radius for the netherite pedestal
            )
    );


    public static final Block GOLDEN_CREEPER_PEDESTAL = registerBlock(
            "golden_creeper_pedestal",
            new MobPedestalBlock(
                    FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)
                            .nonOpaque()
                            .notSolid()
                            .luminance(MobPedestalBlock::getLuminance),
                    MobType.CREEPER, 28 // Mob type and radius for the golden pedestal
            )
    );


    public static final Block DIAMOND_CREEPER_PEDESTAL = registerBlock(
            "diamond_creeper_pedestal",
            new MobPedestalBlock(
                    FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)
                            .nonOpaque()
                            .notSolid()
                            .luminance(MobPedestalBlock::getLuminance),
                    MobType.CREEPER, 64 // Mob type and radius for the diamond pedestal
            )
    );


    public static final Block NETHERITE_CREEPER_PEDESTAL = registerBlock(
            "netherite_creeper_pedestal",
            new MobPedestalBlock(
                    FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)
                            .nonOpaque()
                            .notSolid()
                            .luminance(MobPedestalBlock::getLuminance),
                    MobType.CREEPER, 128 // Mob type and radius for the netherite pedestal
            )
    );


    public static final Block GOLDEN_SPIDER_PEDESTAL = registerBlock(
            "golden_spider_pedestal",
            new MobPedestalBlock(
                    FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)
                            .nonOpaque()
                            .notSolid()
                            .luminance(MobPedestalBlock::getLuminance),
                    MobType.SPIDER, 28 // Mob type and radius for the golden pedestal
            )
    );


    public static final Block DIAMOND_SPIDER_PEDESTAL = registerBlock(
            "diamond_spider_pedestal",
            new MobPedestalBlock(
                    FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)
                            .nonOpaque()
                            .notSolid()
                            .luminance(MobPedestalBlock::getLuminance),
                    MobType.SPIDER, 64 // Mob type and radius for the diamond pedestal
            )
    );


    public static final Block NETHERITE_SPIDER_PEDESTAL = registerBlock(
            "netherite_spider_pedestal",
            new MobPedestalBlock(
                    FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)
                            .nonOpaque()
                            .notSolid()
                            .luminance(MobPedestalBlock::getLuminance),
                    MobType.SPIDER, 128 // Mob type and radius for the netherite pedestal
            )
    );


    public static final Block GOLDEN_STRAY_PEDESTAL = registerBlock(
            "golden_stray_pedestal",
            new MobPedestalBlock(
                    FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)
                            .nonOpaque()
                            .notSolid()
                            .luminance(MobPedestalBlock::getLuminance),
                    MobType.STRAY, 28 // Mob type and radius for the golden pedestal
            )
    );


    public static final Block DIAMOND_STRAY_PEDESTAL = registerBlock(
            "diamond_stray_pedestal",
            new MobPedestalBlock(
                    FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)
                            .nonOpaque()
                            .notSolid()
                            .luminance(MobPedestalBlock::getLuminance),
                    MobType.STRAY, 64 // Mob type and radius for the diamond pedestal
            )
    );


    public static final Block NETHERITE_STRAY_PEDESTAL = registerBlock(
            "netherite_stray_pedestal",
            new MobPedestalBlock(
                    FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)
                            .nonOpaque()
                            .notSolid()
                            .luminance(MobPedestalBlock::getLuminance),
                    MobType.STRAY, 128 // Mob type and radius for the netherite pedestal
            )
    );


    public static final Block GOLDEN_ZOMBIE_PEDESTAL = registerBlock(
            "golden_zombie_pedestal",
            new MobPedestalBlock(
                    FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)
                            .nonOpaque()
                            .notSolid()
                            .luminance(MobPedestalBlock::getLuminance),
                    MobType.ZOMBIE, 28 // Mob type and radius for the golden pedestal
            )
    );


    public static final Block DIAMOND_ZOMBIE_PEDESTAL = registerBlock(
            "diamond_zombie_pedestal",
            new MobPedestalBlock(
                    FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)
                            .nonOpaque()
                            .notSolid()
                            .luminance(MobPedestalBlock::getLuminance),
                    MobType.ZOMBIE, 64 // Mob type and radius for the diamond pedestal
            )
    );


    public static final Block NETHERITE_ZOMBIE_PEDESTAL = registerBlock(
            "netherite_zombie_pedestal",
            new MobPedestalBlock(
                    FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)
                            .nonOpaque()
                            .notSolid()
                            .luminance(MobPedestalBlock::getLuminance),
                    MobType.ZOMBIE, 128 // Mob type and radius for the netherite pedestal
            )
    );


    public static final Block GOLDEN_PHANTOM_PEDESTAL = registerBlock(
            "golden_phantom_pedestal",
            new MobPedestalBlock(
                    FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)
                            .nonOpaque()
                            .notSolid()
                            .luminance(MobPedestalBlock::getLuminance),
                    MobType.PHANTOM, 28 // Mob type and radius for the golden pedestal
            )
    );


    public static final Block DIAMOND_PHANTOM_PEDESTAL = registerBlock(
            "diamond_phantom_pedestal",
            new MobPedestalBlock(
                    FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)
                            .nonOpaque()
                            .notSolid()
                            .luminance(MobPedestalBlock::getLuminance),
                    MobType.PHANTOM, 64 // Mob type and radius for the diamond pedestal
            )
    );


    public static final Block NETHERITE_PHANTOM_PEDESTAL = registerBlock(
            "netherite_phantom_pedestal",
            new MobPedestalBlock(
                    FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)
                            .nonOpaque()
                            .notSolid()
                            .luminance(MobPedestalBlock::getLuminance),
                    MobType.PHANTOM, 128 // Mob type and radius for the netherite pedestal
            )
    );


    public static final Block GOLDEN_ENDERMAN_PEDESTAL = registerBlock(
            "golden_enderman_pedestal",
            new MobPedestalBlock(
                    FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)
                            .nonOpaque()
                            .notSolid()
                            .luminance(MobPedestalBlock::getLuminance),
                    MobType.ENDERMAN, 28 // Mob type and radius for the golden pedestal
            )
    );


    public static final Block DIAMOND_ENDERMAN_PEDESTAL = registerBlock(
            "diamond_enderman_pedestal",
            new MobPedestalBlock(
                    FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)
                            .nonOpaque()
                            .notSolid()
                            .luminance(MobPedestalBlock::getLuminance),
                    MobType.ENDERMAN, 64 // Mob type and radius for the diamond pedestal
            )
    );


    public static final Block NETHERITE_ENDERMAN_PEDESTAL = registerBlock(
            "netherite_enderman_pedestal",
            new MobPedestalBlock(
                    FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)
                            .nonOpaque()
                            .notSolid()
                            .luminance(MobPedestalBlock::getLuminance),
                    MobType.ENDERMAN, 128 // Mob type and radius for the netherite pedestal
            )
    );


    public static final Block GOLDEN_WITCH_PEDESTAL = registerBlock(
            "golden_witch_pedestal",
            new MobPedestalBlock(
                    FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)
                            .nonOpaque()
                            .notSolid()
                            .luminance(MobPedestalBlock::getLuminance),
                    MobType.WITCH, 28 // Mob type and radius for the golden pedestal
            )
    );


    public static final Block DIAMOND_WITCH_PEDESTAL = registerBlock(
            "diamond_witch_pedestal",
            new MobPedestalBlock(
                    FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)
                            .nonOpaque()
                            .notSolid()
                            .luminance(MobPedestalBlock::getLuminance),
                    MobType.WITCH, 64 // Mob type and radius for the diamond pedestal
            )
    );


    public static final Block NETHERITE_WITCH_PEDESTAL = registerBlock(
            "netherite_witch_pedestal",
            new MobPedestalBlock(
                    FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)
                            .nonOpaque()
                            .notSolid()
                            .luminance(MobPedestalBlock::getLuminance),
                    MobType.WITCH, 128 // Mob type and radius for the netherite pedestal
            )
    );


    public static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(IStarsMobPedestal.MOD_ID, name), block);
    }
    private  static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, new Identifier(IStarsMobPedestal.MOD_ID, name),new BlockItem(block,new FabricItemSettings()));
    }

    public static void registerModBlocks(){
        IStarsMobPedestal.LOGGER.info("Registering ModBlocks for" + IStarsMobPedestal.MOD_ID);
    }
}
