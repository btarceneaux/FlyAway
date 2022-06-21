package com.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Airlines {
	@Id
	private int airline_id;
	private String name;
	private String alias;
	private String iata;
	private String callsign;
	private String country;
	private char active_ind;
	
	public Airlines() {
		super();
	}
	

	public Airlines(int airline_id, String name, String alias, String iata, String callsign, String country,
			char active_ind) {
		super();
		this.airline_id = airline_id;
		this.name = name;
		this.alias = alias;
		this.iata = iata;
		this.callsign = callsign;
		this.country = country;
		this.active_ind = active_ind;
	}


	public int getAirline_id() {
		return airline_id;
	}


	public void setAirline_id(int airline_id) {
		this.airline_id = airline_id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAlias() {
		return alias;
	}


	public void setAlias(String alias) {
		this.alias = alias;
	}


	public String getIata() {
		return iata;
	}


	public void setIata(String iata) {
		this.iata = iata;
	}


	public String getCallsign() {
		return callsign;
	}


	public void setCallsign(String callsign) {
		this.callsign = callsign;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public char getActive_ind() {
		return active_ind;
	}


	public void setActive_ind(char active_ind) {
		this.active_ind = active_ind;
	}


	@Override
	public String toString() {
		return "Airlines [airline_id=" + airline_id + ", name=" + name + ", alias=" + alias + ", iata=" + iata
				+ ", callsign=" + callsign + ", country=" + country + ", active_ind=" + active_ind + "]";
	}
	
	
}
