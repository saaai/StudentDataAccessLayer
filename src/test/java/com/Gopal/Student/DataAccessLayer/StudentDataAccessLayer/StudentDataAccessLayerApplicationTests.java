package com.Gopal.Student.DataAccessLayer.StudentDataAccessLayer;

import java.util.Optional;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.Gopal.Student.DataAccessLayer.entities.Student;
import com.Gopal.Student.DataAccessLayer.repositories.StudentRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentDataAccessLayerApplicationTests {

	@Autowired
	private StudentRepository studentRepository;
	
	@Test
	public void testCreateStudent() {
		
		Student student = new Student();
		
		student.setStudent_Name("John");
		student.setStudent_Course("Java Web Services");
		student.setStudent_Fee(30d);
		
		student.setStudent_Name("Sindhu Mental");
		student.setStudent_Course("Java Web Services");
		student.setStudent_Fee(30d);
		
		student.setStudent_Name("vasudha akka");
		student.setStudent_Course("Java Web Services");
		student.setStudent_Fee(30d);
		
		studentRepository.save(student);
		 
	}
	
	@Test
	public void testFindStudentById() {

		StudentRepository studentRepository2 = studentRepository;
		Optional<Student> student = studentRepository2.findById(1l);
		Optional<Student> student1 = studentRepository2.findById(2l);
		Optional<Student> student2 = studentRepository2.findById(3l);
		System.out.println(student);
		System.out.println(student1);
		System.out.println(student2);
	
	} 
	
	@Test
	public void testDeleteStudent() {
		
		StudentRepository studentRepository3 = studentRepository;
	
		studentRepository.deleteById(4l);

	}
	
}
