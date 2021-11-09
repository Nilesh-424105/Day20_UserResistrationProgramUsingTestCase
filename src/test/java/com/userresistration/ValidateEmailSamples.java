package com.userresistration;

import org.junit.Test;

import junit.framework.Assert;

public class ValidateEmailSamples {

	@Test
	public void givenEmailOne_CheckForValidation_ReturnTrue() {
		UserDetails userDetails = new UserDetails();
		boolean result = userDetails.validateEmail("abc@yahoo.com");
		Assert.assertTrue(result);
	}

	@Test
	public void givenEmailTwo_CheckForValidation_ReturnTrue() {
		UserDetails userDetails = new UserDetails();
		boolean result = userDetails.validateEmail("abc-100@yahoo.com");
		Assert.assertTrue(result);
	}

	@Test
	public void givenEmailThree_CheckForValidation_ReturnTrue() {
		UserDetails userDetails = new UserDetails();
		boolean result = userDetails.validateEmail("abc.100@abc.com.au");
		Assert.assertTrue(result);
	}

	@Test
	public void givenEmailFour_CheckForValidation_ReturnFalse() {
		UserDetails userDetails = new UserDetails();
		boolean result = userDetails.validateEmail("abc");
		Assert.assertFalse(result);
	}

	@Test
	public void givenEmailFive_CheckForValidation_ReturnFalse() {
		UserDetails userDetails = new UserDetails();
		boolean result = userDetails.validateEmail(".abc@abc.com");
		Assert.assertFalse(result);
	}

	@Test
	public void givenEmailSix_CheckForValidation_ReturnFalse() {
		UserDetails userDetails = new UserDetails();
		boolean result = userDetails.validateEmail("abc@gmail.com.1a");
		Assert.assertFalse(result);
	}

}
