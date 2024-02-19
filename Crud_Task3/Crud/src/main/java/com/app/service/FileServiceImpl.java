package com.app.service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.app.entity.File;
import com.app.repo.FileRepo;

@Service
public class FileServiceImpl implements FileService {
	
	@Autowired
	private FileRepo fileRepo;

	  public File saveFile(MultipartFile file) throws IOException {
	        File fileEntity = new File();
	        fileEntity.setFileName(file.getOriginalFilename());
	        fileEntity.setData(file.getBytes());
	        return fileRepo.save(fileEntity);
	    }
	
	  public List<File> getAllFiles() {
	        return fileRepo.findAll();
	    }

	@Override
	public void deleteFile(Long id) {
		fileRepo.deleteById(id);
	}
	
}