package com.onebill.exception;

public class BankUser {
	public static void main(String[] args) {
		Bank bank = new Bank();
		bank.deposit(1000);
		bank.withdraw(500);
		bank.withdraw(600);
	}

}
