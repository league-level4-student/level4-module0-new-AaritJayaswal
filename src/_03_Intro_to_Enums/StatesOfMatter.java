package _03_Intro_to_Enums;

import java.util.Random;

public enum StatesOfMatter {

	SOLID(0), LIQUID(25.55), GAS(100);

	double celsiusTemp;

	private StatesOfMatter(double celsiusTemp) {
		this.celsiusTemp = celsiusTemp;

	}

	public static double converttoFarenheit(double celsiusTemp) {
		double farenheitTemp = (celsiusTemp * (9 / 5) + 32);

		return farenheitTemp;

	}

	public static StatesOfMatter getRandomState() {
		Random ran = new Random();
		int value = ran.nextInt(2);
		return values()[value];

	}
}