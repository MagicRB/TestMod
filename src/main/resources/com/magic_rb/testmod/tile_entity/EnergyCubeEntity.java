package com.magic_rb.testmod.tile_entity;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.energy.IEnergyStorage;

public class EnergyCubeEntity extends TileEntity implements IEnergyStorage{

	int energyStored    = 0;
	int maxEnergyStored = 1000000;
	int maxReceive      = 200;
	int maxExtract      = 200;
	
	protected void changed() {
		markDirty();
	}
	
	@Override
	public NBTTagCompound writeToNBT(NBTTagCompound compound) {
		compound.setInteger("energy_stored", energyStored);
		return super.writeToNBT(compound);
	}
	
	@Override
	public void readFromNBT(NBTTagCompound compound) {
		energyStored = compound.getInteger("energy_stored");
		super.readFromNBT(compound);
	}
	
	@Override
	public int receiveEnergy(int maxReceive, boolean simulate) {
		if (maxEnergyStored - energyStored < maxReceive) {
			return maxEnergyStored - energyStored;
		}
		return maxReceive;
		super.changed();
	}

	@Override
	public int extractEnergy(int maxExtract, boolean simulate) {
		if (energyStored < maxExtract) {
			return energyStored;
		}
		return maxExtract;
		//changed();
	}

	@Override
	public int getEnergyStored() {
		return energyStored;
	}

	@Override
	public int getMaxEnergyStored() {
		return maxEnergyStored;
	}

	@Override
	public boolean canExtract() {
		return true;
	}

	@Override
	public boolean canReceive() {
		return true;
	}
	
}
