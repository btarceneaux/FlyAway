package com.bean;

public class Flights {
	private String source_airport;
	private String name;
	private String destination_airport;
	private String destination_airport_name;
	private String alias;
	private String airline_name;
	private double price;
	
	public Flights() {
		super();
	}

	public String getSource_airport() {
		return source_airport;
	}

	public void setSource_airport(String source_airport) {
		this.source_airport = source_airport;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDestination_airport() {
		return destination_airport;
	}

	public void setDestination_airport(String destination_airport) {
		this.destination_airport = destination_airport;
	}

	public String getDestination_airport_name() {
		return destination_airport_name;
	}

	public void setDestination_airport_name(String destination_airport_name) {
		this.destination_airport_name = destination_airport_name;
	}

	public String getAirline_name() {
		return airline_name;
	}

	public void setAirline_name(String airline_name) {
		this.airline_name = airline_name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}
	
	
}
