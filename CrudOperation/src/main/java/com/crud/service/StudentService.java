package com.crud.service;

import com.crud.entity.Student;
import com.crud.repository.StudentRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepo studentRepo;
    public Student AddData(Student student){
        return studentRepo.save(student);
    }
    public List<Student> GetAllData(){
       return studentRepo.findAll();
    }
    public Student FindByStdId(Long id){
        return studentRepo.findById(id).get();
    }

    public void deleteByName(String name){
        studentRepo.deleteByName(name);
    }
    public void inserById(Student Updatestudent, Long id){
        Student s1=studentRepo.findById(id)
                        .orElseThrow(()->new RuntimeException("User Not Found"));
                s1.setName(Updatestudent.getName());
                 s1.setMarks(Updatestudent.getMarks());
                  studentRepo.save(s1);


    }
}
