package com.anuj.dsimpl.other;

import java.io.*;

public class StringReverse {

	static void reverse(String word) {
		StringBuilder builder = new StringBuilder();
		for(int i = word.length()-1; i>=0;i--){
			builder = builder.append(word.charAt(i));
		}
		System.out.println("Reverse of the word " + word + " is " + builder);
	}
	public static void main(String[] args) throws IOException{
		String word = "";		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Input a word to reverse");
		word = reader.readLine();
		reverse(word);		
	}
}
