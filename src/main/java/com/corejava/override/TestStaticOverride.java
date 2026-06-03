package com.corejava.override;

public class TestStaticOverride {

	public static void main(String[] args) {
		
		Utility.print("1"); // via class reference
		
		BetterUtility.print("2"); // via class reference

		Utility utility = new Utility();

		utility.print("3"); // via object reference

		BetterUtility betterUtility = new BetterUtility();

		betterUtility.print("4"); // via object reference

		Utility baseUtility = new BetterUtility();
		
		// You cannot override static method. Below call will print "5" from Utility class
		baseUtility.print("5"); // via object reference

	}

}
