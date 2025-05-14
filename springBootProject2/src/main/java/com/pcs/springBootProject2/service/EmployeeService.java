package com.pcs.springBootProject2.service;

import com.pcs.springBootProject2.entity.Employee;
import com.pcs.springBootProject2.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepo employeeRepo;

    public List<Employee>getAllServices(){
        return employeeRepo.findAll();
    }
    public Optional<Employee> getFindId(int id){
        return employeeRepo.findById(id);
    }
    public Employee postEmployee(@RequestBody Employee employee){
       return employeeRepo.save(employee);
    }
    public void deleteById(int id)
    {
         employeeRepo.deleteById(id);
    }
}
