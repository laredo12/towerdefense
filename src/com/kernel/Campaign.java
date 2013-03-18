package com.kernel;

import java.util.HashMap;


public class Campaign {
	private long gold;
	private int numDeadEnemies;
	HashMap<String, Long> dictionary = new HashMap<String, Long>();
	
	public long getGold() {
		return gold;
	}
	public void setGold(long gold) {
		this.gold = gold;
	}
	public int getNumDeadEnemies() {
		return numDeadEnemies;
	}
	public void setNumDeadEnemies(int numDeadEnemies) {
		this.numDeadEnemies = numDeadEnemies;
	}
	public HashMap<String, Long> getDictionary() {
		return dictionary;
	}
	public void setDictionary(HashMap<String, Long> dictionary) {
		this.dictionary = dictionary;
	}	
}
