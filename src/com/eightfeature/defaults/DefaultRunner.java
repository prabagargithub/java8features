package com.eightfeature.defaults;

public class DefaultRunner {

	public static void main(String[] args) {
	
		DefaultParents defaultParents=new DefaultParents() {
	   
	    public void successAmout() {
	    	// TODO Auto-generated method stub
	    	DefaultParents.super.successAmout();
	    }
			
			@Override
			public void payAmount() {
				for(int i=0;i<10;i++) {
				System.out.println("Welcome to java :"+i);
				}
			}
		};
		defaultParents.payAmount();
	
	}

}
