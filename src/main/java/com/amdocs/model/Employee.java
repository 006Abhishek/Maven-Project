package com.amdocs.model;

import javax.xml.*;

public class Employee {
   
	private int EmpId;
	private double salary;
	private String name;
	
	public int getEmpId() {
		return EmpId;
	}
	public void setEmpId(int empId) {
		EmpId = empId;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Employee [EmpId=" + EmpId + ", salary=" + salary + ", name=" + name + "]";
	}
}
