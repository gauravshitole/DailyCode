package com.pcs.springBootProject2.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "EmployeeInformation")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Emp_id") // Optional: Matches DB column
    private int empId;

    @Column(name = "EmpName")
    private String empName;

    @Column(name = "EmpSalary")
    private int empSalary;

    @Column(name = "EmpDepartment")
    private String department;

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empSalary=" + empSalary +
                ", department='" + department + '\'' +
                '}';
    }
}
