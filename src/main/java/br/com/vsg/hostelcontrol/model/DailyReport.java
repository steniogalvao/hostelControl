package br.com.vsg.hostelcontrol.model;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class DailyReport {

	@Id
	private int id;
	private Bed bed;
	private LocalDate day;
	private String description;

	public int getId() {
		return id;
	}

	public void setId( int id ) {
		this.id = id;
	}

	public Bed getBed() {
		return bed;
	}

	public void setBed( Bed bed ) {
		this.bed = bed;
	}

	public LocalDate getDay() {
		return day;
	}

	public void setDay( LocalDate day ) {
		this.day = day;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription( String description ) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "DailyReport [id=" + id + ", bed=" + bed + ", day=" + day + ", description=" + description + "]";
	}

}
