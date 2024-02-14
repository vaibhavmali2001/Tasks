package com.app.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.app.Entity.QRCode;

@EnableJpaRepositories
@Repository
public interface QrRepo extends JpaRepository<QRCode,Long> {
	

}
