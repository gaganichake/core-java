package com.corejava.override.exception;

// When you override a method, you can remove (omit) or specialize an exception
// however, you can not generalize an exception or add a new exception.
public class AddGeneralizedExceptionClass extends SuperClass {
	
	// Throws a generalized exception to SQLException - error
//	@Override
//	public Integer getNetSalary(int id) throws Exception{
//		// Does NOT Work because Exception is superclass of SQLException
//		return 5000;
//	}
	
}
