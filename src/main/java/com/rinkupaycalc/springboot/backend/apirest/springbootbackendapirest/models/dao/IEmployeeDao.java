package com.rinkupaycalc.springboot.backend.apirest.springbootbackendapirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.rinkupaycalc.springboot.backend.apirest.springbootbackendapirest.models.entity.Employee;

public interface IEmployeeDao extends CrudRepository<Employee, Long>{
    
}
