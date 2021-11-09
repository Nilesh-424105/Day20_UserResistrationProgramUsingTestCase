package com.userresistration;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import junit.framework.Assert;

public class ParameterizeEmailTest {

	@RunWith(Parameterized.class)
	public class ParameterizedEmailTest {
		private String emailTest;
		private Boolean expectedTestResult;
		public UserEntry userEntry;
		
		// @before annotation runs before with each test run
		@Before
		private void initialize() {
			UserEntry userEntry = new UserEntry();
		}
		
		// Test Cases for email with Parameterized constructor
		public ParameterizedEmailTest(String emailTest, Boolean expectedTestResult) {
			this.emailTest = emailTest;
			this.expectedTestResult = expectedTestResult;
		}

		// this is a collection to run will multiple email
		@Parameterized.Parameters
		public Collection data() {
			return Arrays.asList(new Object[][] { 
				    { "abc-100@yahoo.com", true }, 
				    { "abc@yahoo.com", true },
					{ "abc.100@yahoo.com", true }, 
					{ "abc111@abc.com", true },
					{ "abc@gmail.com.com", true },
					{ "abc-100@abc.net", true }, 
					{ "abc.100@abc.com.au", true }, 
					{ "abc@gmail.com.com", true },
					{ "abc@.com.my.", false },
					{ "abc123@gmail.a", false },
					{ "abc123@.com", false },
					{ "abc@%*.com", false }, 
					{ "abc()*@gmail.com –", false }, 
					{ "abc..2002@gmail.com", false },
					{ "abc@abc@gmail.com", false },
					{ "abc123@gmail.a", false }, 
					{ "abc@abc@gmail.com", false },
					{ "abc()*@gmail.com", false }, 
					{ "abc@gmail.com.1a", false }, 
					{ "abc", false },
					{ ".abc@abc.com", false }
					});
		}

		// Test case actually runs from here
		@Test
		public void givenPassWord_CheckForValidation_ReturnTrueOrFalse() {
			Boolean result = userEntry.validateEmail(this.emailTest);
			Assert.assertEquals(this.expectedTestResult, result);
		}
	}
}