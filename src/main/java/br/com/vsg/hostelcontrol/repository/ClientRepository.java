package br.com.vsg.hostelcontrol.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.vsg.hostelcontrol.model.Client;

@Repository
public interface ClientRepository extends CrudRepository<Client, Integer> {

	Client findByNameIgnoreCaseContaining( String name );

}
