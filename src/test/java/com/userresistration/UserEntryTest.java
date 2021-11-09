package com.userresistration;

import org.junit.Test;

import junit.framework.Assert;

public class UserEntryTest {

	@Test
	public void givenDetails_CheckForValidation_ReturnHappy() {
		UserEntry userEntry = new UserEntry();
		String result = userEntry.validateUserEntry("Nilesh", "Kotkar", "nileshkotkar1996@gmail.com", "91 8766483622",
				"Nilesh@77");
		Assert.assertEquals("Happy", result);
	}

	@Test
	public void givenNonMatchingDetails_CheckForValidation_ReturnSad() {
		UserEntry userEntry = new UserEntry();
		String result = userEntry.validateUserEntry("nilesh", "kotkar", "Nileshkotkar1996@gmail.com", "91 87664836227",
				"Nil@77");
		Assert.assertEquals("Sad", result);
	}

}
