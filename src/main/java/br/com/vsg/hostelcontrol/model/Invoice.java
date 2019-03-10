package br.com.vsg.hostelcontrol.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
public class Invoice {

	@Id
	@GeneratedValue
	private int id;

	@OneToMany
	private List<Bill> bills = new ArrayList<>();

	private Reservation reservation;

	private BigDecimal totalValue;

	@Column(updatable = false)
	@CreationTimestamp
	private LocalDateTime creationTime;

	@UpdateTimestamp
	private LocalDateTime upDateTime;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Bill> getBills() {
		return bills;
	}

	public void setBills(List<Bill> bills) {
		this.bills = bills;
	}

	public Reservation getReservation() {
		return reservation;
	}

	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}

	public BigDecimal getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(BigDecimal totalValue) {
		this.totalValue = totalValue;
	}

	@Override
	public String toString() {
		return "Invoice [id=" + id + ", bills=" + bills + ", reservation=" + reservation + ", totalValue=" + totalValue
				+ ", creationTime=" + creationTime + ", upDateTime=" + upDateTime + "]";
	}

}
