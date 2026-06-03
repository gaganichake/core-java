package com.corejava.override.exception;

import java.sql.BatchUpdateException;

// When you override a method, you can remove (omit) or specialize an exception
// however, you can not generalize an exception or add a new exception.
public class AddSQLExceptionTypeClass extends SuperClass {
	
	// Throws a specialized exception (subclass) of SQLException
	@Override
	public Integer getNetSalary(int id) throws BatchUpdateException {
		// Works because BatchUpdateException is a subclass of SQLException
		return 3000;
	}

}
