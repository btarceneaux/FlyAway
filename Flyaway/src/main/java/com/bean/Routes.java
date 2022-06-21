package com.bean;

import javax.persistence.Entity;

@Entity
public class Routes {
	private String iata_icao;
	private int airline_id;
	private String source_airport;
	private int source_airport_id;
	private String destination_airport;
	private int destination_airport_id;
	private String codeshare;
	private int stops;
	private String equipment;
	
	public Routes() {
		super();
	}

	public Routes(String iata_icao, int airline_id, String source_airport, int source_airport_id,
			String destination_airport, int destination_airport_id, String codeshare, int stops, String equipment) {
		super();
		this.iata_icao = iata_icao;
		this.airline_id = airline_id;
		this.source_airport = source_airport;
		this.source_airport_id = source_airport_id;
		this.destination_airport = destination_airport;
		this.destination_airport_id = destination_airport_id;
		this.codeshare = codeshare;
		this.stops = stops;
		this.equipment = equipment;
	}

	public String getIata_icao() {
		return iata_icao;
	}

	public void setIata_icao(String iata_icao) {
		this.iata_icao = iata_icao;
	}

	public int getAirline_id() {
		return airline_id;
	}

	public void setAirline_id(int airline_id) {
		this.airline_id = airline_id;
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

	public int getDestination_airport_id() {
		return destination_airport_id;
	}

	public void setDestination_airport_id(int destination_airport_id) {
		this.destination_airport_id = destination_airport_id;
	}

	public String getCodeshare() {
		return codeshare;
	}

	public void setCodeshare(String codeshare) {
		this.codeshare = codeshare;
	}

	public int getStops() {
		return stops;
	}

	public void setStops(int stops) {
		this.stops = stops;
	}

	public String getEquipment() {
		return equipment;
	}

	public void setEquipment(String equipment) {
		this.equipment = equipment;
	}

	@Override
	public String toString() {
		return "Routes [iata_icao=" + iata_icao + ", airline_id=" + airline_id + ", source_airport=" + source_airport
				+ ", source_airport_id=" + source_airport_id + ", destination_airport=" + destination_airport
				+ ", destination_airport_id=" + destination_airport_id + ", codeshare=" + codeshare + ", stops=" + stops
				+ ", equipment=" + equipment + "]";
	}
	
	
}
