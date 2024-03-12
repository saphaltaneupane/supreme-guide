package com.bway.springproject.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bway.springproject.model.Employee;

public interface EmployeeRepository  extends JpaRepository<Employee, Long>{

}
