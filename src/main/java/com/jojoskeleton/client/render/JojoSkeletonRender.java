package com.jojoskeleton.client.render;

import com.jojoskeleton.client.model.JojoSkeletonModel;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;

public class JojoSkeletonRender extends MobRenderer {
    public JojoSkeletonRender(EntityRendererProvider.Context provider, EntityModel model, float shadowsize) {
        super(provider, model, shadowsize);
    }

    public JojoSkeletonRender(EntityRendererProvider.Context provider) {
        this(provider, new JojoSkeletonModel(provider.bakeLayer(new ModelLayerLocation(new ResourceLocation(""),""))), 0);
    }

    @Override
    public ResourceLocation getTextureLocation(Entity p_114482_) {
        return new ResourceLocation("jojoskeleton");
    }
}
