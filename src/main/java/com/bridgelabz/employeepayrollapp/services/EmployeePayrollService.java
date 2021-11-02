package com.bridgelabz.employeepayrollapp.services;

import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.employeepayrollapp.dto.EmployeePayrollDTO;
import com.bridgelabz.employeepayrollapp.model.EmployeePayrollData;

public class EmployeePayrollService implements IEmployeePayrollService{
	public List<EmployeePayrollData> getEmployeePayrollData() {
		List<EmployeePayrollData> empDataList = new ArrayList();
		empDataList.add(new EmployeePayrollData(1,new EmployeePayrollDTO("Pankaj",30000)));
		return empDataList;
	}
	
	public EmployeePayrollData getEmployeePayrollDataById(int empId) {
		EmployeePayrollData empData = null;
		empData = new EmployeePayrollData(1,new EmployeePayrollDTO("Pankaj",30000));
		return empData;
	}
	
	public EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO empPayrollDTO) {
		EmployeePayrollData empData = null;
		empData = new EmployeePayrollData(1,empPayrollDTO);
		return empData;
	}
	
	public EmployeePayrollData updateEmployeePayrollData(EmployeePayrollDTO empPayrollDTO) {
		EmployeePayrollData empData = null;
		empData = new EmployeePayrollData(1,empPayrollDTO);
		return empData;
	}
	
	public void deleteEmployeePayrollData(int empID) {
		
	}
}
