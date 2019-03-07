package br.com.vsg.hostelcontrol.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

/**
 * Occurrences related to some reservation
 */
@Entity
public class DailyReport {

	@Id
	@GeneratedValue
	private int id;
	
	@OneToOne
	private Bed bed;

	@NotNull
	private LocalDate day;

	private String description;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Bed getBed() {
		return bed;
	}

	public void setBed(Bed bed) {
		this.bed = bed;
	}

	public LocalDate getDay() {
		return day;
	}

	public void setDay(LocalDate day) {
		this.day = day;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "DailyReport [id=" + id + ", bed=" + bed + ", day=" + day + ", description=" + description + "]";
	}

}
