package ru.bt.test;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

public class Gordrinium extends Block {

    public Gordrinium() {
        super(Material.ROCK);
        setRegistryName("gordrinium");
        setTranslationKey("gordrinium");
        setCreativeTab(ExampleMod.Aboba);
        setHardness(10);
        setResistance(2000);
        setHarvestLevel("pickaxe",3);
    }

    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }

    @Override
    public boolean isFullCube(IBlockState state) {
        return false;
    }
}
