package com.onebill.exception;
//runtime exceptions
public class Bank {
	private int balance;

	public int getBalance() {
		return balance;
	}

	public void deposit(int amount) {
		balance = balance + amount;
		System.out.println("The balance afterthe deposit is:" + balance);
	}

	public void withdraw(int amount) {
		if (amount <= balance && amount > 0) {
			balance = balance - amount;
			System.out.println("balance left:" + balance);
		} else {
			try {

				throw new InSufficientBalanceException("Insufficient balance");
			} catch (InSufficientBalanceException e) {
				System.out.println(e.getMsg());

			}

		}
	}
}
