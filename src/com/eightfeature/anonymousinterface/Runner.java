package com.eightfeature.anonymousinterface;

public class Runner {

	public static void main(String[] args) {
		
		ParentInterface parentInterface=new ParentInterface() {
			
			@Override
			public void color() {
				// TODO Auto-generated method stub
				System.out.println("Welcome to Interface Annonyamus Abstract");

			}
		};
		parentInterface.color();
		
	}

}
