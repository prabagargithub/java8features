package com.eightfeature.supplier;

import java.util.Calendar;
import java.util.function.Supplier;

public class NormalImpleMentsInterface implements Supplier<Object> {

	
	
	public static void main(String[] args) {
		NormalImpleMentsInterface normalImpleMentsInterface=new NormalImpleMentsInterface();
	
		System.out.println(normalImpleMentsInterface.get());
	}

	@Override
	public Object get() {
		Calendar calendar= Calendar.getInstance();
		//System.out.println(calendar.getTime());
		
		return calendar.getTime();
	}
}
