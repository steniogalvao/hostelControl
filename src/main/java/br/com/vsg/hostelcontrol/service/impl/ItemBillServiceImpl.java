package br.com.vsg.hostelcontrol.service.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.vsg.hostelcontrol.model.ItemBill;
import br.com.vsg.hostelcontrol.repository.ItemBillRepository;
import br.com.vsg.hostelcontrol.service.ItemBillService;

@Service
public class ItemBillServiceImpl implements ItemBillService {

	@Autowired
	private ItemBillRepository repository;

	@Override
	public ItemBill save(ItemBill itemBill) {
		if (itemBill.getId() == 0) {
			return repository.save(itemBill);
		} else {
			// TODO: Throw some exception
			return null;
		}
	}

	@Override
	public ItemBill get(int id) {
		Optional<ItemBill> opt = repository.findById(id);
		if (opt.isPresent())
			return opt.get();
		return null;
	}

	public ItemBill update(ItemBill itemBill) {
		if (repository.existsById(itemBill.getId()))
			return repository.save(itemBill);
		return null;
	}

	@Override
	public void delete(int id) {
		Optional<ItemBill> opt = repository.findById(id);
		if (opt.isPresent()) {
			repository.delete(opt.get());
		} else {
			// TODO throw not found exception
		}

	}

	@Override
	public List<ItemBill> getAll() {
		Collection<ItemBill> collection = (Collection<ItemBill>) repository.findAll();
		return new ArrayList<ItemBill>(collection);
	}

}
