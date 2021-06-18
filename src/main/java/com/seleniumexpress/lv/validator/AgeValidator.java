package com.seleniumexpress.lv.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class AgeValidator implements ConstraintValidator<Age, Integer> {//no need to use @componenet bcz spring will automaticaaly detect this class because it is implementing constraint validator

private int upper,lower;	
@Override
	public void initialize(Age age) {
	//i can write post construct work right here
		this.lower=age.lower();// value pick krege from @age(upper=75,lower=12)wali annotatiokn ton, naki jo apan age wali annotaion class wich diti aa defalut. i.e value set by thedevelpoer in registrationDtO
		this.upper=age.upper();

		
	}
	@Override
	public boolean isValid(Integer age, ConstraintValidatorContext context) {
		//age =jo user ne text box mai fill kia
	if(age==null)
	{return false;}
		if(age<lower ||age>upper)
		{return false;}
		
		
		return true;
	}

}
