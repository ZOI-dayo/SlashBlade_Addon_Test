package net.zoizoi.forge.slashblade_addon_test;

import mods.flammpfeil.slashblade.SlashBlade;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.zoizoi.forge.slashblade_addon_test.blade.blades.SimpleBlade;

public class BladeLoader {
    public BladeLoader(FMLPreInitializationEvent event) {

        SlashBlade.InitEventBus.register(new SimpleBlade());
//        SlashBlade.InitEventBus.register(new SAloader());
//        if(ConfigLoader.switch_Nihil)
//            SlashBlade.InitEventBus.register(new BladeNihil());
//        if(ConfigLoader.switch_DarkRaven)
//            SlashBlade.InitEventBus.register(new BladeDarkRaven());
//
//        if(ConfigLoader.switch_Toyako)
//            SlashBlade.InitEventBus.register(new BladeToyako());
//        if(ConfigLoader.switch_FluorescentBar)
//            SlashBlade.InitEventBus.register(new BladeFluorescentBar());
//        if(ConfigLoader.switch_Yukari)
//            SlashBlade.InitEventBus.register(new BladeYukari());
//        if(ConfigLoader.switch_Kamuy)
//            SlashBlade.InitEventBus.register(new BladeKamuy());
//        if(ConfigLoader.switch_Kirisaya)
//            SlashBlade.InitEventBus.register(new BladeKirisaya());
//        if(ConfigLoader.switch_FrostWolf)
//            SlashBlade.InitEventBus.register(new BladeFrostWolf());
//        if(ConfigLoader.switch_Laemmle)
//            SlashBlade.InitEventBus.register(new BladeLaemmle());
//        if(ConfigLoader.switch_BladeMaster)
//            SlashBlade.InitEventBus.register(new BladeBladeMaster());
//        if(ConfigLoader.switch_CS2)
//            SlashBlade.InitEventBus.register(new BladeCS2Template());
//        if(ConfigLoader.switch_MURASAMA)
//            SlashBlade.InitEventBus.register(new BladeMURASAMA());
//
//        if(Loader.isModLoaded("botania")){
//            if(ConfigLoader.switch_Terra)
//                SlashBlade.InitEventBus.register(new BladeTerra());
//        }
//        if(ConfigLoader.switch_Wanderer){
//            SlashBlade.InitEventBus.register(new BladeWanderer());
//            if(ConfigLoader.switch_MURASAMA)
//                SlashBlade.InitEventBus.register(new BladeWandererRF());
//        }
//
//
//        if(Loader.isModLoaded(Thaumcraft.MODID)){
//            if(ConfigLoader.switch_Zephyr)
//                SlashBlade.InitEventBus.register(new BladeZephyr());
//        }
//        if(Loader.isModLoaded(SakuraMain.MODID)){
//            if(ConfigLoader.switch_WA)
//                SlashBlade.InitEventBus.register(new BladeWA());
//            if(ConfigLoader.switch_Bamboo)
//                SlashBlade.InitEventBus.register(new BladeBamboo());
//
//        }
    }

}
