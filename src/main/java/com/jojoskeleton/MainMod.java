package com.jojoskeleton;


import com.jojoskeleton.entity.Entities;
import com.mojang.logging.LogUtils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(MainMod.MODID)
public class MainMod {
    public static final String MODID = "jk";
    private static final Logger LOGGER = LogUtils.getLogger();


    public MainMod(){
        IEventBus iEventBus =  FMLJavaModLoadingContext.get().getModEventBus();
        MinecraftForge.EVENT_BUS.register(this);
        Entities.register(iEventBus);
    }
}
