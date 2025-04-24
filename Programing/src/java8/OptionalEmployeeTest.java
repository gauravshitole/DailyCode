package java8;

import java.time.LocalDate;
import java.util.Optional;

public class OptionalEmployeeTest {
    public static void main(String[] args) {
        LocalDate birthDate=LocalDate.of(20,1,20);
        LocalDate plannedJoiningDate=LocalDate.of(25,4,21);
EmployeeOptional employeeOptional=new EmployeeOptional(1,"abc",birthDate,plannedJoiningDate, Optional.empty());
        System.out.println("Employee List is :"+employeeOptional);
        Employee employee=new Employee(1,"Gaurav",birthDate,plannedJoiningDate,null);
        System.out.println("Employee Data is"+employee);
    }

}
