package com.coffeepoweredcrew.adapter.src.classadapter;

import com.coffeepoweredcrew.adapter.src.adaptee.Employee;
import com.coffeepoweredcrew.adapter.src.target.Customer;

/**
 * A class adapter, works as Two-way adapter
 */
public class EmployeeClassAdapter extends Employee implements Customer {

	@Override
	public String getName() {
		return this.getFullName();
	}

	@Override
	public String getDesignation() {
		return this.getJobTitle();
	}

	@Override
	public String getAddress() {
		return this.getOfficeLocation();
	}
	
}
