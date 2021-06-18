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

	// @RequestMapping("/sendEmail/{yourname}")

	@RequestMapping("/sendEmail")

	// public String sendEmail(@PathVariable("yourname") String
	// yourname,@ModelAttribute("emailDTO")EmailDTO emailDTO,Model model)

	public String sendEmail(Model model) {
		model.addAttribute("emailDTO", new EmailDTO());
		// model.addAttribute("yourname",yourname.toUpperCase());

		return "send-email-page";
	}

	@RequestMapping("/process-email")
	public String processEmail(@SessionAttribute("userInfo") UserInfoDTO dto,@ModelAttribute("emailDTO") EmailDTO emailDTO) {

	
	imp.sendEmail(dto.getYourname(),emailDTO.getUserEmail(),dto.getResult()); // we
																		// will
																		// create
																		// LCAppEmailServiceinterface
																		// and
																		// the
																		// calll
																		// this
																		// method
		//and we use session attribute to get yourname
		return "process-email";

	}

}
