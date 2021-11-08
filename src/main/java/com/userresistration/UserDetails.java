package com.userresistration;

import java.util.regex.Pattern;

public class UserDetails {

	private static final String firstName = "^[A-Z]{1}[a-zA-Z]{2,}$";
	private static final String lastName = "^[A-Z]{1}[a-zA-Z]{2,}$";
	private static final String EMAIL_PATTERN = "^[a-zA-Z0-9]+[.(a-zA-Z0-9)]*[@]{1}[a-z]+[.]{1}[a-z]{2,4}[.]*[a-z]*{2}$";
	private static final String MOBILE_NUMBER = "^[9]{1}[0-9]{1}[ ][789]{1}[0-9]{9}$";
	private static final String PASSWORD = "^([A-Za-z0-9]*[!@#$%^&*.]{1}[A-Za-z0-9]*)$";

	public boolean validateFirstName(String fName) {
		boolean result = Pattern.matches(firstName, fName);
		return result;
	}

	public boolean validateLastName(String lName) {
		boolean result = Pattern.matches(lastName, lName);
		return result;
	}

	public boolean validateEmail(String email) {
		boolean result = Pattern.matches(EMAIL_PATTERN, email);
		return result;
	}

	public boolean validateMobileNumber(String mobNumber) {
		boolean result = Pattern.matches(MOBILE_NUMBER, mobNumber);
		return result;
	}

	public boolean validatePassword(String pass) {
		boolean result = Pattern.matches(PASSWORD, pass);
		return result;
	}

}
