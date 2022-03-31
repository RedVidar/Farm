package com.github.redvidar.engine;



public class Engine {

	Preparer prepareGame = new Preparer();


	public void run() {
		prepareGame.prepare();
		//player.printPlayerList(prepareGame.getPlayerList());
	}
}
