package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.app.dto.LoginDto;
import com.app.dto.StudentDto;
import com.app.entity.Student;
import com.app.repo.StudentRepo;
import com.app.response.LoginMessage;

@Service
public class StudentServiceImpl implements StudentService{

	
	
	@Autowired
	private StudentRepo studentRepo;
	
	
	@Override
	public String addStudent(StudentDto studentDto) {
		Student student = new Student(
				studentDto.getId(),
				studentDto.getFirstName(),
				studentDto.getLastName(),
				studentDto.getEmail(),
				studentDto.getPassword()
				);
		studentRepo.save(student);
		return student.getFirstName();
	}


	@Override
	public LoginMessage loginStudent(@RequestBody LoginDto loginDto) {
		System.out.println("in ser");
			Student student1=studentRepo.findByEmail(loginDto.getEmail());
			if(student1!=null)
			{
				System.out.println("in ser1");
				String password=loginDto.getPassword();
				System.out.println(password+"1st pass");
				String password2=student1.getPassword();
				System.out.println(password2+"2nd pass");
				if(password.equals(password2))
				{
					return new LoginMessage("Login Success..",true);
				}
				else
				{
					return new LoginMessage("Login Failed!!!",false);
				}
			}
			else {
				return new LoginMessage("Password Wrong!!!",false);
			}
	
	}


	@Override
	public List<Student> getall() {
		return studentRepo.findAll();
	}


	@Override
	public List<Student>byName(String firstName) {
		return studentRepo.findByFirstName(firstName);
	}


	


	



	}
	
	

