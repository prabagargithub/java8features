package com.eightfeature.BiPredicate;

public class BiPredicate {

	public static void main(String[] args) {

		java.util.function.BiPredicate<String , String> biPredicate=(firstname,lastname) ->{
			
			return firstname.length() >0 && lastname.length()>0;
			
			
		};
     
		System.out.println(biPredicate.test("true", "true"));
		
		
		java.util.function.BiPredicate<String, String> biPredicate2=(String1,String2) ->{
			return !String1.equals(String2);
		};
	
		System.out.println(biPredicate2.test("PRABHA", "prabha"));
	}

}
