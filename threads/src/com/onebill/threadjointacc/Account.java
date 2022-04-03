package com.onebill.threadjointacc;

public class Account {
	int balance;

	public Account(int balance) {
		super();
		this.balance = balance;
	}
	
	public  synchronized void withdraw(int amount) {  //account is a local variable
		if(balance > amount && amount>0) {
			balance = balance - amount;
		}
	}
	public void deposit (int amount) {
		balance = balance + amount;
	}

	public void getBalance() {
		System.out.println("Available Balance is:" + balance);;
	}

	
	}

