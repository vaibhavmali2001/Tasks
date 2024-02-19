package com.app.service;

import java.io.IOException;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.app.entity.Image;

public interface ImageService {

	Image saveImage(MultipartFile image) throws IOException ;

	List<Image> getAllImages();

	void deleteImage(Long id);

}