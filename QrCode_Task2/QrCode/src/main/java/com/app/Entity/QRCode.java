package com.app.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="qrGenerate")
public class QRCode {
	   @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String content;
		public QRCode() {
			super();
		}
		public QRCode(Long id, String content) {
			super();
			this.id = id;
			this.content = content;
		}
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getContent() {
			return content;
		}
		public void setContent(String content) {
			this.content = content;
		}
		@Override
		public String toString() {
			return "QRCode [id=" + id + ", content=" + content + "]";
		}
	    
	    
	
	
}
