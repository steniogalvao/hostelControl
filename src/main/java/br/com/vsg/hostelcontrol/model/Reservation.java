package br.com.vsg.hostelcontrol.model;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import br.com.vsg.hostelcontrol.enums.StandartItensEnum;

@Document
public class Reservation {

	@Id
	private int id;
	private LocalDateTime arrive;
	private LocalDateTime departure;
	private List<DailyReport> dailyReport;
	private Map<StandartItensEnum, Boolean> responsabilities;
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

	public Map<StandartItensEnum, Boolean> getResponsabilities() {
		return responsabilities;
	}

	public void setResponsabilities( Map<StandartItensEnum, Boolean> responsabilities ) {
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
