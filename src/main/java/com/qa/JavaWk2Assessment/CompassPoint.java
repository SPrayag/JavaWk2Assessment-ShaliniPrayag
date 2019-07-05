package com.qa.JavaWk2Assessment;

public class CompassPoint {

	private String north;
	private String east;
	private String south;
	private String west;

	public String getNorth() {
		return north;
	}

	public String getEast() {
		return east;
	}

	public String getSouth() {
		return south;
	}

	public String getWest() {
		return west;
	}

	public CompassPoint(String north, String east, String south, String west) {
		super();
		this.north = north;
		this.east = east;
		this.south = south;
		this.west = west;
	}

}
