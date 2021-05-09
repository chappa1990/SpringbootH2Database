package com.springboot.h2.ctrl;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.h2.model.Employee;
import com.springboot.h2.serv.EmployeeService;

@RestController
public class EmployeeController {

	private final Logger log = LoggerFactory.getLogger(this.getClass()); 
	@Autowired
	EmployeeService service;
	@PostMapping(value= "/employee/save")
	public int save(final @RequestBody @Valid Employee employee) {
		log.info("Saving employee details in the database.");
		service.save(employee);
		return employee.getId();
	}
	
	@GetMapping("/employee/getall")
	public List<Employee> getAll() {
		log.info("Getting employee details from the database.");
		return service.getAll();
	}
	
	@DeleteMapping("/employee/{id}")
   public void DeleteEmployee(@PathVariable("id") int id) {
		service.delete(id);
		System.out.println("Employee was deleted successfully");
	}
}
