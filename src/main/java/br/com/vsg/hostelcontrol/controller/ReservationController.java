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

import br.com.vsg.hostelcontrol.model.Reservation;
import br.com.vsg.hostelcontrol.service.ReservationService;

@Controller
public class ReservationController {

	@Autowired
	private ReservationService service;

	@PostMapping(value = "/reservation")
	@ResponseBody
	public Reservation post(@RequestBody Reservation reservation) {
		return service.save(reservation);
	}

	@GetMapping(value = "/reservation/{id}")
	@ResponseBody
	public Reservation get(@PathVariable int id) {
		return service.get(id);
	}

	@PutMapping(value = "/reservation")
	@ResponseBody
	public Reservation put(@RequestBody Reservation reservation) {
		return service.update(reservation);
	}

	@DeleteMapping(value = "/reservation/{id}")
	@ResponseStatus(value = HttpStatus.OK)
	public void delete(@PathVariable int id) {
		service.delete(id);
	}

}
