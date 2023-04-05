package com.rinkupaycalc.springboot.backend.apirest.springbootbackendapirest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rinkupaycalc.springboot.backend.apirest.springbootbackendapirest.models.entity.Employee;
import com.rinkupaycalc.springboot.backend.apirest.springbootbackendapirest.models.services.IEmployeeService;
import com.rinkupaycalc.springboot.backend.apirest.springbootbackendapirest.repository.EmployeeRepository;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
    
    @Autowired EmployeeRepository employeeRepository;

    @GetMapping("/employees")
    public List<Employee> getAllEmployees(){
        return employeeRepository.getAllEmployees();
    }
}
