package br.com.vsg.hostelcontrol.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.vsg.hostelcontrol.model.Client;

@Repository
public interface ClientRepository extends MongoRepository<Client, String> {

	Client findByName( String name );

}
