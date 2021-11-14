package com.lopputyo.student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@SpringBootApplication
public class StudentApplication {
	com.lopputyo.student.Student Student = new Student();
	com.lopputyo.student.Filetest tiedosto = new Filetest();

	public static void main(String[] args) {
		SpringApplication.run(StudentApplication.class, args);
	}
	@RestController
	@RequestMapping("app")
	public class restitesti{
		
		@GetMapping
		public String joo() throws IOException {	
			Filetest.tiedosto(Student.getFname(),Student.getLname());
			return Student.getFname();
		}
		@GetMapping("/{name}")
		public String ei(@PathVariable String name) {
			Student.setFname(name);
			return "Joo täälä on";
		}
		@GetMapping("/2/{lname}")
		public String oi(@PathVariable String lname) {
			Student.setLname(lname);
			return "Joo täälä on";
		}
	}

}
