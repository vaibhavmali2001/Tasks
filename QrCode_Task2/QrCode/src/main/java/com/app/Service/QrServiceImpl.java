package com.app.Service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.Entity.QRCode;
import com.app.Repo.QrRepo;


@Service
public class QrServiceImpl implements QrService{
	
	@Autowired
	private QrRepo qrRepo;
	
	public QRCode saveQRCode(QRCode qrCode) {
        return qrRepo.save(qrCode);
    }
	
	
	
}
