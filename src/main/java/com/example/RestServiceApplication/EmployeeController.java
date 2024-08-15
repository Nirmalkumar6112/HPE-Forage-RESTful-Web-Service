package com.example.RestServiceApplication;

import com.example.RestServiceApplication.Employee;
import com.example.RestServiceApplication.Employees;
import com.example.RestServiceApplication.EmployeeManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeManager employeeManager;

    public EmployeeController(EmployeeManager employeeManager) {
        this.employeeManager = employeeManager;
    }

	@GetMapping
	public Employees getAllEmployees() {
        return employeeManager.getEmployees();
    }

    @PostMapping
    public String addEmployee(@RequestBody Employee employee){
        employeeManager.addEmployee(employee);
        return "Employee added Success";
    }
}