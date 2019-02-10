package br.com.vsg.hostelcontrol.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.vsg.hostelcontrol.model.Address;
import br.com.vsg.hostelcontrol.repository.AddressRepository;
import br.com.vsg.hostelcontrol.service.AddressService;

@Service
public class AddressServiceImpl implements AddressService {

	@Autowired
	private AddressRepository repository;

	// TODO throw not found exception instead null
	@Override
	public Address update(Address address) {
		if (repository.existsById(address.getId()))
			return repository.save(address);
		return null;
	}

}
