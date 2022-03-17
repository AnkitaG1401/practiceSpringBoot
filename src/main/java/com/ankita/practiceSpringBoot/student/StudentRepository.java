package com.ankita.practiceSpringBoot.student;

import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student,Integer>{
	
	Student findById(int id);
	void deleteById(int id);
}
