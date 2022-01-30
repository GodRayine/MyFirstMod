package ru.bt.test;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import ru.bt.test.proxy.CommonProxy;

@Mod(modid = ExampleMod.MODID, version = ExampleMod.VERSION, name = ExampleMod.NAME)
public class ExampleMod {
    public static final String MODID = "myfirstmode";
    public static final String NAME = "My First Mode";
    public static final String VERSION = "0.0.1";
    public static final Item.ToolMaterial TOOL_MATERIAL = EnumHelper.addToolMaterial("myfirstmode:gordriniumingot", 3, 2000,50F, 20F, 12);


    public static final CreativeTabs Aboba = new CreativeTabs(ExampleMod.MODID) {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(Items.APPLE);
        }
    };
    @SidedProxy(clientSide = "ru.bt.test.proxy.ClientProxy", serverSide = "ru.bt.test.proxy.CommonProxy")
    public static CommonProxy proxy;

    @EventHandler
    public void load(FMLInitializationEvent event) {
        Registry.furnaceRecipes();
        proxy.load(event);

    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);
    }
}
