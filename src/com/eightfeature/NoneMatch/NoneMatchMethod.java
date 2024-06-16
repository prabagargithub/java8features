package com.eightfeature.NoneMatch;

import java.util.Arrays;
import java.util.List;

public class NoneMatchMethod {

	
	public static void main(String[] args) {
		
		List<String> listOfCompany=Arrays.asList("Cognizant","Wipro","TCS","Hcl","Tech Mahedira","L&T");

	boolean allListOfCompanynotInParticularCompany=	listOfCompany.stream().noneMatch(companies->companies.equalsIgnoreCase("Infosys"));
	System.out.println(allListOfCompanynotInParticularCompany);
		
	}
}
