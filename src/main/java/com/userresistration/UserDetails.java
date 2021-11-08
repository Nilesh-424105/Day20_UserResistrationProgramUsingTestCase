package com.userresistration;

import java.util.regex.Pattern;

public class UserDetails {

	public boolean validateFirstName(String lName) {
		String lastName = "^[A-Z]{1}[a-zA-Z]{2,}$";
		boolean result = Pattern.matches(lastName, lName);
		return result;
	}

}
