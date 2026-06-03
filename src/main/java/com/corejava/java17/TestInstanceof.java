package com.corejava.java17;

public class TestInstanceof {

    public static void main(String[] args){

        System.out.println("Before Java 16: " + beforeJava16());

        System.out.println("In Java 16: " + inJava16());

        System.out.println("In Java 17: " + inJava17());

    }

    private static Object beforeJava16() {
        // Before Java 16
        Object o = 11.4;
        if (o instanceof String) {
            String s = (String) o;
            return String.format("String %s", s);
        } else if (o instanceof Integer) {
            Integer i = (Integer) o;
            return String.format("int %d", i);
        } else if (o instanceof Double) {
            Double d = (Double) o;
            return String.format("double %f", d);
        }
        return null;
    }

    private static Object inJava16() {
        // In Java 16
        Object o = 12.5;
        if (o instanceof String s) {
            return String.format("String %s", s);
        } else if (o instanceof Integer i){
            return String.format("int %d", i);
        } else if (o instanceof Double d) {
            return String.format("double %f", d);
        }
        return null;
    }

    private static Object inJava17() {
        // In Java 17
        Object o = 13.6;
        switch (o) {
            case Integer i -> {return String.format("int %d", i);}
            case Double d  -> {return String.format("double %f", d);}
            case String s  -> {return String.format("String %s", s);}
            default        -> {return o.toString();}
        }
    }

}
