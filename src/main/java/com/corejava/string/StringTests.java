package com.corejava.string;

public class StringTests {

	public static void main(String[] args) {

		compareNewStrings();

		compareStringTransitions();

		compareStringAssingments();

	}

	private static void compareStringAssingments() {
		System.out.println("\ncompareStringAssingments");

		String x = "Java"; // Assign a value to x
		String y = x; // Now y and x refer to the same String object
		System.out.println("x string = " + x);
		System.out.println("y string = " + y);
		System.out.println("x == y ? " + (x == y));// try this  without parentheses
		System.out.println("x.equals(y) = " + x.equals(y));

		x = x + " Bean"; // Now modify the object using the x reference
		System.out.println("x string = " + x);
		System.out.println("y string = " + y);
		System.out.println("x == y ? " + (x == y));
		System.out.println("x.equals(y) = " + x.equals(y));
	}

	private static void compareStringTransitions() {
		System.out.println("\ncompareStringTransitions");

		String message = "HELLO WORLD";

		String result = transition(message);

		if(result == message){
			System.out.println("message (" + message + ") and result (" + result + ") are same objects");
		} else {
			System.out.println("message (" + message +  ") and result (" + result + ") are different objects");
		}

		if(result.equals(message)){
			System.out.println("message (" + message + ") and result (" + result + ") are same values");
		} else {
			System.out.println("message (" + message + ") and result (" + result + ") are different values");
		}
	}

	private static String transition(String message) {
		return message.toLowerCase();
	}

	private static void compareNewStrings() {
		System.out.println("\ncompareNewStrings");

		String s1 = "abc";
		String s2 = new String("abc");
		String s3 = "abc";
		String s4 = "a"+"bc";

		System.out.println("s1.equals(s2) = "+s1.equals(s2)); // true
		System.out.println("s1.equals(s3) = "+s1.equals(s3)); // true
		System.out.println("s1.equals(s4) = "+s1.equals(s4)); // true
		System.out.println("(s1 == s2) = "+(s1 == s2)); //false
		System.out.println("(s1 == s3) = "+(s1 == s3)); // true
		System.out.println("(s1 == s4) = "+(s1 == s4)); // true
	}

}
