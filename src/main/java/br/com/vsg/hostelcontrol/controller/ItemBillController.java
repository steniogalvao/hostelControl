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

import br.com.vsg.hostelcontrol.model.ItemBill;
import br.com.vsg.hostelcontrol.service.ItemBillService;

@Controller
public class ItemBillController {

	@Autowired
	private ItemBillService service;

	@PostMapping(value = "/itemBill")
	@ResponseBody
	public ItemBill post(@RequestBody ItemBill itemBill) {
		return service.save(itemBill);
	}

	@GetMapping(value = "/itemBill/{id}")
	@ResponseBody
	public ItemBill get(@PathVariable int id) {
		return service.get(id);
	}

	@PutMapping(value = "/itemBill")
	@ResponseBody
	public ItemBill put(@RequestBody ItemBill itemBill) {
		return service.update(itemBill);
	}

	@DeleteMapping(value = "/itemBill/{id}")
	@ResponseStatus(value = HttpStatus.OK)
	public void delete(@PathVariable int id) {
		service.delete(id);
	}

}
