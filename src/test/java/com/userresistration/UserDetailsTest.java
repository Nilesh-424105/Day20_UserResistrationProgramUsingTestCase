package com.userresistration;

import org.junit.Test;

import junit.framework.Assert;

public class UserDetailsTest {

	@Test
	public void givenFirstName_CheckValidation_ReturnTrue() {
		UserDetails userDetails = new UserDetails();
		boolean result = userDetails.validateFirstName("Nilesh");
		Assert.assertTrue(result);
	}

	@Test
	public void givenFirstLetterSmall_CheckForValidation_ReturnFalse() {
		UserDetails userDetails = new UserDetails();
		boolean result = userDetails.validateFirstName("nilesh");
		Assert.assertFalse(result);
	}

	@Test
	public void givenLastName_CheckValidation_ReturnTrue() {
		UserDetails userDetails = new UserDetails();
		boolean result = userDetails.validateFirstName("Kotkar");
		Assert.assertTrue(result);
	}

	@Test
	public void givenTwoLetters_CheckForValidation_ReturnFalse() {
		UserDetails userDetails = new UserDetails();
		boolean result = userDetails.validateFirstName("Ko");
		Assert.assertFalse(result);
	}

	@Test
	public void givenEmail_CheckValidation_ReturnTrue() {
		UserDetails userDetails = new UserDetails();
		boolean result = userDetails.validateEmail("abc.xyz@gmail.com");
		Assert.assertTrue(result);
	}

	@Test
	public void givenEmailWithoutTld_CheckValidation_ReturnFalse() {
		UserDetails userDetails = new UserDetails();
		boolean result = userDetails.validateEmail("abc.xyz@gmail");
		Assert.assertFalse(result);
	}

	@Test
	public void givenMobileNumber_CheckForValidation_ReturnTrue() {
		UserDetails userDetails = new UserDetails();
		boolean result = userDetails.validateMobileNumber("91 8766483622");
		Assert.assertTrue(result);
	}

	@Test
	public void givenNumberWithoutCC_CheckForValidation_ReturnFalse() {
		UserDetails userDetails = new UserDetails();
		boolean result = userDetails.validateMobileNumber("8766483622");
		Assert.assertFalse(result);
	}

	@Test
	public void givenShortNumber_CheckForValidation_ReturnFalse() {
		UserDetails userDetails = new UserDetails();
		boolean result = userDetails.validateMobileNumber("98 876648");
		Assert.assertFalse(result);
	}

	@Test
	public void givenLongPassWord_CheckForValidation_ReturnTrue() {
		UserDetails userDetails = new UserDetails();
		boolean result = userDetails.validatePassword("Nilesh@77");
		Assert.assertTrue(result);
	}

	@Test
	public void givenShortPassWord_CheckForValidation_ReturnFalse() {
		UserDetails userDetails = new UserDetails();
		boolean result = userDetails.validatePassword("Nilesh");
		Assert.assertFalse(result);
	}
}
