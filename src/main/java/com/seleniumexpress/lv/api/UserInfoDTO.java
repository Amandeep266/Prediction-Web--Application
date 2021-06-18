package com.seleniumexpress.lv.api;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class UserInfoDTO {
	@NotBlank(message = "*cant be blank")
	@Size(min=3,message="* your name should have 3-15 characters")
//	@Min(value=3, message="*should have alteast 3 chatacters")
	private String crushname;
	@NotBlank(message = "* username cant be blank")
	@Size(min=3,max=15,message="* your name should have alteast 3-15 characters")
	private String yourname;
	private String result;
	@AssertTrue(message="You have to agree our terms and condtions first")
	private boolean TandC;
	

	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public boolean isTandC() {
		return TandC;
	}
	public void setTandC(boolean tandC) {
		TandC = tandC;
	}
	public String getYourname() {
		return yourname;
	}
	public void setYourname(String yourname) {
		this.yourname = yourname;
	}
	public String getCrushname() {
		return crushname;
	}
	public void setCrushname(String crushname) {
		this.crushname = crushname;
	}


	
}
