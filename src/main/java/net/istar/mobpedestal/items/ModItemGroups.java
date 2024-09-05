package net.istar.mobpedestal.items;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.istar.mobpedestal.IStarsMobPedestal;
import net.istar.mobpedestal.blocks.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup PEDESTAL_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(IStarsMobPedestal.MOD_ID, "pedestal"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.pedestal"))
                    .icon(() -> new ItemStack(ModBlocks.DIAMOND_SLIME_PEDESTAL)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.GOLDEN_SLIME_PEDESTAL);
                        entries.add(ModBlocks.DIAMOND_SLIME_PEDESTAL);
                        entries.add(ModBlocks.NETHERITE_SLIME_PEDESTAL);
                        entries.add(ModBlocks.GOLDEN_SKELETON_PEDESTAL);
                        entries.add(ModBlocks.DIAMOND_SKELETON_PEDESTAL);
                        entries.add(ModBlocks.NETHERITE_SKELETON_PEDESTAL);
                        entries.add(ModBlocks.GOLDEN_HUSK_PEDESTAL);
                        entries.add(ModBlocks.DIAMOND_HUSK_PEDESTAL);
                        entries.add(ModBlocks.NETHERITE_HUSK_PEDESTAL);
                        entries.add(ModBlocks.GOLDEN_CREEPER_PEDESTAL);
                        entries.add(ModBlocks.DIAMOND_CREEPER_PEDESTAL);
                        entries.add(ModBlocks.NETHERITE_CREEPER_PEDESTAL);
                        entries.add(ModBlocks.GOLDEN_ZOMBIE_PEDESTAL);
                        entries.add(ModBlocks.DIAMOND_ZOMBIE_PEDESTAL);
                        entries.add(ModBlocks.NETHERITE_ZOMBIE_PEDESTAL);
                        entries.add(ModBlocks.GOLDEN_SPIDER_PEDESTAL);
                        entries.add(ModBlocks.DIAMOND_SPIDER_PEDESTAL);
                        entries.add(ModBlocks.NETHERITE_SPIDER_PEDESTAL);
                        entries.add(ModBlocks.GOLDEN_STRAY_PEDESTAL);
                        entries.add(ModBlocks.DIAMOND_STRAY_PEDESTAL);
                        entries.add(ModBlocks.NETHERITE_STRAY_PEDESTAL);
                        entries.add(ModBlocks.GOLDEN_PHANTOM_PEDESTAL);
                        entries.add(ModBlocks.DIAMOND_PHANTOM_PEDESTAL);
                        entries.add(ModBlocks.NETHERITE_PHANTOM_PEDESTAL);
                        entries.add(ModBlocks.GOLDEN_WITCH_PEDESTAL);
                        entries.add(ModBlocks.DIAMOND_WITCH_PEDESTAL);
                        entries.add(ModBlocks.NETHERITE_WITCH_PEDESTAL);
                        entries.add(ModBlocks.GOLDEN_ENDERMAN_PEDESTAL);
                        entries.add(ModBlocks.DIAMOND_ENDERMAN_PEDESTAL);
                        entries.add(ModBlocks.NETHERITE_ENDERMAN_PEDESTAL);
                        entries.add(ModBlocks.GOLDEN_DROWNED_PEDESTAL);
                        entries.add(ModBlocks.DIAMOND_DROWNED_PEDESTAL);
                        entries.add(ModBlocks.NETHERITE_DROWNED_PEDESTAL);
                        entries.add(ModBlocks.GOLDEN_ZOMBIFIED_PIGLIN_PEDESTAL);
                        entries.add(ModBlocks.DIAMOND_ZOMBIFIED_PIGLIN_PEDESTAL);
                        entries.add(ModBlocks.NETHERITE_ZOMBIFIED_PIGLIN_PEDESTAL);
                        entries.add(ModBlocks.GOLDEN_BLAZE_PEDESTAL);
                        entries.add(ModBlocks.DIAMOND_BLAZE_PEDESTAL);
                        entries.add(ModBlocks.NETHERITE_BLAZE_PEDESTAL);
                        entries.add(ModBlocks.GOLDEN_GUARDIAN_PEDESTAL);
                        entries.add(ModBlocks.DIAMOND_GUARDIAN_PEDESTAL);
                        entries.add(ModBlocks.NETHERITE_GUARDIAN_PEDESTAL);
                        entries.add(ModBlocks.GOLDEN_HOGLIN_PEDESTAL);
                        entries.add(ModBlocks.DIAMOND_HOGLIN_PEDESTAL);
                        entries.add(ModBlocks.NETHERITE_HOGLIN_PEDESTAL);
                        entries.add(ModBlocks.GOLDEN_MAGMA_CUBE_PEDESTAL);
                        entries.add(ModBlocks.DIAMOND_MAGMA_CUBE_PEDESTAL);
                        entries.add(ModBlocks.NETHERITE_MAGMA_CUBE_PEDESTAL);
                        entries.add(ModBlocks.GOLDEN_WITHER_SKELETON_PEDESTAL);
                        entries.add(ModBlocks.DIAMOND_WITHER_SKELETON_PEDESTAL);
                        entries.add(ModBlocks.NETHERITE_WITHER_SKELETON_PEDESTAL);
                        entries.add(ModBlocks.GOLDEN_GHAST_PEDESTAL);
                        entries.add(ModBlocks.DIAMOND_GHAST_PEDESTAL);
                        entries.add(ModBlocks.NETHERITE_GHAST_PEDESTAL);
                        entries.add(ModItems.SLIME_SOUL);
                        entries.add(ModItems.SKELETON_SOUL);
                        entries.add(ModItems.HUSK_SOUL);
                        entries.add(ModItems.CREEPER_SOUL);
                        entries.add(ModItems.ZOMBIE_SOUL);
                        entries.add(ModItems.SPIDER_SOUL);
                        entries.add(ModItems.STRAY_SOUL);
                        entries.add(ModItems.PHANTOM_SOUL);
                        entries.add(ModItems.WITCH_SOUL);
                        entries.add(ModItems.ENDERMAN_SOUL);
                        entries.add(ModItems.DROWNED_SOUL);
                        entries.add(ModItems.ZOMBIFIED_PIGLIN_SOUL);
                        entries.add(ModItems.BLAZE_SOUL);
                        entries.add(ModItems.GUARDIAN_SOUL);
                        entries.add(ModItems.HOGLIN_SOUL);
                        entries.add(ModItems.MAGMA_CUBE_SOUL);
                        entries.add(ModItems.WITHER_SKELETON_SOUL);
                        entries.add(ModItems.GHAST_SOUL);




                    }).build());


    public static void registerItemGroups() {
        IStarsMobPedestal.LOGGER.info("Registering Item Groups for " + IStarsMobPedestal.MOD_ID);
    }
}