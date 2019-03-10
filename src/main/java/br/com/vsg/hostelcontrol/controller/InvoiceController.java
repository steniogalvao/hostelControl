package br.com.vsg.hostelcontrol.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import br.com.vsg.hostelcontrol.model.Invoice;
import br.com.vsg.hostelcontrol.service.InvoiceService;

@Controller
public class InvoiceController {

	@Autowired
	private InvoiceService service;

	@PostMapping(value = "/invoice")
	@ResponseBody
	public Invoice create(@Validated @RequestBody Invoice invoice) {
		return service.save(invoice);
	}

	@PutMapping(value = "/invoice")
	@ResponseBody
	public Invoice update(@Validated @RequestBody Invoice invoice) {
		return service.update(invoice);
	}

	@DeleteMapping(value = "/invoice/{id}")
	@ResponseStatus(value = HttpStatus.OK)
	public void delete(@PathVariable int id) {
		service.delete(id);
	}

	@GetMapping(value = "/invoice/{id}")
	@ResponseBody
	public Invoice get(@PathVariable int id) {
		return service.get(id);
	}

	@GetMapping(value = "/beds")
	@ResponseBody
	public List<Invoice> getAll() {
		return service.getAll();
	}

}
