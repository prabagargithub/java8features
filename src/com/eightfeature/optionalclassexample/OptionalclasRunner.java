package com.eightfeature.optionalclassexample;

public class OptionalclasRunner {

	
	public static void main(String[] args) {
		Person prabha=new Person("Prabha", new Car("BMW", new Insurance("NEw India car insurance")));
		System.out.println(prabha.getCarInsuranceName(prabha));
		
		Person  unknownPerson=new Person("Alto", null);
		System.out.println(unknownPerson.getCarInsuranceName(unknownPerson));
	}
}
