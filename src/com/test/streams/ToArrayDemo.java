package com.test.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ToArrayDemo {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(40);
		list.add(30);
		list.add(20);

		Stream<Integer> stream = list.stream(); // Stream Creation
		Stream<Integer> streamFilter = stream.filter(s -> s >=20); // Stream Configurations
		Object[] arr = streamFilter.toArray(); // Stream Processing
		for(Object a : arr) {
			System.out.println(a);
		}
		System.out.println("Single Line ");
		// Single Line
		Object[] arr1 =list.stream().filter(s -> s >=20).toArray();
		for(Object a : arr1) {
			System.out.println(a);
		}
	}

}
