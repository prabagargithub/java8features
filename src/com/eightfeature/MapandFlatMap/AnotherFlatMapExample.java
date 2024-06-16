package com.eightfeature.MapandFlatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AnotherFlatMapExample {
	
       static List<List<String>> movieList;

	   public static void main(String[] args) {
		
		List<String> disneyMovieList=Arrays.asList("Tomorrowland","Jungle Cruise","The New Mutants","Wish","National Treasure","Eternals","Luca","Maleficent");
		List<String> marvelMovieList=Arrays.asList("The Avengers","Captain Marvel","Iron Man","Blade","Doctor Strange","Armor Wars","Thor","The Incredible Hulk");
		List<String> paramountMovieList =Arrays.asList("Jack Reacher","Rings","Jack Reacher: Never Go Back","Mission: Impossible – Dead Reckoning ","Top Gun: Maverick",
				"Transformers: Rise of the Beasts","The Godfather","Witness");

		movieList =Arrays.asList(disneyMovieList,marvelMovieList,paramountMovieList);
		 
		System.out.println(movieList);
		 
		List<String > movies=movieList.stream().flatMap(List::stream).collect(Collectors.toList());
		
		System.out.println(movies);
		
		
		
		

	}

}
