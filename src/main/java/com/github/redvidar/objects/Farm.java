package com.github.redvidar.objects;

import com.github.redvidar.communication.Printer;

public class Farm {
	Printer printer = new Printer();
	Animal animal = new Animal();
	Animal[] arr;


	public Farm() {
		arr = new Animal[7];
		arr[0] = new Animal();
		this.animal.setName("rabbit");
		arr[1] = new Animal();
		this.animal.setName("sheep");
		arr[2] = new Animal();
		this.animal.setName("pig");
		arr[3] = new Animal();
		this.animal.setName("cow");
		arr[4] = new Animal();
		this.animal.setName("horse");
		arr[5] = new Animal();
		this.animal.setName("smallDog");
		arr[6] = new Animal();
		this.animal.setName("bigDog");

	}

public void showFarm(Farm[] farmToSchow){
	for (int i = 0; i < 7; i++) {
		printer.printWord(farmToSchow[i].animal.getName());
		printer.printInt(farmToSchow[i].animal.getAmount());
	}
}
}
