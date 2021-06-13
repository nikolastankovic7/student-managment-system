package com.example.StudentManagment.Service.impl;

import com.example.StudentManagment.Entity.Student;
import com.example.StudentManagment.Repository.StudentRepository;
import com.example.StudentManagment.Service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student saveStudents(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student getStudentById(Long id) {
       return studentRepository.findById(id).get();
    }

    @Override
    public Student updateStudent(Student student) {
       return studentRepository.save(student);
    }

    @Override
    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }


}
