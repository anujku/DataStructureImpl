package com.anuj.dsimpl.other;

import java.io.*;

public class StringPalindrome {

	static String reverse(String word) {
		StringBuilder builder = new StringBuilder();
		for (int i = word.length() - 1; i >= 0; i--) {
			builder = builder.append(word.charAt(i));
		}
		return builder.toString();
	}

	static void palindrome(String word) {
		String palindrome = reverse(word);
		if (word.equals(palindrome))
			System.out.println(word + " is a palindorme word");
		else
			System.out.println(word + " is not a palindorme word");
	}

	public static void main(String[] args) throws IOException {
		String word = "";
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		System.out.println("Input a word to check palindromacy");
		word = reader.readLine();
		palindrome(word);
	}
}
