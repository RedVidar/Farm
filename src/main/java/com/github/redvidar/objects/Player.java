package com.github.redvidar.objects;

import java.util.List;

public class Player {
	private String name;
	private Farm farm = new Farm();


	public Player(String name) {
		this.name = name;
	}


	public String getName() {
		return name;
	}


	public List<Animal> getFarm() {
		return this.farm.animals;
	}
}
