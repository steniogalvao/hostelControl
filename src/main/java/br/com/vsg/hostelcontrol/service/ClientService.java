package br.com.vsg.hostelcontrol.service;

import java.util.List;

import br.com.vsg.hostelcontrol.model.Client;

public interface ClientService {

	Client save( Client client );

	Client update( Client client );

	boolean delete( int id );

	Client get( int id );

	List<Client> nameLike( String name );

	List<Client> getAll();


}
