package com.app.entity;

import java.util.Arrays;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;

@Entity
public class Image {
	
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String imageName;

	    @Lob
	    @Column(length = 16777215) // Set the size of the 'data' column to MEDIUMBLOB
	    private byte[] data;

		public Image() {
			super();
		}

		public Image(Long id, String imageName, byte[] data) {
			super();
			this.id = id;
			this.imageName = imageName;
			this.data = data;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getImageName() {
			return imageName;
		}

		public void setImageName(String imageName) {
			this.imageName = imageName;
		}

		public byte[] getData() {
			return data;
		}

		public void setData(byte[] data) {
			this.data = data;
		}

		@Override
		public String toString() {
			return "Image [id=" + id + ", imageName=" + imageName + ", data=" + Arrays.toString(data) + "]";
		}
	    
	    
	    
}