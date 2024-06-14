package com.eightfeature.streamApi;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.eightfeature.streamApi.MobilePojoStreamApi2.Brand;



public class StreamApisRunner2 {

	public static void main(String[] args) {
		
		List<MobilePojoStreamApi2> arrayList=null;

		MobilePojoStreamApi2 mobilePojoStreamApi=  new MobilePojoStreamApi2(Brand.APPLE, "13 I Pro Max", 256, 150000, 12, 6.1, "black");
		MobilePojoStreamApi2 mobilePojoStreamApi1= new MobilePojoStreamApi2(Brand.GOOGLE, "11 GooPro B32", 226, 90000, 11, 6.1, "Orange");
		MobilePojoStreamApi2 mobilePojoStreamApi2= new MobilePojoStreamApi2(Brand.NOOKIA, "7 Nookia A3", 266, 100000, 13, 6.3, "White");
		MobilePojoStreamApi2 mobilePojoStreamApi3= new MobilePojoStreamApi2(Brand.SAMSUNG, "Gallexy S3 A23", 256, 149000, 12, 6.5, "Ping");
		MobilePojoStreamApi2 mobilePojoStreamApi4= new MobilePojoStreamApi2(Brand.OPPO, "11A Max", 256, 80000, 11, 6.1, "Grey");
		MobilePojoStreamApi2 mobilePojoStreamApi5= new MobilePojoStreamApi2(Brand.APPLE, "14 I Pro Max", 256, 160000, 14, 6.6, "red");
		MobilePojoStreamApi2 mobilePojoStreamApi6= new MobilePojoStreamApi2(Brand.APPLE, "16 I Pro Max", 256, 180000, 15, 6.6, "White");
		MobilePojoStreamApi2 mobilePojoStreamApi7= new MobilePojoStreamApi2(Brand.NOOKIA, "IMax", 256, 160000, 12, 6.5, "black");
		MobilePojoStreamApi2 mobilePojoStreamApi8= new MobilePojoStreamApi2(Brand.VIVO, "V Max", 256, 110000, 12, 6.1, "Ping");
		MobilePojoStreamApi2 mobilePojoStreamApi9= new MobilePojoStreamApi2(Brand.VIVO, "V14 Max", 256, 140000, 12, 6.5, "black");
		MobilePojoStreamApi2 mobilePojoStreamApi10= new MobilePojoStreamApi2(Brand.SAMSUNG, "S3SAM Max", 256, 180000, 12, 6.6, "Orange");
		MobilePojoStreamApi2 mobilePojoStreamApi11= new MobilePojoStreamApi2(Brand.GOOGLE, "GMax", 256, 150000, 12, 6.1, "black");
		MobilePojoStreamApi2 mobilePojoStreamApi12= new MobilePojoStreamApi2(Brand.GOOGLE, "GMAs", 256, 160000, 12, 6.4, "White");

		
		arrayList=Arrays.asList(mobilePojoStreamApi,mobilePojoStreamApi1,mobilePojoStreamApi2,mobilePojoStreamApi3,mobilePojoStreamApi4,mobilePojoStreamApi5,mobilePojoStreamApi6,mobilePojoStreamApi7,mobilePojoStreamApi8,mobilePojoStreamApi9,mobilePojoStreamApi10,mobilePojoStreamApi11,mobilePojoStreamApi12);
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------");

		System.out.printf( "| %-15s | %-15s | %-15s | %-15s | %-15s | %-15s | %-15s |%n", "Brand" ,"Model" ,"Memory" ,"Price" ,"MegaPixel","DisplaySize","Color");
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------");

		for(MobilePojoStreamApi2 list:arrayList) {
			System.out.printf("| %-15s | %-15s | %-15s | %-15s | %-15s | %-15s | %-15s |%n",list.getBrand(),list.getModel(),list.getMemory(),list.getPrice(),list.getMegapixel(),list.getDisplaySize(),list.getColor());
	
		}
		System.out.println("api2----------------------------------------------------------------------------------------------------------------------------------------------------");

		System.out.printf( "| %-15s | %-15s | %-15s | %-15s | %-15s | %-15s | %-15s |%n", "Brand" ,"Model" ,"Memory" ,"Price" ,"MegaPixel","DisplaySize","Color");
		//Here We are do sorting the price low level to high level
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------");
		
		Collections.sort(arrayList,new SortingByLowToHighUsingComprator());
		for(MobilePojoStreamApi2 sorts:arrayList) {
			System.out.printf("| %-15s | %-15s | %-15s | %-15s | %-15s | %-15s | %-15s |%n",sorts.getBrand(),sorts.getModel(),sorts.getMemory(),sorts.getPrice(),sorts.getMegapixel(),sorts.getDisplaySize(),sorts.getColor());

		}
		
		Collections.sort(arrayList,new SortingByHighToLowUsingComprator());
		System.out.println("------------------------SortingByHighToLowUsingComprator-------------------------------");
		for(MobilePojoStreamApi2 sorts:arrayList) {
		
			System.out.printf("| %-15s | %-15s | %-15s | %-15s | %-15s | %-15s | %-15s |%n",sorts.getBrand(),sorts.getModel(),sorts.getMemory(),sorts.getPrice(),sorts.getMegapixel(),sorts.getDisplaySize(),sorts.getColor());

		}
	}

}
