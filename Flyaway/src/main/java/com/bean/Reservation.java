package com.bean;

import java.util.Date;

public class Reservation {
	int reservation_number;
	String contact_email_address;
	String country;
	String source_city;
	String source_airport_alias;
	String source_airport_name;
	String destination_airport_alias;
	String destination_airport_name;
	String airline;
	Double price;
	Date departure_date;
	Date return_date;
	
	public Reservation() {
		super();
	}

	public int getReservation_number() {
		return reservation_number;
	}

	public void setReservation_number(int reservation_number) {
		this.reservation_number = reservation_number;
	}

	public String getContact_email_address() {
		return contact_email_address;
	}

	public void setContact_email_address(String contact_email_address) {
		this.contact_email_address = contact_email_address;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getSource_city() {
		return source_city;
	}

	public void setSource_city(String source_city) {
		this.source_city = source_city;
	}

	public String getSource_airport_alias() {
		return source_airport_alias;
	}

	public void setSource_airport_alias(String source_airport_alias) {
		this.source_airport_alias = source_airport_alias;
	}

	public String getSource_airport_name() {
		return source_airport_name;
	}

	public void setSource_airport_name(String source_airport_name) {
		this.source_airport_name = source_airport_name;
	}

	public String getDestination_airport_alias() {
		return destination_airport_alias;
	}

	public void setDestination_airport_alias(String destination_airport_alias) {
		this.destination_airport_alias = destination_airport_alias;
	}

	public String getDestination_airport_name() {
		return destination_airport_name;
	}

	public void setDestination_airport_name(String destination_airport_name) {
		this.destination_airport_name = destination_airport_name;
	}

	public String getAirline() {
		return airline;
	}

	public void setAirline(String airline) {
		this.airline = airline;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Date getDeparture_date() {
		return departure_date;
	}

	public void setDeparture_date(Date departure_date) {
		this.departure_date = departure_date;
	}

	public Date getReturn_date() {
		return return_date;
	}

	public void setReturn_date(Date return_date) {
		this.return_date = return_date;
	}
}
