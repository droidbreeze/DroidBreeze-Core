package com.droidbreeze.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class MarbleBlock extends Block
{	
	public MarbleBlock(Material material)
	{
		super(material);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setHardness(0.5F);
		this.setBlockName("marble");
	}
}
