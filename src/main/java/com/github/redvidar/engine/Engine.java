package com.github.redvidar.engine;

import com.github.redvidar.communication.Collector;
import com.github.redvidar.communication.Printer;
import com.github.redvidar.objects.Player;

public class Engine {
	Printer printer = new Printer();
	Collector collector = new Collector();
	Preparer prepareGame = new Preparer();
	Player player = new Player();

	public void run() {
		prepareGame.prepare();
		//player.printPlayerList(prepareGame.getPlayerList());
	}
}
