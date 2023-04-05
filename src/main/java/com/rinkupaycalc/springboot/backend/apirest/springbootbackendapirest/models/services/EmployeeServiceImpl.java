package com.rinkupaycalc.springboot.backend.apirest.springbootbackendapirest.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rinkupaycalc.springboot.backend.apirest.springbootbackendapirest.models.dao.IEmployeeDao;
import com.rinkupaycalc.springboot.backend.apirest.springbootbackendapirest.models.entity.Employee;

@Service
public class EmployeeServiceImpl implements IEmployeeService{

    @Autowired
    private IEmployeeDao employeeDao;
    @Override
    @Transactional(readOnly=true)
    public List<Employee> findAll() {
        return (List<Employee>) employeeDao.findAll();
    }
    
}
