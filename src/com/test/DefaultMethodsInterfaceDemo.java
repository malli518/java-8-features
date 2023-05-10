package com.test;

public interface DefaultMethodsInterfaceDemo {
	void test1();
	default void test2() {
		System.out.println("default method ");
	};
}
