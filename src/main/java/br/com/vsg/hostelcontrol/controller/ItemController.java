package br.com.vsg.hostelcontrol.controller;

import org.springframework.beans.factory.annotation.Autowired;
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
import br.com.vsg.hostelcontrol.service.ItemService;

@Controller
public class ItemController {

	@Autowired
	private ItemService service;

	@PostMapping(value = "/item")
	@ResponseBody
	public Item post(@RequestBody Item item) {
		return service.save(item);
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
