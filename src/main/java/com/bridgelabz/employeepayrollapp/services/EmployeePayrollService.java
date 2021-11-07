package com.bridgelabz.employeepayrollapp.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.bridgelabz.employeepayrollapp.dto.EmployeePayrollDTO;
import com.bridgelabz.employeepayrollapp.exceptions.EmployeePayrollException;
import com.bridgelabz.employeepayrollapp.model.EmployeePayrollData;
import com.bridgelabz.employeepayrollapp.repository.EmployeePayrollRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EmployeePayrollService implements IEmployeePayrollService{
	@Autowired
	private EmployeePayrollRepository employeeRepository;
	
	private List<EmployeePayrollData> employeePayrollList = new ArrayList<>();
	
	public List<EmployeePayrollData> getEmployeePayrollData() {
		return employeeRepository.findAll();
	}
	
	public EmployeePayrollData getEmployeePayrollDataById(int empId) {
		return employeeRepository
				.findById(empId)
				.orElseThrow(() ->  new EmployeePayrollException("Employee with id "+ 
							empId + " does not exist..!"));
	}
	
	public EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO empPayrollDTO) {
		EmployeePayrollData empData = null;
		empData = new EmployeePayrollData(empPayrollDTO);
		employeePayrollList.add(empData);
		log.debug("Emp Data: " + empData.toString());
		return employeeRepository.save(empData);
	}
	
	public EmployeePayrollData updateEmployeePayrollData(int empId, EmployeePayrollDTO empPayrollDTO) {
		EmployeePayrollData empData = this.getEmployeePayrollDataById(empId);
		empData.updateEmployeePayrollData(empPayrollDTO);
		return employeeRepository.save(empData);
	}
	
	public void deleteEmployeePayrollData(int empId) {
		EmployeePayrollData employeePayrollData = this.getEmployeePayrollDataById(empId);
		employeeRepository.delete(employeePayrollData);
	}
}
