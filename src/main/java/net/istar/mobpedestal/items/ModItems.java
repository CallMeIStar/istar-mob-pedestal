package net.istar.mobpedestal.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.istar.mobpedestal.IStarsMobPedestal;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item SLIME_SOUL = registerItem("slime_soul", new Item(new FabricItemSettings()));
    public static final Item SKELETON_SOUL = registerItem("skeleton_soul", new Item(new FabricItemSettings()));
    public static final Item HUSK_SOUL = registerItem("husk_soul", new Item(new FabricItemSettings()));
    public static final Item CREEPER_SOUL = registerItem("creeper_soul", new Item(new FabricItemSettings()));
    public static final Item ZOMBIE_SOUL = registerItem("zombie_soul", new Item(new FabricItemSettings()));
    public static final Item SPIDER_SOUL = registerItem("spider_soul", new Item(new FabricItemSettings()));
    public static final Item STRAY_SOUL = registerItem("stray_soul", new Item(new FabricItemSettings()));
    public static final Item PHANTOM_SOUL = registerItem("phantom_soul", new Item(new FabricItemSettings()));
    public static final Item WITCH_SOUL = registerItem("witch_soul", new Item(new FabricItemSettings()));
    public static final Item ENDERMAN_SOUL = registerItem("enderman_soul", new Item(new FabricItemSettings()));
    public static final Item DROWNED_SOUL = registerItem("drowned_soul", new Item(new FabricItemSettings()));
    public static final Item ZOMBIFIED_PIGLIN_SOUL = registerItem("zombified_piglin_soul", new Item(new FabricItemSettings()));
    public static final Item BLAZE_SOUL = registerItem("blaze_soul", new Item(new FabricItemSettings()));
    public static final Item GUARDIAN_SOUL = registerItem("guardian_soul", new Item(new FabricItemSettings()));
    public static final Item HOGLIN_SOUL = registerItem("hoglin_soul", new Item(new FabricItemSettings()));
    public static final Item MAGMA_CUBE_SOUL = registerItem("magma_cube_soul", new Item(new FabricItemSettings()));
    public static final Item WITHER_SKELETON_SOUL = registerItem("wither_skeleton_soul", new Item(new FabricItemSettings()));
    public static final Item GHAST_SOUL = registerItem("ghast_soul", new Item(new FabricItemSettings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(IStarsMobPedestal.MOD_ID, name), item);
    }

    public static void registerModItems() {
        IStarsMobPedestal.LOGGER.info("Registering Mod Items for " + IStarsMobPedestal.MOD_ID);

    }
}