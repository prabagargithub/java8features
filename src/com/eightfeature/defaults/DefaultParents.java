package com.eightfeature.defaults;

public interface DefaultParents {
	
	abstract void payAmount();
	
     default void successAmout() {
    	 System.out.println("Successfully amount transfered");
	}

}
