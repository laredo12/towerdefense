package com.kernel;

import java.util.ArrayList;

public class Player {
	private String name;
	private long gems;
	private ArrayList<StoreUpgrade> storeUpgrade;
	public long getGems() {
		return gems;
	}
	public void setGems(long gems) {
		this.gems = gems;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<StoreUpgrade> getStoreUpgrade() {
		return storeUpgrade;
	}
	public void setStoreUpgrade(ArrayList<StoreUpgrade> storeUpgrade) {
		this.storeUpgrade = storeUpgrade;
	}
}