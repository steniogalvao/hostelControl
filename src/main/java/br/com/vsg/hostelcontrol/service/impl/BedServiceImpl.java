package br.com.vsg.hostelcontrol.service.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.vsg.hostelcontrol.model.Bed;
import br.com.vsg.hostelcontrol.repository.BedRepository;
import br.com.vsg.hostelcontrol.service.BedService;

@Service
public class BedServiceImpl implements BedService {

	@Autowired
	private BedRepository repository;

	@Override
	public Bed save(Bed bed) {
		return repository.save(bed);
	}

	// TODO throw not found exception
	@Override
	public Bed get(int id) {
		Optional<Bed> opt = repository.findById(id);
		if (opt.isPresent())
			return opt.get();
		return null;
	}

	// TODO throw not found exception
	@Override
	public Bed update(Bed bed) {
		if (repository.existsById(bed.getId()))
			return repository.save(bed);
		return null;
	}

	@Override
	public void delete(int id) {
		Optional<Bed> opt = repository.findById(id);
		if (opt.isPresent()) {
			opt.get().setActive(false);
			repository.save(opt.get());
		} else {
			// TODO throw not found exception
		}

	}

	@Override
	public List<Bed> getAll() {
		Collection<Bed> collection = (Collection<Bed>) repository.findAll();
		return new ArrayList<Bed>(collection);
	}

}
