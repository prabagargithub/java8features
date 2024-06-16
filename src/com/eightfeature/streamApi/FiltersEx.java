package com.eightfeature.streamApi;

import java.util.ArrayList;
import java.util.List;

public class FiltersEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<String> counrieStrings=new ArrayList<String>();
		
		counrieStrings.add("USSR");
		counrieStrings.add("INDIA");
		counrieStrings.add("USA");
		counrieStrings.add("China");
		
		//Only limit  value we gave 3 only so three is printing
		counrieStrings.stream().limit(3).forEach(filters->System.out.println(filters));
        
		
		//skip
		//first two value it will skip
		
		System.out.println("_______________________________________________________________________________");
		counrieStrings.stream().skip(2).forEach(System.out::println);
		
	}

}
