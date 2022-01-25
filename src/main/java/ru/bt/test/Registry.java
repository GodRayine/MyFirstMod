package ru.bt.test;

import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import ru.bt.test.crafts.furnace.GOreToGIngot;
import ru.bt.test.items.tools.ItemGSword;

@GameRegistry.ObjectHolder("myfirstmode")
@Mod.EventBusSubscriber
public class Registry {

    @GameRegistry.ObjectHolder("gring")
    public static GordryRing GORDRY_RING;
    @GameRegistry.ObjectHolder("banana")
    public static Banana BANANA;
    @GameRegistry.ObjectHolder("gordriniumingot")
    public static GordriniumIngot GORDRINIUM_INGOT;
    @GameRegistry.ObjectHolder("gsword")
    public static ItemGSword ITEM_GSWORD;

    @SubscribeEvent
    public static void onRegistryItem(RegistryEvent.Register<Item> event) {
        event.getRegistry().register(new GordryRing());
        event.getRegistry().register(new Banana());
        event.getRegistry().register(new GordriniumIngot());
        event.getRegistry().register(new ItemGSword());
    }

    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public static void onRegistryModel(ModelRegistryEvent event) {
        registryModel(GORDRY_RING);
        registryModel(BANANA);
        registryModel(GORDRINIUM_INGOT);
        registryModel(ITEM_GSWORD);
    }

    @SideOnly(Side.CLIENT)
    private static void registryModel(Item item) {
        final ResourceLocation regName = item.getRegistryName();
        final ModelResourceLocation mrl = new ModelResourceLocation(regName, "inventory");
        ModelBakery.registerItemVariants(item, mrl);
        ModelLoader.setCustomModelResourceLocation(item, 0, mrl);
    }

    public static void furnaceRecipes(){
        GOreToGIngot.registerRecipes();
    }

}
