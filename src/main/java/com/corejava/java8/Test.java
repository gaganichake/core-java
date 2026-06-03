package com.corejava.java8;

import java.io.IOException;

public class Test {

    public static void main(String[] args) throws IOException {

//        byte[] area = new byte[256];
//        System.out.println("Garvit, please enter area: ");
//        int areaBytesRead = System.in.read(area);
//        while(System.in.read() != '\n'); // Clear the buffer after reading single char
//
//        byte[] length = new byte[256];
//        System.out.println("Garvit, now please enter length: ");
//        int lengthBytesRead =  System.in.read(length);
//        while(System.in.read() != '\n'); // Clear the buffer after reading single char

//        System.out.println("The width of the rectangle is: "
//                + findAreaWidth(Double.parseDouble(new String(area, 0, areaBytesRead-1)),
//                Double.parseDouble(new String(length, 0, lengthBytesRead-1))));


        byte[] perimeter = new byte[256];
        System.out.println("Garvit, please enter perimeter: ");
        int perimeterBytesRead = System.in.read(perimeter);
        while(System.in.read() != '\n'); // Clear the buffer after reading single char

        byte[] length = new byte[256];
        System.out.println("Garvit, now please enter length: ");
        int lengthBytesRead =  System.in.read(length);
        while(System.in.read() != '\n'); // Clear the buffer after reading single char

        System.out.println("The width of the rectangle is: "
                + findPerimeterWidth(Double.parseDouble(new String(perimeter, 0, perimeterBytesRead-1)),
                Double.parseDouble(new String(length, 0, lengthBytesRead-1))));
    }

    private static double findAreaWidth(double area, double length) {

        return area / length;

    }

    private static double findPerimeterWidth(double perimeter, double length) {

        return (perimeter - (2 * length)) / 2;

    }
}
