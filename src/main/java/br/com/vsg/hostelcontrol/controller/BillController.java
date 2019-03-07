package br.com.vsg.hostelcontrol.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import br.com.vsg.hostelcontrol.model.Item;
import br.com.vsg.hostelcontrol.model.ItemType;
import br.com.vsg.hostelcontrol.service.ItemService;
import br.com.vsg.hostelcontrol.service.ItemTypeService;

@Controller
public class BillController {

	@Autowired
	private ItemService service;
	@Autowired
	private ItemTypeService itemTypeService;

	@PostMapping(value = "/item")
	@ResponseBody
	public Item post(@RequestBody Item item, @Param(value = "amount") int amount) {
		Item saved = null;
		ItemType itemType = itemTypeService.get(item.getItemType().getId());
		itemType.setAmount(itemType.getAmount() + amount);
		item.setItemType(itemType);
		for (int i = 0; i < amount; i++) {
			saved = service.save(item);
		}
		return saved;
	}

	@GetMapping(value = "/item/{id}")
	@ResponseBody
	public Item get(@PathVariable int id) {
		return service.get(id);
	}

	@PutMapping(value = "/item")
	@ResponseBody
	public Item put(@RequestBody Item item) {
		return service.update(item);
	}

	@DeleteMapping(value = "/item/{id}")
	@ResponseStatus(value = HttpStatus.OK)
	public void delete(@PathVariable int id) {
		service.delete(id);
	}

}
