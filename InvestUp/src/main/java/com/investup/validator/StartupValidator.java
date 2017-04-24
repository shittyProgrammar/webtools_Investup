package com.investup.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.investup.pojo.Investor;
import com.investup.pojo.Startup;

public class StartupValidator implements Validator{

	@Override
	public boolean supports(Class aClass) {
		
		return aClass.equals(Startup.class);
	}

	@Override
	public void validate(Object obj, Errors errors) {
	
		Startup startup=(Startup) obj;
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userName", "error.invalid.startup", "Username Required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", "error.invalid.startup", "Email Required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "contactNumber", "error.invalid.startup", "Contact Number Required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "error.invalid.startup", "Password Required");
//		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "confirmPassword", "error.invalid.startup","Password Required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "startupDescription", "error.invalid.startup", "Description Required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "startupName", "error.invalid.startup", "Startup Name Required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "startupLicenseNumber", "error.invalid.startup", "License Number Required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "startupEquity", "error.invalid.startup", "Equity Required in %");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "startupFirstName", "error.invalid.startup", "First Name Required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "startupLastName", "error.invalid.startup", "Last Name Required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "startupStreet", "error.invalid.startup", "Street Required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "startupCity", "error.invalid.startup", "City Required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "startupState", "error.invalid.startup", "State Required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "startupCountry", "error.invalid.startup", "Country Required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "zip", "error.invalid.startup", "zip code Required");
		
	}
	
	
	

	

}
