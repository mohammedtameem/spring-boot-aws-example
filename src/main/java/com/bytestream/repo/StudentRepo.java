package com.bytestream.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bytestream.entity.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer>
{
	
}
