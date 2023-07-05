package com.canddella.entity;

public class Account {
	private String accountNo;
	private String accountType;
	private String accountCreateDate;
	private String balance;

	public Account() {

	}

	public Account(String accountNo, String accountType, String accountCreateDate, String balance) {
		super();
		this.accountNo = accountNo;
		this.accountType = accountType;
		this.accountCreateDate = accountCreateDate;
		this.balance = balance;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getAccountCreateDate() {
		return accountCreateDate;
	}

	public void setAccountCreateDate(String accountCreateDate) {
		this.accountCreateDate = accountCreateDate;
	}

	public String getBalance() {
		return balance;
	}

	public void setBalance(String balance) {
		this.balance = balance;
	}

}
