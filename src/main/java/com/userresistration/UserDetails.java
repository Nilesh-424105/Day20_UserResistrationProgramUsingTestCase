package com.userresistration;

import java.util.regex.Pattern;

public class UserDetails {

	private static final String firstName = "^[A-Z]{1}[a-zA-Z]{2,}$";
	private static final String lastName = "^[A-Z]{1}[a-zA-Z]{2,}$";
	private static final String EMAIL_PATTERN = "^[a-zA-Z0-9]+[.(a-zA-Z0-9)]*[@]{1}[a-z]+[.]{1}[a-z]{2,4}[.]*[a-z]*{2}$";

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

}
