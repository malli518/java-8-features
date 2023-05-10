package com.test;

public class DefaultMethodsInterfaceDemoImpl implements DefaultMethodsInterfaceDemo {

	public void test1() {
		System.out.println("default impl class");
	}

	public static void main(String[] args) {
		DefaultMethodsInterfaceDemoImpl d = new DefaultMethodsInterfaceDemoImpl();
		d.test1();
		d.test2();
	}

}
