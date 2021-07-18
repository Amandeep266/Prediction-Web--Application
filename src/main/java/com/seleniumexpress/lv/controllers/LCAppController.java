package com.seleniumexpress.lv.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.seleniumexpress.lv.api.UserInfoDTO;
import com.seleniumexpress.lv.service.LCAppService;

@Controller
@SessionAttributes("userInfo")
public class LCAppController {
	@Autowired
private LCAppService lcservice;
	@RequestMapping("/")
	public String showHomePage(Model model){
		UserInfoDTO userinfo = new UserInfoDTO();
		model.addAttribute("userInfo", userinfo);
		
		return "home-page";
	}

	@RequestMapping("/process-homepage")
	public String showResultPage(Model model, @Valid UserInfoDTO dto, BindingResult result1)
	{
	
		model.addAttribute("userInfo",dto);// since we aree handling model  object manually so spring will not senderrors to hoe page so we to handle that manuayy aslo
		model.addAttribute(BindingResult.MODEL_KEY_PREFIX+"userInfo",result1);

		if (result1.hasErrors()) {
			List<ObjectError> err = result1.getAllErrors();
			for (ObjectError temp : err) {
				System.out.println(temp);

			}

			return "home-page";
		}		
		String appResult= lcservice.calculateLove(dto.getYourname(), dto.getCrushname());
		model.addAttribute("result",appResult);
		dto.setResult(appResult);
			return "result-page";
	}

}
