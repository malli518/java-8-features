package com.test;

public class FunctionalInterfaceMain {

	public static void main(String[] args) {
		FunctionalInterfaceDemo demo = (a, b) -> {
			return a + b;
		};
		int res = demo.test(10, 20);
		System.out.println(demo.test1(20, 10));
		System.out.println(res);
	}

}
