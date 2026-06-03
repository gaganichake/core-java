package com.corejava.exception;

public class TestExceptionOrder {

	public static void main(String[] args) {

		try {
			// Throwing NullPointerException
//			String name = null;
//			name.equals("gagan");

			// Throwing ClassCastException
			Object x = 0;
			System.out.println((String) x);

			// catch specific exceptions first followed by generic Exception
		} catch (NullPointerException e) {
			// RuntimeException
			System.out.println("Caught NullPointerException");
		} catch (ClassCastException e) {
			// RuntimeException
			System.out.println("Caught ClassCastException");
		} catch (Exception e) {
			System.out.println("Caught Exception");
		}
	}

}
