package net.andrew.testmod;

import net.andrew.testmod.init.BlockInit;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class TestModClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		// This entrypoint is suitable for setting up client-specific logic, such as rendering.
		BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(),BlockInit.MITHRIL_SAPLING);
		BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(),BlockInit.SILVER_SAPLING);
		BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(),BlockInit.IRONWOOD_SAPLING);
	}
}