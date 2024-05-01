package com.efr.employee.rest.api.dao;

import com.efr.employee.rest.api.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
