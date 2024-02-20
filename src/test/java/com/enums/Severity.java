package com.enums;

public enum Severity {
	/*
	 * CRITICAL {
	 * 
	 * @Override public String asLowerCase() { return
	 * Severity.CRITICAL.toString().toLowerCase(); } }, HIGH {
	 * 
	 * @Override public String asLowerCase() { return
	 * Severity.HIGH.toString().toLowerCase(); } }, MEDIUM {
	 * 
	 * @Override public String asLowerCase() { return
	 * Severity.MEDIUM.toString().toLowerCase(); } }, LOW {
	 * 
	 * @Override public String asLowerCase() { return
	 * Severity.LOW.toString().toLowerCase(); } };
	 * 
	 * public abstract String asLowerCase();
	 */

	CRITICAL(2), HIGH(4), MEDIUM(6), LOW(8);

	private int fixinghours;

	public int getFixinghours() {
		return fixinghours;
	}

	public void setFixinghours(int fixinghours) {
		this.fixinghours = fixinghours;
	}

	private Severity(int hours) {
		fixinghours = hours;
	}
}
