package com.test.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CountDemo {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);

		Stream<Integer> stream = list.stream(); // Stream Creation
		Stream<Integer> streamFilter = stream.filter(s -> s >=20); // Stream Configurations
		System.out.println(streamFilter.count()); // Stream Processing
		System.out.println("Single Line ");
		// Single Line
		System.out.println(list.stream().filter(s -> s >=20).count());


	}
}
