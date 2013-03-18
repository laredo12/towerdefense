package com.kernel;

import java.util.ArrayList;

public class Wave {
	private int numEmemies;
	private ArrayList<Enemy> enemies;
	
	public int getNumEmemies() {
		return numEmemies;
	}
	public void setNumEmemies(int numEmemies) {
		this.numEmemies = numEmemies;
	}
	public ArrayList<Enemy> getEnemies() {
		return enemies;
	}
	public void setEnemies(ArrayList<Enemy> enemies) {
		this.enemies = enemies;
	}
	public Wave(int numEnemies)
	{
		this.numEmemies = numEnemies;
	}
	public void createEnemies(int numEnemies)
	{
		
	}
	public void populateMap()
	{
		
	}
}
