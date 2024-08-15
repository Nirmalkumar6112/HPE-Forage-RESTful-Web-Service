package com.example.RestServiceApplication;

import java.util.List;

import com.example.RestServiceApplication.Employees;
import com.example.RestServiceApplication.Employee;

import org.springframework.stereotype.Service;

@Service
public class EmployeeManager {
    private Employees employees;

    public EmployeeManager() {
        employees = new Employees();
        employees.getEmployeeList().add(new Employee("1", "Antonio ", "Neri", "neri@mail.com", "CEO"));
        employees.getEmployeeList().add(new Employee("2", "Marie", "Myers", "myers@mail.com", "CFO"));
        employees.getEmployeeList().add(new Employee("3", "Fidelma", "Russo", "russo@mail.com", "CTO"));
    }

    public Employees getEmployees(){
        return employees;
    }

    public void addEmployee(Employee employee){
        List<Employee> list = employees.getEmployeeList();
        list.add(employee);
    }
}