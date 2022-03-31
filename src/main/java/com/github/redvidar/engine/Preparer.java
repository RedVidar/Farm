package com.github.redvidar.engine;

import com.github.redvidar.communication.ConsoleScanner;
import com.github.redvidar.communication.Printer;
import com.github.redvidar.objects.Farm;
import com.github.redvidar.objects.Player;
import java.util.ArrayList;
import java.util.List;

public class Preparer {

	private Printer printer = new Printer();
	private ConsoleScanner collector = new ConsoleScanner();
	private int numberOfPlayers;
	private List<Player> players;
	private Farm mainFarm;

	public void prepare() {
		mainFarm = new Farm(true);
		printer.printWord("Number of players:");
		printer.printIntPrompt();
		numberOfPlayers = collector.readInt();
		players = new ArrayList<>();
		for (int i = 0; i < numberOfPlayers; i++) {
			printer.printWord("Player name");
			String name = collector.readString();
			players.add(new Player(name));
			printer.printFarm(players.get(i).getFarm());
		}
		printer.printPlayerList(players);
	}

	public List<Player> getPlayerList() {
		return players;
	}

}
