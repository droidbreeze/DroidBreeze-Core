package com.droidbreeze.core.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelCashRegister extends ModelBase
{
    //fields
    ModelRenderer tillBase;
    ModelRenderer tillSupportFront;
    ModelRenderer tillScreenFront;
    ModelRenderer tillSupportBack;
    ModelRenderer tillScreenBack;
  
  public ModelCashRegister()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      tillBase = new ModelRenderer(this, 0, 0);
      tillBase.addBox(0F, 0F, 0F, 14, 1, 10);
      tillBase.setRotationPoint(-7F, 23F, -7F);
      tillBase.setTextureSize(64, 32);
      tillBase.mirror = true;
      setRotation(tillBase, 0F, 0F, 0F);
      tillSupportFront = new ModelRenderer(this, 0, 25);
      tillSupportFront.addBox(0F, 0F, 0F, 12, 4, 1);
      tillSupportFront.setRotationPoint(-6F, 19F, -6F);
      tillSupportFront.setTextureSize(64, 32);
      tillSupportFront.mirror = true;
      setRotation(tillSupportFront, 0F, 0F, 0F);
      tillScreenFront = new ModelRenderer(this, 0, 12);
      tillScreenFront.addBox(0F, 0F, 0F, 14, 10, 2);
      tillScreenFront.setRotationPoint(-7F, 12F, -1F);
      tillScreenFront.setTextureSize(64, 32);
      tillScreenFront.mirror = true;
      setRotation(tillScreenFront, -0.7853982F, 0F, 0F);
      tillSupportBack = new ModelRenderer(this, 27, 25);
      tillSupportBack.addBox(0F, 0F, 0F, 12, 1, 1);
      tillSupportBack.setRotationPoint(-6F, 22F, -5F);
      tillSupportBack.setTextureSize(64, 32);
      tillSupportBack.mirror = true;
      setRotation(tillSupportBack, 0F, 0.0174533F, 0F);
      tillScreenBack = new ModelRenderer(this, 33, 12);
      tillScreenBack.addBox(0F, 0F, 0F, 12, 8, 2);
      tillScreenBack.setRotationPoint(-6F, 14F, 0F);
      tillScreenBack.setTextureSize(64, 32);
      tillScreenBack.mirror = true;
      setRotation(tillScreenBack, -0.7853982F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    tillBase.render(f5);
    tillSupportFront.render(f5);
    tillScreenFront.render(f5);
    tillSupportBack.render(f5);
    tillScreenBack.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }

}
