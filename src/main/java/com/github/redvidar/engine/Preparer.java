package com.github.redvidar.engine;

import com.github.redvidar.communication.Collector;
import com.github.redvidar.communication.Printer;
import com.github.redvidar.objects.Farm;
import com.github.redvidar.objects.Player;

public class Preparer {
	Printer printer = new Printer();
	Collector collector = new Collector();
	int numberOfPlayers;
	Player[] arr;
	String name;
	Farm farm = new Farm();

	public void prepare() {
//		int[][] mainFarm = farm.newFarm();
		Object mainFarm = farm.newPlayerFarm();
		farm.addSheep(3);
		farm.showFarm(mainFarm);
		printer.printWord("Number of players:");
		printer.printIntPrompt();
		numberOfPlayers = collector.readInt();
		arr = new Player[numberOfPlayers];
		for (int i = 0; i < numberOfPlayers; i++) {
			printer.printWord("Player name");
			name = collector.readString();
			arr[i] = new Player(name);
			printer.printWord(name);
//			printer.printAmountOfAnimals(1,2,mainFarm);
		}

	}

	public Object givePlayers(){
		return arr;
	}
}
