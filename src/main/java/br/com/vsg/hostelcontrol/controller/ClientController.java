package br.com.vsg.hostelcontrol.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
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

import br.com.vsg.hostelcontrol.model.Client;
import br.com.vsg.hostelcontrol.service.ClientService;

@Controller
public class ClientController {

	@Autowired
	private ClientService clientService;

	@PostMapping(value = "/client")
	@ResponseBody
	public Client create(@Validated @RequestBody Client client) {
		return clientService.save(client);
	}

	@GetMapping(value = "/client/{id}")
	@ResponseBody
	public Client get(@PathVariable int id) {
		return clientService.get(id);
	}

	@PutMapping(value = "/client")
	@ResponseBody
	public Client put(@Validated @RequestBody Client client) {
		return clientService.update(client);
	}

	@DeleteMapping(value = "/client/{id}")
	@ResponseStatus(value = HttpStatus.OK)
	public void delete(@PathVariable int id) {
		clientService.delete(id);
	}

	@GetMapping(value = "/clients")
	@ResponseBody
	public List<Client> getAll() {
		return clientService.getAll();
	}
	
	@GetMapping(value = "/clients/name")
	@ResponseBody
	public List<Client> getClientsByName(@Param(value = "name") String name) {
		return clientService.getAll();
	}
}
