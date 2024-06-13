package com.eightfeature.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Runner {

	
	public static void main(String[] args) {
		
		Eligibility runner=new Eligibility();
		
//		System.out.println("True :" +runner.eligibility(18));
		
		Predicate<Integer> boPredicate=(age) -> age>=18;
		System.out.println("True :" +boPredicate.test(18));
		
	
		
		ArrayList<PredicateHandsonExperienceStudent> arrayList=new ArrayList<PredicateHandsonExperienceStudent>();
		arrayList.add(new PredicateHandsonExperienceStudent("101", "prabha", 750));
		arrayList.add(new PredicateHandsonExperienceStudent("102", "vallarasu", 700));
		arrayList.add(new PredicateHandsonExperienceStudent("103", "arun", 800));
		arrayList.add(new PredicateHandsonExperienceStudent("104", "reegan", 850));

		Predicate<PredicateHandsonExperienceStudent> predicate =list->list.getMark()<800;
		
		for(PredicateHandsonExperienceStudent predicateHandsonExperienceStudent:arrayList) {
			
			if(predicate.test(predicateHandsonExperienceStudent)) {
				
				System.out.println(predicateHandsonExperienceStudent.getName());
			}
		}

	}
}
