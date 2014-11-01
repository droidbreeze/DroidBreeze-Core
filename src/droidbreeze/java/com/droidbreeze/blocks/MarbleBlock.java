package com.droidbreeze.blocks;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class MarbleBlock extends Block
{
	public static final String[] marbleBlocks = new String[] {"white", "yellow", "red"};
	@SideOnly(Side.CLIENT)
	private IIcon[] marbleIcons;
	
	public MarbleBlock(Material material)
	{
		super(material);
		this.setCreativeTab(CreativeTabs.tabBlock);
	}
	
	@SideOnly(Side.CLIENT)
    public IIcon getIcon(int icon1, int icon2)
    {
        if (icon2 < 0 || icon2 >= this.marbleIcons.length)
        {
        	icon2 = 0;
        }

        return this.marbleIcons[icon2];
    }
	
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(Item i, CreativeTabs j, List k)
	{
		k.add(new ItemStack(i, 1, 0));
		k.add(new ItemStack(i, 1, 1));
		k.add(new ItemStack(i, 1, 2));
	}
	
	@SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister p_149651_1_)
    {
        this.marbleIcons = new IIcon[marbleBlocks.length];

        for (int i = 0; i < this.marbleIcons.length; ++i)
        {
            this.marbleIcons[i] = p_149651_1_.registerIcon(this.getTextureName() + "_" + marbleBlocks[i]);
        }
    }
}
