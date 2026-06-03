package com.corejava.transient_;

import java.io.Serial;
import java.io.Serializable;

// You must implement Serializable interface to enable
// the serialization and deserialization of an object
public class Person implements Serializable{

	@Serial
    private static final long serialVersionUID = 258055474961796542L;
	private final String firstName;
	private final transient String middleName;
	private final String lastName;

	public Person(String fName, String mName, String lName){
		this.firstName = fName;
		this.middleName = mName;
		this.lastName = lName;
	}

	@Override
	public String toString() {
		return "NameStore{" +
				"firstName='" + firstName + '\'' +
				", middleName='" + middleName + '\'' +
				", lastName='" + lastName + '\'' +
				'}';
	}
}
