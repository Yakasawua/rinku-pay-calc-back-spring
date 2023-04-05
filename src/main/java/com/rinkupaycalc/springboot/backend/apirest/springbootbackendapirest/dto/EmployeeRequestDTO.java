package com.rinkupaycalc.springboot.backend.apirest.springbootbackendapirest.dto;

import com.rinkupaycalc.springboot.backend.apirest.springbootbackendapirest.models.entity.Employee.Role;

public class EmployeeRequestDTO {
    private Long id;
    private Role role;
    private String name;
    private String employeeNumber;

    public EmployeeRequestDTO(Long id, Role role, String name, String employeeNumber) {
        this.id = id;
        this.role = role;
        this.name = name;
        this.employeeNumber = employeeNumber;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Role getRole() {
        return this.role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployeeNumber() {
        return this.employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

}
