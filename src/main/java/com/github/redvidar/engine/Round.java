package com.github.redvidar.engine;

import com.github.redvidar.communication.ConsoleScanner;
import com.github.redvidar.communication.Printer;
import com.github.redvidar.objects.AnimalType;
import com.github.redvidar.objects.Player;

public class Round {
	private Printer printer = new Printer();
	private ConsoleScanner scanner = new ConsoleScanner();
	private Dice dice = Dice.createDice(true);

	public void prepareRound(Player player) {
		printer.printFarm(player.getFarm());
		AnimalType roll1 = dice.rollDice();
		AnimalType roll2 = dice.rollDice();
		if (roll1 == roll2) {
			player.addAnimal(roll1,2);
		} else {
			player.addAnimal(roll1,1);
			player.addAnimal(roll2,1);
		}
		printer.printFarm(player.getFarm());

	}
}