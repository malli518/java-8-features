package com.test;

import java.util.function.Function;

public class FunctionChaining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<Integer, Integer> mul = i -> i * i;

		Function<Integer, Integer> doub = i -> 2 * i;

		System.out.println(mul.andThen(doub).apply(8));
		System.out.println(doub.compose(mul).apply(8));

	}

}
