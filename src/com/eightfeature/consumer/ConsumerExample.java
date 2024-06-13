package com.eightfeature.consumer;

import java.util.function.Consumer;

public class ConsumerExample {

	public void consumerExample() {
		
		Consumer< String> consumer=new Consumer<String>() {
			
			@Override
			public void accept(String t) {
             System.out.println(":"+ t);				
			}
		};consumer.accept("Vanakkam");
		
	}
	public void lambdaExampleMethods() {
	Consumer<String> comConsumer=input->System.out.println(input);
	Consumer<String> consumer=input->System.out.println(input+"Consumer calling");
	comConsumer.andThen(consumer).accept("AndThenBoth Called");
	
    comConsumer.accept(":Hello");
	}
	public static void main(String[] args) {

		ConsumerExample consumerExample=new ConsumerExample();
		consumerExample.consumerExample();
		consumerExample.lambdaExampleMethods(); 
	                                       }

}
