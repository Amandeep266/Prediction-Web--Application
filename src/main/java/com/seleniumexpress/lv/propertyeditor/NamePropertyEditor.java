package com.seleniumexpress.lv.propertyeditor;

import java.beans.PropertyEditorSupport;

public class NamePropertyEditor extends PropertyEditorSupport {

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		// TODO Auto-generated method stub
	String myConvertedStringValue=text.toUpperCase();
	setValue(myConvertedStringValue);
	}

	
}
