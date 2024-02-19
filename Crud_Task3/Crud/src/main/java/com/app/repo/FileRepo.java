package com.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.app.entity.File;

@EnableJpaRepositories
@Repository
public interface FileRepo extends JpaRepository<File,Long>{

}
