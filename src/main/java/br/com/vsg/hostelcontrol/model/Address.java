package br.com.vsg.hostelcontrol.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Address{

	@GeneratedValue
	@Id
	private int Id;
	private String country;
	private String state;
	private String city;
	private String neighboorhood;
	private String street;
	private int number;
	private String complement;
	private int zipcode;

	public int getId() {
		return Id;
	}

	public void setId( int id ) {
		Id = id;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry( String country ) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState( String state ) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity( String city ) {
		this.city = city;
	}

	public String getNeighboorhood() {
		return neighboorhood;
	}

	public void setNeighboorhood( String neighboorhood ) {
		this.neighboorhood = neighboorhood;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet( String street ) {
		this.street = street;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber( int number ) {
		this.number = number;
	}

	public String getComplement() {
		return complement;
	}

	public void setComplement( String complement ) {
		this.complement = complement;
	}

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode( int zipcode ) {
		this.zipcode = zipcode;
	}

	@Override
	public String toString() {
		return "Address [Id=" + Id + ", country=" + country + ", state=" + state + ", city=" + city + ", neighboorhood=" + neighboorhood + ", street=" + street + ", number=" + number + ", complement=" + complement + ", zipcode=" + zipcode + "]";
	}

}
