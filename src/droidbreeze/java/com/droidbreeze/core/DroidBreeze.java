package com.droidbreeze.core;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.droidbreeze.core.blocks.BlockCashRegister;
import com.droidbreeze.core.blocks.BlockMarble;
import com.droidbreeze.core.items.ItemDebitCard;
import com.droidbreeze.core.tileentity.EntityCashRegister;
import com.droidbreeze.core.world.gen.OreGenerator;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@Mod(modid = DroidBreeze.MODID, version = DroidBreeze.VERSION)
public class DroidBreeze
{
    public static final String MODID = "DroidBreezeCore";
    public static final String VERSION = "1.0.0";
      
    @SidedProxy(clientSide="com.droidbreeze.core.client.ClientProxy", serverSide="com.droidbreeze.core.CommonProxy")
    public static CommonProxy proxy;
    
    /* CREATIVE TABS */
    public static CreativeTabs tabDroidBreezeCore = new CreativeTabs("tabDroidBreezeCore")
    {
    	@Override
    	@SideOnly(Side.CLIENT)
    	public Item getTabIconItem()
    	{
    		return itemDebitCard;
    	}
    };
    
    /* BLOCKS */
    public static Block blockTill;
    public static Block blockMarble;
    
    /* ITEMS */
    public static Item itemDebitCard;
    
    /* TILE ENTITIES */
    
    /**
     * Prepare instances for game use.
     * @param event
     */
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	preInitItems();
    	preInitBlocks();
    }
    
    /**
     * Cerate new item instances
     */
    public void preInitItems()
    {
    	itemDebitCard = new ItemDebitCard().setUnlocalizedName("debitCard").setTextureName(MODID + ":debitCard").setCreativeTab(this.tabDroidBreezeCore);
    }
    
    /**
     * Create new block instances
     */
    public void preInitBlocks()
    {
    	blockTill = new BlockCashRegister(Material.rock).setBlockName("cashRegister").setBlockTextureName(MODID + ":cashRegisterIcon").setCreativeTab(this.tabDroidBreezeCore);
    	blockMarble = new BlockMarble(Material.rock).setBlockName("marble").setBlockTextureName(MODID + ":marble").setCreativeTab(this.tabDroidBreezeCore);
    }
    
    /**
     * Register instances for ingame use.
     * @param event
     */
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	initRegisterBlocks();
    	initRegisterItems();
    	initRegisterTileEntities();
    	initRegisterWorldGenerators();
    	
    	
        proxy.registerRenderers();
    }
    
    /**
     * Register Blocks
     */
    public void initRegisterBlocks()
    {
    	GameRegistry.registerBlock(blockTill, "cashRegisterIcon");
    	GameRegistry.registerBlock(blockMarble, "blockMarble");
    }
    
    /**
     * Register Items
     */
    public void initRegisterItems()
    {
    	GameRegistry.registerItem(itemDebitCard, "debit-card");
    }
    
    /**
     * Register Tile Entities
     */
    public void initRegisterTileEntities()
    {
    	GameRegistry.registerTileEntity(EntityCashRegister.class, "cashRegisterEntity");
    }
    
    /**
     * Register World Generators
     */
    public void initRegisterWorldGenerators()
    {
    	GameRegistry.registerWorldGenerator(new OreGenerator(), 1);
    }
    
    /**
     * 
     * @param event
     */
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
    	
    }
}
