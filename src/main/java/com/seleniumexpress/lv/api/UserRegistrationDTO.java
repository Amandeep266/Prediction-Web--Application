package com.seleniumexpress.lv.api;
import javax.validation.constraints.*;

import com.seleniumexpress.lv.validator.Age;
public class UserRegistrationDTO {
	//@NotBlank(message = "* username cant be blank")
	//@Size(min=3,message="* your name shul have alteast 3 chatacters")
	@NotEmpty(message="Name cant be empty")
	private String name;
	private String username;
	private char password[];
	private String countryName;
	private String hobbies[];
	private String gender;
	
	@Age(lower=18,upper=35,message="age should be between 18-35")//custom annotation
	private Integer age;
	private CommunicationDTO communicationDTO;
	

public CommunicationDTO getCommunicationDTO() {
		return communicationDTO;
	}
	public void setCommunicationDTO(CommunicationDTO communicationDTO) {
		this.communicationDTO = communicationDTO;
	}

	

	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}

	
	public String[] getHobbies() {
		return hobbies;
	}
	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public char[] getPassword() {
		return password;
	}
	public void setPassword(char[] password) {
		this.password = password;
	}
}
