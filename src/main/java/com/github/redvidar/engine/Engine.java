package com.github.redvidar.engine;



public class Engine {

	Preparer prepareGame = new Preparer();
	Round round =new Round();


	public void run() {
		prepareGame.prepare();
		round.prepareRound(prepareGame.getPlayerList().get(0));
	}
}
