package com.github.redvidar.communication;

import com.github.redvidar.objects.Animal;
import com.github.redvidar.objects.Player;

import java.util.List;

public class Printer {


	public void printIntPrompt() {

		System.out.println("Give int and confirm with Enter");
	}


	public void printWord(String word) {
		System.out.println("" + word);
	}


	public void printPlayerList(List<Player> players) {
		players.forEach(player -> {
			System.out.println("Player:" + player.getName());
		});
	}

	public void printFarm(List<Animal> animals) {
		animals.forEach(animal -> {
			System.out.println("Animal:" + animal.getName() + "Amount:" + animal.getAmount());
		});
	}

}
