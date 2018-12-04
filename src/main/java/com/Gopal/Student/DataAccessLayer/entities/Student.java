package com.Gopal.Student.DataAccessLayer.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "studenttab")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Student_Id")
	private Long Student_Id;
	
	@Column(name = "Student_Name")
	private String Student_Name;
	
	@Column(name = "Student_Course")
	private String Student_Course;
	
	@Column(name = "Student_Fee")
	private double Student_Fee;

	public Long getStudent_Id() {
		return Student_Id;
	}

	public void setStudent_Id(Long student_Id) {
		Student_Id = student_Id;
	}

	public String getStudent_Name() {
		return Student_Name;
	}

	public void setStudent_Name(String student_Name) {
		Student_Name = student_Name;
	}

	public String getStudent_Course() {
		return Student_Course;
	}

	public void setStudent_Course(String student_Course) {
		Student_Course = student_Course; 
	}

	public double getStudent_Fee() {
		return Student_Fee;
	}

	public void setStudent_Fee(double student_Fee) {
		Student_Fee = student_Fee;
	}

	@Override
	public String toString() {
		return "Student [Student_Id=" + Student_Id + ", Student_Name=" + Student_Name + ", Student_Course="
				+ Student_Course + ", Student_Fee=" + Student_Fee + "]";
	}
	
}
