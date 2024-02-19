package com.app.entity;

import java.util.Arrays;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;

@Entity
public class Video {
	
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String VideoName;

	    @Lob
	    @Column(length = 16777215) // Set the size of the 'data' column to MEDIUMBLOB
	    private byte[] Videodata;

		public Video() {
			super();
		}

		public Video(Long id, String videoName, byte[] videodata) {
			super();
			this.id = id;
			VideoName = videoName;
			this.Videodata = videodata;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getVideoName() {
			return VideoName;
		}

		public void setVideoName(String videoName) {
			VideoName = videoName;
		}

		public byte[] getVideoData() {
			return Videodata;
		}

		public void setVideoData(byte[] Videodata) {
			this.Videodata = Videodata;
		}

		@Override
		public String toString() {
			return "Video [id=" + id + ", VideoName=" + VideoName + ", Videodata=" + Arrays.toString(Videodata) + "]";
		}
	    
	    
}
