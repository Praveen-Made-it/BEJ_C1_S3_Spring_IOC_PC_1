/*
 *Author Name:Praveen Kumar
 *Date: 16-Nov-22
 *Created With IntelliJ Idea Community Edition
 */


package com.niit.jdp.config;

import com.niit.jdp.domain.Department;
import com.niit.jdp.domain.Employee;
import org.springframework.context.annotation.Bean;

public class EmployeeConfig {
    @Bean("employee1")
    // A method which returns an object of type Employee.
    public Employee getEmployee() {
        // Creating an object of type Employee.
        Employee employee = new Employee();
        // Setting the value of employeeId, employeeName, employeeSalary
        employee.setEmployeeId(27186);
        employee.setEmpoyeeName("Praveen");
        employee.setEmployeeSalary("5_00_000");
        return employee;
    }

    @Bean

    // Creating a bean of type Department.
    public Department getdepartment() {
        return new Department(1, "Developement");
    }

}
