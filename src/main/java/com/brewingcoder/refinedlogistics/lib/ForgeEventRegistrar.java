package com.brewingcoder.refinedlogistics.lib;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import java.util.function.Consumer;

public final class ForgeEventRegistrar {
    public static <T extends Event> void addModListener(Consumer<T> consumer) {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(consumer);
    }

    public static <T extends Event> void addEventListener(Consumer<T> consumer) {
        MinecraftForge.EVENT_BUS.addListener(consumer);
    }
}
