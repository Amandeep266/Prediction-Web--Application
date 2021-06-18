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
	//public String showHomePage(Model model,HttpServletRequest request)
	public String showHomePage(Model model){
	//public String showHomePage(@CookieValue("LCApp.yourname") String yourname,Model model){
		UserInfoDTO userinfo = new UserInfoDTO();
		model.addAttribute("userInfo", userinfo);
		//model.addAttribute("yourname",yourname);
//		Cookie cookie[]=request.getCookies();
//		for(Cookie temp: cookie)
//		{
//			
//			if("LCApp.yourname".equals(temp.getName()))
//			{
//				String username=temp.getValue();
//				userinfo.setYourname(username);
//				
//			}
//		}
		return "home-page";
	}

	@RequestMapping("/process-homepage")
	// public String showResultPage(@RequestParam String yourname,@RequestParam
	// String crushname,Model model)

	//public String showResultPage(@Valid @ModelAttribute("userInfo") UserInfoDTO dto, BindingResult result,HttpServletResponse response)
//	public String showResultPage(@Valid @ModelAttribute("userInfo") UserInfoDTO dto, BindingResult result,HttpServletRequest request)
	public String showResultPage(Model model, @Valid UserInfoDTO dto, BindingResult result1)
	{
	//	 model.addAttribute("communicationDTO",communicationDTO);
		// model.addAttribute("crushname",crushname);
		//
	
		model.addAttribute("userInfo",dto);// since we aree handling model  object manually so spring will not senderrors to hoe page so we to handle that manuayy aslo
		model.addAttribute(BindingResult.MODEL_KEY_PREFIX+"userInfo",result1);

		if (result1.hasErrors()) {
			List<ObjectError> err = result1.getAllErrors();
			for (ObjectError temp : err) {
				System.out.println(temp);

			}

			return "home-page";
		}
		
		
		
		
		// model.addAttribute("userInfo",userinfoDTO);
//return a service whic calculate  love between user and crush 
		
		
		
//		HttpSession session=request.getSession();
//		session.setAttribute("username",dto.getYourname());
//		session.setMaxInactiveInterval(120);
		
		
		
		//create a cookie
	
		//add cookie to response object
		
//		{	Cookie theCookie=new Cookie("LCApp.yourname",dto.getYourname());
//		theCookie.setMaxAge(60*60*24);
//		response.addCookie(theCookie);
			
		String appResult= lcservice.calculateLove(dto.getYourname(), dto.getCrushname());
		model.addAttribute("result",appResult);
		
		dto.setResult(appResult);
		
	
		
			return "result-page";
	}

}
