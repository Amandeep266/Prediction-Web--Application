package com.seleniumexpress.lv.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.seleniumexpress.lv.api.UserRegistrationDTO;

public class EmailValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return UserRegistrationDTO.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		// TODO Auto-generated method stub

		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "communicationDTO.email","email.empty","email empty");
		
		String email=((UserRegistrationDTO) target). getCommunicationDTO().getEmail();
				if(email.endsWith("seleniumexpress.com"))
				{
					
					errors.rejectValue("communicationDTO.email", "email.invalidDomain", "email.should be ending with seleniumexpress.com");
				}
	}

}
