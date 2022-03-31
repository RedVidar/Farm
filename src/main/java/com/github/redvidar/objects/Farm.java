package com.github.redvidar.objects;

import java.util.ArrayList;
import java.util.List;

public class Farm  {
	List<Animal> animals;


	public Farm() {
		animals = new ArrayList<>();
		animals.add(new Animal("rabbit"));
		animals.add(new Animal("sheep"));
		animals.add(new Animal("pig"));
		animals.add(new Animal("cow"));
		animals.add(new Animal("horse"));
		animals.add(new Animal("smallDog"));
		animals.add(new Animal("bigDog"));
	}

	public Farm(boolean isEmpty) {
		animals = new ArrayList<>();
		animals.add(new Animal("rabbit",20));
		animals.add(new Animal("sheep",20));
		animals.add(new Animal("pig",20));
		animals.add(new Animal("cow",20));
		animals.add(new Animal("horse",10));
		animals.add(new Animal("smallDog",10));
		animals.add(new Animal("bigDog",10));
	}


}
