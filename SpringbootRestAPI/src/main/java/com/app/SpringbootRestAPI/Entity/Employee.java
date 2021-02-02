package com.app.SpringbootRestAPI.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="employee")

public class Employee 
{

	@Id
	@Column(name="employee_id")
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long employeeId;
	
	
	@Column(name="employeeName")
	private String employeeName;
	
	@Column(name="designation")
	private String designation;

	public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	
}
