package com.test;

import java.util.function.Predicate;

public class PerdicateJoning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<String> checkLength = s -> s.length() >= 5;

		Predicate<String> checkEvenOrOdd = s -> s.length() % 2 == 0;

		System.out.println("length " + checkLength.test("Nagamalli"));

		System.out.println("even " + checkEvenOrOdd.test("Nagamalli"));

		System.out.println("and " + checkLength.and(checkEvenOrOdd).test("Nagamalli"));
		System.out.println("or " + checkLength.or(checkEvenOrOdd).test("Nagamalli"));
		System.out.println("negaive " + checkLength.negate().test("Nagamalli"));

	}

}
