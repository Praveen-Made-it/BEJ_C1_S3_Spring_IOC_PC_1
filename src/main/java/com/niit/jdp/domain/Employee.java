/*
 *Author Name:Praveen Kumar
 *Date: 16-Nov-22
 *Created With IntelliJ Idea Community Edition
 */


package com.niit.jdp.domain;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
    private int employeeId;
    private String empoyeeName;
    private String employeeSalary;

    @Autowired
    private Department department;

    public Employee() {

    }

    public Employee(int employeeId, String empoyeeName, String employeeSalary, Department department) {
        this.employeeId = employeeId;
        this.empoyeeName = empoyeeName;
        this.employeeSalary = employeeSalary;
        this.department = department;
    }
}
