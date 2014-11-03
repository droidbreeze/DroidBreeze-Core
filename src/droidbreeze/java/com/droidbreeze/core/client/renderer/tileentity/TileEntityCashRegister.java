package com.droidbreeze.core.client.renderer.tileentity;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

import org.lwjgl.opengl.GL11;

import com.droidbreeze.core.client.model.ModelCashRegister;

public class TileEntityCashRegister extends TileEntitySpecialRenderer {
        
    private final ModelCashRegister model;
    
    public TileEntityCashRegister() {
            this.model = new ModelCashRegister();
    }
    
    /**
     * Set rotation of cash register in world.
     * 
     * @param world
     * @param coordX
     * @param coordY
     * @param coordZ
     */
    private void adjustRotatePivotViaMeta(World world, int coordX, int coordY, int coordZ) 
    {
            int meta = world.getBlockMetadata(coordX, coordY, coordZ);
            GL11.glPushMatrix();
            GL11.glRotatef(meta * (-90), 0.0F, 0.0F, 1.0F);
            GL11.glPopMatrix();
    }
    
    /**
     * Render the Cash Register 
     */
    @Override
    public void renderTileEntityAt(TileEntity tileEntity, double coordX, double coordY, double coordZ, float scale) 
    {
            GL11.glPushMatrix();
            GL11.glTranslatef((float) coordX + 0.5F, (float) coordY + 1.5F, (float) coordZ + 0.5F);

            ResourceLocation textures = (new ResourceLocation("droidbreezeCore:textures/tileentities/cashRegister.png")); 
            Minecraft.getMinecraft().renderEngine.bindTexture(textures);       
            
            GL11.glRotatef(180F, 0.0F, 0.0F, 1.0F);
            this.model.render((Entity)null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
            GL11.glPopMatrix();
    }
}