package com.github.redvidar.objects;

import com.github.redvidar.communication.Printer;

public class Player {
	Printer printer = new Printer();
	private String name;
	Farm farm = new Farm();


	public Player(String name) {
		this.name = name;
		this.farm = new Farm();
	}


	public String getName() {
		return name;
	}

}
