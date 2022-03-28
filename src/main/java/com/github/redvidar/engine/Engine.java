package com.github.redvidar.engine;

import com.github.redvidar.communication.Collector;
import com.github.redvidar.communication.Printer;

public class Engine {
	Printer printer = new Printer();
	Collector collector = new Collector();
	Preparer prepareGame = new Preparer();

	public void run() {
		prepareGame.prepare();

	}
}
