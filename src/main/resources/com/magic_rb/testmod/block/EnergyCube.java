package com.magic_rb.testmod.block;

import com.magic_rb.testmod.TestMod;
import com.magic_rb.testmod.tile_entity.EnergyCubeEntity;

import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

public class EnergyCube extends Block implements ITileEntityProvider {
	protected String name = "energy_cube";
	CreativeTabs tab = CreativeTabs.BUILDING_BLOCKS;
	
	public EnergyCube() {
		super(Material.ROCK);
		
		setUnlocalizedName(this.name);
		setRegistryName(this.name);
		
		setHardness(3f);
		setResistance(5f);
		
		super.setCreativeTab(tab);
		
	}
	
	public void registerItemModel(Item itemBlock) {
		TestMod.proxy.registerItemRenderer(itemBlock, 0, name);
	}
	
	public Item createItemBlock() {
		return new ItemBlock(this).setRegistryName(getRegistryName());
	}
	
    @Override
    public TileEntity createNewTileEntity(World worldIn, int meta) {
        return new EnergyCubeEntity();
    }

    private EnergyCubeEntity getTE(World world, BlockPos pos) {
        return (EnergyCubeEntity) world.getTileEntity(pos);
    }
    
    public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, EnumFacing side, float hitX, float hitY, float hitZ)
    {
    	TextComponentTranslation component = new TextComponentTranslation("message.testmod.energy_stored", getTE(world, pos).getEnergyStored());
        component.getStyle().setColor(TextFormatting.GREEN);
        player.sendStatusMessage(component, false);
    	return true;
    }
}
