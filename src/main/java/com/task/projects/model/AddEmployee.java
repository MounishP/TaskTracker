package com.task.projects.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "add_employee")
public class AddEmployee {
    @Column(name = "emp_name")
    private String empName;
    @Column(name = "date_of_joining")
    private LocalDate empDOJ;
    @Column(name = "emp_address")
    private String empAddress;
    @Column(name = "emp_designation")
    private String empDesignation;

    public AddEmployee() {
    }

    public AddEmployee(String empName, LocalDate empDOJ, String empAddress, String empDesignation) {
        this.empName = empName;
        this.empDOJ = empDOJ;
        this.empAddress = empAddress;
        this.empDesignation = empDesignation;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public LocalDate getEmpDOJ() {
        return empDOJ;
    }

    public void setEmpDOJ(LocalDate empDOJ) {
        this.empDOJ = empDOJ;
    }

    public String getEmpAddress() {
        return empAddress;
    }

    public void setEmpAddress(String empAddress) {
        this.empAddress = empAddress;
    }

    public String getEmpDesignation() {
        return empDesignation;
    }

    public void setEmpDesignation(String empDesignation) {
        this.empDesignation = empDesignation;
    }
}
