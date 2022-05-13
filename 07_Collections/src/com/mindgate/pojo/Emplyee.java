package com.mindgate.pojo;

import java.util.Objects;

public class Emplyee {
	private int empId;
	private String name;
	private int age;
	public Emplyee() {
		// TODO Auto-generated constructor stub
	}
	public Emplyee(int empId, String name, int age) {
		super();
		this.empId = empId;
		this.name = name;
		this.age = age;
	}
	// hashcode genarate on basis of values
	@Override
	public int hashCode() {
		return Objects.hash(age, empId, name);
	}
	
	//values compare for displyed
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emplyee other = (Emplyee) obj;
		return age == other.age && empId == other.empId && Objects.equals(name, other.name);
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Emplyee [empId=" + empId + ", name=" + name + ", age=" + age + "]";
	}
	

}
