package com.chandan.interestcalculator;

public interface Interest {

	static final double rate = 25;
	
	public double simpleInterest(double principal, double time);
	public double compInterest(double principal, double time);
}
