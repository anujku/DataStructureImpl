package com.anuj.dsimpl.other;

public class Factorial {

	static int fact(int num) {
		int fact = 1;
		while (num != 0) {
			fact = fact * num;
			num--;
		}
		return fact;
	}

	public static void main(String[] args) {
		int num = 6;
		System.out.println("Factorial of " + num + " is " + fact(num));
	}
}
