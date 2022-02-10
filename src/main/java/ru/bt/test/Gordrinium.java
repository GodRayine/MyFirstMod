package ru.bt.test;

import net.minecraft.block.BlockOre;
import net.minecraft.block.state.IBlockState;

public class Gordrinium extends BlockOre {

    public Gordrinium() {
        setRegistryName("gordrinium");
        setTranslationKey("gordrinium");
        setCreativeTab(ExampleMod.MFM);
        setHardness(10);
        setResistance(2000);
        setHarvestLevel("pickaxe",3);
        setResistance(20.0F);
    }

    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return true;
    }

    @Override
    public boolean isFullCube(IBlockState state) {
        return false;
    }
}
