package com.jojoskeleton.entity;

import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.level.Level;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.jojoskeleton.MainMod.MODID;


@Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD )
public class TestEntity extends Mob {

    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister
            .create(ForgeRegistries.ENTITY_TYPES, MODID);

    public static RegistryObject<EntityType<TestEntity>> TESTENTITY = ENTITIES
            .register("testentity",()->EntityType.Builder
                    .of(TestEntity::new, MobCategory.MONSTER)
                    .build("testentity")
            );


    protected TestEntity(EntityType<? extends Mob> p_21368_, Level p_21369_) {
        super(p_21368_, p_21369_);
    }


    @SubscribeEvent
    public static void registerAttribute(EntityAttributeCreationEvent e){
        e.put(TESTENTITY.get(),Mob.createMobAttributes()
                .add(Attributes.MAX_HEALTH,20)
                .build());
    }
    static final ModelLayerLocation testml = new ModelLayerLocation(new ResourceLocation("testentity"),"main");
    @SubscribeEvent
    public static void registerRendering(EntityRenderersEvent.RegisterRenderers event){

        event.registerEntityRenderer(TESTENTITY.get(),
                provider->new TestRenderer(provider,new TestModel<>(provider.bakeLayer(testml)),0));
    }
    @SubscribeEvent
    public static void registerModel(EntityRenderersEvent.RegisterLayerDefinitions event){
        event.registerLayerDefinition(testml,TestModel::createModel);
    }
    @OnlyIn(Dist.CLIENT)
    static class TestModel<E extends TestEntity> extends HierarchicalModel<E>{
        ModelPart root;
        TestModel(ModelPart root){
            this.root=root;
        }
        @Override
        public ModelPart root() {
            return root;
        }
        public static LayerDefinition createModel(){
            MeshDefinition mesh = new MeshDefinition();
            mesh.getRoot().addOrReplaceChild("base",
                    CubeListBuilder.create()
                            .addBox(0,0,0,1,1,1),
                    PartPose.ZERO);
            return LayerDefinition.create(mesh,128,128);
        }
        @Override
        public void setupAnim(E p_102618_, float p_102619_, float p_102620_, float p_102621_, float p_102622_, float p_102623_) {

        }
    }
    @OnlyIn(Dist.CLIENT)
    static class TestRenderer extends MobRenderer<TestEntity,TestModel<TestEntity>> {
        public TestRenderer(EntityRendererProvider.Context p_174304_, TestModel<TestEntity> p_174305_, float p_174306_) {
            super(p_174304_, p_174305_, p_174306_);
        }



        @Override
        public ResourceLocation getTextureLocation(TestEntity p_114482_) {
            return new ResourceLocation("");
        }
    }

}
