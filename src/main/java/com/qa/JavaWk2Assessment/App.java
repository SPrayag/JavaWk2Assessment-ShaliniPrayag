package com.qa.JavaWk2Assessment;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		String input = null;
		Scanner scan = new Scanner(System.in);

		System.out.println("Grey foggy clouds float oppressively close to you, \r\n"
				+ "reflected in the murky grey water which reaches up your shins.\r\n"
				+ "Some black plants barely poke out of the shallow water.\r\n"
				+ "You notice a small watch-like device in your left hand.  \r\n"
				+ "It has hands like a watch, but the hands don't seem to tell time. \r\n");

		System.out.println("Please enter north, east, south or west:");
		String s = scan.nextLine();

		while (input == null) {
			try {
				input = s;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		// System.out.println(input);

	}
}