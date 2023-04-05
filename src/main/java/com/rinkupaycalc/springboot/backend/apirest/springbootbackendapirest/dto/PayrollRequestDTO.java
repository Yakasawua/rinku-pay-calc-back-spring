package com.rinkupaycalc.springboot.backend.apirest.springbootbackendapirest.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

public class PayrollRequestDTO {
    private LocalDate month_year;

    private Long id;
    private EmployeeRequestDTO employee;
    private LocalDate month;
    private Integer deliveries;
    private BigDecimal workedHours;
    private BigDecimal deliveriesPayment;
    private BigDecimal bonusPayment;
    private BigDecimal isrRetention;
    private BigDecimal groceryVouchers;
    private BigDecimal totalSalary;

    public LocalDate getMonth_year() {
        return this.month_year;
    }

    public void setMonth_year(LocalDate month_year) {
        this.month_year = month_year;
    }

    public PayrollRequestDTO(Long id, EmployeeRequestDTO employee, LocalDate month, Integer deliveries, BigDecimal workedHours, 
    BigDecimal deliveriesPayment, BigDecimal bonusPayment, BigDecimal isrRetention, BigDecimal groceryVouchers, BigDecimal totalSalary ) {
        this.id = id;
        this.employee = employee;
        this.month = month;
        this.deliveries = deliveries;
        this.workedHours = workedHours;
        this.deliveriesPayment = deliveriesPayment;
        this.bonusPayment = bonusPayment;
        this.isrRetention = isrRetention;
        this.groceryVouchers = groceryVouchers;
        this.totalSalary = totalSalary;
    }


    public PayrollRequestDTO() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public EmployeeRequestDTO getEmployee() {
        return this.employee;
    }

    public void setEmployee(EmployeeRequestDTO employee) {
        this.employee = employee;
    }


    public LocalDate getMonth() {
        return this.month;
    }

    public void setMonth(LocalDate month) {
        this.month = month;
    }

    public Integer getDeliveries() {
        return this.deliveries;
    }

    public void setDeliveries(Integer deliveries) {
        this.deliveries = deliveries;
    }

    public BigDecimal getWorkedHours() {
        return this.workedHours;
    }

    public void setWorkedHours(BigDecimal workedHours) {
        this.workedHours = workedHours;
    }

    public BigDecimal getDeliveriesPayment() {
        return this.deliveriesPayment;
    }

    public void setDeliveriesPayment(BigDecimal deliveriesPayment) {
        this.deliveriesPayment = deliveriesPayment;
    }

    public BigDecimal getBonusPayment() {
        return this.bonusPayment;
    }

    public void setBonusPayment(BigDecimal bonusPayment) {
        this.bonusPayment = bonusPayment;
    }

    public BigDecimal getIsrRetention() {
        return this.isrRetention;
    }

    public void setIsrRetention(BigDecimal isrRetention) {
        this.isrRetention = isrRetention;
    }

    public BigDecimal getGroceryVouchers() {
        return this.groceryVouchers;
    }

    public void setGroceryVouchers(BigDecimal groceryVouchers) {
        this.groceryVouchers = groceryVouchers;
    }

    public BigDecimal getTotalSalary() {
        return this.totalSalary;
    }

    public void setTotalSalary(BigDecimal totalSalary) {
        this.totalSalary = totalSalary;
    }


}
