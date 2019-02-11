package br.com.vsg.hostelcontrol.service;

import java.util.List;

import br.com.vsg.hostelcontrol.model.Employee;

public interface EmployeeService {

	Employee save(Employee employee);

	Employee update(Employee employee);

	void delete(int id);

	Employee get(int id);

	List<Employee> nameLike(String name);

	List<Employee> getAll();

}
