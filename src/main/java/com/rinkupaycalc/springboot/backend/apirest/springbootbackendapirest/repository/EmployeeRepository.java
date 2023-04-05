package com.rinkupaycalc.springboot.backend.apirest.springbootbackendapirest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.rinkupaycalc.springboot.backend.apirest.springbootbackendapirest.models.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

    //Stored procedure is called
    @Query(value = "{CALL get_all_employees()}", nativeQuery=true)
    List<Employee> getAllEmployees();

}
