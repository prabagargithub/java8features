package com.eightfeature.FindFirstAndFindAnyMethods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirstAndFindAnyMethods {

	static void findFirst() {
		
    List<String> findFirst=Arrays.asList("Cognizant","Wipro","TCS","Hcl","Tech Mahedira","L&T");
		
	Optional<String> optionalFindFirst=	findFirst.stream().findFirst();
	System.out.println(optionalFindFirst.get());
	             
	
	}
	
	static void findAny() {
		
	    List<String> findAnyValueInTheList=Arrays.asList("Cognizant","Wipro","TCS","Hcl","Tech Mahedira","L&T");
        
	    Optional<String> findAnyValue=findAnyValueInTheList.stream().findAny();
	    
	    //if u want anyone u can use here stream and parrallel Stream i'm used
	    
	    Optional<String> findAnyValueParallelStream=findAnyValueInTheList.parallelStream().findAny();

	    System.out.println(findAnyValue);
	    System.out.println(findAnyValueParallelStream);
	}
	
	
	public static void main(String[] args) {
		
		findFirst();
		findAny();
	}
}
