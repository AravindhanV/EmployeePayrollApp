package com.bridgelabz.employeepayrollapp.model;

import com.bridgelabz.employeepayrollapp.dto.EmployeePayrollDTO;

public class EmployeePayrollData {
	private int employeeId;
	private String name;
	private long salary;
	
	public EmployeePayrollData() {}
	
	public EmployeePayrollData(int empId, EmployeePayrollDTO empPayrollDTO) {
		this.employeeId = empId;
		this.name = empPayrollDTO.name;
		this.salary = empPayrollDTO.salary;
	}
	
	public int getEmployeeId() {
		return employeeId;
	}
	
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.salary = salary;
	}
	
	public long getSalary(long salary) {
		return salary;
	}
}
