package br.com.vsg.hostelcontrol.service;

import java.util.List;

import br.com.vsg.hostelcontrol.model.Bill;

public interface BillService {

	Bill save(Bill bill);

	Bill get(int id);

	Bill update(Bill bill);

	void delete(int id);

	List<Bill> getAll();

}
