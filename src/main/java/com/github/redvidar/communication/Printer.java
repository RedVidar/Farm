package com.github.redvidar.communication;

public class Printer {

	public void printIntPrompt() {
		System.out.println("Give int and confirm with Enter");
	}

	public void printCharPrompt() {
		System.out.println("Give char and confirm with Enter");
	}

	public void printRoundMenu() {
		System.out.println("1. Exchange cards");
		System.out.println("2. Dice roll");
	}

	public void printWord(String word) {
		System.out.println("" + word);
	}

	public void printAmountOfAnimals(int x, int y, int[][] z) {
		int amount = z[x][y];
		System.out.println(amount);
	}
	public void printInt(Object x){
		System.out.println(x);
	}
}
