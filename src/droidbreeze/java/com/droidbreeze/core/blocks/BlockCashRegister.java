package com.droidbreeze.core.blocks;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

import com.droidbreeze.core.DroidBreeze;
import com.droidbreeze.core.client.renderer.tileentity.TileEntityCashRegister;
import com.droidbreeze.core.tileentity.EntityCashRegister;

public class BlockCashRegister extends BlockContainer
{
	public BlockCashRegister(Material material)
	{
		super(material);
		
		this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.7F, 1.0F);
	}
	
	/**
	 * Create a new tile entity
	 */
	@Override
	public TileEntity createNewTileEntity(World world, int i)
	{
		return new EntityCashRegister();
	}
	
	/**
	 * Get entity render type.
	 */
	@Override 
	public int getRenderType()
	{
		return -1;
	}
	
	/**
	 * Is block opaque
	 */
	@Override
	public boolean isOpaqueCube()
	{
		return false;
	}
	
	/**
	 * Should we render this as a normal block
	 */
	public boolean renderAsNormalBlock()
	{
		return false;
	}
	
	/**
	 * Register block/entity icon.
	 * @param icon
	 */
	public void registerIcons(IIconRegister icon)
	{
		this.blockIcon = icon.registerIcon(DroidBreeze.MODID + ":blockTill");
	}
}
