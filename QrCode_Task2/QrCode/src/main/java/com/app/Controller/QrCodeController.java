package com.app.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.Entity.QRCode;
import com.app.Service.QrService;

@RestController
@CrossOrigin
@RequestMapping("/qrCode")
public class QrCodeController {
	
	@Autowired
	private QrService qrService;
		
	   @PostMapping(path="/generate")
	    public QRCode generateQRCode(@RequestBody QRCode qrCode) {
	        return qrService.saveQRCode(qrCode);
	    }
}
