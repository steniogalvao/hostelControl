package br.com.vsg.hostelcontrol.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.vsg.hostelcontrol.model.Bill;

@Repository
public interface BillRepository extends CrudRepository<Bill, Integer> {

}
