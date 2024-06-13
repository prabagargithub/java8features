package com.eightfeature.lambda.expression;

public class LambdaExpression {

	public static void main(String[] args) {
		
	   
		MyInterface myInterface=(a,b)->{
			return a+b;
			
		};
		
		myInterface.someMethod(10, 27);
		
	}

}
