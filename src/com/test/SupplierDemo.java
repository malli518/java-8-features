package com.test;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<Date> curentDate = () -> new Date();
		System.out.println(curentDate.get());
		
		//no andThen and compose methods
	}

}
