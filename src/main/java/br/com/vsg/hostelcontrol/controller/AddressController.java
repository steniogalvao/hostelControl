package br.com.vsg.hostelcontrol.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.vsg.hostelcontrol.model.Address;
import br.com.vsg.hostelcontrol.service.AddressService;

@Controller
public class AddressController {

	@Autowired
	private AddressService service;

	@PutMapping(value = "/address")
	@ResponseBody
	public Address update(@Validated @RequestBody Address address) {
		return service.update(address);
	}

}
