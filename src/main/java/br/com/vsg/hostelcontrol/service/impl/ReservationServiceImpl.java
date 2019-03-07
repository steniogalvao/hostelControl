package br.com.vsg.hostelcontrol.service.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.vsg.hostelcontrol.model.Reservation;
import br.com.vsg.hostelcontrol.repository.ReservationRepository;
import br.com.vsg.hostelcontrol.service.ReservationService;

@Service
public class ReservationServiceImpl implements ReservationService {

	@Autowired
	private ReservationRepository repository;

	@Override
	public Reservation save(Reservation reservation) {
		if (reservation.getId() == 0) {
			return repository.save(reservation);
		} else {
			// TODO: Throw some exception
			return null;
		}
	}

	@Override
	public Reservation get(int id) {
		Optional<Reservation> opt = repository.findById(id);
		if (opt.isPresent())
			return opt.get();
		return null;
	}

	public Reservation update(Reservation reservation) {
		if (repository.existsById(reservation.getId()))
			return repository.save(reservation);
		return null;
	}

	@Override
	public void delete(int id) {
		Optional<Reservation> opt = repository.findById(id);
		if (opt.isPresent()) {
			repository.delete(opt.get());
		} else {
			// TODO throw not found exception
		}

	}

	@Override
	public List<Reservation> getAll() {
		Collection<Reservation> collection = (Collection<Reservation>) repository.findAll();
		return new ArrayList<Reservation>(collection);
	}

}
