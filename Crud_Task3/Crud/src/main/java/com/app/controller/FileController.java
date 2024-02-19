package com.app.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.app.entity.File;
import com.app.service.FileService;

@RestController
@CrossOrigin
@RequestMapping("/file")
public class FileController {

	@Autowired
	private FileService fileService;
	
	@PostMapping("/upload")
	 public ResponseEntity<File> uploadFile(@RequestParam("file") MultipartFile file) throws IOException {
        File savedFile = fileService.saveFile(file);
        return ResponseEntity.ok(savedFile);
    }
	
	@GetMapping("/all")
    public ResponseEntity<List<File>> getAllFiles() {
        List<File> files = fileService.getAllFiles();
        return ResponseEntity.ok(files);
    }
	
	@DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteFile(@PathVariable Long id) {
        fileService.deleteFile(id);
        return ResponseEntity.ok("File deleted successfully");
    }
}