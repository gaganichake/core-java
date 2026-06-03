package com.corejava.java8.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * In general with Lambda expression you create and use anonymous methods.
 * You can create any number of anonymous methods, however you can use the method 
 * name of your Functional Interface to call your anonymous methods. see LambdaExpression.java
 * 
 * This means that you only need to know the method name that already have a implementation.
 * 
 * Method references enable you to do this; they are compact, easy-to-read lambda 
 * expressions for methods that already have a name.
 * 
 */
public class MethodReferences {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

		names.stream()
				.filter(name -> name.startsWith("A"))  // Lambda for filtering
				.map(name -> name.toUpperCase())       // Lambda for transformation
				.forEach(name -> System.out.println(name)); // Terminal openration

		// Instead of a lambda like (x) -> x.toString(), you can use a method reference:
		names.stream()
				.filter(name -> name.startsWith("A"))  // Lambda for filtering
				.map(String::toUpperCase)       // Instance method reference as shorthand
				.forEach(System.out::println);         // Static Method reference as shorthand
	}

}
