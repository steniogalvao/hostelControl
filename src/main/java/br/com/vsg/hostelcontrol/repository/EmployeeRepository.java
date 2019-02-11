package br.com.vsg.hostelcontrol.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.vsg.hostelcontrol.model.Client;
import br.com.vsg.hostelcontrol.model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

	Client findByNameIgnoreCaseContaining( String name );

}
