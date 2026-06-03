package com.corejava.java8.interfaces;

import java.util.function.*;

/**
 * Java 8 Predefined Functional Interfaces (from java.util.function):
 */
public class PredefinedFunctionalInterfaces {

    public static void main(String[] args) {

        // Predicate<T>: Tests a condition and returns a boolean.
        Predicate<String> isNotEmpty = s -> !s.isEmpty();
        System.out.println(isNotEmpty.test("Hello")); // true

        // Consumer<T>: Accepts a single argument and performs an operation. Return void.
        Consumer<String> printer = message -> System.out.println(message);
        printer.accept("Hello, Lambda!"); // Prints "Hello, Lambda!"

        // Supplier<T>: Supplies a value without taking any arguments.
        Supplier<Double> randomValue = () -> Math.random();
        System.out.println(randomValue.get()); // Random double

        // BinaryOperator<T>: Takes two arguments and produces a result of the same type.
        BinaryOperator<Integer> sum = (a, b) -> a + b;
        System.out.println(sum.apply(10, 15)); // 25

        // Function<T, R>: Takes one argument and produces (returns) a result of any type.
        Function<Integer, String> intToString = n -> "Number: " + n;
        System.out.println(intToString.apply(5)); // "Number: 5"
    }
}
