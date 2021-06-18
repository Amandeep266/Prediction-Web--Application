package com.seleniumexpress.lv.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.seleniumexpress.lv.api.UserRegistrationDTO;

public class UserNameValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		// check if UsreNameValidator support given Object
		return UserRegistrationDTO.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		// TODO Auto-generated method stub
		// write custom validation logic
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "username", "username.empty", "username cant be empty ");

		String UserName = ((UserRegistrationDTO)target).getUsername();
		System.out.println(UserName);//aha null print kr rea console uper
		if (!UserName.contains("_")) {
			errors.rejectValue("username", "username.invalidString", "String must contain '_'");
		}

	}
}