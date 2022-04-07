package com.github.redvidar.objects;

import java.util.ArrayList;
import java.util.List;

import static com.github.redvidar.objects.AnimalType.*;

public class Farm  {
	private List<Animal> animals;

	public List<Animal> getAnimals() {
		return animals;
	}

	public Farm() {
		animals = new ArrayList<>();
		animals.add(new Animal(RABBIT));
		animals.add(new Animal(SHEEP));
		animals.add(new Animal(PIG));
		animals.add(new Animal(COW));
		animals.add(new Animal(HORSE));
		animals.add(new Animal(SMALL_DOG));
		animals.add(new Animal(BIG_DOG));
	}

	public Farm(boolean isEmpty) {
		animals = new ArrayList<>();
		animals.add(new Animal(RABBIT,20));
		animals.add(new Animal(SHEEP,20));
		animals.add(new Animal(PIG,20));
		animals.add(new Animal(COW,20));
		animals.add(new Animal(HORSE,10));
		animals.add(new Animal(SMALL_DOG,10));
		animals.add(new Animal(BIG_DOG,10));
	}


}
