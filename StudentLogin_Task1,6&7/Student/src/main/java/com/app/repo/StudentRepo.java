package com.app.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.app.dto.LoginDto;
import com.app.entity.Student;

@EnableJpaRepositories
@Repository
public interface StudentRepo  extends JpaRepository<Student, Integer> {

	Student findByEmail(String string);

	List<Student> findByFirstName(String firstName);

	Student getByEmail(String email);

	Student findByMobile(String mobile);

	



	
    	
	
}