package com.stringvalidation.stringmerging.model;

public class Form {

	private String string1;

	private String string2;

	@Override
	public String toString() {
		return "Form [string1=" + string1 + ", string2=" + string2 + "]";
	}

	public String getString1() {
		return string1;
	}

	public void setString1(String string1) {
		this.string1 = string1;
	}

	public String getString2() {
		return string2;
	}

	public void setString2(String string2) {
		this.string2 = string2;
	}

}
