package com.app.SpringbootRestAPI.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.SpringbootRestAPI.Entity.Employee;


@Repository
public interface EmployeeDao extends JpaRepository<Employee,Long> {

	

}
