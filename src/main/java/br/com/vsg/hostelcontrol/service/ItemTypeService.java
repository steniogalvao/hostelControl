package br.com.vsg.hostelcontrol.service;

import java.util.List;

import br.com.vsg.hostelcontrol.model.ItemType;

public interface ItemTypeService {

	ItemType save(ItemType itemType);

	ItemType get(int id);

	ItemType update(ItemType itemType);

	void delete(int id);

	List<ItemType> getAll();

	List<ItemType> findByName(String itemTypeName);

}
