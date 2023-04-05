package com.rinkupaycalc.springboot.backend.apirest.springbootbackendapirest.models.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="payroll_payroll")
public class Payroll implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employee_id")
    private Employee employee;

    @Column(nullable = false, name = "month")
    private LocalDate month;

    @Column(nullable = false, name = "deliveries")
    private Integer deliveries = 0;

    @Column(nullable = false, precision = 10, scale = 2, name = "worked_hours")
    private BigDecimal workedHours = BigDecimal.ZERO;

    @Column(nullable = false, precision = 10, scale = 2, name = "deliveries_payment")
    private BigDecimal deliveriesPayment = BigDecimal.ZERO;

    @Column(nullable = false, precision = 10, scale = 2, name = "bonus_payment")
    private BigDecimal bonusPayment = BigDecimal.ZERO;

    @Column(nullable = false, precision = 10, scale = 2, name = "isr_retention")
    private BigDecimal isrRetention = BigDecimal.ZERO;

    @Column(nullable = false, precision = 10, scale = 2, name = "grocery_vouchers")
    private BigDecimal groceryVouchers = BigDecimal.ZERO;

    @Column(nullable = false, precision = 10, scale = 2, name = "total_salary")
    private BigDecimal totalSalary = BigDecimal.ZERO;

    @Override
    public String toString() {
        return "Nomina de " + employee + "para el mes " + month;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Employee getEmployee() {
        return this.employee;
    }

    public void setEmployee(Employee employee) {
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

    private static final long serialVersionUID = 1602231661172946371L;

}
