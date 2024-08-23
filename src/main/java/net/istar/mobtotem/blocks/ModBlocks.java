package net.istar.mobtotem.blocks;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.istar.mobtotem.IStarsMobTotems;
import net.istar.mobtotem.blocks.totemblocks.SlimeTotemBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block SLIME_TOTEM = registerBlock("slime_totem",
    new SlimeTotemBlock(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque().notSolid()));
    public static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(IStarsMobTotems.MOD_ID, name), block);
    }
    private  static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, new Identifier(IStarsMobTotems.MOD_ID, name),new BlockItem(block,new FabricItemSettings()));
    }

    public static void registerModBlocks(){
        IStarsMobTotems.LOGGER.info("Registering ModBlocks for" + IStarsMobTotems.MOD_ID);
    }
}
