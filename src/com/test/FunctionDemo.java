package com.test;

import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<Integer, Integer> fun = i -> i*i;
		System.out.println("mul " + fun.apply(10));
	}

}
