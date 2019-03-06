package br.com.vsg.hostelcontrol.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.vsg.hostelcontrol.model.ItemBill;

@Repository
public interface ItemBillRepository extends CrudRepository<ItemBill, Integer> {

}