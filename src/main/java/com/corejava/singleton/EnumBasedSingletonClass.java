package com.corejava.singleton;

/*
 * Enum based Singleton Class
 * Use the enum-based singleton for a simpler, thread-safe implementation that prevents cloning and serialization issues.
 * This is the most simple and effective way to create a Singleton Class.
 * This approach is functionally equivalent to the public field approach, except that it is more concise,
 * provides the serialization machinery for free, and provides ironclad guarantee against multiple instantiation,
 * even in the face of sophisticated serialization or reflection attacks.
 */
public enum EnumBasedSingletonClass {
    INSTANCE;

    private int counter = 0;

    public int getNextCounterValue() {
        return ++counter;
    }
}
