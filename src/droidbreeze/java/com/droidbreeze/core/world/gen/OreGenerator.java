package com.droidbreeze.core.world.gen;

import java.util.Random;

import com.droidbreeze.core.DroidBreeze;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class OreGenerator implements IWorldGenerator
{

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) 
	{
		switch(world.provider.dimensionId)
		{
			case -1:
				generateNether(world, random, chunkX * 16, chunkZ * 16);
				break;
			case 0:
				generateSurface(world, random, chunkX * 16, chunkZ * 16);
				break;
			case 1:
				generateEnd(world, random, chunkX * 16, chunkZ * 16);
				break;
		}
	}
	
	private void generateEnd(World world, Random random, int chunkX, int chunkZ)
	{
		
	}
	
	private void generateSurface(World world, Random random, int chunkX, int chunkZ)
	{
		for(int count = 0; count < 5; count++)
		{
			int XCoord = chunkX + random.nextInt(16);
			int YCoord = random.nextInt(64);
			int ZCoord = chunkZ + random.nextInt(16);
			
			(new WorldGenMinable(DroidBreeze.blockMarble, 50)).generate(world, random, XCoord, YCoord, ZCoord);
		}
	}
	
	private void generateNether(World world, Random random, int chunkX, int chunkZ)
	{
		
	}
}
