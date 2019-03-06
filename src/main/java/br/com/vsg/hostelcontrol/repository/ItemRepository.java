package br.com.vsg.hostelcontrol.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.vsg.hostelcontrol.model.Item;

@Repository
public interface ItemRepository extends CrudRepository<Item, Integer> {

	Item findItemBybarcode(long barcode);

//	@Query("select i from Item where Item.itemType.name=?1 order by Item.expirationDate")
//	Item findItemByItemTypeNameOrderByExpirationDate(String name);

}