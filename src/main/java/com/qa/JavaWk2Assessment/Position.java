package com.qa.JavaWk2Assessment;

import java.util.Random;

public class Position extends CompassPoint {

	public Position(String north, String east, String south, String west) {
		super(north, east, south, west);
	}

	public static void main(String[] args, Object compass) {

		/*
		 * int max = 10; int min = 1; int range = max - min + 1;
		 * 
		 * for (int i = 0; i < 10; i++) { Random rand1 = new Random();
		 * rand1.nextInt(range + min); }
		 */

		for (int i = 0; i < 10; i++) {
			Random rand = new Random();
			rand.nextInt(10);

			if (i > 0) {
				compass.equals(i);

			}
		}

	}

}
