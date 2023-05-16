package com.jojoskeleton.client;

import com.jojoskeleton.client.model.JojoSkeletonModel;
import com.jojoskeleton.client.render.JojoSkeletonRender;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent.*;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import static com.jojoskeleton.MainMod.MODID;
import static com.jojoskeleton.entity.Entities.JOJOSKELETON;

@Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class RenderModelLoader {
    ModelLayerLocation JOJOSKELETONMLL = new ModelLayerLocation(new ResourceLocation("jojo_skeleton"),"models");
    @SubscribeEvent
    public void registerRender(RegisterRenderers e){
        e.registerEntityRenderer(JOJOSKELETON.get(),provider-> new JojoSkeletonRender(provider,new JojoSkeletonModel(provider.bakeLayer(JOJOSKELETONMLL)),0));
    }


    @SubscribeEvent
    public void registerModels(RegisterLayerDefinitions e){
        e.registerLayerDefinition(JOJOSKELETONMLL, JojoSkeletonModel::createModel);
    }
}
