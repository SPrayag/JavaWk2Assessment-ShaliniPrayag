package com.qa.JavaWk2Assessment;

import java.util.List;
import java.util.ArrayList;

public class Game {

	private List<CompassPoint> compass = new ArrayList<CompassPoint>();
	private List<Position> position = new ArrayList<Position>();

	private int num;

	public Game(List<CompassPoint> compass, List<Position> position, int num) {
		super();
		this.compass = compass;
		this.position = position;
		this.num = num;
	}

	public List<CompassPoint> getCompass() {
		return compass;
	}

	public List<Position> getPosition() {
		return position;
	}

	public int getNum() {
		return num;
	}

}