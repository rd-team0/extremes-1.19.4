package net.rdteam.extremes.entity.client;

import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.rdteam.extremes.Extremes;
import net.rdteam.extremes.entity.custom.CubeEntity;

public class CubeRenderer extends MobEntityRenderer<CubeEntity, CubeModel<CubeEntity>> {

    private static final Identifier TEXTURE = new Identifier(Extremes.MOD_ID, "texture/entity/moss_golem.png");


    public CubeRenderer(EntityRendererFactory.Context context) {
        super(context, new CubeModel<>(context.getPart(ModModelLayers.MOSS_GOLEM)), 0.7f);
    }

    @Override
    public Identifier getTexture(CubeEntity entity) {
        return TEXTURE;
    }

    @Override
    public void render(CubeEntity mobEntity, float f, float g, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i) {
        matrixStack.scale(1f,1f,1f);
        super.render(mobEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}
