package com.example.RestServiceApplication;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.RestServiceApplication.Employee;
import com.example.RestServiceApplication.Employees;
import com.example.RestServiceApplication.EmployeeManager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;


@SpringBootTest
public class RestServiceApplicationTests {

    @Mock
	private EmployeeManager employeeManager;

	// Helper fn to get the no of current employees
	int getEmployeeCount(EmployeeManager manager)
	{
		return manager.getEmployees().getEmployeeList().size();
	}

	@Test
	// To check that employee list is populated on initialization
	void createEmployeeManager() {
		EmployeeManager newEmployeeManager = new EmployeeManager();
		assert(getEmployeeCount(newEmployeeManager) != 0);
	}

	@Test
	// Adding employees should increase the total count.
	void addEmployee() {
		EmployeeManager employeeManager = new EmployeeManager();
		int employeeCount = getEmployeeCount(employeeManager);
		Employee employee = new Employee("123", "N", "K", "nk@mail.com", "Software developer");
		employeeManager.addEmployee(employee);
		assert(employeeCount + 1 == getEmployeeCount(employeeManager));
	}

	@ExtendWith(MockitoExtension.class)
    @BeforeEach void setUp()
    {
		this.employeeManager = new EmployeeManager();
		Employee newEmployee = new Employee("123", "N", "K", "nk@mail.com", "Software developer");
		this.employeeManager.addEmployee(newEmployee);
    }

	@Test
	// Check whether test employee ID is found in ID field
	void employeeIdInList() {
		List<Employee> employees = this.employeeManager.getEmployees().getEmployeeList();
		for (int i=0; i<employees.size(); i++)
		{
			Employee employee = employees.get(i);
			if (employee.getEmployeeId() == "123")
			{
				return;
			}
		}
		assert(false);
	}

	@Test
	// Check whether test employee first name is found in first name field
	void employeeFirstNameInList() {
		List<Employee> employees = this.employeeManager.getEmployees().getEmployeeList();
		for (int i=0; i<employees.size(); i++)
		{
			Employee employee = employees.get(i);
			if (employee.getFirstName() == "N")
			{
				return;
			}
		}
		assert(false);
	}

	@Test
	// Check whether test employee last name is found in last name field
	void employeeLastNameInList() {
		List<Employee> employees = this.employeeManager.getEmployees().getEmployeeList();
		for (int i=0; i<employees.size(); i++)
		{
			Employee employee = employees.get(i);
			if (employee.getLastName() == "K")
			{
				return;
			}
		}
		assert(false);
	}

	@Test
	// Check whether test employee email is found in email field
	void employeeEmailInList() {
		List<Employee> employees = this.employeeManager.getEmployees().getEmployeeList();
		for (int i=0; i<employees.size(); i++)
		{
			Employee employee = employees.get(i);
			if (employee.getEmail() == "nk@mail.com")
			{
				return;
			}
		}
		assert(false);
	}

	@Test
	// Check whether test employee title is found in title field
	void employeeTitleInList() {
		List<Employee> employees = this.employeeManager.getEmployees().getEmployeeList();
		for (int i=0; i<employees.size(); i++)
		{
			Employee employee = employees.get(i);
			if (employee.getTitle() == "Software developer")
			{
				return;
			}
		}
		assert(false);
	}
}
