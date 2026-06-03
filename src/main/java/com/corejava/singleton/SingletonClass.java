package com.corejava.singleton;

public class SingletonClass {

	private int counter = 0;

	public int getNextCounterValue() {
		return ++counter;
	}

	/*
	 * Declare a class variable of this class type. Make it private and not provide any
	 * getter setter methods for this variable. This variable will hold your Singleton Object.
	 */	
	private static SingletonClass singletonObject;

	/*
	 * Make default constructor Private.
	 * A private Constructor prevents any other class from instantiating.
	 * Also, do not provide any overloaded constructors.
	 */
	private SingletonClass() {
		// Optional Code
	}

	/*
	 * Create a public method for getting the reference to the Singleton Object. 
	 * Also make this method access Synchronized to for Thread safety.
	 * No more than one thread can access this method simultaneously, insuring that only one
	 * Singleton Object is created even in a multi-threaded environment.
	 */
	public static synchronized SingletonClass getSingletonObject() {
		if (singletonObject == null) {
			singletonObject = new SingletonClass();
		}
		return singletonObject;
	}

	/*
	 * Override the Object's clone method to prevent cloning
	 */
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}

}
