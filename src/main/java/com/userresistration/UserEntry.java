package com.userresistration;

import java.util.regex.Pattern;

public class UserEntry {

	private static final String firstName = "^[A-Z]{1}[a-zA-Z]{2,}$";
	private static final String lastName = "^[A-Z]{1}[a-zA-Z]{2,}$";
	private static final String EMAIL_PATTERN = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
	private static final String MOBILE_NUMBER = "^[9]{1}[0-9]{1}[ ][789]{1}[0-9]{9}$";
	private static final String PASSWORD = "^([A-Za-z0-9]*[!@#$%^&*.]{1}[A-Za-z0-9]*)$";

	public String validateUserEntry(String fName, String lName, String email, String mobNumber, String pass) {
		boolean fNameRes = Pattern.matches(firstName, fName);
		boolean lNameRes = Pattern.matches(lastName, lName);
		boolean emailRes = Pattern.matches(EMAIL_PATTERN, email);
		boolean mobNumRes = Pattern.matches(MOBILE_NUMBER, mobNumber);
		boolean passRes = Pattern.matches(PASSWORD, pass);

		if (fNameRes == true && lNameRes == true && emailRes == true && mobNumRes == true && passRes == true)
			return "Happy";
		else
			return "Sad";

	}

}
