package br.com.vsg.hostelcontrol.service;

import java.util.List;

import br.com.vsg.hostelcontrol.model.Client;

public interface AddressService {

	Client save( Client client );

	Client update( Client client );

	boolean delete( String id );

	Client get( String id );

	List<Client> getAll();

}
