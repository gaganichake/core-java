package com.corejava.override;

public class BetterUtility extends Utility {

	public static void print(String str) {

		System.out.println(BetterUtility.class.getName() + " : " + str);
	}
}
