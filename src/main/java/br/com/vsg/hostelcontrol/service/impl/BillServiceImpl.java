package br.com.vsg.hostelcontrol.service.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.vsg.hostelcontrol.model.Bill;
import br.com.vsg.hostelcontrol.repository.BillRepository;
import br.com.vsg.hostelcontrol.service.BillService;

@Service
public class BillServiceImpl implements BillService {

	@Autowired
	private BillRepository repository;

	@Override
	public Bill save(Bill bill) {
		if (bill.getId() == 0) {
			return repository.save(bill);
		} else {
			// TODO: Throw some exception
			return null;
		}
	}

	@Override
	public Bill get(int id) {
		Optional<Bill> opt = repository.findById(id);
		if (opt.isPresent())
			return opt.get();
		return null;
	}

	public Bill update(Bill bill) {
		if (repository.existsById(bill.getId()))
			return repository.save(bill);
		return null;
	}

	@Override
	public void delete(int id) {
		Optional<Bill> opt = repository.findById(id);
		if (opt.isPresent()) {
			repository.delete(opt.get());
		} else {
			// TODO throw not found exception
		}

	}

	@Override
	public List<Bill> getAll() {
		Collection<Bill> collection = (Collection<Bill>) repository.findAll();
		return new ArrayList<Bill>(collection);
	}

}
