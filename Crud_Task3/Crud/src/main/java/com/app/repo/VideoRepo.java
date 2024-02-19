package com.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.app.entity.Video;

@EnableJpaRepositories
@Repository
public interface VideoRepo extends JpaRepository<Video,Long> {

}
