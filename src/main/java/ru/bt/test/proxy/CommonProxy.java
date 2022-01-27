package ru.bt.test.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import ru.bt.test.registers.BlockRegister;
import ru.bt.test.registers.OreGen;

public class CommonProxy {
    public void preInit(FMLPreInitializationEvent event)
    {
        BlockRegister.register();
    }

    public void load(FMLInitializationEvent event) {
        GameRegistry.registerWorldGenerator(new OreGen(), 0);
    }

    public void postInit(FMLPostInitializationEvent event) {

    }
}
