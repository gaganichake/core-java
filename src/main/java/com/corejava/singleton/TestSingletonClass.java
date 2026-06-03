package com.corejava.singleton;

public class TestSingletonClass {
	public static void main(String[] args) {

		NotASingletonClass obj1 = new NotASingletonClass();
		for (int i = 0; i < 5; i++) {
			System.out.println("Not a singleton object 1:" + obj1.getNextCounterValue());
		}

		NotASingletonClass obj2 = new NotASingletonClass();
		for (int i = 0; i < 5; i++) {
			System.out.println("Not a singleton object 2:" + obj2.getNextCounterValue());
		}

		// Compilation error: The constructor SingletonClass() is not visible
		// SingletonClass o = new SingletonClass();

		SingletonClass o1 = SingletonClass.getSingletonObject();
		for (int i = 0; i < 5; i++) {
			System.out.println("Singleton instance 1:" + o1.getNextCounterValue());
		}

		SingletonClass o2 = SingletonClass.getSingletonObject();
		for (int i = 0; i < 5; i++) {
			System.out.println("Singleton instance 2:" + o2.getNextCounterValue());
		}

		EnumBasedSingletonClass enumInstance1 = EnumBasedSingletonClass.INSTANCE;
		for (int i = 0; i < 5; i++) {
			System.out.println("Enum Singleton instance 1: " + enumInstance1.getNextCounterValue());
		}

		EnumBasedSingletonClass enumInstance2 = EnumBasedSingletonClass.INSTANCE;
		for (int i = 0; i < 5; i++) {
			System.out.println("Enum Singleton instance 2: " + enumInstance2.getNextCounterValue());
		}
	}
}
