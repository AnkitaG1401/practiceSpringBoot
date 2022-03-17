package com.ankita.practiceSpringBoot.student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
//	private List<Student> students = new ArrayList<> (Arrays.asList(
//			new Student(1,"Ram","Java"),
//			new Student(2,"Shyam","C++"),
//			new Student(3,"Radha","Spring")
//			));
	
	public List<Student> getAllStudents(){
		//return students;
		List<Student> students = new ArrayList<>();
		studentRepository.findAll().forEach(students::add);
		return students;
	}
	
	public Student getStudent(int id) {
		//return students.stream().filter(t -> t.getId()==id).findFirst().get();
		return studentRepository.findById(id);
	}

	public void addStudent(Student student) {
		//students.add(student);
		studentRepository.save(student);
		
	}
		
	public void updateStudent(int id,Student student){
		studentRepository.save(student);
	}
	
	public void deleteStudent(int id) {
		studentRepository.deleteById(id);
	}
		

}
