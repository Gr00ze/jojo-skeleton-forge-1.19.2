package com.jojoskeleton.entity;

import com.google.common.base.Supplier;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.ai.attributes.Attributes;
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

    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister
            .create(ForgeRegistries.ENTITY_TYPES,MODID);

    public static final  RegistryObject<EntityType<JojoSkeleton>> JOJOSKELETON = ENTITIES
            .register("jojo_skeleton", () -> EntityType
                    .Builder.of(JojoSkeleton::new, MobCategory.MONSTER)
                    .sized(2,5)
                    .fireImmune()
                    .build("jojo_skeleton"));

    public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister
            .create(ForgeRegistries.SOUND_EVENTS,MODID);

    //static final Supplier<SoundEvent> boh = (Supplier<SoundEvent>) new SoundEvent(new ResourceLocation("jk:jojo_attack"));

    //public static final RegistryObject<SoundEvent> jja = SOUNDS.register( "jk:jojo_attack",boh);

    //public static final SoundEvent jojo_attack = SOUNDS.register( "jk:jojo_attack",boh);

    @SubscribeEvent
    public static void addAttributes(EntityAttributeCreationEvent event){
        event.put(JOJOSKELETON.get(), Mob.createMobAttributes()
                .add(Attributes.MAX_HEALTH,100)
                .build());
    }






}
