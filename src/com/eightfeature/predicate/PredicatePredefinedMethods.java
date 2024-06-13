package com.eightfeature.predicate;

import java.util.function.Predicate;

public class PredicatePredefinedMethods {

	// example username and password
	
	Predicate<String> userNamePredicate;
	Predicate<String> passwordPredicate;
	Predicate<Boolean> opPredicate;
	public void andExample() {
		userNamePredicate=input->input.equalsIgnoreCase("YES");
		passwordPredicate=input -> input.equalsIgnoreCase("NO");
		System.out.println(userNamePredicate.and(passwordPredicate).test("Yes"));
	}
	
	public void orExample() {
		userNamePredicate=input->input.equalsIgnoreCase("YES");
		passwordPredicate=input->input.equalsIgnoreCase("No");
	    System.out.println(userNamePredicate.or(passwordPredicate).test("NO"));	
	}
	
	public void negateExample() {
	
		opPredicate=input->input;
		System.out.println(opPredicate.negate().test(true));
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PredicatePredefinedMethods predicatePredefinedMethods=new PredicatePredefinedMethods();
		predicatePredefinedMethods.orExample();
	}

}
