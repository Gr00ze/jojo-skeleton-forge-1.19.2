package com.jojoskeleton.client.model;

import com.jojoskeleton.entity.JojoSkeleton;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.LayerDefinitions;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.jetbrains.annotations.NotNull;

import static com.jojoskeleton.MainMod.MODID;

@OnlyIn(Dist.CLIENT)
public class JojoSkeletonModel<T extends JojoSkeleton> extends HierarchicalModel<T> {

    private final ModelPart root;

    public JojoSkeletonModel(ModelPart root){
        this.root=root;
    }
    @Override
    @NotNull
    public ModelPart root() {
        return root;
    }

    public static LayerDefinition createModel(){
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition root = partdefinition.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, -5.0F, 0.0F));

        PartDefinition rib_cage = root.addOrReplaceChild("rib_cage", CubeListBuilder.create().texOffs(94, 9).addBox(-1.0F, -9.0F, -0.75F, 1.0F, 9.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(99, 9).addBox(-1.0F, -0.05F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(92, 2).addBox(0.0F, -10.0F, 10.25F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(92, 2).addBox(0.0F, -8.0F, 10.25F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(92, 2).addBox(0.0F, 0.0F, 10.25F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(92, 2).addBox(0.0F, 4.0F, 8.25F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(92, 2).addBox(0.0F, 2.0F, -9.75F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(92, 2).addBox(0.0F, 4.0F, -8.75F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(92, 2).addBox(0.0F, 2.0F, 9.25F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(92, 2).addBox(0.0F, -2.0F, 10.25F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(92, 2).addBox(0.0F, -4.0F, 10.25F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(92, 2).addBox(0.0F, -6.0F, 10.25F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(92, 2).addBox(0.0F, -8.0F, 10.25F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(92, 2).addBox(0.0F, -6.0F, -10.75F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(92, 2).addBox(0.0F, -4.0F, -10.75F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(92, 2).addBox(0.0F, -2.0F, -10.75F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(92, 2).addBox(0.0F, 0.0F, -10.75F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(92, 2).addBox(0.0F, -8.0F, -10.75F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(92, 2).addBox(0.0F, -10.0F, -10.75F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(92, 2).addBox(0.0F, -8.0F, -10.75F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(95, 0).addBox(0.0F, -12.0F, -6.75F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(95, 0).addBox(0.0F, -12.0F, 6.25F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -25.0F, -0.1F));

        PartDefinition cube_r1 = rib_cage.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(80, 17).addBox(-3.0F, 0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(80, 17).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 4.0F, 3.75F, -1.5708F, 0.0F, 1.5708F));

        PartDefinition cube_r2 = rib_cage.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(69, 17).addBox(-6.5F, -0.5F, 3.5F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(69, 15).addBox(-7.5F, -2.5F, 3.5F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(69, 13).addBox(-9.5F, -4.5F, 3.5F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(69, 13).addBox(-9.5F, -6.5F, 3.5F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(69, 13).addBox(-9.5F, -8.5F, 3.5F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(69, 13).addBox(-9.5F, -10.5F, 3.5F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(69, 13).addBox(-9.5F, -12.5F, 3.5F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(69, 9).addBox(-8.5F, -16.5F, 3.5F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(94, 5).addBox(-12.5F, -15.5F, 3.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(69, 11).addBox(-8.5F, -14.5F, 3.5F, 9.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(69, 0).addBox(-9.5F, -16.5F, -4.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(69, 2).addBox(-9.5F, -14.5F, -4.5F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(69, 2).addBox(-9.5F, -12.5F, -4.5F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(69, 2).addBox(-9.5F, -10.5F, -4.5F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(69, 2).addBox(-9.5F, -8.5F, -4.5F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(69, 2).addBox(-9.5F, -6.5F, -4.5F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(69, 2).addBox(-9.5F, -4.5F, -4.5F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(69, 4).addBox(-9.5F, -2.5F, -4.5F, 9.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(69, 6).addBox(-9.5F, -0.5F, -4.5F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5F, 4.5F, 10.75F, 0.0F, -1.5708F, 0.0F));

        PartDefinition cube_r3 = rib_cage.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(69, 9).addBox(-8.5F, -16.5F, -4.5F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(69, 11).addBox(-8.5F, -14.5F, -4.5F, 9.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(69, 13).addBox(-9.5F, -12.5F, -4.5F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(69, 13).addBox(-9.5F, -10.5F, -4.5F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(69, 13).addBox(-9.5F, -8.5F, -4.5F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(69, 13).addBox(-9.5F, -6.5F, -4.5F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(69, 13).addBox(-9.5F, -4.5F, -4.5F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(69, 15).addBox(-7.5F, -2.5F, -4.5F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(69, 17).addBox(-6.5F, -0.5F, -4.5F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5F, 4.5F, -10.25F, 0.0F, 1.5708F, 0.0F));

        PartDefinition cube_r4 = rib_cage.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(80, 17).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(80, 17).addBox(-3.0F, 0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 4.0F, -3.25F, 1.5708F, 0.0F, 1.5708F));

        PartDefinition cube_r5 = rib_cage.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(69, 0).addBox(-9.8F, -16.5F, 3.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5F, 4.5F, -10.55F, 0.0F, 1.5708F, 0.0F));

        PartDefinition cube_r6 = rib_cage.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(69, 6).addBox(-9.5F, -0.5F, 3.5F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(69, 4).addBox(-9.5F, -2.5F, 3.5F, 9.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(69, 2).addBox(-9.5F, -4.5F, 3.5F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(69, 2).addBox(-9.5F, -6.5F, 3.5F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(69, 2).addBox(-9.5F, -8.5F, 3.5F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(69, 2).addBox(-9.5F, -10.5F, 3.5F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(69, 2).addBox(-9.5F, -12.5F, 3.5F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(69, 2).addBox(-9.5F, -14.5F, 3.5F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5F, 4.5F, -10.25F, 0.0F, 1.5708F, 0.0F));

        PartDefinition teschio = root.addOrReplaceChild("teschio", CubeListBuilder.create().texOffs(0, 0).addBox(0.8333F, -3.5833F, -3.5F, 6.0F, 4.0F, 7.0F, new CubeDeformation(0.0F))
                .texOffs(36, 0).addBox(0.8333F, 0.4167F, -2.5F, 6.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(26, 1).addBox(6.8333F, -3.0833F, -2.0F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(36, 9).addBox(-2.1667F, 1.4167F, 0.5F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(10, 12).addBox(-2.4667F, -0.8833F, 2.2F, 3.6F, 2.6F, 1.0F, new CubeDeformation(-0.3F))
                .texOffs(0, 12).addBox(-2.4667F, -0.8833F, -3.2F, 3.6F, 2.6F, 1.0F, new CubeDeformation(-0.3F))
                .texOffs(36, 12).addBox(-2.1667F, 1.4167F, -2.5F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(25, 12).addBox(-2.1667F, -0.5833F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(2.1667F, -45.4167F, -0.3F));

        PartDefinition cube_r7 = teschio.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(23, 16).addBox(-4.0F, -52.0F, -5.0F, 7.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.1667F, 48.4167F, 0.5F, 0.0F, -1.5708F, 0.0F));

        PartDefinition cube_r8 = teschio.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(4, 17).addBox(-0.8F, -1.0F, -2.5F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.6667F, -1.5833F, -2.1F, 0.0F, -1.5708F, 0.0F));

        PartDefinition mandibola = teschio.addOrReplaceChild("mandibola", CubeListBuilder.create().texOffs(33, 0).addBox(-1.0F, -43.0F, -2.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(10, 22).addBox(2.6892F, -43.0F, 0.0349F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 4).addBox(3.6892F, -44.0F, 0.0349F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 4).addBox(3.6892F, -44.0F, -4.0349F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(10, 22).addBox(2.6892F, -43.0F, -4.0349F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.1667F, 48.4167F, 1.5F));

        PartDefinition cube_r9 = mandibola.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(26, 23).addBox(2.0F, -1.0F, -1.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -42.0F, -5.5F, 0.0F, -1.1781F, 0.0F));

        PartDefinition cube_r10 = mandibola.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(26, 23).addBox(2.0F, -1.0F, -3.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -42.0F, 2.5F, 0.0F, 1.1781F, 0.0F));

        PartDefinition denti_mandibola = mandibola.addOrReplaceChild("denti_mandibola", CubeListBuilder.create().texOffs(0, 0).addBox(-1.1F, -43.9F, -2.3F, 1.0F, 1.3F, 1.2F, new CubeDeformation(-0.4F))
                .texOffs(0, 0).addBox(-1.1F, -43.9F, -1.9F, 1.0F, 1.3F, 1.2F, new CubeDeformation(-0.4F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r11 = denti_mandibola.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.75F, -0.6F, 1.0F, 1.3F, 1.2F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(1.9F, -43.15F, -3.3F, 0.0F, -1.1781F, 0.0F));

        PartDefinition cube_r12 = denti_mandibola.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.75F, -0.6F, 1.0F, 1.3F, 1.2F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(2.4F, -43.15F, -3.5F, 0.0F, -1.1781F, 0.0F));

        PartDefinition cube_r13 = denti_mandibola.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.75F, -0.6F, 1.0F, 1.3F, 1.2F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.9F, -43.15F, -2.9F, 0.0F, -1.1781F, 0.0F));

        PartDefinition cube_r14 = denti_mandibola.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.75F, -0.6F, 1.0F, 1.3F, 1.2F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(1.4F, -43.15F, -3.1F, 0.0F, -1.1781F, 0.0F));

        PartDefinition cube_r15 = denti_mandibola.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.75F, -0.1F, 1.0F, 1.3F, 1.2F, new CubeDeformation(-0.4F))
                .texOffs(0, 0).addBox(-0.5F, -0.75F, -0.6F, 1.0F, 1.3F, 1.2F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.4F, -43.15F, -2.7F, 0.0F, -1.1781F, 0.0F));

        PartDefinition cube_r16 = denti_mandibola.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(0, 0).addBox(-0.4F, -0.75F, -0.6F, 1.0F, 1.3F, 1.2F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-0.6F, -43.15F, -2.2F, 0.0F, -0.4363F, 0.0F));

        PartDefinition cube_r17 = denti_mandibola.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(0, 0).addBox(-0.4F, -0.75F, -0.6F, 1.0F, 1.3F, 1.2F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-0.6F, -43.15F, -0.8F, 0.0F, 0.4363F, 0.0F));

        PartDefinition cube_r18 = denti_mandibola.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.75F, -1.1F, 1.0F, 1.3F, 1.2F, new CubeDeformation(-0.4F))
                .texOffs(0, 0).addBox(-0.5F, -0.75F, -0.6F, 1.0F, 1.3F, 1.2F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.4F, -43.15F, -0.3F, 0.0F, 1.1781F, 0.0F));

        PartDefinition cube_r19 = denti_mandibola.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.75F, -0.6F, 1.0F, 1.3F, 1.2F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.9F, -43.15F, -0.1F, 0.0F, 1.1781F, 0.0F));

        PartDefinition cube_r20 = denti_mandibola.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.75F, -0.6F, 1.0F, 1.3F, 1.2F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(1.4F, -43.15F, 0.1F, 0.0F, 1.1781F, 0.0F));

        PartDefinition cube_r21 = denti_mandibola.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.75F, -0.6F, 1.0F, 1.3F, 1.2F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(1.9F, -43.15F, 0.3F, 0.0F, 1.1781F, 0.0F));

        PartDefinition cube_r22 = denti_mandibola.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.75F, -0.6F, 1.0F, 1.3F, 1.2F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(2.4F, -43.15F, 0.5F, 0.0F, 1.1781F, 0.0F));

        PartDefinition mascella = teschio.addOrReplaceChild("mascella", CubeListBuilder.create().texOffs(1, 22).addBox(2.6892F, -43.0F, -4.0349F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(22, 22).addBox(-1.0F, -43.0F, -2.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(1, 22).addBox(2.6892F, -43.0F, 0.0349F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.1667F, 45.4167F, 1.5F));

        PartDefinition cube_r23 = mascella.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(15, 23).addBox(2.0F, -1.0F, -3.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -42.0F, 2.5F, 0.0F, 1.1781F, 0.0F));

        PartDefinition cube_r24 = mascella.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(15, 23).addBox(2.0F, -1.0F, -1.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -42.0F, -5.5F, 0.0F, -1.1781F, 0.0F));

        PartDefinition denti_mascella = mascella.addOrReplaceChild("denti_mascella", CubeListBuilder.create().texOffs(0, 0).addBox(-1.1F, -43.7F, -2.3F, 1.0F, 1.2F, 1.2F, new CubeDeformation(-0.4F))
                .texOffs(0, 0).addBox(-1.1F, -43.7F, -1.9F, 1.0F, 1.2F, 1.2F, new CubeDeformation(-0.4F)), PartPose.offset(0.0F, 2.3F, 0.0F));

        PartDefinition cube_r25 = denti_mascella.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.55F, -0.6F, 1.0F, 1.2F, 1.2F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(1.9F, -43.15F, -3.3F, 0.0F, -1.1781F, 0.0F));

        PartDefinition cube_r26 = denti_mascella.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.55F, -0.6F, 1.0F, 1.2F, 1.2F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(2.4F, -43.15F, -3.5F, 0.0F, -1.1781F, 0.0F));

        PartDefinition cube_r27 = denti_mascella.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.55F, -0.6F, 1.0F, 1.2F, 1.2F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.9F, -43.15F, -2.9F, 0.0F, -1.1781F, 0.0F));

        PartDefinition cube_r28 = denti_mascella.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.55F, -0.6F, 1.0F, 1.2F, 1.2F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(1.4F, -43.15F, -3.1F, 0.0F, -1.1781F, 0.0F));

        PartDefinition cube_r29 = denti_mascella.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.55F, -0.1F, 1.0F, 1.2F, 1.2F, new CubeDeformation(-0.4F))
                .texOffs(0, 0).addBox(-0.5F, -0.55F, -0.6F, 1.0F, 1.2F, 1.2F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.4F, -43.15F, -2.7F, 0.0F, -1.1781F, 0.0F));

        PartDefinition cube_r30 = denti_mascella.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(0, 0).addBox(-0.4F, -0.55F, -0.6F, 1.0F, 1.2F, 1.2F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-0.6F, -43.15F, -2.2F, 0.0F, -0.4363F, 0.0F));

        PartDefinition cube_r31 = denti_mascella.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(0, 0).addBox(-0.4F, -0.55F, -0.6F, 1.0F, 1.2F, 1.2F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-0.6F, -43.15F, -0.8F, 0.0F, 0.4363F, 0.0F));

        PartDefinition cube_r32 = denti_mascella.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.55F, -1.1F, 1.0F, 1.2F, 1.2F, new CubeDeformation(-0.4F))
                .texOffs(0, 0).addBox(-0.5F, -0.55F, -0.6F, 1.0F, 1.2F, 1.2F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.4F, -43.15F, -0.3F, 0.0F, 1.1781F, 0.0F));

        PartDefinition cube_r33 = denti_mascella.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.55F, -0.6F, 1.0F, 1.2F, 1.2F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.9F, -43.15F, -0.1F, 0.0F, 1.1781F, 0.0F));

        PartDefinition cube_r34 = denti_mascella.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.55F, -0.6F, 1.0F, 1.2F, 1.2F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(1.4F, -43.15F, 0.1F, 0.0F, 1.1781F, 0.0F));

        PartDefinition cube_r35 = denti_mascella.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.55F, -0.6F, 1.0F, 1.2F, 1.2F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(1.9F, -43.15F, 0.3F, 0.0F, 1.1781F, 0.0F));

        PartDefinition cube_r36 = denti_mascella.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.55F, -0.6F, 1.0F, 1.2F, 1.2F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(2.4F, -43.15F, 0.5F, 0.0F, 1.1781F, 0.0F));

        PartDefinition spine = root.addOrReplaceChild("spine", CubeListBuilder.create().texOffs(48, 32).addBox(-1.0F, -19.25F, -0.75F, 2.0F, 23.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(47, 59).addBox(-1.5F, 3.75F, -1.15F, 2.5F, 11.0F, 2.5F, new CubeDeformation(0.0F)), PartPose.offset(7.0F, -22.75F, -0.1F));

        PartDefinition armright = spine.addOrReplaceChild("armright", CubeListBuilder.create().texOffs(21, 31).addBox(-1.0F, -38.0F, 13.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(22, 43).addBox(-0.5F, -32.0F, 13.6F, 5.0F, 10.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(23, 59).addBox(0.0F, -22.0F, 14.1F, 4.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-7.0F, 22.75F, 0.1F));

        PartDefinition handright = armright.addOrReplaceChild("handright", CubeListBuilder.create().texOffs(2, 52).addBox(0.0F, -12.0F, 15.0F, 4.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition armright2 = armright.addOrReplaceChild("armright2", CubeListBuilder.create().texOffs(21, 31).addBox(-1.0F, -38.0F, -19.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(22, 43).addBox(-0.5F, -32.0F, -18.6F, 5.0F, 10.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(23, 59).addBox(0.0F, -22.0F, -18.1F, 4.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r37 = armright2.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(0, 31).mirror().addBox(-4.2F, -2.5F, -1.0F, 8.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(6.5F, -37.0F, 8.9F, -1.5708F, -1.5708F, 0.0F));

        PartDefinition cube_r38 = armright2.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(0, 38).addBox(-3.5F, -3.5F, -1.0F, 7.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.0F, -32.5F, 8.4F, 0.0F, 1.5708F, 0.0F));

        PartDefinition cube_r39 = armright2.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(0, 31).addBox(-3.9F, -2.5F, -1.0F, 8.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.5F, -37.0F, -8.9F, -1.5708F, -1.5708F, 0.0F));

        PartDefinition cube_r40 = armright2.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(0, 38).addBox(-3.5F, -3.5F, -1.0F, 7.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.0F, -32.5F, -8.4F, 0.0F, -1.5708F, 0.0F));

        PartDefinition handright2 = armright2.addOrReplaceChild("handright2", CubeListBuilder.create().texOffs(2, 52).addBox(0.0F, -12.0F, -17.0F, 4.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition hipbone = root.addOrReplaceChild("hipbone", CubeListBuilder.create().texOffs(65, 29).addBox(2.0F, -10.0F, -6.2F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(65, 29).addBox(2.0F, -10.0F, 5.2F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(79, 25).addBox(2.0F, -8.0F, -6.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(79, 25).addBox(2.0F, -8.0F, 5.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r41 = hipbone.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(79, 30).addBox(-7.5F, -0.5F, -0.5F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, -6.5F, 2.3F, 0.0F, -1.5708F, 0.0F));

        PartDefinition cube_r42 = hipbone.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(79, 30).addBox(-2.5F, -0.5F, -0.5F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, -6.5F, 2.7F, 0.0F, -1.5708F, 0.0F));

        PartDefinition cube_r43 = hipbone.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(65, 23).addBox(-2.5F, -2.0F, -0.5F, 5.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.5F, -8.0F, 3.7F, 0.0F, 1.5708F, 0.0F));

        PartDefinition cube_r44 = hipbone.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(65, 23).addBox(-2.5F, -2.0F, -0.5F, 5.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.5F, -8.0F, -3.7F, 0.0F, -1.5708F, 0.0F));

        PartDefinition legleft = root.addOrReplaceChild("legleft", CubeListBuilder.create().texOffs(92, 60).addBox(3.0F, -8.0F, -7.2F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(86, 34).addBox(0.0F, -6.0F, -11.2F, 7.0F, 17.0F, 7.0F, new CubeDeformation(0.0F))
                .texOffs(62, 35).addBox(0.5F, 11.0F, -10.7F, 6.0F, 17.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(59, 58).addBox(-4.5F, 28.0F, -10.7F, 9.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition legright = root.addOrReplaceChild("legright", CubeListBuilder.create().texOffs(92, 60).addBox(3.0F, -37.0F, 5.2F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(86, 34).addBox(0.0F, -35.0F, 4.2F, 7.0F, 17.0F, 7.0F, new CubeDeformation(0.0F))
                .texOffs(62, 35).addBox(0.5F, -18.0F, 4.7F, 6.0F, 17.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(59, 58).addBox(-4.5F, -1.0F, 4.7F, 9.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 29.0F, 0.0F));

        return LayerDefinition.create(meshdefinition, 128, 128);

    }
    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        root.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }
    @Override
    public void setupAnim(T entity, float p_102619_, float p_102620_, float p_102621_, float p_102622_, float p_102623_) {

    }


}
