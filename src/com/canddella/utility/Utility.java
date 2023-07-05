package com.canddella.utility;

import java.util.ArrayList;

import com.canddella.entity.Account;
import com.canddella.entity.Customer;
import com.canddella.service.Service;

public class Utility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		
		Account account=Service.createAccount();
		Customer customer=Service.createCustomer(account);
		Service.displayDetails(customer);
		
	}

}
