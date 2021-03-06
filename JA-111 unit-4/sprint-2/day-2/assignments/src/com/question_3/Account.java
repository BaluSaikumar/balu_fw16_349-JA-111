package com.question_3;

public class Account {
	
	private int accountId;
	
	private String accountType;
	
	private int balance;

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Account(int accountId, String accountType, int balance) {
		super();
		this.accountId = accountId;
		this.accountType = accountType;
		this.balance = balance;
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public boolean withdraw(int withdrawnBalance) {
		
		if(getBalance()>=withdrawnBalance) {
			
			int currentBalance = getBalance()-withdrawnBalance;
			
			System.out.println(currentBalance);
			
			return true;
			
		}
		
		else {
			
			System.out.println("Sorry!!! No enough balance");
			
			return false;
			
		}
		
	}

}
