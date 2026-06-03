package com.corejava.java16;

import java.util.List;

public class WhatAreRecords {

    public static void main(String[] args) {
        // Example usage of the Record class
        Person person = new Person("John", 30);
        System.out.println(person);
        System.out.println("Name: " + person.name());
        System.out.println("Age: " + person.age());

        List<Person> people = List.of(new Person("Alice", 25), new Person("Bob", 28));
        people.forEach(System.out::println);
    }

}
