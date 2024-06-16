package com.eightfeature.streamApi;

import java.security.PublicKey;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.eightfeature.streamApi.Dish.TypeS;

public class StreamDistnict {
	static List<Dish> dishs;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		List<String> nameList=Arrays.asList("prthan mandiri","LockShabha","Rajaya Shabha","MP","Election commission","AganiPath","MP");
//		
//		nameList.stream().distinct().forEach(System.out::println);
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
       
//       getVegItems();
       isPriceHigh();
       
	}
	public static void getVegItems() {
		System.out.println("---------------------------------------------------------------------");
		System.out.println("**************************DISH***************************************");
		System.out.println("---------------------------------------------------------------------");
	List<Dish> dishList=	dishs.stream().filter(Dish::isVegiterian).collect(Collectors.toList());
	dishList.forEach(item->System.out.println(item.getDishName()));
	}
          public static void isPriceHigh() {
        	  System.out.println("---------------------------------------------------------------------");
      		System.out.println("**************************DISH PRICE***************************************");
      		System.out.println("---------------------------------------------------------------------");
        	 List<Boolean> diList=  dishs.stream().filter(Dish::isVegiterian).map(item->item.getPrice() >=90).collect(Collectors.toList());
        	 diList.forEach(item->System.out.println(item.TRUE));
        	  
          } 
     }
