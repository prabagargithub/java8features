package com.eightfeature.StaticMethodReference;


interface Operations{
	
	public void add(int a,int b);
}


public class StaticMethodReferences {
	
	//here is those interface and class methods both is working same so we will using methods reference
	
	public static void sum(int a,int b) {
		System.out.println(a+b);
	}
	
	public static void main(String args[]) {
		
		Operations operations=StaticMethodReferences::sum;
		
		operations.add(22, 23);
		
		StaticMethodReferences.sum(22, 24);
		
	}

}
