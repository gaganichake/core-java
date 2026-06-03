package com.corejava.singleton;

public class NotASingletonClass {
    private int counter = 0;

    public int getNextCounterValue() {
        return ++counter;
    }
}
