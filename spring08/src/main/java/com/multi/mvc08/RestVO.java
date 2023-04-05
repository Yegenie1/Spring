package com.multi.mvc08;

public class RestVO {
	
	private String destination;
	private double lat;
	private double lon;
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public double getLat() {
		return lat;
	}
	public void setLat(double lat) {
		this.lat = lat;
	}
	public double getLon() {
		return lon;
	}
	public void setLon(double lon) {
		this.lon = lon;
	}
	@Override
	public String toString() {
		return "RestVO [destination=" + destination + ", lat=" + lat + ", lon=" + lon + "]";
	}
	
	

}
