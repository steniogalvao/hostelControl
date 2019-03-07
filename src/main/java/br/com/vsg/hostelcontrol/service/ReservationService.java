package br.com.vsg.hostelcontrol.service;

import java.util.List;

import br.com.vsg.hostelcontrol.model.Reservation;

public interface ReservationService {

	Reservation save(Reservation reservation);

	Reservation get(int id);

	Reservation update(Reservation reservation);

	void delete(int id);

	List<Reservation> getAll();

}
