package com.app.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

@Service
public class SMSService {
	
	@Value("AC1808aefc19002af95f7c18194a413608")
    private String twilioAccountSid;

    @Value("8b0d3beedd8bb10e28c236fca7db6e8d")
    private String twilioAuthToken;

    @Value("+15166897997")
    private String twilioPhoneNumber;

    public void sendSMS(String to, String body) {
        Twilio.init(twilioAccountSid, twilioAuthToken);
        Message message = Message.creator(
                new PhoneNumber(to),
                new PhoneNumber(twilioPhoneNumber),
                body
        ).create();
        System.out.println("SMS sent with SID: " + message.getSid());
    }
}
