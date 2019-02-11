package br.com.vsg.hostelcontrol.service.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.vsg.hostelcontrol.model.Employee;
import br.com.vsg.hostelcontrol.repository.EmployeeRepository;
import br.com.vsg.hostelcontrol.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository repository;

	@Override
	public Employee save(Employee employee) {
		return repository.save(employee);
	}

	// TODO: throw not found exception instead null
	@Override
	public Employee update(Employee employee) {
		if (get(employee.getId()) != null)
			return repository.save(employee);
		return null;
	}

	@Override
	public void delete(int id) {
		Optional<Employee> opt = repository.findById(id);
		if (opt.isPresent()) {
			opt.get().setActive(false);
			repository.save(opt.get());
		}else {
			//TODO throw not found
		}
	}

	@Override
	public Employee get(int id) {
		Optional<Employee> result = repository.findById(id);
		return result.isPresent() ? (Employee) result.get() : null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> nameLike(String name) {
		return new ArrayList<Employee>((Collection<Employee>) repository.findByNameIgnoreCaseContaining(name));
	}

	// TODO: implement pagination
	@Override
	public List<Employee> getAll() {
		Collection<Employee> collection = (Collection<Employee>) repository.findAll();
		return new ArrayList<Employee>(collection);
	}

}
