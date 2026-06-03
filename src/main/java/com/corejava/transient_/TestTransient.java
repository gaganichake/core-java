package com.corejava.transient_;

import java.io.*;

// You must implement Serializable interface to enable
// the serialization and deserialization of an object
class TestTransient implements Serializable {
    // Normal variables
    int i = 10, j = 20;
    // Transient variables
    transient int k = 30;
    // Use of transient has no impact here
    transient static int l = 40;
    transient final int m = 50;

    @Override
    public String toString() {
        return "TestTransient{" +
                "i=" + i +
                ", j=" + j +
                ", k=" + k +
                ", m=" + m +
                '}';
    }

    public static void main(String[] args) throws Exception {
        TestTransient input = new TestTransient();

        // serialization
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("abc.txt"));
        oos.writeObject(input);

        // de-serialization
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("abc.txt"));
        TestTransient output = (TestTransient)ois.readObject();

        System.out.println("i = " + output.i);
        System.out.println("j = " + output.j);
        System.out.println("k = " + output.k);

        // transient and static : Since static fields are not part of state of the object, there is
        // no use/impact of using transient keyword with static variables.
        // However, there is no compilation error.
        System.out.println("l = " + output.l);

        // transient and final : final variables are directly serialized by their values, so there is
        // no use/impact of declaring final variable as transient.
        // There is no compile-time error though.
        System.out.println("m = " + output.m);

        Person person = new Person("Steve","Middle","Jobs");
        ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream(
                "person"));
        // writing to object
        o.writeObject(person);
        o.close();

        // reading from object
        ObjectInputStream in =new ObjectInputStream(
                new FileInputStream("person"));
        Person person2 = (Person)in.readObject();
        System.out.println(person2);
        // output will be :  firstName='Steve', middleName='null', lastName='Jobs'

        System.out.println("In Hibernate, transient fields are not persisted to database!");
        System.out.println("That way you have fields which are only known to the application and not to the database.");
    }
}
