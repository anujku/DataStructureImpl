package com.anuj.dsimpl.other;

public class FibonnaciSeries {

	static int fibo(int num) {
		if (num < 2)
			return num;
		else
			return fibo(num - 1) + fibo(num - 2);
	}

	public static void main(String[] args) {
		int num = 6;
		for (int i = 0; i <= num; i++) {
			System.out.print(fibo(i));
			if (num != i)
				System.out.print(", ");
		}

		System.out.println();
		int i = 0;
		while (true) {
			int fib = fibo(i);
			System.out.print(fib + ", ");
			if (fib >= num)
				break;

			i++;

		}
	}
}
