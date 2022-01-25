package ru.bt.test.crafts.craftingtable;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.crafting.CraftingHelper;
import net.minecraftforge.common.crafting.IRecipeFactory;

public class CraftingTableRegister {
    public static void register(){
    }
    private static void registerRecipes(String name){
        CraftingHelper.register(new ResourceLocation("myfirstmode", name), (IRecipeFactory) (context, json) -> CraftingHelper.getRecipe(json, context));
    }
}
