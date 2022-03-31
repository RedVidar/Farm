package com.github.redvidar.objects;

public class Animal {
	private int amount;
	private String name;

	public Animal(String name) {
		this.name = name;
	}

	public Animal(String name, int howMany) {
		this.name = name;
		this.amount = howMany;
	}


	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getName() {
		return name;
	}

	public int getAmount() {
		return amount;
	}
}
