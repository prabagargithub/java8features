package com.eightfeature.ArbitraryObjectAnyTypeMethodReferences;

import java.util.function.Function;



public class ArbitraryObjectAnyType {

	public static void main(String[] args) {
	

		Function<String, String> function=INPUT ->INPUT.toLowerCase();
		Function<String, String> methodReferenceFunction=String::toLowerCase;
		System.out.println(methodReferenceFunction.apply("PRABHA"));
		
		Function<String, Integer> lambdaFunction=INPUT_STREAM ->INPUT_STREAM.length();
		System.out.println(lambdaFunction.apply("Hello World"));
		
		Function<String, Integer> methodRefeFunction=String :: length;
		System.out.println(methodRefeFunction.apply("Cognizant"));
		
		
		
	}

}
