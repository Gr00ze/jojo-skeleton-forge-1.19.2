package com.jojoskeleton;


import com.jojoskeleton.entity.Entities;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(MainMod.MODID)
public class MainMod {
    public static final String MODID = "jk";

    public MainMod(){
        IEventBus iEventBus =  FMLJavaModLoadingContext.get().getModEventBus();
        MinecraftForge.EVENT_BUS.register(this);
        Entities.ENTITIES.register(iEventBus);
    }
}
