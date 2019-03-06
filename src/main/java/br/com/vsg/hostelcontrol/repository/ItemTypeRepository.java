package br.com.vsg.hostelcontrol.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.vsg.hostelcontrol.model.ItemType;


@Repository
public interface ItemTypeRepository extends CrudRepository<ItemType, Integer> {

	List<ItemType> findItemTypeByNameContainsIgnoreCase(String name);

}