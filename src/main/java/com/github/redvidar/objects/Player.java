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

	public void addAnimal(String index,int i) {
		switch (index) {
			case "rabbit":
				this.farm.animals.get(0).addAmount((this.farm.animals.get(0).getAmount() + i)/2);
				break;
			case "sheep":
				this.farm.animals.get(1).addAmount((this.farm.animals.get(1).getAmount() + i)/2);
				break;
			case "pig":
				this.farm.animals.get(2).addAmount((this.farm.animals.get(2).getAmount() + i)/2);
				break;
			case "cow":
				this.farm.animals.get(3).addAmount((this.farm.animals.get(3).getAmount() + i)/2);
				break;
			case "horse":
				this.farm.animals.get(4).addAmount((this.farm.animals.get(4).getAmount() + i)/2);
				break;
			case "smallDog":
				this.farm.animals.get(5).addAmount((this.farm.animals.get(5).getAmount() + i)/2);
				break;
			case "bigDog":
				this.farm.animals.get(6).addAmount((this.farm.animals.get(6).getAmount() + i)/2);
				break;
		}
	}
}
