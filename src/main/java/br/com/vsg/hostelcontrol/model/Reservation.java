package br.com.vsg.hostelcontrol.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import br.com.vsg.hostelcontrol.enums.StandartItensEnum;

@Entity
public class Reservation {

	@Id
	@GeneratedValue
	private int id;

	@NotNull
	private LocalDateTime arrive;

	private LocalDateTime departure;

	@OneToMany
	private List<DailyReport> dailyReport = new ArrayList<>();

	@ElementCollection(targetClass = StandartItensEnum.class)
	@Enumerated(EnumType.STRING)
	private List<StandartItensEnum> responsabilities = new ArrayList<>();

	private String travelReason;

	@NotNull
	@OneToOne
	private Client client;

	@Column(updatable = false)
	@CreationTimestamp
	private LocalDateTime creationTime;

	@UpdateTimestamp
	private LocalDateTime updateTime;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDateTime getArrive() {
		return arrive;
	}

	public void setArrive(LocalDateTime arrive) {
		this.arrive = arrive;
	}

	public LocalDateTime getDeparture() {
		return departure;
	}

	public void setDeparture(LocalDateTime departure) {
		this.departure = departure;
	}

	public List<DailyReport> getDailyReport() {
		return dailyReport;
	}

	public void setDailyReport(List<DailyReport> dailyReport) {
		this.dailyReport = dailyReport;
	}

	public List<StandartItensEnum> getResponsabilities() {
		return responsabilities;
	}

	public void setResponsabilities(List<StandartItensEnum> responsabilities) {
		this.responsabilities = responsabilities;
	}

	public String getTravelReason() {
		return travelReason;
	}

	public void setTravelReason(String travelReason) {
		this.travelReason = travelReason;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	@Override
	public String toString() {
		return "Reservation [id=" + id + ", arrive=" + arrive + ", departure=" + departure + ", dailyReport="
				+ dailyReport + ", responsabilities=" + responsabilities + ", travelReason=" + travelReason
				+ ", client=" + client + ", creationTime=" + creationTime + ", updateTime=" + updateTime + "]";
	}

}
