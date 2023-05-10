package com.test.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MapDemo {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);

		Stream<Integer> stream = list.stream(); // Stream Creation
		Stream<Integer> streamMap = stream.map(s -> s * s); // Stream Configurations
		streamMap.forEach(s -> System.out.println(s)); // Stream Processing
		System.out.println("Single Line ");
		// Single Line
		list.stream().map(s -> s * s).forEach(s -> System.out.println(s));

	}

}
