package com.springmvc.springdemo.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {

	private String coursePrefix;

	@Override
	public void initialize(CourseCode theCourseCode) {
		coursePrefix = theCourseCode.value();
	}

	@Override
	public boolean isValid(String theCode, ConstraintValidatorContext arg1) {
		boolean result;

		if (theCode != null) {
			result = theCode.startsWith(coursePrefix);
		} else {
			result = true;
		}
		return result;
	}
}
