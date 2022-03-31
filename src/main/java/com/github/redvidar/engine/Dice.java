package com.github.redvidar.engine;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Dice {
	private List<String> sides;
	private Random rand = new Random();

	public Dice(){
		sides= new ArrayList<>();
		sides.add("rabbit");
		sides.add("sheep");
		sides.add("pig");
		sides.add("cow");
		sides.add("horse");
		sides.add("smallDog");
		sides.add("bigDog");
	}
//TODO exchange to string (possible to make 2of same kind)
	//public int rollDice(){
		//return rand.nextInt(sides.size());
	public String rollDice(){
		return sides.get(rand.nextInt(sides.size()));
	}
}
