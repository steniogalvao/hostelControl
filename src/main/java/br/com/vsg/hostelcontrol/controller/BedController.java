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

import br.com.vsg.hostelcontrol.model.Bed;
import br.com.vsg.hostelcontrol.service.BedService;

@Controller
public class BedController {

	@Autowired
	private BedService service;

	@PostMapping(value = "/bed")
	@ResponseBody
	public Bed create(@Validated @RequestBody Bed bed) {
		return service.save(bed);
	}

	@PutMapping(value = "/bed")
	@ResponseBody
	public Bed update(@Validated @RequestBody Bed bed) {
		return service.update(bed);
	}

	@DeleteMapping(value = "/bed/{id}")
	@ResponseStatus(value = HttpStatus.OK)
	public void delete(@PathVariable int id) {
		service.delete(id);
	}

	@GetMapping(value = "/bed/{id}")
	@ResponseBody
	public Bed get(@PathVariable int id) {
		return service.get(id);
	}

	@GetMapping(value = "/beds")
	@ResponseBody
	public List<Bed> getAll() {
		return service.getAll();
	}

}
