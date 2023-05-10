package com.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("a.n@gmail.com");
		list.add("a.c@amazon.com");
		list.add("a.b@capitalone.com");
		list.add("a.w@citco.com");
		list.add("a.r@rythmos.com");
		list.add("a.a@gmail.com");				
		list = list.stream().filter(email ->  email.contains("gmail.com") == true ).collect(Collectors.toList());
		System.out.println(list);
	}

}
