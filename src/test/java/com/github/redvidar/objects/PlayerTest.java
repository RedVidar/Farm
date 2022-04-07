package com.github.redvidar.objects;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PlayerTest {

	Player player = new Player("xD");

	@Test

		//ctrl alt m v f

	void shouldAddRabbitWhenEmpty() {
		//given
		int rabbitCount = 5;
		int expectedRabbitCount = 2;

		//when
		player.addAnimal(AnimalType.RABBIT, rabbitCount);
		//than
		assertThat(player.getFarm().get(0).getAmount()).isEqualTo(expectedRabbitCount);
	}
	@Test
	void shouldAddRabbitWhenOdd(){
		//given
		int expectedRabbitCount =6;
		int rabbitCountFirst =6;
		int rabbitCountSecond =3;
		//when
		player.addAnimal(AnimalType.RABBIT,rabbitCountFirst);
		player.addAnimal(AnimalType.RABBIT,rabbitCountSecond);
		//than
		assertThat(player.getFarm().get(0).getAmount()).isEqualTo(expectedRabbitCount);

	}
	@Test
	void shouldAddRabbitWhenEven(){
		//given
		int expectedRabbitCount =7;
		int rabbitCountFirst =8;
		int rabbitCountSecond =2;
		//when
		player.addAnimal(AnimalType.RABBIT,rabbitCountFirst);
		player.addAnimal(AnimalType.RABBIT,rabbitCountSecond);
		//than
		assertThat(player.getFarm().get(0).getAmount()).isEqualTo(expectedRabbitCount);

	}
}
