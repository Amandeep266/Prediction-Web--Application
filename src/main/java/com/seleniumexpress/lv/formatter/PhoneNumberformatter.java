package com.seleniumexpress.lv.formatter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.seleniumexpress.lv.api.Phone;

public class PhoneNumberformatter implements  Formatter<Phone>{

	@Override
	public String print(Phone phone, Locale locale) 
	{
		// TODO Auto-generated method stub
		
		
		return 	phone.getCode()+"-"+phone.getUserNumber();
		
	}

	@Override
	public Phone parse(String completePhoneNumber, Locale locale) throws ParseException {
		// TODO Auto-generated method stub
		Phone phone=new Phone();
		int index=completePhoneNumber.indexOf("-");
		String phoneNumber[]=completePhoneNumber.split("-");
		if(index==-1)
		{
			phone.setCode("91");
			phone.setUserNumber(phoneNumber[0]);
			
		}
		else
		{

		
	
		phone.setCode(phoneNumber[0]);
		phone.setUserNumber(phoneNumber[1]);
	
		}
		return phone;
	}
	

}
