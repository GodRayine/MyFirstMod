package ru.bt.test.items.tools;

import net.minecraft.item.ItemSword;
import ru.bt.test.ExampleMod;

public class ItemGSword extends ItemSword {
    public ItemGSword(){
        super(ExampleMod.TOOL_MATERIAL);
        setRegistryName("gsword");
        setTranslationKey("gsword");
        setCreativeTab(ExampleMod.Aboba);
        setMaxStackSize(1);
    }

}
