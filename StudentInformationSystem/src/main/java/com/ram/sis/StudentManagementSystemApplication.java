package com.ram.sis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ram.sis.entity.Student;
import com.ram.sis.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		/*
		Student student1 = new Student("Ram", "Lovewanshi", "ramsoftware786@gmail.com");
		 studentRepository.save(student1);
		  
		  Student student2 = new Student("Sanjay", "kumar", "sanjay@gmail.com");
		  studentRepository.save(student2);
		 
		 Student student3 = new Student("deepak", "sharma", "deepak@gmail.com");
		 studentRepository.save(student3);
		*/
		
	}

}
