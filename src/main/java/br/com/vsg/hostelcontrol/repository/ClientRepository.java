package br.com.vsg.hostelcontrol.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.vsg.hostelcontrol.model.Client;
import br.com.vsg.hostelcontrol.model.Person;

@Repository
public interface ClientRepository extends CrudRepository<Person, Integer> {

	Client findByName( String name );

}
