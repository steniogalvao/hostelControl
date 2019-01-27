package br.com.vsg.hostelcontrol.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.vsg.hostelcontrol.model.Client;
import br.com.vsg.hostelcontrol.repository.ClientRepository;
import br.com.vsg.hostelcontrol.service.ClientService;

@Service
public class ClientServiceImpl implements ClientService {

	@Autowired
	private ClientRepository repository;

	@Override
	public Client save( Client client ) {
		return repository.save( client );
	}

	@Override
	public Client update( Client client ) {
		return repository.save( client );
	}

	@Override
	public boolean delete( String id ) {
		Client client = get( id );
		if ( client != null ) {
			repository.delete( client );
			return true;
		}
		return false;
	}

	@Override
	public Client get( String id ) {
		Optional<Client> result = repository.findById( id );
		return result.isPresent() ? result.get() : null;
	}

	@Override
	public Client getByName( String name ) {
		return repository.findByName( name );
	}

	// TODO: implement pagination
	@Override
	public List<Client> getAll() {
		return repository.findAll();
	}

}
