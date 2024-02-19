package com.app.service;

import java.io.IOException;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.app.entity.Video;

public interface VideoService {

	Video saveVideo(MultipartFile video) throws IOException ;

	List<Video> getAllVideos();

	void deleteVideo(Long id);

}
