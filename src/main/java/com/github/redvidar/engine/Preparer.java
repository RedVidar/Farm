package com.github.redvidar.engine;

import com.github.redvidar.communication.Collector;
import com.github.redvidar.communication.Printer;
import com.github.redvidar.objects.Farm;
import com.github.redvidar.objects.Player;

import java.util.ArrayList;
import java.util.List;

public class Preparer {

	Printer printer = new Printer();
	Collector collector = new Collector();
	int numberOfPlayers;
	List<Player> players;
	String name;
	Player player = new Player();
	Farm mainFarm = new Farm();

	public void prepare() {
		mainFarm = new Farm(2);
		printer.printWord("Number of players:");
		printer.printIntPrompt();
		numberOfPlayers = collector.readInt();
		players = new ArrayList<>();
		for (int i = 0; i < numberOfPlayers; i++) {
			printer.printWord("Player name");
			name = collector.readString();
			players.add(new Player(name));
		}
		player.printPlayerList(players);

	}

	public List<Player> getPlayerList() {
		return players;
	}

}
