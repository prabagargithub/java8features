package com.eightfeature.ConstructorMethodReferences;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

public class ConstructorMethodReferences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		List<String> herosList=new ArrayList<String>();
		
		herosList.add("Vijay");
		herosList.add("Ajith");
		herosList.add("Surya");
		herosList.add("Vikram");
		herosList.add("Vikram");
		
		//convert to List To Set
		
		Set<String> setConvertToList =new HashSet<String>(herosList);
		
//		System.out.println(setConvertToList);
		
		
		//here Functional and lambda interface
		
		Function<List<String>, Set<String>> listToSetLambdaFunction= list -> new HashSet<String>(list);
		
		Function<List<String>, Set<String>> listToSetMethodReferenceFunction= HashSet::new ;
		
		System.out.println(listToSetMethodReferenceFunction.apply(herosList));
	}

}
