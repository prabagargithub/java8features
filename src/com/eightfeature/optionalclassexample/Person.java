package com.eightfeature.optionalclassexample;

import java.util.Optional;

    public class Person {
	private String name;
	
	private Optional<Car> car;
	public Person(String name, Car car) {
		super();
		this.name = name;
		this.car = Optional.ofNullable(car);
	}
    public void setName(String name) {
		this.name = name;
	}

	public Optional<Car> getCar() {
		return car;
	}
    
	public String getCarInsuranceName(Person person) {
		
		Optional<Person> personsOptional=Optional.ofNullable(person);	
		return personsOptional.flatMap(Person::getCar)
		.flatMap(Car ::getInsurance).map(Insurance::getName).orElse("One of the valus is null");	
	}
}
