package com.eightfeature.streamApi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list=new ArrayList<String>();
		list.add("Wonderwomen");
		list.add("Superman");	
		list.add("BadMan");
		list.add("Sackthiman");
		list.add("Ironman");
		
		for(String s: list) {
			System.out.println("Before sorting :"+s);
		}
		System.out.println("-------------------------------------------------");
		Collections.sort(list);
		for(String heros:list) {
			System.out.println("After sorting :" +heros);
		}
	}

}
