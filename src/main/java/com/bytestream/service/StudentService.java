package com.bytestream.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bytestream.entity.Student;
import com.bytestream.repo.StudentRepo;

@Service
public class StudentService 
{
	@Autowired
	StudentRepo repo;

	public List<Student> getStudents() 
	{
		
		return repo.findAll();
	}
	

}
