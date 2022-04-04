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
		return this.farm.getAnimals();
	}

	public void addAnimal(AnimalType index, int i) {
		switch (index) {
			case RABBIT:
				this.farm.getAnimals().get(0).addAmount((this.farm.getAnimals().get(0).getAmount() + i)/2);
				break;
			case SHEEP:
				this.farm.getAnimals().get(1).addAmount((this.farm.getAnimals().get(1).getAmount() + i)/2);
				break;
			case PIG:
				this.farm.getAnimals().get(2).addAmount((this.farm.getAnimals().get(2).getAmount() + i)/2);
				break;
			case COW:
				this.farm.getAnimals().get(3).addAmount((this.farm.getAnimals().get(3).getAmount() + i) / 2);
				break;
			case HORSE:
				this.farm.getAnimals().get(4).addAmount((this.farm.getAnimals().get(4).getAmount() + i)/2);
				break;
			case SMALL_DOG:
				this.farm.getAnimals().get(5).addAmount((this.farm.getAnimals().get(5).getAmount() + i)/2);
				break;
			case BIG_DOG:
				this.farm.getAnimals().get(6).addAmount((this.farm.getAnimals().get(6).getAmount() + i)/2);
				break;
		}
	}
}
