package com.eightfeature.anonymous.arguments.methods;

public class Threads {
	
	public static void main(String[] agrs) {
		
	new Thread(new Runnable() {
			
			@Override
			public void run() {

           for(int i=0;i<5;i++) {
	          System.out.println("annonyums inner ");
                                }	
			}
		}).start();
	}

}
