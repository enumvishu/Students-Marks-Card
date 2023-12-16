package com.smc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.smc.DTO.Students;
import com.smc.helper.ResponseStructure;
import com.smc.service.Student_Service;

@RestController
public class Student_Controller {

	@Autowired
	private Student_Service student_service;

	@PostMapping("student/one")
	public ResponseStructure saveStudent(@RequestBody Students student) {

		ResponseStructure responseStructure = student_service.saveStudent(student);

		return responseStructure;

	}

	@PostMapping("student/multiple")
	public ResponseStructure<List<Students>> saveMultipleStudent(@RequestBody List<Students> students) {

		return student_service.saveMultipleStudent(students);

	}

	@GetMapping("student/{id}")
	public ResponseStructure<Students> fetchById(@PathVariable int id) {

		return student_service.fetchById(id);

	}

}
