package com.corejava.override.exception;

// When you override a method, you can remove (omit) or specialize an exception
// however, you can not generalize an exception or add a new exception.
public class AddNewExceptionTypeClass extends SuperClass {

	// Add one more exception - error
//	@Override
//	public Integer getNetSalary(int id) throws SQLException, FileNotFoundException {
//		// Does NOT Work because FileNotFoundException is NOT a subclass of SQLException
//		return 4000;
//	}
	
}
