package com.springmvc.springdemo.model;

import java.util.LinkedHashMap;

public class Student {

	private String firstName;
	private String lastName;
	private String country;
	private String language;
	private LinkedHashMap<String, String> languageOptions;
	private String operatingSystems;
	private String[] operatingSystemsOptions;

	public Student() {
		super();
		languageOptions = new LinkedHashMap<String, String>();
		languageOptions.put("Java", "Java");
		languageOptions.put("C++", "C++");
		languageOptions.put("DotNet", "DotNet");

		operatingSystemsOptions = new String[3];
		operatingSystemsOptions[0] = "Linux";
		operatingSystemsOptions[1] = "Mac";
		operatingSystemsOptions[2] = "Windows";
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public LinkedHashMap<String, String> getLanguageOptions() {
		return languageOptions;
	}

	public void setLanguageOptions(LinkedHashMap<String, String> languageOptions) {
		this.languageOptions = languageOptions;
	}

	public String getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(String operatingSystems) {
		this.operatingSystems = operatingSystems;
	}

	public String[] getOperatingSystemsOptions() {
		return operatingSystemsOptions;
	}

	public void setOperatingSystemsOptions(String[] operatingSystemsOptions) {
		this.operatingSystemsOptions = operatingSystemsOptions;
	}

}
