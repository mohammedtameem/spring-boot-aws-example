package com.bytestream.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bytestream.entity.Student;
import com.bytestream.service.StudentService;

@RestController
@RequestMapping("/api/v1")
public class StudentController 
{
	@Autowired
	StudentService service;
	
	@GetMapping("/getStudents")
	public List<Student> getStudents()
	{
		return service.getStudents();
		
	}

}
