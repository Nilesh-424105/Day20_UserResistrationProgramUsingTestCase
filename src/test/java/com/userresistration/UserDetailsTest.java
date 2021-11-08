package com.userresistration;

import org.junit.Test;

import junit.framework.Assert;

public class UserDetailsTest {

	@Test
	public void givenLastName_CheckValidation_ReturnTrue() {
		UserDetails userDetails = new UserDetails();
		boolean result = userDetails.validateFirstName("Kotkar");
		Assert.assertTrue(result);
	}

	@Test
	public void givenFirstLetterSmall_CheckForValidation_ReturnFalse() {
		UserDetails userDetails = new UserDetails();
		boolean result = userDetails.validateFirstName("kotkar");
		Assert.assertFalse(result);
	}

	@Test
	public void givenTwoLetters_CheckForValidation_ReturnFalse() {
		UserDetails userDetails = new UserDetails();
		boolean result = userDetails.validateFirstName("Ko");
		Assert.assertFalse(result);
	}

}
