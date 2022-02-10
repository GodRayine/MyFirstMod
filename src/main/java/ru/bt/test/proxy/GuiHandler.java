//package ru.bt.test.proxy;
//
//import net.minecraft.entity.player.EntityPlayer;
//import net.minecraft.tileentity.TileEntity;
//import net.minecraft.util.math.BlockPos;
//import net.minecraft.world.World;
//import net.minecraftforge.fml.common.network.IGuiHandler;
//import ru.bt.test.tile.TileEntityForge;
//import ru.bt.test.blocks.ForgeTable;
//
//public class GuiProxy implements IGuiHandler {
//    @Override
//    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
//        BlockPos pos = new BlockPos(x, y, z);
//        TileEntity te = world.getTileEntity(pos);
//        if (te instanceof TileEntityForge) {
//            return new TestContainer(player.inventory, (TileEntityForge) te);
//        }
//        return null;
//    }
//
//    @Override
//    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
//        BlockPos pos = new BlockPos(x, y, z);
//        TileEntity te = world.getTileEntity(pos);
//        if (te instanceof TileEntityForge) {
//            TileEntityForge containerTileEntity = (TileEntityForge) te;
//            return new TestContainerGui(containerTileEntity, new TestContainer(player.inventory, containerTileEntity));
//        }
//        return null;
//    }
//}
