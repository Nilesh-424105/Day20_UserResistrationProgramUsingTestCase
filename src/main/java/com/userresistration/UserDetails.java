package com.userresistration;

import java.util.regex.Pattern;

public class UserDetails {

	public boolean validateFirstName(String fName) {
		String firstName = "^[A-Z]{1}[a-zA-Z]{2,}$";
		boolean result = Pattern.matches(firstName, fName);
		return result;
	}

}
