package com.jojoskeleton.client.model;

import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.LayerDefinitions;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.world.entity.Entity;

public class JojoSkeletonModel extends HierarchicalModel {

    private final ModelPart root;

    public JojoSkeletonModel(ModelPart root){
        this.root=root;
    }
    @Override
    public ModelPart root() {
        return root;
    }

    public static LayerDefinition createModel(){
        MeshDefinition meshDefinition = new MeshDefinition();

        meshDefinition.getRoot()
                .addOrReplaceChild("body", new CubeListBuilder()
                        .addBox(0,0,0,10,10,10), PartPose.ZERO);

        return LayerDefinition.create(meshDefinition,128,128);
    }

    @Override
    public void setupAnim(Entity p_102618_, float p_102619_, float p_102620_, float p_102621_, float p_102622_, float p_102623_) {

    }
}
