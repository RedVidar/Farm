package com.github.redvidar.objects;


import java.util.List;

public class Player {
	private String name;
	Farm farm = new Farm();


	public Player(String name) {
		this.name = name;
		this.farm = new Farm();
	}

	public Player() {
	}


	public String getName() {
		return name;
	}

	public void getFarm() {
		farm.printFarm(this.farm.animals);
	}


	public void printPlayerList(List<Player> players) {
		players.forEach(player -> {
			System.out.println("Player:" + player.getName());
		});
	}


	public void printPlayerFarm(Player player) {
		System.out.println(player.getName());
		player.getFarm();
	}
}
