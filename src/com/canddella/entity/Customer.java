package com.canddella.entity;

public class Customer {
	private String customerCode;
	private String customerName;
	private String customerType;
	private Account account;

	public Customer(String customerCode, String customerName, String customerType, Account account) {
		super();
		this.customerCode = customerCode;
		this.customerName = customerName;
		this.customerType = customerType;
		this.account = account;
	}

	public String getCustomerCode() {
		return customerCode;
	}

	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerType() {
		return customerType;
	}

	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

}
