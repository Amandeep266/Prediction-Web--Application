package com.seleniumexpress.lv.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.seleniumexpress.lv.api.EmailDTO;
import com.seleniumexpress.lv.api.UserInfoDTO;
import com.seleniumexpress.lv.service.LCAPPEmailServiceImpl;

@Controller
public class EmailController {
	
	@Autowired
	private LCAPPEmailServiceImpl imp;

	@RequestMapping("/sendEmail")
	public String sendEmail(Model model) {
		model.addAttribute("emailDTO", new EmailDTO());

		return "send-email-page";
	}

	@RequestMapping("/process-email")
	public String processEmail(@SessionAttribute("userInfo") UserInfoDTO dto,@ModelAttribute("emailDTO") EmailDTO emailDTO) {

	
	imp.sendEmail(dto.getYourname(),emailDTO.getUserEmail(),dto.getResult());
		
		return "process-email";

	}

}
