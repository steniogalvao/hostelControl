package br.com.vsg.hostelcontrol.controller;

import java.util.List;

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

import br.com.vsg.hostelcontrol.model.ItemType;
import br.com.vsg.hostelcontrol.service.ItemTypeService;

@Controller
public class ItemTypeController {

	@Autowired
	private ItemTypeService service;

	@PostMapping(value = "/itemType")
	@ResponseBody
	public ItemType post(@RequestBody ItemType itemType) {
		return service.save(itemType);
	}

	@GetMapping(value = "/itemType/{id}")
	@ResponseBody
	public ItemType get(@PathVariable int id) {
		return service.get(id);
	}

	@GetMapping(value = "/itemType")
	@ResponseBody
	public List<ItemType> get(@Param(value = "name") String name) {
		return service.findByName(name);
	}

	@PutMapping(value = "/itemType")
	@ResponseBody
	public ItemType put(@RequestBody ItemType itemType) {
		return service.update(itemType);
	}

	@DeleteMapping(value = "/itemType/{id}")
	@ResponseStatus(value = HttpStatus.OK)
	public void delete(@PathVariable int id) {
		service.delete(id);
	}

}
