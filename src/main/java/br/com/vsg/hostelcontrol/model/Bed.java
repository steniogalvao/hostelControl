package br.com.vsg.hostelcontrol.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


/**
 * Bed that the hostel have
 */
@Entity
public class Bed {

	@GeneratedValue
	@Id
	private int id;
	private String name;
	private String description;

	public int getId() {
		return id;
	}

	public void setId( int id ) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName( String name ) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription( String description ) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Bed [id=" + id + ", name=" + name + ", description=" + description + "]";
	}

}
