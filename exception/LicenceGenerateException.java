package com.onebill.exception;

public class LicenceGenerateException extends RuntimeException {
	public String msg;

	public LicenceGenerateException(String msg) {
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}

}
