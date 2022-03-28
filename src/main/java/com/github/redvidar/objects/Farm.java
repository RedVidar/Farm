package com.github.redvidar.objects;

import com.github.redvidar.communication.Printer;

public class Farm {
	Printer printer = new Printer();
	public String animal;
	public int sheep;
	public int rabbit;
	public int pig;
	public int cow;
	public int horse;
	public int smallDog;
	public int bigDog;


	public Object newPlayerFarm() {
		sheep = 20;
		rabbit = 20;
		pig = 20;
		cow = 20;
		horse = 20;
		smallDog = 5;
		bigDog = 3;
		return this;
	}

	public void showFarm(Object farm) {
		printer.printInt(this.rabbit);
		printer.printInt(this.sheep);
		printer.printInt(this.pig);
		printer.printInt(this.cow);
		printer.printInt(this.horse);
		printer.printInt(this.smallDog);
		printer.printInt(this.bigDog);
	}

	public void addSheep(int x) {
		this.sheep = this.sheep + x;
	}
	//1-królik
	//2-owca
	//3-świnia
	//4-krowa
	//5-qń
	//6-mpies
	//7-dpies
	/*public int[][] newFarm() {
		int[][] mainFarm = {{1, 2, 3, 4, 5, 6, 7}, {20, 20, 20, 20, 20, 20, 5}};
		return mainFarm;
	}

	public int[][] newPlayerFarm() {
		int[][] mainFarm = {{1, 2, 3, 4, 5, 6, 7}, {0, 0, 0, 0, 0, 0, 0}};
		return mainFarm;
	}
	*/

}
