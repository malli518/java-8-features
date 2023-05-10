package com.test;

import java.util.function.Predicate;

public class PerdicateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PerdicateDemo perdicateDemo=new PerdicateDemo();
		System.out.println(perdicateDemo.checkLength("Nagamalli"));
		
		Predicate<String> predicate = s -> s.length() >=5;
		System.out.println(predicate.test("Nagamalli"));
		System.out.println(predicate.test("Naga"));

	}
	
	public boolean checkLength(String str) {	
		if(str.length() >= 5) {
			return true;
		}else {
			return false;
		}
	}

}
