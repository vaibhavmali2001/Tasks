package com.app.service;

import java.io.IOException;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.app.entity.File;

public interface FileService {

	File saveFile(MultipartFile file) throws IOException;

	List<File> getAllFiles();

	void deleteFile(Long id);

}
