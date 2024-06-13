package com.eightfeature.BiConsumer;

public class BiConsumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		java.util.function.BiConsumer<Integer, Integer>  add=(num1,num2) -> System.out.println(num1+ num2);
		java.util.function.BiConsumer<Integer, Integer> multiplicationBiConsumer=(num1,num2) ->System.out.println(num1* num2);
		
		add.andThen(multiplicationBiConsumer).accept(22, 3);
		
		
	}

}
