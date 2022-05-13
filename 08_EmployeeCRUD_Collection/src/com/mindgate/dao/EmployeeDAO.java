package com.mindgate.dao;

import java.util.HashSet;

import java.util.Set;

import com.mindgate.pojo.Employee;

public class EmployeeDAO {
	private Set<Employee> employeeSet = new HashSet<Employee>();
	//  add new employee
	public boolean addNewEmplyee(Employee employee)                                                                                                                                         
	{
		
		return employeeSet.add(employee);
		 
	}
	
	// update
	public boolean updateEmployee(Employee employee) {
		for (Employee emp : employeeSet) {
			if(emp.getEmplId() == employee.getEmplId()) {
			emp.setName(employee.getName());
			emp.setSalary(employee.getSalary());
			return true;
		}
		}
		return false;
	}
	//delete
	public boolean deleteEmplyeeById(int employee)
	{
		for (Employee employee1 : employeeSet) {
			if(employee1.getEmplId() == employee ) {
				return employeeSet.remove(employee1);
				
			}
			
		}
		return false;
	}
	//get single employee by id 
	public Employee getEmployeeById(int employeeId) {
		for (Employee employee : employeeSet) {
			if(employee.getEmplId() == employeeId) {
				return employee;
			}
			
		}
		return null;
	}
	// get all the emplyee
	public Set<Employee> getAllEmployee(){
		return employeeSet;
	}

}
