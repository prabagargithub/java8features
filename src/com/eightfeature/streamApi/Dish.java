package com.eightfeature.streamApi;

public class Dish {

	public TypeS typeS;
	public String dishName;
	public boolean isVegiterian;
	public int price;
	
	public enum TypeS{
		MAIN_COURSE,OTHERS,STARTER,CURRY,DESSERTS;
	}

	public Dish(TypeS typeS, String dishName, boolean isVegiterian, int price) {
		super();
		this.typeS = typeS;
		this.dishName = dishName;
		this.isVegiterian = isVegiterian;
		this.price = price;
	}

	public TypeS getTypeS() {
		return typeS;
	}

	public String getDishName() {
		return dishName;
	}

	public boolean isVegiterian() {
		return isVegiterian;
	}

	public int getPrice() {
		return price;
	}

	
}
