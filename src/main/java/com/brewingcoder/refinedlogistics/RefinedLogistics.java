package com.brewingcoder.refinedlogistics;

import com.brewingcoder.refinedlogistics.world.RLOreGen;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.stream.Collectors;

import static com.brewingcoder.refinedlogistics.lib.ForgeEventRegistrar.addModListener;

@Mod(RefinedLogistics.MODID)
public class RefinedLogistics
{
    public static final String MODID = "refinedlogistics";
    public static final Logger LOGGER = LogManager.getLogger(MODID);


    public RefinedLogistics() {

        addModListener(this::commonSetup);
        addModListener(this::clientSetup);


        ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER,ConfigHandler.SERVER_CONFIG);


//        MinecraftForge.EVENT_BUS.register(this);
    }

    void commonSetup(final FMLCommonSetupEvent event)
    {
        RLOreGen.register();
    }

    void clientSetup(final FMLClientSetupEvent event) {
    }





//    private void enqueueIMC(final InterModEnqueueEvent event)
//    {
//        //InterModComms.sendTo("examplemod", "helloworld", () -> { LOGGER.info("Hello world from the MDK"); return "Hello world";});
//    }
//
//    private void processIMC(final InterModProcessEvent event)
//    {
////        LOGGER.info("Got IMC {}", event.getIMCStream().
////                map(m->m.getMessageSupplier().get()).
////                collect(Collectors.toList()));
//    }
//    @SubscribeEvent
//    public void onServerStarting(FMLServerStartingEvent event) {
////        LOGGER.info("HELLO from server starting");
//    }
//    @Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
//    public static class RegistryEvents {
//        @SubscribeEvent
//        public static void onBlocksRegistry(final RegistryEvent.Register<Block> blockRegistryEvent) {
//            LOGGER.info("HELLO from Register Block");
//        }
//    }
}
