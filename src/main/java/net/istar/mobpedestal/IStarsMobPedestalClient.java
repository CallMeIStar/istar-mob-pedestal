package net.istar.mobpedestal;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.istar.mobpedestal.blocks.ModBlocks;
import net.minecraft.client.render.RenderLayer;

public class IStarsMobPedestalClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GOLDEN_SLIME_PEDESTAL, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DIAMOND_SLIME_PEDESTAL, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.NETHERITE_SLIME_PEDESTAL, RenderLayer.getTranslucent());
    }
}
