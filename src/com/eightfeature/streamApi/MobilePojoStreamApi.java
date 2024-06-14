package com.eightfeature.streamApi;

//Here comparable interface we will implement based on our pojo class is args
public class MobilePojoStreamApi implements Comparable<MobilePojoStreamApi>{
	


	public Brand brand;
	public String model;
	public int memory;
	public int price;
	public int megapixel;
	public double displaySize;
	public String color;
	
	public MobilePojoStreamApi(Brand brand, String model, int memory, int price, int megapixel, double displaySize,
			String color) {
		super();
		this.brand = brand;
		this.model = model;
		this.memory = memory;
		this.price = price;
		this.megapixel = megapixel;
		this.displaySize = displaySize;
		this.color = color;
	}
	public enum Brand{
		APPLE,GOOGLE,VIVO,OPPO,NOOKIA,SAMSUNG;
		
	}
	
	
	public Brand getBrand() {
		return brand;
	}
	public String getModel() {
		return model;
	}
	public int getMemory() {
		return memory;
	}
	public int getPrice() {
		return price;
	}
	public int getMegapixel() {
		return megapixel;
	}
	public double getDisplaySize() {
		return displaySize;
	}
	public String getColor() {
		return color;
	}
	@Override
	public int compareTo(MobilePojoStreamApi object) {
		// TODO Auto-generated method stub
		
		if(this.getPrice() >object.getPrice()) {
			return 1;
			
		}else if(this.getPrice() < object.getPrice()) {
			return -1;
		}else {
			return 0;	
		}
		
	}



}
