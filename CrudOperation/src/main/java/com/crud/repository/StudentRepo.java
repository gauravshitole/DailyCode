package com.crud.repository;

import com.crud.entity.Student;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface StudentRepo extends JpaRepository<Student,Long> {
    @Modifying
    @Transactional
    @Query("DELETE FROM Student s WHERE s.name = :name")
    void deleteByName(String name);
}
