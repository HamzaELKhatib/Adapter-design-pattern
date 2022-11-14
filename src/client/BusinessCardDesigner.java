package com.coffeepoweredcrew.adapter.src.client;

import com.coffeepoweredcrew.adapter.src.target.Customer;

/**
 * Client code which requires Customer interface.
 */
public class BusinessCardDesigner {

	public String designCard(Customer customer) {
		String card = "";
		card += customer.getName();
		card += "\n" + customer.getDesignation();
		card += "\n" + customer.getAddress();
		return card;
	}
}
