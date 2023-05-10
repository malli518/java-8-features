package com.test;

import java.util.function.Consumer;

public class ConsumerChaning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<Integer> mul = i-> System.out.println(i*i);
		mul.accept(10);
		
		Consumer<Integer> doub = i-> System.out.println(2*i);
		doub.accept(10);
		
		//andThen just execute the two methods and it will not take first excution result to next one
		mul.andThen(doub).accept(10);
		
		//no compose method
	}

}
