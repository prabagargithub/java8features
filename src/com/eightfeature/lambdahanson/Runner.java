package com.eightfeature.lambdahanson;

public class Runner {
      
	
	public void print() {
		
		Car car=new Benz();
	    System.out.println("Execute: "+car.add(10, 20));
	}
	
	void lambdaExpression() {
		
		Car car=(int a,int b)->{ return a+b;};
		System.out.println(car.add(20, 40));
	}
	
	
	public static void main(String[] args) {

		Runner runner=new Runner();
		runner.lambdaExpression();
	}

}
