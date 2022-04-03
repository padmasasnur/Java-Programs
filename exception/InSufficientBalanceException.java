package com.onebill.exception;

public class InSufficientBalanceException extends RuntimeException {

	public String msg;

	public InSufficientBalanceException(String msg) {
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}

}
