package com.test;

import java.util.HashMap;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Employee, String> hm = new HashMap<Employee, String>();
		hm.put(new Employee("a"), "emp1");
		hm.put(new Employee("b"), "emp2");

		System.out.println("HashMap's data> " + hm);
		System.out.println("HashMap's size> " + hm.size());
		System.out.println(hm.get(new Employee("a")));
	}

}
