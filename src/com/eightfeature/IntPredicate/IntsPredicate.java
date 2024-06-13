package com.eightfeature.IntPredicate;

import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;
import java.util.function.Predicate;

public class IntsPredicate {

	public static void main(String[] args) {
		// Before Int Predicate
		
	Predicate<Integer> predicate=(age) ->age>=18;
	
	System.out.println(predicate.test(22));
	
	//After IntPredicate
      IntPredicate inPredicate=(age)-> age>=18;
      
      System.out.println(inPredicate.test(23));
      
      LongPredicate longPredicate=(mark) -> mark>=175;

     System.out.println(longPredicate.test(175));
     
     DoublePredicate doublePredicate =(percent) -> percent>=200.00;
     System.out.println(doublePredicate.test(188.00));
     
	}

}
