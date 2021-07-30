package com.seleniumexpress.lv.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.seleniumexpress.lv.api.UserRegistrationDTO;

public class UserNameValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		
		return UserRegistrationDTO.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "username", "username.empty", "username cant be empty ");

		String UserName = ((UserRegistrationDTO)target).getUsername();
		System.out.println(UserName);
		if (!UserName.contains("_")) {
			errors.rejectValue("username", "username.invalidString", "String must contain '_'");
		}

	}
}
