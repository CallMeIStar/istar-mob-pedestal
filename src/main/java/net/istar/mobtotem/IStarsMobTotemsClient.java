package net.istar.mobtotem;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.istar.mobtotem.blocks.ModBlocks;
import net.minecraft.client.render.RenderLayer;

public class IStarsMobTotemsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SLIME_TOTEM, RenderLayer.getTranslucent());
    }
}
