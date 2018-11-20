package com.tasklist.TaskListCapstone.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tasklist.TaskListCapstone.entity.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
	
	Employee findByEmpname(String empname);

}
