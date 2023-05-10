package com.test;

public class Employee {
	private String name;

	public Employee(String name) { // constructor
		this.name = name;
	}

	@Override
	public int hashCode() {
		return 1;
	}

	@Override
	public boolean equals(Object obj) {
		return true;
	}

	@Override
	public String toString() {
		return "Employee[ name=" + name + "] ";
	}
}
