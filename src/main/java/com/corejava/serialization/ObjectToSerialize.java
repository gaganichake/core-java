package com.corejava.serialization;

import java.io.Serial;
import java.io.Serializable;

/**
 * The object to serialize.
 */
public class ObjectToSerialize implements Serializable {
    @Serial
    private static final long serialVersionUID = 42L;
 
    private final String firstName;
    private final String lastName;
    private final transient Integer age;// transient: not serialized

    public ObjectToSerialize(String firstName, String lastName, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "ObjectToSerialize{" +
                "firstName='" + firstName + '\'' +
                ", lastName=" + lastName +
                ", age=" + age +
                '}';
    }
}
