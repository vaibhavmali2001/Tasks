package com.app.service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.app.entity.Image;
import com.app.repo.ImageRepo;

@Service
public class ImageServiceImpl implements ImageService {
	
	@Autowired
	private ImageRepo imageRepo;

	@Override
	public Image saveImage(MultipartFile image) throws IOException  {
		Image imageEntity=new Image();
		imageEntity.setImageName(image.getOriginalFilename());
		imageEntity.setData(image.getBytes());
		return imageRepo.save(imageEntity);
	}

	@Override
	public List<Image> getAllImages() {
		  return imageRepo.findAll();
	}

	@Override
	public void deleteImage(Long id) {
		imageRepo.deleteById(id);
		
	}
	
	
}
