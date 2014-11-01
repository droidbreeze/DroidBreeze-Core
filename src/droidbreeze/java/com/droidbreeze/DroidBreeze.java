package com.droidbreeze;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

import com.droidbreeze.blocks.MarbleBlock;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = DroidBreeze.MODID, version = DroidBreeze.VERSION)
public class DroidBreeze
{
    public static final String MODID = "droidbreeze";
    public static final String VERSION = "1.0";
      
    @SidedProxy(clientSide="com.droidbreeze.client.ClientProxy", serverSide="com.droidbreeze.CommonProxy")
    public static CommonProxy proxy;
    
    /* BLOCKS */
    public static Block marbleBlock;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	marbleBlock = new MarbleBlock(Material.ground);
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	GameRegistry.registerBlock(marbleBlock, "marble");
    	
        proxy.registerRenderers();
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
    	
    }
}
