package br.com.vsg.hostelcontrol.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import br.com.vsg.hostelcontrol.enums.StandartItensEnum;

@Entity
public class Reservation {

	@Id
	@GeneratedValue
	private int id;
	private LocalDateTime arrive;
	private LocalDateTime departure;
	@OneToMany
	private List<DailyReport> dailyReport = new ArrayList<>();
	@ElementCollection( targetClass = StandartItensEnum.class )
	@Enumerated( EnumType.STRING )
	private List<StandartItensEnum> responsabilities = new ArrayList<>();
	private String travelReason;

	public int getId() {
		return id;
	}

	public void setId( int id ) {
		this.id = id;
	}

	public LocalDateTime getArrive() {
		return arrive;
	}

	public void setArrive( LocalDateTime arrive ) {
		this.arrive = arrive;
	}

	public LocalDateTime getDeparture() {
		return departure;
	}

	public void setDeparture( LocalDateTime departure ) {
		this.departure = departure;
	}

	public List<DailyReport> getDailyReport() {
		return dailyReport;
	}

	public void setDailyReport( List<DailyReport> dailyReport ) {
		this.dailyReport = dailyReport;
	}

	public List<StandartItensEnum> getResponsabilities() {
		return responsabilities;
	}

	public void setResponsabilities( List<StandartItensEnum> responsabilities ) {
		this.responsabilities = responsabilities;
	}

	public String getTravelReason() {
		return travelReason;
	}

	public void setTravelReason( String travelReason ) {
		this.travelReason = travelReason;
	}

	@Override
	public String toString() {
		return "Reservation [id=" + id + ", arrive=" + arrive + ", departure=" + departure + ", dailyReport=" + dailyReport + ", responsabilities=" + responsabilities + ", travelReason=" + travelReason + "]";
	}

}
