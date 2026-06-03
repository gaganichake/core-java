package com.corejava.read.console;

import java.io.IOException;

public class Readex {

	//Reading input from console will throw IOException
	public static void main(String[] args) throws IOException {

		readSingleChar();

		readMultipleChar();

		readNumbers();
	}

	private static void readSingleChar() throws IOException {
		//For single char
		byte[] b = new byte[1];

		System.out.println("Enter a character: ");
		int numberOfBytesRead = System.in.read(b);

		System.out.println("Input: " + new String(b, 0, numberOfBytesRead) + ",  Number of bytes read: " + numberOfBytesRead);

		while(System.in.read() != '\n'); // Clear the buffer after reading single char
	}

	private static void readMultipleChar() throws IOException {

		//For multiple char
		byte[] b = new byte[256];

		System.out.println("Enter multiple characters: ");
		int numberOfBytesRead = System.in.read(b);

		System.out.println("Input: " + new String(b, 0, numberOfBytesRead-1) + ",  Number of bytes read: " + numberOfBytesRead);
	}

	private static void readNumbers() throws IOException {
		//Convert into int
		byte[] b = new byte[10];

		System.out.println("Enter any number: ");
		int numberOfBytesRead = System.in.read(b);

		int number = Integer.parseInt((new String(b, 0, numberOfBytesRead)).trim());

		System.out.println("Input: " + number + ",  Number of bytes read: " + numberOfBytesRead);
	}

}
