package com.rinkupaycalc.springboot.backend.apirest.springbootbackendapirest.models.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employees_employee")
public class Employee implements Serializable{

    public enum Role {
        CH, CA, AU
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable=false, unique=true, name = "employee_number")
    private String employeeNumber;

    @Column(nullable=false, name = "name")
    private String name;

    @Column(nullable=false, name = "role")
    @Enumerated(EnumType.STRING)
    private Role role;

    @Column(nullable=false, name = "base_salary")
    private BigDecimal baseSalary = BigDecimal.valueOf(30.00);

    @Column(nullable=false, name = "deliveries_payment_employee")
    private BigDecimal deliveriesPaymentEmployee = BigDecimal.valueOf(5.00);

    @Column(nullable=false, name = "bonus_hourly")
    private BigDecimal bonusHourly = BigDecimal.ZERO;

    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(String employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public BigDecimal getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(BigDecimal baseSalary) {
		this.baseSalary = baseSalary;
	}

	public BigDecimal getDeliveriesPaymentEmployee() {
		return deliveriesPaymentEmployee;
	}

	public void setDeliveriesPaymentEmployee(BigDecimal deliveriesPaymentEmployee) {
		this.deliveriesPaymentEmployee = deliveriesPaymentEmployee;
	}

	public BigDecimal getBonusHourly() {
		return bonusHourly;
	}

	public void setBonusHourly(BigDecimal bonusHourly) {
		this.bonusHourly = bonusHourly;
	}

    private static final long serialVersionUID = 1L;
}
