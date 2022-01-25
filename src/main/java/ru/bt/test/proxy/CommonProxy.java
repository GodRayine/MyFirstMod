package ru.bt.test.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import ru.bt.test.registers.BlockRegister;

public class CommonProxy {
    public void preInit(FMLPreInitializationEvent event)
    {
        BlockRegister.register();
    }

    public void load(FMLInitializationEvent event)
    {

    }

    public void postInit(FMLPostInitializationEvent event) {

    }
}
