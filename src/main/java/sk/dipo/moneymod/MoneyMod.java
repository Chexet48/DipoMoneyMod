package sk.dipo.moneymod;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(MoneyMod.MODID)
public class MoneyMod {
    public static final String MODID = "dipomoneymod";
    private static final Logger LOGGER = LogManager.getLogger();
    public static MoneyMod instance;

    public MoneyMod() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::enqueueIMC);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::processIMC);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        MinecraftForge.EVENT_BUS.register(this);

        instance = this;

        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
    }

    private void setup(final FMLCommonSetupEvent event) {
        // Pre-Init Code
        LOGGER.info("Pre-Init Started");
        LOGGER.info("Pre-Init Finished");
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
        // Client-Only Code
    }

    private void enqueueIMC(final InterModEnqueueEvent event) {
        // Code to Dispatch IMC to Another Mod
    }

    private void processIMC(final InterModProcessEvent event) {
        // Code to Handle IMC from Other Mods
    }
}
