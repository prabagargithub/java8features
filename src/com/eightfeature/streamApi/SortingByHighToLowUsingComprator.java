package com.eightfeature.streamApi;

import java.util.Comparator;

public class SortingByHighToLowUsingComprator implements Comparator<MobilePojoStreamApi2>{

	@Override
	public int compare(MobilePojoStreamApi2 object1, MobilePojoStreamApi2 object2) {
		
		return object2.getPrice()-object1.getPrice();
	}

}
