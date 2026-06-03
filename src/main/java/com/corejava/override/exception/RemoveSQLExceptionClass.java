package com.corejava.override.exception;

// When you override a method, you can remove (omit) or specialize an exception
// however, you can not generalize an exception or add a new exception.
public class RemoveSQLExceptionClass extends SuperClass {

	// Omit SQLException	
	@Override
	public Integer getNetSalary(int id) {
		// Works
		return 2000;
	}
	
	// Throws a generalized exception to SQLException - error
//	@Override
//	public Integer getNetSalary(int id) throws Exception{
//		// Does NOT Work because Exception is superclass of SQLException
//		return new 5000;
//	}
	
}
