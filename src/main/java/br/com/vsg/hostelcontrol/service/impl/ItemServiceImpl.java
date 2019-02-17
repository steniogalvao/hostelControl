package br.com.vsg.hostelcontrol.service.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.vsg.hostelcontrol.model.Item;
import br.com.vsg.hostelcontrol.repository.ItemRepository;
import br.com.vsg.hostelcontrol.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	private ItemRepository repository;

	@Override
	public Item save(Item item) {
		if (item.getId() == 0) {
			return repository.save(item);
		} else {
			// TODO: Throw some exception
			return null;
		}
	}

	@Override
	public Item get(int id) {
		Optional<Item> opt = repository.findById(id);
		if (opt.isPresent())
			return opt.get();
		return null;
	}

	public Item update(Item item) {
		if (repository.existsById(item.getId()))
			return repository.save(item);
		return null;
	}

	@Override
	public void delete(int id) {
		Optional<Item> opt = repository.findById(id);
		if (opt.isPresent()) {
			repository.delete(opt.get());
		} else {
			// TODO throw not found exception
		}

	}

	@Override
	public List<Item> getAll() {
		Collection<Item> collection = (Collection<Item>) repository.findAll();
		return new ArrayList<Item>(collection);
	}

}
