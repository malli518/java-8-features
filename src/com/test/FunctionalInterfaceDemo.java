package com.test;

@FunctionalInterface
public interface FunctionalInterfaceDemo {
	int test(int a, int b);
	
	default int test1(int a, int b) {
		return a+b;
	}
}
