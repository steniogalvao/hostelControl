package br.com.vsg.hostelcontrol.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Client extends Person {

	private String ocupation;
	@ElementCollection
	private Map<String, String> social = new HashMap<>();
	@OneToOne
	private Invoice invoice;
	@OneToMany
	private List<Reservation> reservations = new ArrayList<>();

	public String getOcupation() {
		return ocupation;
	}

	public void setOcupation( String ocupation ) {
		this.ocupation = ocupation;
	}

	public Map<String, String> getSocial() {
		return social;
	}

	public void setSocial( Map<String, String> social ) {
		this.social = social;
	}

	public Invoice getInvoice() {
		return invoice;
	}

	public void setInvoice( Invoice invoice ) {
		this.invoice = invoice;
	}

	public List<Reservation> getReservations() {
		return reservations;
	}

	public void setReservations( List<Reservation> reservations ) {
		this.reservations = reservations;
	}

	@Override
	public String toString() {
		return "Client [ocupation=" + ocupation + ", social=" + social + ", invoice=" + invoice + ", reservations=" + reservations + "]";
	}

}
