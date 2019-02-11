package br.com.vsg.hostelcontrol.service;

import java.util.List;

import br.com.vsg.hostelcontrol.model.Bed;

public interface BedService {

	Bed save(Bed bed);

	Bed get(int id);

	Bed update(Bed bed);

	void delete(int id);

	List<Bed> getAll();

}
