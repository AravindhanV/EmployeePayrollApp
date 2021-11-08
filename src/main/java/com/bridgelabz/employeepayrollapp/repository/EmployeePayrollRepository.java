package com.bridgelabz.employeepayrollapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.bridgelabz.employeepayrollapp.model.EmployeePayrollData;

public interface EmployeePayrollRepository  extends JpaRepository<EmployeePayrollData, Integer>{
	@Query(value="select * from employee as e, department as d, employee_dept as ed where e.id=ed.emp_id and ed.dept_id=d.dept_id", nativeQuery = true)
	List<EmployeePayrollData> findEmployeesByDepartment(String department);
}