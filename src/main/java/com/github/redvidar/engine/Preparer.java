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

	public void prepare() {

		printer.printWord("Number of players:");
		printer.printIntPrompt();
		numberOfPlayers = collector.readInt();
		arr = new Player[numberOfPlayers];
		for (int i = 0; i < numberOfPlayers; i++) {
			printer.printWord("Player name");
			name = collector.readString();
			arr[i] = new Player(name);
		}
		for (int i = 0; i < numberOfPlayers; i++) {
			printer.printWord(arr[i].getName());
		}

	}


}
