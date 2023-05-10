package com.test.streams;

import java.util.Arrays;
import java.util.List;

public class IntermediateVsTerminalOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		//here filter and map are the intermediate operators 
		// and forEach is the terminal operation
		//peek is for debugging the intermediate operations output 
		// and it is same like map and it will not return any thing because it will take Consumer as input
		list.stream().filter(i-> i%2 == 0).peek(System.out::println).map(s-> s*s).filter(z-> z>5).forEach(System.out::println);
		
		//reduce is used to reduce the stream and return single output
		System.out.println(list.stream().filter(i-> i%2 == 0).reduce((s,b)-> s+b).get());
	}

}
