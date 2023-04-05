package com.rinkupaycalc.springboot.backend.apirest.springbootbackendapirest.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.rinkupaycalc.springboot.backend.apirest.springbootbackendapirest.models.entity.Payroll;

public interface PayrollRepository extends JpaRepository<Payroll, Long>{
    
    //Stored procedure is called
    @Query(value = "{CALL payroll_list_by_month_year(:month_year)}", nativeQuery=true)
    List<Payroll> findByMonthYear(@Param("month_year") LocalDate monthYear);

}
