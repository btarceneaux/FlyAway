package com.bean;


public class Airports {
	private int airport_id;
	private String name;
	private String city;
	private String country;
	private String iata;
	private String source_airport;
	private int source_airport_id;
	private String destination_airport;
	private String destination_airport_name;
	private int destination_airport_id;
	private int airline_id;
	private String airline_name;
	private String alias;
	private double price;
	private boolean isSelected;
	private int index;
	
	public Airports() {
		super();
	}

	public Airports(int airport_id, String name, String city, String country, String iata, String source_airport,
			int source_airport_id, String destination_airport, String destination_airport_name,
			int destination_airport_id, int airline_id, String airline_name, String alias, double price, boolean isSelected,
			int index) {
		super();
		this.airport_id = airport_id;
		this.name = name;
		this.city = city;
		this.country = country;
		this.iata = iata;
		this.source_airport = source_airport;
		this.source_airport_id = source_airport_id;
		this.destination_airport = destination_airport;
		this.destination_airport_name = destination_airport_name;
		this.destination_airport_id = destination_airport_id;
		this.airline_id = airline_id;
		this.airline_name = airline_name;
		this.alias = alias;
		this.price = price;
		this.isSelected = false;
		this.index = index;
	}

	public int getAirport_id() {
		return airport_id;
	}

	public void setAirport_id(int airport_id) {
		this.airport_id = airport_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getIata() {
		return iata;
	}

	public void setIata(String iata) {
		this.iata = iata;
	}

	public String getSource_airport() {
		return source_airport;
	}

	public void setSource_airport(String source_airport) {
		this.source_airport = source_airport;
	}

	public int getSource_airport_id() {
		return source_airport_id;
	}

	public void setSource_airport_id(int source_airport_id) {
		this.source_airport_id = source_airport_id;
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

	public int getDestination_airport_id() {
		return destination_airport_id;
	}

	public void setDestination_airport_id(int destination_airport_id) {
		this.destination_airport_id = destination_airport_id;
	}

	public int getAirline_id() {
		return airline_id;
	}

	public void setAirline_id(int airline_id) {
		this.airline_id = airline_id;
	}

	public String getAirline_name() {
		return airline_name;
	}

	public void setAirline_name(String airline_name) {
		this.airline_name = airline_name;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isSelected() {
		return isSelected;
	}

	public void setSelected(boolean isSelected) {
		this.isSelected = isSelected;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

}
