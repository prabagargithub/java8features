package com.eightfeature.InstanceMethodReferences;


@FunctionalInterface
interface Operations{
	
	public void vanakkam(String name);
	
}
public class MethodReferences {
	//here is those interface and class methods both is working same so we will using methods reference

	public void wishes(String comment) {
		System.out.println("Vanakkam da mapla" +comment);
	}
	
	public static void main(String[] args) {
		
		Operations operations=(name) ->{
			System.out.println("MethodReferences da :" +name);
		};
		
		operations.vanakkam("madurai");
		
		//"using instance methods need to create Object obj then call methods reference in object"
		
		
		MethodReferences methodReferences=new MethodReferences();
		
		Operations operations2=methodReferences::wishes;
		
	    operations2.vanakkam(" instance methods need to create Object obj then call methods reference in object");
	}

}
