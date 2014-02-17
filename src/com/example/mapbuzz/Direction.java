package com.example.mapbuzz;

public class Direction {
	private int distance;
	private int duration;
	private long start_lat;
	private long start_lng;
	private long end_lat;
	private long end_lng;
	private String maneuver;
	
	public Direction(int distance, int duration, long start_lat,
			long start_lng, long end_lat, long end_lng, String maneuver) {
		super();
		this.distance = distance;
		this.duration = duration;
		this.start_lat = start_lat;
		this.start_lng = start_lng;
		this.end_lat = end_lat;
		this.end_lng = end_lng;
		this.maneuver = maneuver;
	}
	
	
}
