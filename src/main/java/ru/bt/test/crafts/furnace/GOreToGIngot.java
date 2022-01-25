package ru.bt.test.crafts.furnace;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import ru.bt.test.registers.BlockRegister;
import ru.bt.test.Registry;

public class GOreToGIngot {
    public static void registerRecipes() {
        GameRegistry.addSmelting(new ItemStack(BlockRegister.GORDRINIUM), new ItemStack(Registry.GORDRINIUM_INGOT), 20F);
    }
}