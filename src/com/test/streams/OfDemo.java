package com.test.streams;

import java.util.stream.Stream;

public class OfDemo {

	public static void main(String[] args) {
		System.out.println(Stream.of(1,11,122,123,1234).anyMatch(s -> s.equals(122)));
		String arr[] = {"abc","asd","dea"};
		Stream.of(arr).forEach(System.out::println);
		
	}

}
