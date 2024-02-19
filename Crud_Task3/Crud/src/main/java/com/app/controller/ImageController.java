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

import com.app.entity.Image;
import com.app.service.ImageService;

@RestController
@CrossOrigin
@RequestMapping("/image")
public class ImageController {
	
	@Autowired
	private ImageService imageService;
	
	@PostMapping("/upload")
    public ResponseEntity<Image> uploadImage(@RequestParam("image") MultipartFile image) throws IOException {
        Image savedImage = imageService.saveImage(image);
        return ResponseEntity.ok(savedImage);
    }
	
	 @GetMapping("/all")
	    public ResponseEntity<List<Image>> getAllImages() {
	        List<Image> images = imageService.getAllImages();
	        return ResponseEntity.ok(images);
	    }
	 
	 @DeleteMapping("/delete/{id}")
	    public ResponseEntity<String> deleteImage(@PathVariable Long id) {
	        imageService.deleteImage(id);
	        return ResponseEntity.ok("Image deleted successfully");
	    }
}
