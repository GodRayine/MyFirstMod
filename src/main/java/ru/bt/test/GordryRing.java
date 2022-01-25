package ru.bt.test;

import baubles.api.BaubleType;
import baubles.api.IBauble;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class GordryRing extends Item implements IBauble {
    public GordryRing() {
        setRegistryName("gring");
        setTranslationKey("gring");
        setCreativeTab(ExampleMod.Aboba);
        setMaxStackSize(1);
    }

    @Override
    public BaubleType getBaubleType(ItemStack itemStack) {
        return BaubleType.RING;
    }

}
