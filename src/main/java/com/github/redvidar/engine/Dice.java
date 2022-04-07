package com.github.redvidar.engine;

import com.github.redvidar.objects.AnimalType;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

import static com.github.redvidar.objects.AnimalType.*;

public class Dice {
	private List<AnimalType> sides;
	private Random rand = new Random();

	private Dice(boolean wolf) {
		sides = new ArrayList<>();

		IntStream.range(0, 6).forEach(i -> sides.add(RABBIT));
		IntStream.range(0, 2).forEach(i -> sides.add(SHEEP));
		sides.add(PIG);
		if (wolf) {
			sides.add(COW);
			sides.add(WOLF);
			sides.add(SHEEP);
		} else {
			sides.add(HORSE);
			sides.add(PIG);
			sides.add(FOX);
		}
	}


	public static Dice createDice(boolean wolf) {
		return new Dice(wolf);
	}


	public AnimalType rollDice() {
		return sides.get(rand.nextInt(sides.size()));
	}
}
