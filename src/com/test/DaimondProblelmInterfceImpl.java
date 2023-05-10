package com.test;

public class DaimondProblelmInterfceImpl implements DaimondProblelmInterfce1, DaimondProblelmInterfce2 {

//	@Override
//	public void m1() {
//		System.out.println("class m1 method");
//	}
	
	public static void main(String []a) {
		DaimondProblelmInterfceImpl daimondProblelmInterfceImpl= new DaimondProblelmInterfceImpl();
		daimondProblelmInterfceImpl.m1();
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		DaimondProblelmInterfce1.super.m1();
	}
}
