package com.example.StudentManagment;

import com.example.StudentManagment.Entity.Student;
import com.example.StudentManagment.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagmentSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagmentSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;


	@Override
	public void run(String... args) throws Exception {

//		Student nikola = new Student(1L,"Nikola","Stankovic","nikolastan@gmail.com");
//		studentRepository.save(nikola);
//
//		Student marko = new Student(2l,"Marko","Markovic","markomarkovic@gmail.com");
//		studentRepository.save(marko);
//
//		Student nevena = new Student(3l,"Nevena","Bozovic","nevenab@gmail.com");
//		studentRepository.save(nevena);


	}
}
