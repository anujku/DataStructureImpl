package com.anuj.dsimpl.other;

import java.util.Scanner;

public class StringSpaceRemover {
	
	private static Scanner scanner;

  static void spaceRemover(String line){
		line = line.replaceAll("\\s","") ;
		System.out.println("After removing the spaces from the line : " + line);
	}

	public static void main(String[] args) {
    scanner = new Scanner(System.in);
		System.out.println("Enter a String to remove spaces");
		String line = scanner.nextLine();
		spaceRemover(line);
	}
}
