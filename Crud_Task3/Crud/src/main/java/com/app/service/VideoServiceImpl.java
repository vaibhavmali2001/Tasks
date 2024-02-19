package com.app.service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.app.entity.Video;
import com.app.repo.VideoRepo;

@Service
public class VideoServiceImpl implements VideoService {
	
	@Autowired
	private VideoRepo videoRepo;
	
	 public Video saveVideo(MultipartFile file) throws IOException {
	        Video videoEntity = new Video();
	        videoEntity.setVideoName(file.getOriginalFilename());
	        videoEntity.setVideoData(file.getBytes());
	        return videoRepo.save(videoEntity);
	    }

	@Override
	public List<Video> getAllVideos() {
		return videoRepo.findAll();
	}

	@Override
	public void deleteVideo(Long id) {
		videoRepo.deleteById(id);
		
	}
}