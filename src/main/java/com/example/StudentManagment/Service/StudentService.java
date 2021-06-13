package com.example.StudentManagment.Service;

import com.example.StudentManagment.Entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();

    Student saveStudents(Student student);

    Student getStudentById(Long id);

    Student updateStudent(Student student);

    void deleteStudent(Long id);
}
