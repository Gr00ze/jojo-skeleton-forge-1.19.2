package com.jojoskeleton.client.render;

import com.jojoskeleton.client.model.JojoSkeletonModel;
import com.jojoskeleton.entity.JojoSkeleton;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.Mob;

import static com.jojoskeleton.MainMod.MODID;

public class JojoSkeletonRender extends MobRenderer<JojoSkeleton,JojoSkeletonModel<JojoSkeleton>> {
    ResourceLocation TEXTURE = new ResourceLocation(MODID,"/textures/entity/jojo_skeleton.png");
    public JojoSkeletonRender(EntityRendererProvider.Context provider, JojoSkeletonModel<JojoSkeleton> model, float shadowsize) {
        super(provider, model, shadowsize);
    }

    @Override
    public ResourceLocation getTextureLocation(JojoSkeleton p_114482_) {
        return TEXTURE;
    }
}
