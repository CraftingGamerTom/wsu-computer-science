package com.java21days;

public class divider {
	public static void main (String[] args){
		
		int dividend = 10;
		int divisor = 7;
		int answer;
		int remainder;
		
		answer = dividend / divisor;
		remainder = dividend % divisor;
		
		System.out.println("Answer is:\t" + answer);
		System.out.println("With a remainder of:\t" + remainder);
		
	}

}
