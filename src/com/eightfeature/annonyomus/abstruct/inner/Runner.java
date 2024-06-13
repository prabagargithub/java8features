package com.eightfeature.annonyomus.abstruct.inner;

public class Runner {

	public static void main(String[] args) {
	
		ParentAbstract parentAbstract=new ParentAbstract() {

			@Override
			public void color() {
				System.out.println("Welcome to Main Annonyamus Abstract");
				
			}
			
			
		};
		parentAbstract.color();
	}

}
