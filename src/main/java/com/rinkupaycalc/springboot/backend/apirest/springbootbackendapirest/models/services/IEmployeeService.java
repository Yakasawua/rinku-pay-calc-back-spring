package com.rinkupaycalc.springboot.backend.apirest.springbootbackendapirest.models.services;

import java.util.List;

import com.rinkupaycalc.springboot.backend.apirest.springbootbackendapirest.models.entity.Employee;

public interface IEmployeeService {

    public List<Employee> findAll();
    
}