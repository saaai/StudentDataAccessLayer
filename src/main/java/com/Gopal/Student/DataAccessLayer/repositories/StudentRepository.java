package com.Gopal.Student.DataAccessLayer.repositories;

import org.springframework.data.repository.CrudRepository;

import com.Gopal.Student.DataAccessLayer.entities.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

}


