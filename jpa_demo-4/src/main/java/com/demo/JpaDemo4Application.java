package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.demo.entities.Course;
import com.demo.entities.Student;
import com.demo.repo.CourseRepo;
import com.demo.repo.StudentRepo;

@SpringBootApplication
public class JpaDemo4Application implements CommandLineRunner {
	@Autowired
	private CourseRepo courseRepo;
	@Autowired
	private StudentRepo studentRepo;

	public static void main(String[] args) {
		SpringApplication.run(JpaDemo4Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Course c1 = new Course("java", "20 days");
		Course c2 = new Course("html&css", "5 days");
		Course c3 = new Course("mysql database", "7 days");
		Course c4 = new Course("hibernate", "8 days");
		Course c5 = new Course("spring & spring boot", "25 days");

		Student s1 = new Student("dilip", 22);
		Student s2 = new Student("balu", 21);

		Student s3 = new Student("hari", 24);
		Student s4 = new Student("sadhik", 25);

		Student s5 = new Student("ebinazer", 22);
		Student s6 = new Student("ganesh", 21);

		Student s7 = new Student("imran", 23);
		Student s8 = new Student("jagadesh", 26);

		Student s9 = new Student("mallikarjun", 22);
		Student s10 = new Student("gnani", 21);

		c1.getStudent().add(s1);
		c1.getStudent().add(s2);

		c2.getStudent().add(s3);
		c2.getStudent().add(s4);

		c3.getStudent().add(s5);
		c3.getStudent().add(s6);

		c4.getStudent().add(s7);
		c4.getStudent().add(s8);

		c5.getStudent().add(s9);
		c5.getStudent().add(s10);

		s1.getCourse().add(c1);
		s2.getCourse().add(c1);

		s3.getCourse().add(c2);
		s4.getCourse().add(c2);

		s5.getCourse().add(c3);
		s6.getCourse().add(c3);

		s7.getCourse().add(c4);
		s8.getCourse().add(c4);

		s9.getCourse().add(c5);
		s9.getCourse().add(c5);

		courseRepo.save(c1);
		courseRepo.save(c2);
		courseRepo.save(c3);
		courseRepo.save(c4);
		courseRepo.save(c5);

		studentRepo.save(s1);
		studentRepo.save(s2);
		studentRepo.save(s3);
		studentRepo.save(s4);
		studentRepo.save(s5);
		studentRepo.save(s6);
		studentRepo.save(s7);
		studentRepo.save(s8);
		studentRepo.save(s9);
		studentRepo.save(s10);

	}

}
