package com.jojoskeleton.entity;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.jojoskeleton.MainMod.MODID;
@Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class Entities {

    public static DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister
            .create(ForgeRegistries.ENTITY_TYPES,MODID);

    public static RegistryObject<EntityType<JojoSkeleton>> JOJOSKELETON = ENTITIES
            .register("jojo_skeleton", () -> EntityType
                    .Builder.of(JojoSkeleton::new, MobCategory.MONSTER)
                    .fireImmune()
                    .canSpawnFarFromPlayer()
                    .sized(3,3)
                    .build("jojo_skeleton"));

    @SubscribeEvent
    public static void addAttributes(EntityAttributeCreationEvent event){
        event.put(JOJOSKELETON.get(),JojoSkeleton.attributes);
    }





}
