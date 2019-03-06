package br.com.vsg.hostelcontrol.service.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.vsg.hostelcontrol.model.ItemType;
import br.com.vsg.hostelcontrol.repository.ItemTypeRepository;
import br.com.vsg.hostelcontrol.service.ItemTypeService;

@Service
public class ItemTypeServiceImpl implements ItemTypeService {

	@Autowired
	private ItemTypeRepository repository;

	@Override
	public ItemType save(ItemType itemType) {
		if (itemType.getId() == 0) {
			return repository.save(itemType);
		} else {
			// TODO: Throw some exception
			return null;
		}
	}

	@Override
	public ItemType get(int id) {
		Optional<ItemType> opt = repository.findById(id);
		if (opt.isPresent())
			return opt.get();
		return null;
	}

	public ItemType update(ItemType itemType) {
		if (repository.existsById(itemType.getId()))
			return repository.save(itemType);
		return null;
	}

	@Override
	public void delete(int id) {
		Optional<ItemType> opt = repository.findById(id);
		if (opt.isPresent()) {
			repository.delete(opt.get());
		} else {
			// TODO throw not found exception
		}

	}

	@Override
	public List<ItemType> getAll() {
		Collection<ItemType> collection = (Collection<ItemType>) repository.findAll();
		return new ArrayList<ItemType>(collection);
	}

	@Override
	public List<ItemType> findByName(String itemTypeName) {
		return repository.findItemTypeByNameContainsIgnoreCase(itemTypeName);
	}

}
