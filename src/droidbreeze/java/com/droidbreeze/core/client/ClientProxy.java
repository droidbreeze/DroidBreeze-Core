package com.droidbreeze.core.client;

import com.droidbreeze.core.CommonProxy;
import com.droidbreeze.core.client.renderer.tileentity.TileEntityCashRegister;
import com.droidbreeze.core.tileentity.EntityCashRegister;

import cpw.mods.fml.client.registry.ClientRegistry;

public class ClientProxy extends CommonProxy
{
	@Override
	public void registerRenderers()
	{
		 ClientRegistry.bindTileEntitySpecialRenderer(EntityCashRegister.class, new TileEntityCashRegister());
	}
}
