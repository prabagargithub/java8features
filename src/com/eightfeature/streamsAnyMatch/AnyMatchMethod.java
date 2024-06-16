package com.eightfeature.streamsAnyMatch;

import java.util.Arrays;
import java.util.List;

public class AnyMatchMethod {

	public static void main(String[] args) {
	
		
	List<String> listOfCompany=Arrays.asList("Cognizant","Wipro","TCS","Hcl","Tech Mahedira","L&T");
		
	boolean matchesCheckTrueOrFalse= listOfCompany.stream().anyMatch(company->company.equalsIgnoreCase("L&t"));
    
	System.out.println("Matches of company true or false :"+matchesCheckTrueOrFalse);
		
	}

}
