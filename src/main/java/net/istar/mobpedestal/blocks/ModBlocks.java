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
