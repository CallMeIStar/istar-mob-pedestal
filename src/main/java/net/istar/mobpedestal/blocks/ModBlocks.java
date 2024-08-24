package net.istar.mobpedestal.blocks;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.istar.mobpedestal.IStarsMobPedestal;
import net.istar.mobpedestal.blocks.pedestalblocks.*;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block GOLDEN_SLIME_PEDESTAL = registerBlock("golden_slime_pedestal", new GoldenSlimePedestalBlock(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque().notSolid()));
    public static final Block DIAMOND_SLIME_PEDESTAL = registerBlock("diamond_slime_pedestal", new DiamondSlimePedestalBlock(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque().notSolid()));
    public static final Block NETHERITE_SLIME_PEDESTAL = registerBlock("netherite_slime_pedestal", new NetheriteSlimePedestalBlock(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque().notSolid()));


    public static final Block GOLDEN_SKELETON_PEDESTAL = registerBlock("golden_skeleton_pedestal", new GoldenSkeletonPedestalBlock(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque().notSolid()));
    public static final Block DIAMOND_SKELETON_PEDESTAL = registerBlock("diamond_skeleton_pedestal", new DiamondSkeletonPedestalBlock(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque().notSolid()));
    public static final Block NETHERITE_SKELETON_PEDESTAL = registerBlock("netherite_skeleton_pedestal", new NetheriteSkeletonPedestalBlock(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque().notSolid()));

    public static final Block GOLDEN_HUSK_PEDESTAL = registerBlock("golden_husk_pedestal", new GoldenHuskPedestalBlock(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque().notSolid()));
    public static final Block DIAMOND_HUSK_PEDESTAL = registerBlock("diamond_husk_pedestal", new DiamondHuskPedestalBlock(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque().notSolid()));
    public static final Block NETHERITE_HUSK_PEDESTAL = registerBlock("netherite_husk_pedestal", new NetheriteHuskPedestalBlock(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque().notSolid()));

    public static final Block GOLDEN_CREEPER_PEDESTAL = registerBlock("golden_creeper_pedestal", new GoldenCreeperPedestalBlock(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque().notSolid()));
    public static final Block DIAMOND_CREEPER_PEDESTAL = registerBlock("diamond_creeper_pedestal", new DiamondCreeperPedestalBlock(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque().notSolid()));
    public static final Block NETHERITE_CREEPER_PEDESTAL = registerBlock("netherite_creeper_pedestal", new NetheriteCreeperPedestalBlock(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque().notSolid()));

    public static final Block GOLDEN_SPIDER_PEDESTAL = registerBlock("golden_spider_pedestal", new GoldenSpiderPedestalBlock(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque().notSolid()));
    public static final Block DIAMOND_SPIDER_PEDESTAL = registerBlock("diamond_spider_pedestal", new DiamondSpiderPedestalBlock(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque().notSolid()));
    public static final Block NETHERITE_SPIDER_PEDESTAL = registerBlock("netherite_spider_pedestal", new NetheriteSpiderPedestalBlock(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque().notSolid()));

    public static final Block GOLDEN_STRAY_PEDESTAL = registerBlock("golden_stray_pedestal", new GoldenStrayPedestalBlock(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque().notSolid()));
    public static final Block DIAMOND_STRAY_PEDESTAL = registerBlock("diamond_stray_pedestal", new DiamondStrayPedestalBlock(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque().notSolid()));
    public static final Block NETHERITE_STRAY_PEDESTAL = registerBlock("netherite_stray_pedestal", new NetheriteStrayPedestalBlock(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque().notSolid()));

    public static final Block GOLDEN_ZOMBIE_PEDESTAL = registerBlock("golden_zombie_pedestal", new GoldenZombiePedestalBlock(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque().notSolid()));
    public static final Block DIAMOND_ZOMBIE_PEDESTAL = registerBlock("diamond_zombie_pedestal", new DiamondZombiePedestalBlock(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque().notSolid()));
    public static final Block NETHERITE_ZOMBIE_PEDESTAL = registerBlock("netherite_zombie_pedestal", new NetheriteZombiePedestalBlock(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque().notSolid()));

    public static final Block GOLDEN_PHANTOM_PEDESTAL = registerBlock("golden_phantom_pedestal", new GoldenPhantomPedestalBlock(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque().notSolid()));
    public static final Block DIAMOND_PHANTOM_PEDESTAL = registerBlock("diamond_phantom_pedestal", new DiamondPhantomPedestalBlock(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque().notSolid()));
    public static final Block NETHERITE_PHANTOM_PEDESTAL = registerBlock("netherite_phantom_pedestal", new NetheritePhantomPedestalBlock(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque().notSolid()));

    public static final Block GOLDEN_ENDERMAN_PEDESTAL = registerBlock("golden_enderman_pedestal", new GoldenEndermanPedestalBlock(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque().notSolid()));
    public static final Block DIAMOND_ENDERMAN_PEDESTAL = registerBlock("diamond_enderman_pedestal", new DiamondEndermanPedestalBlock(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque().notSolid()));
    public static final Block NETHERITE_ENDERMAN_PEDESTAL = registerBlock("netherite_enderman_pedestal", new NetheriteEndermanPedestalBlock(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque().notSolid()));

    public static final Block GOLDEN_WITCH_PEDESTAL = registerBlock("golden_witch_pedestal", new GoldenWitchPedestalBlock(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque().notSolid()));
    public static final Block DIAMOND_WITCH_PEDESTAL = registerBlock("diamond_witch_pedestal", new DiamondWitchPedestalBlock(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque().notSolid()));
    public static final Block NETHERITE_WITCH_PEDESTAL = registerBlock("netherite_witch_pedestal", new NetheriteWitchPedestalBlock(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque().notSolid()));

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
