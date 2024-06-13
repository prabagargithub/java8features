package com.eightfeature.BiFunction;

import java.util.function.BiFunction;

public class BiFunctionRunner {

	public static void main(String[] args) {
		
		BiFunction<String, String, String> biFunction=(firstname,lastname) -> firstname + " " +lastname;
		System.out.println(biFunction.apply("CTS", "Prabagar.s"));
		
		BiFunctionInterfa<String, String, String, String, String, String> multpleParamTestBiFunctionInterfa=new BiFunctionInterfa<String, String, String, String, String, String>() {
			
			@Override
			public String getMultipleParam(String firstname, String lastname, String age, String address, String qualfication,
					String expr) {
			
				return firstname + " "+ lastname + " " + age + " " + address + " " + qualfication + " " + expr;
			}
		};

		System.out.println(multpleParamTestBiFunctionInterfa.getMultipleParam("Prabagar", "subiramani", "31", "Chennai", "Btech", "6"));
	}

}
