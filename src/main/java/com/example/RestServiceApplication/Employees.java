package com.example.RestServiceApplication;

import java.util.List;
import java.util.ArrayList;

public class Employees {
    private List<Employee> employeeList = new ArrayList<>();

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList){
        this.employeeList = employeeList;
    }
}