package com.test;

public class MethodReference {

	public static void main(String[] args) {
		FunctionalInterfaceDemo demo = Test::isMehodReference;
		demo.test(10, 20);
	}

}

class Test {
	public static int isMehodReference(int a, int b) {
		System.out.println("this is method reference method ");
		return a + b;
	}
}