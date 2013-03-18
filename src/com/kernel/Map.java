package com.kernel;

import java.util.ArrayList;

public class Map {

	private ArrayList<Wave> Wave;
	private String name;

	public Map() {
		// TODO
	}

	public ArrayList<Wave> getWave() {
		return Wave;
	}

	public void setWave(ArrayList<Wave> wave) {
		Wave = wave;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
