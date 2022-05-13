package com.mindgate.pojo;

import java.util.Objects;

public class Employee {
	private int EmplId;
	private String name;
	private double salary;
	public Employee() {
	}
	public Employee(int emplId, String name, double salary) {
		super();
		EmplId = emplId;
		this.name = name;
		this.salary = salary;
	}
	
	//hashcode
	@Override
	public int hashCode() {
		return Objects.hash(EmplId, name, salary);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return EmplId == other.EmplId && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}
	//getter and setter
	
	public int getEmplId() {
		return EmplId;
	}
	public void setEmplId(int emplId) {
		EmplId = emplId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	//override to stirng method
	@Override
	public String toString() {
		return "Employee [EmplId=" + EmplId + ", name=" + name + ", salary=" + salary + "]";
	}
	
	 

}
