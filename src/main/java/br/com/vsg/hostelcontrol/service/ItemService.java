package br.com.vsg.hostelcontrol.service;

import java.util.List;

import br.com.vsg.hostelcontrol.model.Item;

public interface ItemService {

	Item save(Item item);

	Item get(int id);

	Item update(Item item);

	void delete(int id);

	List<Item> getAll();
	
	Item findItemByItemTypeName(String itemTypeName);

}
