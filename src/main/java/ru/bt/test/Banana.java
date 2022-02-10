package ru.bt.test;

import net.minecraft.item.ItemFood;

public class Banana extends ItemFood {
    public Banana() {
        super(6, 3, false);
        setRegistryName("banana");
        setTranslationKey("banana");
        setCreativeTab(ExampleMod.MFM);
        setAlwaysEdible();
        setMaxStackSize(16);
    }
}
