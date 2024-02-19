package com.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.app.entity.Image;

@EnableJpaRepositories
@Repository
public interface ImageRepo extends JpaRepository<Image,Long> {

}
