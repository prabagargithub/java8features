package com.eightfeature.MapandFlatMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApMapFunction {

	public static void main(String[] args) {
     
		List<String> mapList=Arrays.asList("Jack Sparrow","Jhon Wick","The Machanic","Mission Impossible");
		
	List<Integer> countChar=	mapList.stream().map(String ::length)
		.collect(Collectors.toList());
		
        countChar.forEach(System.out::println);
	}

}
