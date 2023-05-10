package com.test.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class MinAndMaxDemo {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(40);
		list.add(30);
		list.add(20);

		Stream<Integer> stream = list.stream(); // Stream Creation
		Stream<Integer> streamFilter = stream.filter(s -> s >=20); // Stream Configurations
		Optional<Integer> min = streamFilter.min((i1,i2) -> i1.compareTo(i2)); // Stream Processing
		System.out.println("min : " +min.get());
		System.out.println("Single Line ");
		// Single Line
		int min1 =list.stream().filter(s -> s >=20).min((i1,i2) -> i1.compareTo(i2)).get();
		System.out.println("min1 : "+min1);
		int max1 =list.stream().filter(s -> s >=20).max((i1,i2) -> i1.compareTo(i2)).get();
		System.out.println("max1 : "+max1);
		
		int max2 =list.stream().filter(s -> s >=20).max((i1,i2) -> i2.compareTo(i1)).get();
		System.out.println("max2 : "+max2);//20 output
	}

}
