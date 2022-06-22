package com.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Airports {
	@Id
	private int airport_id;
	private String name;
	private String city;
	private String country;
	private String iata;
	private String icao;
	private double latitude;
	private double longitude;
	private int altitude;
	private double timezone;
	private String dst;
	private String tz_database_time_zone;
	private String type;
	
	public Airports() {
		super();
	}

	public Airports(int airport_id, String name, String city, String country, String iata, String icao, double latitude,
			double longitude, int altitude, double timezone, String dst, String tz_database_time_zone, String type) {
		super();
		this.airport_id = airport_id;
		this.name = name;
		this.city = city;
		this.country = country;
		this.iata = iata;
		this.icao = icao;
		this.latitude = latitude;
		this.longitude = longitude;
		this.altitude = altitude;
		this.timezone = timezone;
		this.dst = dst;
		this.tz_database_time_zone = tz_database_time_zone;
		this.type = type;
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

	public String getIcao() {
		return icao;
	}

	public void setIcao(String icao) {
		this.icao = icao;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public int getAltitude() {
		return altitude;
	}

	public void setAltitude(int altitude) {
		this.altitude = altitude;
	}

	public double getTimezone() {
		return timezone;
	}

	public void setTimezone(double timezone) {
		this.timezone = timezone;
	}

	public String getDst() {
		return dst;
	}

	public void setDst(String dst) {
		this.dst = dst;
	}

	public String getTz_database_time_zone() {
		return tz_database_time_zone;
	}

	public void setTz_database_time_zone(String tz_database_time_zone) {
		this.tz_database_time_zone = tz_database_time_zone;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
}
