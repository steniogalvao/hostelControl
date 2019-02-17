package br.com.vsg.hostelcontrol.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.vsg.hostelcontrol.model.Item;

public interface ItemRepository extends CrudRepository<Item, Integer> {

}
