package com.employee.contoller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.model.Employee;
import com.employee.repository.EmployeeRepository;

@RestController
public class EmployeeContoller {

	@Autowired
	
	private EmployeeRepository employeeRepository;
	
	@PostMapping(value="/add")
	public String addEmployee( @RequestBody Employee employee) {
    employeeRepository.save(employee);
    return "data added";
	}
	

	@GetMapping(value="/{name}")
	public List<Employee> getEmployeeByName(@PathVariable String name ){
		 return employeeRepository.findByName(name);
		 
	}
	
	@GetMapping(value="/{fname}")
	public List<Employee> getEmployeeByFName(@PathVariable String fname ){
		 return employeeRepository.findByName(fname);
		 
	}
}
