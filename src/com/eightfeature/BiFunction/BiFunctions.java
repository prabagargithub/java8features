package com.eightfeature.BiFunction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

public class BiFunctions {
	
	public static void main(String args[]) {
	
		BiFunction<String, String, String> biFunction=new BiFunction<String, String, String>() {
			
			@Override
			public String apply(String t, String u) {
				// TODO Auto-generated method stub
				return null;
			}
		};
		
		
		BiFunction<String, String, String> biFunction2= (firstname,lastname) ->{return firstname+ " "+lastname; };
		System.out.println(biFunction2.apply("Hello", "World"));

		
		List<String> list1=Arrays.asList("java" ,".Net" ,"Phython");
		
		List<String> list2=Arrays.asList("Spring boot" ,"networking","javascript");
		
		
		List<String> returList=new ArrayList<String>();
		
		BiFunction<List<String>, List<String>, List<String>> retBiFunction=(L1,L2) ->{
			for(int i=0;i<list1.size() ;i++) {
				returList.add(list1.get(i)+ "  :  "+list2.get(i));
				
				
			}
			return returList;
		} ;
		
		System.out.println(retBiFunction.apply(list1, list2));
		
        List<String> List1=Arrays.asList("AMAZON" ,"GOOGLE" ,"AZURE");
		
		List<String> List2=Arrays.asList("Cloud" ,"Cloud","Cloud");
		
		
		List<String> addList=new ArrayList<String>();
		
		BiFunction<List<String>, List<String>, List<String>> returnBifunction =(L3,L4) ->{ 
			
			for(int i=0;i<List1.size();i++) {
				addList.add(List1.get(i) + ":" +List2.get(i));
			}
			return addList;
			
		};
		System.out.println(returnBifunction.apply(List1, List2));
	}
}
