package com.seleniumexpress.lv.service;

import org.springframework.stereotype.Service;

@Service
public class LCAppServiceImpl implements LCAppService {
public final String LCAppFormula="FLAME";
	@Override
	public String calculateLove(String yourname, String crushname) {
		// TODO Auto-generated method stub

		int count=(yourname+crushname).toCharArray().length;
		int formulaCount=LCAppFormula.toCharArray().length;
		int rem=count%formulaCount;
		char resultChar=LCAppFormula.charAt(rem);
	
		String result=whatBetweenUs(resultChar);
	
		return result;
	}

	@Override
	public String whatBetweenUs(char calculateResult) {
		// TODO Auto-generated method stub
	String result=null;
		if(calculateResult=='F')
		{
			
			result=LoveCalculatorConstants.F;
		}
		else if(calculateResult=='L')
		{
			result=LoveCalculatorConstants.L;
		}
		else if(calculateResult=='A')
		{
			result=	LoveCalculatorConstants.A;
		}
		else if(calculateResult=='M')
		{
			result=LoveCalculatorConstants.M;
		}
		else if(calculateResult=='E')
		{
			result=LoveCalculatorConstants.E;
		}
		return result;
		
		
		
	}

}
