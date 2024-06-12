package com.satyam.test.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.satyam.test.entity.Student;
import com.satyam.test.repo.StudentRepository;

@RestController
public class Controller {
	
	@Autowired
	private StudentRepository  repo;
	
	@PostMapping("/save")
	private String saveStudent(@RequestBody Student student) {
		Student save = repo.save(student);
		return "Save Student with ID: "+save.getId();

	}
	@PutMapping("update")
	private String updateStudent(@RequestBody Student student) {
		repo.save(student);
		return "Updated Student Successfully ";

	}
	@GetMapping("fetch/{id}")
	private Student getStudent(@PathVariable Integer id) {
		Optional<Student> byId = repo.findById(id);
        return byId.get();
	}
	@DeleteMapping("/delete/{id}")
	private String deleteStudent(@PathVariable Integer id) {
		repo.deleteById(id);
		return "Student Deleted Successfully";
	}
    
	
	@GetMapping("/all")
	public List<Student> getAll(){
		return repo.findAll();
	}
}
