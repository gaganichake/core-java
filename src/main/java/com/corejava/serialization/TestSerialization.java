package com.corejava.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class TestSerialization {

    private static final String FILE_NAME = "object.ser";

    /**
     * Saves an object.
     */
    private static void saveObject(Serializable object) throws IOException {
        ObjectOutputStream outputStream  = new ObjectOutputStream(new FileOutputStream(FILE_NAME));
        outputStream.writeObject(object);
        outputStream.close();
    }
 
    /**
     * Loads an object.
     */
    private static Object loadObject() throws ClassNotFoundException, IOException {
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(FILE_NAME));
        Object object = inputStream.readObject();
        inputStream.close();
        return object;
    }
 
    public static void main(String[] args) {
        ObjectToSerialize original = new ObjectToSerialize("Tom", "Henk", 30);
        System.out.println(original);
        try {
            saveObject(original);
            ObjectToSerialize loaded = (ObjectToSerialize) loadObject();
            System.out.println(loaded);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
