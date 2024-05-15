package net.rdteam.extremes;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.rdteam.extremes.entity.ModEntity;
import net.rdteam.extremes.entity.client.CubeModel;
import net.rdteam.extremes.entity.client.CubeRenderer;
import net.rdteam.extremes.entity.client.ModModelLayers;

public class ExtremesClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		EntityRendererRegistry.register(ModEntity.MOSS_GOLEM, CubeRenderer::new);
		EntityModelLayerRegistry.registerModelLayer(ModModelLayers.MOSS_GOLEM, CubeModel::getTexturedModelData);
	}
}