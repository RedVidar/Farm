package com.github.redvidar.objects;

public class Animal {

	private int amount;

	public AnimalType getName() {
		return name;
	}

	private AnimalType name;

	public Animal(AnimalType name) {
		this.name = name;
	}

	public Animal(AnimalType name, int howMany) {
		this.name = name;
		this.amount = howMany;
	}


	public int getAmount() {
		return amount;
	}

	public void addAmount(int howMany) {
		this.amount = this.amount + howMany;
	}

	;
}
