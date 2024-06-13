package com.eightfeature.functionalInterface.realpredefined;

import java.util.function.Function;

public class Runner {
	
	
	void lambdaStyle() {
		Function<Integer, Double> inFunction=usd-> usd*85.5;
	    System.out.println("Lambda Expression:"+inFunction.apply(20));
	}
	
	void annonyoumsInner() {
		Function<Integer, Double> annonyomusFunction=new Function<Integer, Double>() {
			
			@Override
			public Double apply(Integer t) {
				
				return t*85.5;
			}
		};
		System.out.println("AnnonyoumsInnerClass :"+annonyomusFunction.apply(20));
	}
	
	void rcbWantIplCupLamdaExpression() {
		Function<String, String> iFunction=cup->cup + "Long live Achivements";
		System.out.println("Lambda Expression String: "+iFunction.apply("IPL Cup"));
	}
	
	void countTheLetter() {
		Function<String, Integer > function=givenString->givenString.length();
		System.out.println("countTheLetter :"+function.apply("Hello world"));
	}
	void convertToUpperCase() {
		Function<String , String> function=new Function<String, String>() {
			
			@Override
			public String apply(String t) {
			
				return t.toUpperCase();
			}
		};
		System.out.println("UpperCase :" +function.apply("empty"));
	}
	
	void calculate() {
		Function<String, Integer> function=new Function<String, Integer>() {
			
			@Override
			public Integer apply(String t) {
				int a=Integer.parseInt(t);
				return a*a;
			}
		};System.out.println("Convertion string to int:"+function.apply("20"));
	}
    
	void convertTolowerCase() {
		
		 Function<String, String> function=new Function<String, String>() {
				
				@Override
				public String apply(String t) {
					return t.toLowerCase();
				}
			}; System.out.println("UpperCase :" +function.apply("LOWChance"));
		
	}
	void annonyoumsInnerClass() {
		Function<String, String> annFunction=(String s)->s +"Rcb Win Cup";
		System.out.println("Lambda Expression String: "+annFunction.apply("Log Time Excepecting"));
		
		
	}
	void findEmpty() {
		Function<String, Boolean> function=leafElemnt -> leafElemnt.isEmpty()  || leafElemnt.equals("");
		System.out.println("findEmpty :"+function.apply(""));
	}
	
	public static void main(String[] args) {
		
		UsDollarToInr usDollarToInr=new UsDollarToInr();
		usDollarToInr.dollorConvertion(10);
		Runner runner=new Runner();
		runner.lambdaStyle();
		runner.annonyoumsInner();
		runner.annonyoumsInnerClass();
        runner.rcbWantIplCupLamdaExpression();
        runner.countTheLetter();
        runner.convertToUpperCase();
        runner.convertTolowerCase();
        runner.findEmpty();
        runner.calculate();
		System.out.println(usDollarToInr.dollorConvertion(10));
		
		System.out.println(runner);

	}

}
