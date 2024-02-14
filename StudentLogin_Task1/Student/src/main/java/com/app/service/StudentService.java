package com.app.service;

import java.util.List;

import com.app.dto.LoginDto;
import com.app.dto.StudentDto;
import com.app.entity.Student;
import com.app.response.LoginMessage;

public interface StudentService {

	String addStudent(StudentDto studentDto);

	LoginMessage loginStudent(LoginDto loginDto);

	List<Student> getall();

	List<Student> byName(String firstName);

	

	



}
