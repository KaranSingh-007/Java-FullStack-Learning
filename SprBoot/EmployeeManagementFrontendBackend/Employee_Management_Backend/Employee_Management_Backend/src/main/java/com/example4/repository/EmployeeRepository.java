package com.example4.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example4.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
