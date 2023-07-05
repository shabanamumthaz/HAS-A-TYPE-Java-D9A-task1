package com.canddella.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.canddella.entity.Account;
import com.canddella.entity.Customer;

public class Service {

	public static Account createAccount() {
		Scanner scanner = new Scanner(System.in);
		Account account = new Account();

		System.out.println("********Account Details************");
		System.out.println("Enter Account number:");
		account.setAccountNo(scanner.nextLine());
		System.out.println("Enter Account Type:\n1.Savings\n2.Fixed");
		int choice = scanner.nextInt();

		if (choice == 1) {
			account.setAccountType("Savings");
		} else
			account.setAccountType("Fixed");

		System.out.println("Enter Account create date:");
		scanner.nextLine();
		account.setAccountCreateDate(scanner.nextLine());
		System.out.println("Enter Account balance:");
		account.setBalance(scanner.nextLine());

		return account;

	}

	public static Customer createCustomer(Account account) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter  Customer code");
		String cusCode = scanner.nextLine();
		System.out.println("Enter  Customer Name");
		String cusName = scanner.nextLine();
		System.out.println("Enter  Customer Type");
		String cusType = scanner.nextLine();

		return new Customer(cusCode, cusName, cusType, account);
	}

	public static void displayDetails(Customer customer) {

		System.out.println("********Account Details************");
		System.out.println(
				"Customer Name    :" + customer.getCustomerName() + "\nCustomer Type:" + customer.getCustomerType());
		System.out.println("Account No   :" + customer.getAccount().getAccountNo() + "\nAccount Type:"
				+ customer.getAccount().getAccountType());
		System.out.println("Account Create Date   :" + customer.getAccount().getAccountCreateDate()
				+ "\nAccount Balance:" + customer.getAccount().getBalance());

	}

}
