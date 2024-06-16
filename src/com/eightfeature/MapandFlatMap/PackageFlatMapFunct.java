package com.eightfeature.MapandFlatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PackageFlatMapFunct {

	public static List<Package> packages;
	
	public static void  packagesAllMapFunction() {
		//thes is two different arraysList is printed
		List<List<String>> listStrea=packages.stream().map(Package::getItems).collect(Collectors.toList());
		System.out.println(listStrea);
		
	}
	public static void  packagesAllFlatMapFunction() {
	
	List<String > flatMaList=packages.stream().map(Package::getItems).flatMap(List::stream).collect(Collectors.toList());
	
	//flatMaList.forEach(System.out::println);
	System.out.println(flatMaList);
	
	}
	
	public static void main(String[] args) {
	
		Package pack=new Package("Course", Arrays.asList("java,Spring boot,Hibernate,Microservices"));
		Package package1=new Package("Course", Arrays.asList("Phython","java script",".net"));
		
		
		packages=Arrays.asList(pack,package1);
		
		System.out.printf("| %-15s  |  %-15s  |                                              %n" ,"Cources" ,"List of Cources");
		
		System.out.println("-----------------------------------------------------------------");
		
		for(Package p:packages) {
			System.out.printf("| %-15s  |  %-15s  | %n" ,p.getName() ,p.getItems());
		}
		System.out.println("-----------------------------------------------------------------");
		packagesAllMapFunction();
		System.out.println("-----------------------------------------------------------------");
		System.out.printf("| %-15s | %n" ,"List of Cources");
		packagesAllFlatMapFunction();
		System.out.println("------------------------------FlatMapX-----------------------------------");

	}

}
