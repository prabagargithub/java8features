package com.eightfeature.streamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.eightfeature.streamApi.MobilePojoStreamApi.Brand;

public class StreamApisRunner {

	
	public static void displayMobiles() {
		List<MobilePojoStreamApi> arrayList=null;

		MobilePojoStreamApi mobilePojoStreamApi=new MobilePojoStreamApi(Brand.APPLE, "13 I Pro Max", 256, 150000, 12, 6.1, "black");
		MobilePojoStreamApi mobilePojoStreamApi1=new MobilePojoStreamApi(Brand.GOOGLE, "11 GooPro B32", 226, 90000, 11, 6.1, "Orange");
		MobilePojoStreamApi mobilePojoStreamApi2=new MobilePojoStreamApi(Brand.NOOKIA, "7 Nookia A3", 266, 100000, 13, 6.3, "White");
		MobilePojoStreamApi mobilePojoStreamApi3=new MobilePojoStreamApi(Brand.SAMSUNG, "Gallexy S3 A23", 256, 149000, 12, 6.5, "Ping");
		MobilePojoStreamApi mobilePojoStreamApi4=new MobilePojoStreamApi(Brand.OPPO, "11A Max", 256, 80000, 11, 6.1, "Grey");
		MobilePojoStreamApi mobilePojoStreamApi5=new MobilePojoStreamApi(Brand.APPLE, "14 I Pro Max", 256, 160000, 14, 6.6, "red");
		MobilePojoStreamApi mobilePojoStreamApi6=new MobilePojoStreamApi(Brand.APPLE, "16 I Pro Max", 256, 180000, 15, 6.6, "White");
		MobilePojoStreamApi mobilePojoStreamApi7=new MobilePojoStreamApi(Brand.NOOKIA, "IMax", 256, 160000, 12, 6.5, "black");
		MobilePojoStreamApi mobilePojoStreamApi8=new MobilePojoStreamApi(Brand.VIVO, "V Max", 256, 110000, 12, 6.1, "Ping");
		MobilePojoStreamApi mobilePojoStreamApi9=new MobilePojoStreamApi(Brand.VIVO, "V14 Max", 256, 140000, 12, 6.5, "black");
		MobilePojoStreamApi mobilePojoStreamApi10=new MobilePojoStreamApi(Brand.SAMSUNG, "S3SAM Max", 256, 180000, 12, 6.6, "Orange");
		MobilePojoStreamApi mobilePojoStreamApi11=new MobilePojoStreamApi(Brand.GOOGLE, "GMax", 256, 150000, 12, 6.1, "black");
		MobilePojoStreamApi mobilePojoStreamApi12=new MobilePojoStreamApi(Brand.GOOGLE, "GMAs", 256, 160000, 12, 6.4, "White");

		
		arrayList=Arrays.asList(mobilePojoStreamApi,mobilePojoStreamApi1,mobilePojoStreamApi2,mobilePojoStreamApi3,mobilePojoStreamApi4,mobilePojoStreamApi5,mobilePojoStreamApi6,mobilePojoStreamApi7,mobilePojoStreamApi8,mobilePojoStreamApi9,mobilePojoStreamApi10,mobilePojoStreamApi11,mobilePojoStreamApi12);
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------");

		System.out.printf( "| %-15s | %-15s | %-15s | %-15s | %-15s | %-15s | %-15s |%n", "Brand" ,"Model" ,"Memory" ,"Price" ,"MegaPixel","DisplaySize","Color");
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------");

		for(MobilePojoStreamApi list:arrayList) {
			System.out.printf("| %-15s | %-15s | %-15s | %-15s | %-15s | %-15s | %-15s |%n",list.getBrand(),list.getModel(),list.getMemory(),list.getPrice(),list.getMegapixel(),list.getDisplaySize(),list.getColor());
	
		}
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------");

		System.out.printf( "| %-15s | %-15s | %-15s | %-15s | %-15s | %-15s | %-15s |%n", "Brand" ,"Model" ,"Memory" ,"Price" ,"MegaPixel","DisplaySize","Color");
		//Here We are do sorting the price low level to high level
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------");
		
		Collections.sort(arrayList);
		for(MobilePojoStreamApi sorts:arrayList) {
			System.out.printf("| %-15s | %-15s | %-15s | %-15s | %-15s | %-15s | %-15s |%n",sorts.getBrand(),sorts.getModel(),sorts.getMemory(),sorts.getPrice(),sorts.getMegapixel(),sorts.getDisplaySize(),sorts.getColor());

		}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		displayMobiles();
	}
	
	

}
