package com.mindgate.main;

import java.util.Scanner;
import java.util.Set;
import com.mindgate.dao.EmployeeDAO;
import com.mindgate.pojo.Employee;

public class EmployeeMain {                                                                                                 

	public static void main(String[] args) {
		//Set<Employee> employees = new HashSet<Employee>();
		Scanner scanner = new Scanner(System.in);
		int choice;
		 int EmplId;
		 String name;
		 double salary;
		 Employee employee;
		 String continoueChoice;
		EmployeeDAO EmployeeDoa = new EmployeeDAO();
do {
		System.out.println("Menu");
		System.out.println("1 .Add new Employee");
		System.out.println("2. Update Employee Details");
		System.out.println("3. delete Emplyee Details by Id");
		System.out.println("4. Get single Emplyee Deatils by Id");
		System.out.println("5. Get all the Deatails");

		System.out.println("Enter your choice");
		choice = scanner.nextInt();

		switch (choice) {
		case 1:
			System.out.println("Enter Empid");
			EmplId = scanner.nextInt();
			System.out.println("Enter name");
			name = scanner.next();
			System.out.println("Enter salary");
			salary = scanner.nextDouble();
			employee = new Employee(EmplId, name, salary);
			if(EmployeeDoa.addNewEmplyee(employee))
			{
				System.out.println("Added Succesfully");
			
			}
			else {
				System.out.println("not Added");
			}
			
	

			break;
		case 2:
			    System.out.println("Enter Empid");
				EmplId = scanner.nextInt();
				System.out.println("Enter name");
				name = scanner.next();
				System.out.println("Enter salary");
				salary = scanner.nextDouble();
				employee = new Employee(EmplId, name, salary);
				employee.setEmplId(EmplId);
				employee.setName(name);
				employee.setSalary(salary);
				
				if(EmployeeDoa.updateEmployee(employee))
				{
					System.out.println("Updated Successfully");
				}
				else {
					System.out.println("Not Updated");
				}

			
			break;
		case 3:
			System.out.println("Enter emplyeeId");
			EmplId = scanner.nextInt();
			if(EmployeeDoa.deleteEmplyeeById(EmplId))
			{
				System.out.println("Deleted Successfully");
			}
			else {
				System.out.println("Not Deleted");
			}
			
			
			
			break;
		case 4: System.out.println("Enter emplyeeId");
				EmplId = scanner.nextInt();
				employee = EmployeeDoa.getEmployeeById(EmplId);
				System.out.println(employee.getName());
				System.out.println(employee.getEmplId());
				System.out.println(employee.getSalary());
			break;
		case 5:
			Set<Employee> employeeSet = EmployeeDoa.getAllEmployee();
			System.out.println(employeeSet);
			
			break;
		default:
			break;

		}
		System.out.println("do you want to continoue y o n");
		continoueChoice = scanner.next();
}while(continoueChoice.equals("yes"));

	}

}


