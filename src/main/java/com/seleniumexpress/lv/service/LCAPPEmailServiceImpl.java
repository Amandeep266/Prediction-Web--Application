 package com.seleniumexpress.lv.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;


@Service
public class LCAPPEmailServiceImpl implements LCAppEmailService {
@Autowired
	private JavaMailSender jms;
	@Override
	public void sendEmail(String yourname,String userEmail, String result) {
		// TODO Auto-generated method stub
SimpleMailMessage newEmail=new SimpleMailMessage();
newEmail.setTo(userEmail);
newEmail.setSubject("Love Calculator Application Result");
newEmail.setText("Hi "+ yourname+" The result predicted by LCAPP is "+result);
jms.send(newEmail);

	}

}

