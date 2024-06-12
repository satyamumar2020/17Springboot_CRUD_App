package com.satyam.test.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.satyam.test.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
