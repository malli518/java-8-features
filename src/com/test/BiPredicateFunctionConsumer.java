package com.test;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiPredicateFunctionConsumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiPredicate<Integer, Integer> bipr = (a,b) -> a*b >= 5;
		System.out.println(bipr.test(10, 2));
		
		BiFunction<Integer, Integer, Integer> bifun= (a,b) -> a*b;
		System.out.println(bifun.apply(10, 20));
	}

}
