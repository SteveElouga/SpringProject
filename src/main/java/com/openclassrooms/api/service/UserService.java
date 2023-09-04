package com.openclassrooms.api.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.openclassrooms.api.model.User;
import com.openclassrooms.api.repository.UserRepository;

import lombok.Data;

@Data
@Service
public class UserService {
	@Autowired
    private UserRepository employeeRepository;

    public Optional<User> getEmployee(final Long id) {
        return this.employeeRepository.findById(id);
    }

    public Iterable<User> getEmployees() {
        return this.employeeRepository.findAll();
    }

    public void deleteEmployee(final Long id) {
    	this.employeeRepository.deleteById(id);
    }

    public User saveEmployee(User employee) {
        User savedEmployee = this.employeeRepository.save(employee);
        return savedEmployee;
    }
}
