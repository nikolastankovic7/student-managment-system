package com.example.StudentManagment.Repository;

import com.example.StudentManagment.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {

}
