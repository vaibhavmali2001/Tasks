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

import com.app.entity.Video;
import com.app.service.VideoService;

@RestController
@CrossOrigin
@RequestMapping("/video")
public class VideoController {
	
	@Autowired
	private VideoService videoService;
	
	@PostMapping("/upload")
    public ResponseEntity<Video> uploadVideo(@RequestParam("video") MultipartFile video) throws IOException {
        Video savedVideo = videoService.saveVideo(video);
        return ResponseEntity.ok(savedVideo);
    }
	
	@GetMapping("/all")
    public ResponseEntity<List<Video>> getAllVideos() {
        List<Video> videos = videoService.getAllVideos();
        return ResponseEntity.ok(videos);
    }
	
	 @DeleteMapping("/delete/{id}")
	    public ResponseEntity<String> deleteVideo(@PathVariable Long id) {
	        videoService.deleteVideo(id);
	        return ResponseEntity.ok("Video deleted successfully");
	    }
}
