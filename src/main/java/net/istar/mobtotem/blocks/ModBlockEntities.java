package net.istar.mobtotem.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.istar.mobtotem.IStarsMobTotems;
import net.istar.mobtotem.TotemBlockEntity.SlimeTotemBlockEntity;
import net.istar.mobtotem.blocks.totemblocks.SlimeTotemBlock;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlockEntities {
    public static final BlockEntityType<SlimeTotemBlockEntity> SLIME_TOTEM_BLOCK_ENTITY_BLOCK =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(IStarsMobTotems.MOD_ID, "slime_totem_block_entity"),
                    FabricBlockEntityTypeBuilder.create(SlimeTotemBlockEntity::new,
                            ModBlocks.SLIME_TOTEM).build());

    public static void registerBlockEntities() {
        IStarsMobTotems.LOGGER.info("Registering Block Entities for " + IStarsMobTotems.MOD_ID);
    }
}