package com.eightfeature.OptionalType;

import java.util.Optional;




public class OptionalTypes {

	public void isPresentExample() {
		//* If a value is present, returns {@code true}, otherwise {@code false}.
		Optional<String> optional=Optional.of("Hello");
		System.out.println("ifPresent :"+optional.isPresent());
	} 
	
	public void isEmptyExample() {
		// If a value is  not present, returns {@code true}, otherwise
		Optional<String> optional=Optional.of("EmptyCheck");
		System.out.println("Empty Check : "+optional.isEmpty());
	}
	
	
	public void ifPresentExample() {
		Optional<String> optional=Optional.of("Check Length value");
	    optional.ifPresent(str-> System.out.println("Check the value is string length:"+str.length()));
	}
	
	public void ifElseExample() {
		
		// If a value is present, performs the given action with the value,
	    // * otherwise performs the given empty-based action.
		String name=null;
		String result=Optional.ofNullable(name).orElse("ifElseExample");
		System.out.println("ifElseExample :"+result);
	}
	
	public void getExample() {
		Optional<String> optional=Optional.of("RiO De JEnerevo");
		System.out.println("getExample :"+optional);
	}
	
	
	public static void main(String[] args) {
		
	
		
		
	}
}
