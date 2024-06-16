package com.eightfeature.AllMatchMethod;

import java.util.Arrays;
import java.util.List;

public class AllMatchMethod {

	public static void main(String[] args) {
		
		List<String> listOfCompany=Arrays.asList("Cognizant","Wipro","TCS","Hcl","Tech Mahedira","L&T");
		//Here AllMatch
		//Means all list value is should be same company then returns true otherwise is false 
		
		boolean checkAllIsSameCompaniesOrNot=listOfCompany.stream().allMatch(companies->companies.equalsIgnoreCase("tcs"));
		System.out.println(checkAllIsSameCompaniesOrNot);
		
		
	}
}
