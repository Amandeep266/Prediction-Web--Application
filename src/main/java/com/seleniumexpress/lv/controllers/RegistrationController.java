package com.seleniumexpress.lv.controllers;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.seleniumexpress.lv.api.UserRegistrationDTO;
import com.seleniumexpress.lv.propertyeditor.NamePropertyEditor;
import com.seleniumexpress.lv.validator.EmailValidator;
import com.seleniumexpress.lv.validator.UserNameValidator;

@Controller
public class RegistrationController 
{
	
	@RequestMapping("/register")
	public String showRegistrationPage( @ModelAttribute("userReg") UserRegistrationDTO dto)
	{
		
 //UserRegistrationDTO  dto=new UserRegistrationDTO();
//	// model.addAttribute("userReg",dto);
//	Phone phone=new Phone();
//		phone.setCode("91");
//		phone.setUserNumber("234567890");
//		
//		
//	CommunicationDTO communicationDTO=new CommunicationDTO();
////		//communicationDTO.setPhone(phone);
//		dto.setCommunicatioDTO(communicationDTO);
		
//		
		
//		if(result.hasErrors())
//		{
//			System.out.println("has errors");
//		List <ObjectError> l=result.getAllErrors();
//		for(ObjectError temp:l)
//		{
//	System.out.println(temp);		
//			
//		
//		}
//		
//
//		return "home-page";}
//		
//		else
//			
//		{	
		
			//}
		return "user-registration-page";
	
	}
@RequestMapping("/registration-success")
public String processUserRegistration(@Valid@ModelAttribute("userReg") UserRegistrationDTO dto,BindingResult result)
{
//{	CommunicationDTO communicationDTO=new CommunicationDTO();
//////communicationDTO.setPhone(phone);
//dto.setCommunicatioDTO(communicationDTO);
//
	if(result.hasErrors())
	{
		System.out.println("has errors");
	List <ObjectError> l=result.getAllErrors();
	for(ObjectError temp:l)
	{
System.out.println(temp);		
	}
	return "user-registration-page";
	}
return "registration-success";	
}
@InitBinder("userReg")
public void initBinder(WebDataBinder binder)
{
StringTrimmerEditor editor=new StringTrimmerEditor(true);
binder.registerCustomEditor(String.class, "name",editor);

NamePropertyEditor nameEditor=new NamePropertyEditor();
binder.registerCustomEditor(String.class, "name",nameEditor);
//UserNameValidator validator=new UserNameValidator();
binder.addValidators(new UserNameValidator());
binder.addValidators( new EmailValidator());

}

}
