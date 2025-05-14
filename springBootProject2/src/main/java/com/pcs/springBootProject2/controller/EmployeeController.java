package com.pcs.springBootProject2.controller;

import com.pcs.springBootProject2.entity.Employee;
import com.pcs.springBootProject2.repository.EmployeeRepo;
import com.pcs.springBootProject2.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController

public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/employee")
    public List<Employee> GetEmployeeAll(){
        return employeeService.getAllServices();

    }
    @GetMapping("employee/{id}")
    public Optional <Employee >getbyId(@PathVariable int id){
        return employeeService.getFindId( id);
    }
    @PostMapping("/employee")
    public Employee AddEmployee(@RequestBody Employee employee){
        return employeeService.postEmployee(employee);
    }
@DeleteMapping("employee/{id}")
public void deleteemployee(@PathVariable int id){
        employeeService.deleteById(id);
}

}