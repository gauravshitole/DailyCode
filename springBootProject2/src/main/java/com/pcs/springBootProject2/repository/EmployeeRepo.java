package com.pcs.springBootProject2.repository;

import com.pcs.springBootProject2.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee,Integer> {


}
