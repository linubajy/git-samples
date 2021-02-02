package com.app.SpringbootRestAPI.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.SpringbootRestAPI.Entity.Employee;
import com.app.SpringbootRestAPI.service.EmployeeService;

@RequestMapping("/employee")
@RestController
public class EmployeeController 
{
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/save")
	public Employee save(@RequestBody Employee employee )
	{
		return employeeService.saveEmployee(employee);
	}
	
	@PutMapping("/update")
	public Employee update(@RequestBody Employee employee )
	{
		return employeeService.updateEmployee(employee);
	}
	
	@GetMapping("/all")
	public List<Employee>getAllEmployee()
	{
		return employeeService.getAllEmployeeList();
	}
	
	@GetMapping("/by/{employeeId}")
	public Employee getOne(@PathVariable(name="employeeId") Long employeeId)
	{
		return employeeService.getEmployee(employeeId);
	}
	
	@DeleteMapping("/delete/{employeeId}")
	public void deleteEmployee(@PathVariable(name="employeeId") Long employeeId)
	{
		employeeService.deleteEmployee(employeeId);
	}
	
}
