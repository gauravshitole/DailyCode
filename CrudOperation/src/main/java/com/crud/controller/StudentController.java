package com.crud.controller;

import com.crud.entity.Student;
import com.crud.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;
@PostMapping("/Student")
    public Student AddStudent(@RequestBody Student student){
     return studentService.AddData(student);


}
    @GetMapping("/Student")
    public  List<Student> getAllStudent(){
    return studentService.GetAllData();
    }
    @GetMapping("/Student/{id}")
    public Student findId(@PathVariable Long id){
    return  studentService.FindByStdId(id);
    }

    @DeleteMapping("/Student/{name}")
    public ResponseEntity<String> deleteStudentByName(@PathVariable String name) {
        studentService.deleteByName(name);
        return ResponseEntity.ok("Deleted student with name: " + name);
    }
    @PutMapping("/Student/{id}")
    public void insertData(@RequestBody Student student,@PathVariable Long id){
    studentService.inserById(student,id);
    }
}
