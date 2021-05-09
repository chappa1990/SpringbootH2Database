package com.springboot.h2.serv;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springboot.h2.model.Employee;
import com.springboot.h2.repo.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	EmployeeRepository repository;
	public void save(final Employee employee) {
		repository.save(employee);
	}
	public List<Employee> getAll() {
		final List<Employee> employees = new ArrayList<>();
		repository.findAll().forEach(Employee -> employees.add(Employee));
		return employees;
	}
	public void delete(int id)
	{
		repository.deleteById(id);
	}
}
