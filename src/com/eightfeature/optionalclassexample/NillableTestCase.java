package com.eightfeature.optionalclassexample;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.security.PublicKey;
import java.util.Optional;

import org.junit.Test;



public class NillableTestCase {

	
		// TODO Auto-generated method stub

		
		@Test
		public void testEmpty() {
			Optional<String> empty=Optional.empty();
		
		}
		
		@Test
		public void testUsingOF() {
			String name="agni";
			Optional<String> ofOptional=Optional.of(name);
			assertTrue(ofOptional.isPresent());
		}
		
		@Test
		public void testUsingOFVullable() {
			String name="agni";
			Optional<String> ofOptional=Optional.ofNullable(name);
			assertFalse(ofOptional.isPresent());
		}
	

}
