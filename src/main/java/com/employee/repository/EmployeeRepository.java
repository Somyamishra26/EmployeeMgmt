package com.employee.repository;



import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.employee.model.Employee;

public interface EmployeeRepository extends MongoRepository<Employee, String> {
	List<Employee> findByName(String name);

}
