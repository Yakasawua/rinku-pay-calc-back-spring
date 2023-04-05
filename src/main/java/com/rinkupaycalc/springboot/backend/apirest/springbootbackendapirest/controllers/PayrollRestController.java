package com.rinkupaycalc.springboot.backend.apirest.springbootbackendapirest.controllers;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rinkupaycalc.springboot.backend.apirest.springbootbackendapirest.dto.EmployeeRequestDTO;
import com.rinkupaycalc.springboot.backend.apirest.springbootbackendapirest.dto.PayrollRequestDTO;
import com.rinkupaycalc.springboot.backend.apirest.springbootbackendapirest.models.entity.Payroll;
import com.rinkupaycalc.springboot.backend.apirest.springbootbackendapirest.repository.PayrollRepository;

@RestController
@RequestMapping("/payroll")
public class PayrollRestController {

    @Autowired PayrollRepository payrollRepository;

    @PostMapping("/list")
    public List<PayrollRequestDTO> findByMonthYear(@RequestBody PayrollRequestDTO payrollRequestDTO) {
        LocalDate monthYear = payrollRequestDTO.getMonth_year();
        List<Payroll> payrolls = payrollRepository.findByMonthYear(monthYear);
        List<PayrollRequestDTO> payrollDTOs = payrolls.stream()
                .map(p -> {
                    PayrollRequestDTO payrollDTO = new PayrollRequestDTO();
                    payrollDTO.setId(p.getId());
                    payrollDTO.setEmployee(
                        new EmployeeRequestDTO(
                            p.getEmployee().getId(),
                            p.getEmployee().getRole(),
                            p.getEmployee().getName(),
                            p.getEmployee().getEmployeeNumber()
                        )
                    );
                    payrollDTO.setMonth(p.getMonth());
                    payrollDTO.setDeliveries(p.getDeliveries());
                    payrollDTO.setWorkedHours(p.getWorkedHours());
                    payrollDTO.setDeliveriesPayment(p.getDeliveriesPayment());
                    payrollDTO.setBonusPayment(p.getBonusPayment());
                    payrollDTO.setIsrRetention(p.getIsrRetention());
                    payrollDTO.setGroceryVouchers(p.getGroceryVouchers());
                    payrollDTO.setTotalSalary(p.getTotalSalary());
                    return payrollDTO;

                }
                    ).collect(Collectors.toList());
        return payrollDTOs;
    }
    
}
