package com.eightfeature.streamApi;

import java.util.Comparator;

public class SortingByLowToHighUsingComprator implements Comparator<MobilePojoStreamApi2>{



	@Override
	public int compare(MobilePojoStreamApi2 object1, MobilePojoStreamApi2 object2) {
	
		return object1.getPrice() -object2.getPrice();
	}
}
