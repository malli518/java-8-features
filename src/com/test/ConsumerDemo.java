package com.test;

import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<Integer> mul = i-> System.out.println(i*i);
		mul.accept(10);
	}

}
