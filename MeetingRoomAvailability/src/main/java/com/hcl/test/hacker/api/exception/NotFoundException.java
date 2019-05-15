package com.hcl.test.hacker.api.exception;

@javax.annotation.Generated(value = "class com.hcl.test.hacker.codegen.languages.SpringCodegen", date = "2017-05-19T06:17:46.555Z")

public class NotFoundException extends ApiException {
	private int code;
	public NotFoundException (int code, String msg) {
		super(code, msg);
		this.code = code;
	}
}
