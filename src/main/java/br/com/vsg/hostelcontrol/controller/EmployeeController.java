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

import br.com.vsg.hostelcontrol.model.Employee;
import br.com.vsg.hostelcontrol.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService service;

	@PostMapping(value = "/employee")
	@ResponseBody
	public Employee create(@Validated @RequestBody Employee employee) {
		return service.save(employee);
	}

	@GetMapping(value = "/employee/{id}")
	@ResponseBody
	public Employee get(@PathVariable int id) {
		return service.get(id);
	}

	@PutMapping(value = "/employee")
	@ResponseBody
	public Employee put(@Validated @RequestBody Employee employee) {
		return service.update(employee);
	}

	@DeleteMapping(value = "/employee/{id}")
	@ResponseStatus(value = HttpStatus.OK)
	public void delete(@PathVariable int id) {
		service.delete(id);
	}

	@GetMapping(value = "/employees")
	@ResponseBody
	public List<Employee> getAll() {
		return service.getAll();
	}

	@GetMapping(value = "/employees/name")
	@ResponseBody
	public List<Employee> getEmployeeByName(@Param(value = "name") String name) {
		return service.getAll();
	}
}
