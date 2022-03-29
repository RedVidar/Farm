package com.github.redvidar.objects;

public class Animal {
	private int amount;
	private String name;

	public void creteAnimal(String type, int howMany) {
		this.name = type;
		this.amount = howMany;
	}

	public void setName(String name) {
		this.name = name;
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
