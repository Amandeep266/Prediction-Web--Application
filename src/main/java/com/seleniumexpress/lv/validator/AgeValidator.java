package com.seleniumexpress.lv.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class AgeValidator implements ConstraintValidator<Age, Integer> {

private int upper,lower;	
@Override
	public void initialize(Age age) {
	//i can write post construct work right here
		this.lower=age.lower();
		this.upper=age.upper();

		
	}
	@Override
	public boolean isValid(Integer age, ConstraintValidatorContext context) {
		
	if(age==null)
	{return false;}
		if(age<lower ||age>upper)
		{return false;}
		
		
		return true;
	}

}
