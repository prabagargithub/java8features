package com.eightfeature.streamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.eightfeature.streamApi.Dish.TypeS;

public class DishRunner {

	static List<Dish> dishs;
	
	public static void usingJava8() {
		
		List<String> nameList=dishs.stream().filter(dish->dish.isVegiterian() ==false)
		.sorted(Comparator.comparing(Dish::getPrice)).map(dis->dis.getDishName()).collect(Collectors.toList());
		System.out.println(nameList);
	}
	
	public static void getNonVegItemByPrice() {
		
		List<Dish> nonVegItemLowToHighDishs=new ArrayList<Dish>();
		
		//iterate
		//check if the item is non veg
		//sort the low to high
		
		for(Dish dish:dishs) {
			if(!dish.isVegiterian()) {
				nonVegItemLowToHighDishs.add(dish);
			}
		}
		
		Collections.sort(nonVegItemLowToHighDishs,new Comparator<Dish>() {

			@Override
			public int compare(Dish dish1, Dish dish2) {
				// TODO Auto-generated method stub
				return Integer.compare(dish1.getPrice(), dish2.getPrice());
			}		
		});
		
		for(Dish dish:nonVegItemLowToHighDishs) {
			System.out.println("DishName :"  +dish.getDishName());
		}
	}
	
	
	public static void main(String[] args) {
		
		Dish dish=new Dish(TypeS.MAIN_COURSE, "Chicken Biriyani", false, 121);
		Dish dish1=new Dish(TypeS.MAIN_COURSE, "Panner Biriyani", true, 120);
		Dish dish2=new Dish(TypeS.OTHERS, "Cheese Pizza", true, 151);
		Dish dish3=new Dish(TypeS.OTHERS, "French Fries", false, 40);
		Dish dish4=new Dish(TypeS.STARTER, "Chicken 555", true, 90);
		Dish dish5=new Dish(TypeS.STARTER, "Corn  Fingers", false, 90);
		Dish dish6=new Dish(TypeS.STARTER, "Nethili", true, 110);
		Dish dish7=new Dish(TypeS.CURRY, "Chicken Gravy", false, 125);
		Dish dish8=new Dish(TypeS.DESSERTS, "Royal Falooda", true, 75);
		Dish dish9=new Dish(TypeS.DESSERTS, "Trible sundae", true, 85);
		Dish dish10=new Dish(TypeS.CURRY, "Panner butter masala", true, 70);

		
       dishs=Arrays.asList(dish,dish1,dish2,dish3,dish4,dish5,dish6,dish7,dish8,dish9,dish10);
       
       System.out.println("--------------MENU-------------------");
       
       for(Dish dis:dishs) {
//    	   System.out.println(dis.getDishName());
       }
//       getNonVegItemByPrice();
       usingJava8();
       System.out.println("--------------END OF MENU-------------------");
	}

}
