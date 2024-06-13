package com.eightfeature.supplier;

import java.util.Calendar;
import java.util.function.Supplier;

public class SupplierExample {

	void annonyamus() {
		Supplier<Object> supplier=new Supplier<Object>() {
			
			@Override
			public Object get() {
				Calendar calendar= Calendar.getInstance();
				return calendar.getTime();
			}
		};System.out.println(supplier.get());
		
	}
	
	
	void lambdaExample() {
		
		Supplier<Object> supplier=()->{Calendar calendar= Calendar.getInstance();
		return calendar.getTime();};
		System.out.println(supplier.get());
	}
	public static void main(String[] args) {
		SupplierExample supplierExample=new SupplierExample();
		supplierExample.annonyamus();
		supplierExample.lambdaExample();
		
	}

}
