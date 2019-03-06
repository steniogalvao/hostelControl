package br.com.vsg.hostelcontrol.service;

import java.util.List;

import br.com.vsg.hostelcontrol.model.ItemBill;

public interface ItemBillService {

	ItemBill save(ItemBill itemBill);

	ItemBill get(int id);

	ItemBill update(ItemBill itemBill);

	void delete(int id);

	List<ItemBill> getAll();

}
