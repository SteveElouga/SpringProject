package com.openclassrooms.api.controller;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.openclassrooms.api.model.User;
import com.openclassrooms.api.service.UserService;

@RestController
public class EmployeeController {
	
	@Autowired
    private UserService employeeService;
    
    @PostMapping("/employee/post")
	public User createEmployee(@RequestBody User employee) {
		return this.employeeService.saveEmployee(employee);
	}
    
    @GetMapping("/employee/{id}")
	public User getEmployee(@PathVariable("id") final Long id) {
		Optional<User> employee = employeeService.getEmployee(id);
		if(employee.isPresent()) {
			return employee.get();
		} else {
			return null;
		}
	}
    
    @GetMapping("/employees")
    public Iterable<User> getEmployees() {
        return employeeService.getEmployees();
    }
    
    @DeleteMapping("/employee/{id}")
	public void deleteEmployee(@PathVariable("id") final Long id) {
		employeeService.deleteEmployee(id);
	}
    
    @PutMapping("/employee/{id}")
	public User updateEmployee(@PathVariable("id") final Long id, @RequestBody User employee) {
		Optional<User> e = employeeService.getEmployee(id);
		if(e.isPresent()) {
			User currentEmployee = e.get();
			
			String firstName = employee.getFirst_name();
			if(firstName != null) {
				currentEmployee.setFirst_name(firstName);
			}
			String lastName = employee.getLast_name();
			if(lastName != null) {
				currentEmployee.setLast_name(lastName);;
			}
			String email = employee.getEmail();
			if(email != null) {
				currentEmployee.setEmail(email);
			}
			String hash = employee.getHash();
			if(hash != null) {
				currentEmployee.setHash(hash);
			}
			String phone_number = employee.getPhone_number();
			if(phone_number != null) {
				currentEmployee.setPhone_number(phone_number);
			}
			String country_code = employee.getCountry_code();
			if(country_code != null) {
				currentEmployee.setCountry_code(country_code);
			}
			String password = employee.getPassword();
			if(password != null) {
				currentEmployee.setPassword(password);;
			}
			employeeService.saveEmployee(currentEmployee);
			return currentEmployee;
		} else {
			return null;
		}
	}
    
    
}
