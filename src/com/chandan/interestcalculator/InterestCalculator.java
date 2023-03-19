package com.chandan.interestcalculator;

public class InterestCalculator implements Interest{

private double amount, principal, time, rate;
	
	@Override
	public double simpleInterest(double principal, double time) {
		this.principal =principal;
		this.time= time;
		this.rate=Interest.rate;
		amount = (principal*rate*time)/100;
		return amount;
	}

	@Override
	public double compInterest(double principal, double time) {
		this.principal =principal;
		this.time= time;
		this.rate=Interest.rate;
		amount = principal * (Math.pow((1 + rate / 100), time));
		// if we need to calculate interest amount only then we need to use (amount-principal)
		
		/*
		 * we can also calculate compound interest using below formula
		 * amount = Principle*(1+(rate / 100))^time
		 */

		return amount;
	}

	
	public static void main(String[] args) {
		InterestCalculator ic = new InterestCalculator();
		double principal = 700000;
		double time = 5;
		double amount = ic.simpleInterest(principal, time);
		System.out.println("Simple Interest = "+ amount);
		System.out.println("Compound Interest = "+ ic.compInterest(principal, time));
		
		

	}

}
