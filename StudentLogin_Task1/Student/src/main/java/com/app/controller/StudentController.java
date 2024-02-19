package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.LoginDto;
import com.app.dto.StudentDto;
import com.app.entity.Student;
import com.app.response.LoginMessage;
import com.app.service.StudentService;

@RestController
@CrossOrigin
@RequestMapping("/student")
public class StudentController {
	
	
	@Autowired
	private StudentService studentService;
	
	//Add new Student
	@PostMapping(path="/save")
	public String saveStudent(@RequestBody StudentDto studentDto)
	{
		String id= studentService.addStudent(studentDto);
		return id;
	}
	
	//Login
	@PostMapping(path="/login")
	public ResponseEntity<?>loginStudent(@RequestBody LoginDto loginDto){
		LoginMessage loginmessage = studentService.loginStudent(loginDto);
		System.out.println("In Controller");
		return ResponseEntity.ok(loginmessage);
	}
	
	//See all Students
	@GetMapping(path="/all")
	public List<Student>getall(){
		return studentService.getall();
	}
	
	//Find by Name
	@GetMapping(path="/byname")
	public List<Student>byName(@RequestParam String firstName)
	{
		System.out.println("In findcontr");
		return studentService.byName(firstName);
	}
	
	//Delete By Id
	@DeleteMapping(path="/delete")
	public String DeleteStudent(@RequestParam Integer id) {
		String ans=studentService.removeStudent(id);
		return ans;
	}
}
