package com.corejava.java16;

// records are a special kind of class in Java introduced in Java 14 as a preview feature and made stable in Java 16.
// They are a quick way to create data-carrying classes without having to write boilerplate code.
// Use Cases for Records:
// 1. When you need a simple data structure to hold data.
// 2. When you want to create immutable objects.
// 3. When you want to redce boilerplate code.
// 4. When you want to create a class that is primarily used for data transfer, storage or representation.s
// Record class definition
public record Person(String name, int age) {
    // Constructor is automatically generated
    // Getters are automatically generated
    // toString() method is automatically generated
    // equals() and hashCode() methods are automatically generated
    // You can add additional methods if needed
    // Example of an additional method
    public String greet() {
        return "Hello, my name is " + name + " and I am " + age + " years old.";
    }
    // The class is immutable by default
}
// Limitations of Records:
// 1. Records cannot extend other classes (but can implement interfaces).
// 2. Records are implicitly final, meaning you cannot subclass them.
// 3. Records cannot have mutable fields.
// 4. Records cannot have instance initializers.
// 5. Records cannot have static fields (except for constants).
// 6. Records cannot have non-final fields.
// 7. Records cannot have a default constructor.
// 8. Records cannot have a constructor with parameters that are not part of the record's components.
// 9. Records cannot have a constructor with parameters that are not final.
