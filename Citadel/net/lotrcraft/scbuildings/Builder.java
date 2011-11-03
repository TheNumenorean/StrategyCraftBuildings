package net.lotrcraft.scbuildings;

import org.bukkit.Bukkit;

import org.bukkit.Location;
import org.bukkit.craftbukkit.CraftWorld;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;

import net.lotrcraft.strategycraft.buildings.Castle;
import net.lotrcraft.strategycraft.units.Unit;

import net.minecraft.server.EntityPlayer;
import net.minecraft.server.WorldServer;

public class Builder extends Unit {

	public Builder(Castle castle, Location l) {
		super(castle, l);
	}

	@Override
	public void onAttack(Object arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onAttacked(Object arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onDestroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void onMove(Location arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void create(Location l) {
		//EntityPlayer v = new EntityPlayer(null, null, null, null);
		//WorldServer ws = ((CraftWorld) l.getWorld()).getHandle();
		
	}

}
